package com.frankmorara.eplteams

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeamAdapter(val context: Context,
                  val dataset: List<Team>)
    : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

        class TeamViewHolder(
            private val view: View
        ): RecyclerView.ViewHolder(view){

            val textView: TextView = view.findViewById(R.id.team_name)
            val imageView: ImageView = view.findViewById(R.id.team_logo)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return TeamViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.teamNameId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size


}