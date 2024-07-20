package com.example.worldcupwinners

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Myadapter(private val listt : ArrayList<info>) : RecyclerView.Adapter<Myadapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myadapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Myadapter.MyViewHolder, position: Int) {

        val currentItem = listt[position]
        holder.images.setImageResource(currentItem.images)
        holder.teams.text = currentItem.teams
        holder.years.text = currentItem.years
    }

    override fun getItemCount(): Int {
        return listt.size
    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val images: ImageView = itemView.findViewById(R.id.image)
        val teams: TextView = itemView.findViewById(R.id.team)
        val years: TextView = itemView.findViewById(R.id.year)
    }
}