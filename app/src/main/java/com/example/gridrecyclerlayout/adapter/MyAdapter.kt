package com.example.gridrecyclerlayout.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.gridrecyclerlayout.R
import com.example.gridrecyclerlayout.model.GridData

class MyAdapter(var context: Context, var arrayList: ArrayList<GridData>) :
    RecyclerView.Adapter<MyAdapter.ItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_view_layout_item, parent, false)
        return ItemHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val charItem: GridData = arrayList.get(position)

        holder.icons.setImageResource(charItem.icons!!)
        holder.titles.text = charItem.iconText

        holder.titles.setOnClickListener {
            Toast.makeText(context, charItem.iconText, Toast.LENGTH_LONG).show()
        }

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)
        var titles = itemView.findViewById<TextView>(R.id.title_text_view)

    }
}