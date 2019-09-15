package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.element.view.*

class MyAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.element, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.element.text = items.get(position)
        holder.button3.setOnClickListener {
            holder.element.text="123"
        }
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val element = view.element
        val button3 = view.button3
    }
}



