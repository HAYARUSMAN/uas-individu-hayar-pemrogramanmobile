package com.example.uas_individu

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NegaraAdapter(private val context: Context, private val negara: List<Negara>,val listener: (Negara) -> Unit)
    : RecyclerView.Adapter<NegaraAdapter.NegaraViewHolder>(){
    class NegaraViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgView = view.findViewById<ImageView>(R.id.img_item_photo)
        val txtTitle = view.findViewById<TextView>(R.id.item_name)
        val txtSub = view.findViewById<TextView>(R.id.item_description)

        fun bindView(negara: Negara, listener: (Negara) -> Unit) {
            imgView.setImageResource(negara.imgView)
            txtTitle.text = negara.txtTitle
            txtSub.text = negara.txtSub
            itemView.setOnClickListener{
                listener(negara)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NegaraViewHolder {
        return NegaraViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_negara, parent, false)
        )

    }

    override fun onBindViewHolder(holder: NegaraViewHolder, position: Int) {
        holder.bindView(negara[position],listener)
    }

    override fun getItemCount(): Int = negara.size


}