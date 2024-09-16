package com.example.heroesapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroAdapter(
    private val heroList: List<Hero>
) : RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hero_item, parent, false)
        return HeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val hero = heroList[position]
        holder.bind(hero)
    }

    override fun getItemCount(): Int = heroList.size

    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.heroName)
        private val imageView: ImageView = itemView.findViewById(R.id.heroImage)

        fun bind(hero: Hero) {
            nameTextView.text = hero.name
            Picasso.get().load(hero.imageUrl).into(imageView)
        }
    }
}
