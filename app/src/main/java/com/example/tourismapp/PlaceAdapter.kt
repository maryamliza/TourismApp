package com.example.tourismapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tourismapp.databinding.ItemPlaceBinding

class PlaceAdapter(
    private val objList: List<Place>,
    private val navigateToDetail: (Place) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPlaceBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = objList[position]
        val binding = holder.binding
        binding.tvName.text = place.name
        binding.tvStatus.text = place.status

        binding.tvName.setOnClickListener {
            navigateToDetail(place)
        }

//        binding.ivPlace = obj.bedsNumber.toString()
//        añadir la libreria glide
        Glide.with(binding.ivPlace.context)
            .load(place.imageUrl)
            .into(binding.ivPlace)
    }

    override fun getItemCount(): Int {
        return objList.size
    }

}