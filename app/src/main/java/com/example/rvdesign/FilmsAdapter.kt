package com.example.rvdesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FilmsAdapter(private val mContext: Context, private val FilmList: List<Films>) :
    RecyclerView.Adapter<FilmsAdapter.CardDesignCatch>() {

    inner class CardDesignCatch(view: View) : RecyclerView.ViewHolder(view) {
        var imageViewFilmImg: ImageView
        var textViewFilmTag: TextView
        var textViewFilmPrice: TextView
        var buttonSepet: Button

        init {
            imageViewFilmImg = view.findViewById(R.id.imageViewFilmImg)
            textViewFilmTag = view.findViewById(R.id.textViewFilmTag)
            textViewFilmPrice = view.findViewById(R.id.textViewFilmPrice)
            buttonSepet = view.findViewById(R.id.buttonSepet)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignCatch {

        val tasarim =
            LayoutInflater.from(mContext).inflate(R.layout.card_film_design, parent, false)
        return CardDesignCatch(tasarim)

    }

    override fun onBindViewHolder(holder: CardDesignCatch, position: Int) {

        val film = FilmList[position]
        holder.textViewFilmTag.text = film.film_name
        holder.textViewFilmPrice.text = "${film.film_price} TL"
        holder.imageViewFilmImg.setImageResource(mContext.resources.getIdentifier(film.film_img,"drawable",mContext.packageName))
        holder.buttonSepet.setOnClickListener {
            Toast.makeText(mContext,"${film.film_name} sepete eklendi",Toast.LENGTH_SHORT).show()
        }



    }

    override fun getItemCount(): Int {

        return FilmList.size

    }
}