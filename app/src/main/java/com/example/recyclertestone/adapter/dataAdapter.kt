package com.example.recyclertestone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclertestone.R
import com.example.recyclertestone.model.Data
import kotlinx.android.synthetic.main.item_data.view.*
import java.util.zip.Inflater

class dataAdapter(var datalist: ArrayList<Data>) :
    RecyclerView.Adapter<dataAdapter.dataViewHolder>() {
    inner class dataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(data: Data) {
            itemView.txtNo.text = data.no
            itemView.txtName.text = data.name
            itemView.txtPrice.text = data.price
            itemView.imgShoe.setImageResource(data.shoe)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_data, parent, false)
        return dataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: dataViewHolder, position: Int) {
        holder.bindData(datalist[position])
    }
}