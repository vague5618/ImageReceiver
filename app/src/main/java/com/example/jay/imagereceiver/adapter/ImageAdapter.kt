package com.example.jay.imagereceiver.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jay.imagereceiver.R
import com.example.jay.imagereceiver.model.ImageItem
import com.example.jay.imagereceiver.util.ImageAsync
import java.util.ArrayList

class ImageAdapter(val context : Context) : RecyclerView.Adapter<ImageViewHolder>(){

    var imageList: ArrayList<ImageItem>? = null

    override fun onBindViewHolder(holder: ImageViewHolder?, position: Int) {

        val item = imageList?.get(position)

        ImageAsync(holder?.imageView, context).execute(item?.resource)
        holder?.textView?.text = item?.title
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ImageViewHolder {
        return ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image, parent, false))
    }

    override fun getItemCount(): Int {
        return imageList?.size?: 0
    }
}