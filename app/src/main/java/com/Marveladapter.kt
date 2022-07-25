package com

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ananya.marvelapplication.R


class Marveladapter (val ListOfCharacters : ArrayList<marvelchar> , val context: Context) :
    RecyclerView.Adapter<Marveladapter.ViewHolder>() {
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
         lateinit var characterimage : ImageView
         lateinit var charactername : TextView
        init {
            characterimage = view.findViewById(R.id.char_image)
            charactername = view.findViewById(R.id.char_name)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Marveladapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Marveladapter.ViewHolder, position: Int) {
        holder.characterimage.setImageResource(ListOfCharacters[position].charimage)
        holder.charactername.text=(ListOfCharacters[position].charname)
    }

    override fun getItemCount(): Int {
        return ListOfCharacters.size
    }


}


