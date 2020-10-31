package com.bubble.androidtutorialkotlin.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bubble.androidtutorialkotlin.R

class RecycleAdapter(
    private val ComponentList: MutableList<activityModal>,
    private val listener: (activityModal) -> Unit
) : RecyclerView.Adapter<RecycleAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.main_list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val component = ComponentList[position]
        holder.component_name.text=component.Title

        holder.itemView.setOnClickListener { listener(component) }
    }

    override fun getItemCount(): Int {
        return ComponentList.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val component_name: TextView = itemView.findViewById(R.id.component_name)

    }
}