package com.example.tourismapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.tourismapp.databinding.FragmentCulturalBinding
import com.example.tourismapp.model.RetrofitManager
import com.example.tourismapp.model.onSuccess

class CulturalFragment : Fragment() {
    private lateinit var binding: FragmentCulturalBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCulturalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding.btMaps.setOnClickListener {
            findNavController().navigate(R.id.action_culturalFragment_to_mapFragment)
        }

        val service = RetrofitManager.getService()
        service.getPlaces().onSuccess {
            Log.e("ML",it.toString())
            val recycler = binding.rcPlaces
            recycler.adapter = PlaceAdapter(it)
        }

        Glide.with( requireContext() )
            .load( "https://fotografias.lasexta.com/clipping/cmsimages02/2020/0" +
                    "9/21/86828440-B1FB-43AC-9E9C-A94AC6A4B8BD/default.jpg?crop=1300,731,x0,y0&width=1900&height=1069&optimize=low" )
        .into( binding.ivDummmy )
    }
}
