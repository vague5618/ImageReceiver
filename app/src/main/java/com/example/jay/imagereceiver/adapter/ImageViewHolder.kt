package com.example.jay.imagereceiver.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.jay.imagereceiver.R

class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val imageView by lazy {
        itemView.findViewById(R.id.img_view) as ImageView
    }

    val textView by lazy {
        itemView.findViewById(R.id.text) as TextView
    }
}