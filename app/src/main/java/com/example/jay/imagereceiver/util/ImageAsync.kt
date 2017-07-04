package com.example.jay.imagereceiver.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.lang.ref.WeakReference

/**
 * Created by JAY on 2017. 7. 5..
 */
class ImageAsync(imageView: ImageView?, val context : Context) : AsyncTask<Int, Void, Bitmap>()
{
    val imageViewReference: WeakReference<ImageView?>

    init {
        imageViewReference = WeakReference(imageView)
    }

    override fun doInBackground(vararg params: Int?): Bitmap? {
        val options = BitmapFactory.Options()
        options.inSampleSize = 2
        return BitmapFactory.decodeResource(context.resources, params[0] as Int, options)
    }

    override fun onPreExecute() {
        super.onPreExecute()
        imageViewReference.get()?.setImageResource(0)
    }

    override fun onPostExecute(result: Bitmap?) {
        super.onPostExecute(result)
        result?.let { imageViewReference.get()?.setImageBitmap(result) }
    }
}