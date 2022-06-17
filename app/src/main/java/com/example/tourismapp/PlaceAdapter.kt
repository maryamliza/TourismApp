package com.example.tourismapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismapp.databinding.ItemPlaceBinding

class PlaceAdapter(
    private val objList: List<Place>
) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPlaceBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val obj = objList[position]
        val binding = holder.binding
        binding.tvName.text = obj.name
        binding.tvStatus.text = obj.status
//        binding.ivPlace = obj.bedsNumber.toString()
//        añadir la libreria glide

    }

    override fun getItemCount(): Int {
        return objList.size
    }
}