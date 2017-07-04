package com.example.jay.imagereceiver

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.example.jay.imagereceiver.adapter.ImageAdapter
import com.example.jay.imagereceiver.model.ImageData

class MainActivity : AppCompatActivity() {

    private val recyclerView by lazy {
        findViewById(R.id.recycler_view) as RecyclerView
    }

    private var imageAdapter: ImageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageAdapter = ImageAdapter(this)
        imageAdapter?.imageList = ImageData.getSampleList(this, 10)
        recyclerView.adapter = imageAdapter
    }
}
