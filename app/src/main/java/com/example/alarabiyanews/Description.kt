package com.example.alarabiyanews

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        // Retrieve the data from the intent
        val imageUrl = intent.getStringExtra("imageUrl")
        val headline = intent.getStringExtra("headline")
        val source = intent.getStringExtra("source")
        val time = intent.getStringExtra("time")
        val description = intent.getStringExtra("description")

        // Find the views in the layout
        val imageView: ImageView = findViewById(R.id.desc_img)
        val headlineView: TextView = findViewById(R.id.desc_headline)
        val sourceView: TextView = findViewById(R.id.desc_source)
        val timeView: TextView = findViewById(R.id.desc_date)
        val descriptionView: TextView = findViewById(R.id.detailed_news)

        // Load the image using Glide
        Glide.with(this)
            .load(imageUrl)
            .placeholder(R.drawable.error_image)
            .error(R.drawable.error_image)
            .into(imageView)

        // Set the text data
        headlineView.text = headline
        sourceView.text = source
        timeView.text = time
        descriptionView.text = description
    }
}
