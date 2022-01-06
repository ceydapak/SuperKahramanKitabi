package com.example.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class adapter( val liste : ArrayList<String>, val gorsel: ArrayList<Int>) : RecyclerView.Adapter<adapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        //Inflater, MenuInflater, LayoutInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.recyclerView_row.text= liste.get(position)
        holder.itemView.setOnClickListener {
            var intent = Intent(holder.itemView.context,MainActivity2 ::class.java)
            intent.putExtra("isim",liste.get(position))
            intent.putExtra("gorsel",gorsel.get(position))
           /* val singleton = SingletonClass.SecilenHero
            singleton.grsel = gorsel.get(position)*/

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return liste.size
    }
}