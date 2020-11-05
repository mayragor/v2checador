package com.checador.checador.utils

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.checador.checador.R
import com.checador.checador.model.People


class AdapterPeople(
    private val list: List<People>,
    private val fragmentHome: Int, val context: Context
) : RecyclerView.Adapter<ListViewHolders>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolders {
        val inflater = LayoutInflater.from(parent.context)
        return ListViewHolders(
            inflater,
            parent,
            fragmentHome
        )
    }

    override fun getItemCount(): Int = list.size
    override fun onBindViewHolder(holder: ListViewHolders, position: Int) {
        val data: People = list[position]
        holder.binds(data,context)
        holder.itemView.setOnClickListener{

        }
    }
}


//Soporte
class ListViewHolders(inflater: LayoutInflater, parent: ViewGroup, Layout: Int) :
    RecyclerView.ViewHolder(inflater.inflate(Layout, parent, false)) {

    private var nombreView: TextView? = null
    private var entradaView: TextView? = null

    private var salidaView: TextView? = null
    init {
        nombreView = itemView.findViewById(R.id.tvnombre)
        entradaView = itemView.findViewById(R.id.tvhora_entrada)
        salidaView = itemView.findViewById(R.id.tvhora_salida)

    }

    fun binds(comerce: People, context: Context) {
        nombreView?.text = comerce.name
        entradaView?.text =comerce.entrada
        salidaView?.text =comerce.salida

    }

}