package com.example.dddd.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.dddd.R
import kotlinx.android.synthetic.main.item_post.view.*

class SimpleAdapter : RecyclerView.Adapter<SimpleAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount() = 10


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
    }

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind() = itemView.apply {
            title.text = "Title"
            body.text = "Body"
        }

    }
}