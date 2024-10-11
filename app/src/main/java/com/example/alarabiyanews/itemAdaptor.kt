package com.example.alarabiyanews

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemAdapter(private val itemList: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    data class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.image1)
        val headline: TextView = view.findViewById(R.id.headline)
        val source: TextView = view.findViewById(R.id.source)
        val time: TextView = view.findViewById(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]

        holder.apply {
            Glide.with(view.context)
                .load(item.imageUrl)
                .placeholder(R.drawable.error_image)
                .error(R.drawable.error_image)
                .into(imageView)

            headline.text = item.headline
            source.text = item.source
            time.text = item.time

            // Set onClickListener to pass data to Description Activity
            view.setOnClickListener {
                val context = view.context
                val intent = Intent(context, Description::class.java)

                // Pass data to Description Activity using Intent extras
                intent.putExtra("imageUrl", item.imageUrl)
                intent.putExtra("headline", item.headline)
                intent.putExtra("source", item.source)
                intent.putExtra("time", item.time)
                intent.putExtra("description", item.description)

                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount() = itemList.size
}
