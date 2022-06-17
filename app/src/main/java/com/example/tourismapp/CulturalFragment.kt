package com.example.tourismapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tourismapp.databinding.FragmentCulturalBinding

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

        val placeList = listOf<Place>(
           Place("Playa","","abierto","hermosa playa",10.5)
        )

        val recycler = binding.rcPlaces
        recycler.adapter = PlaceAdapter(placeList)
    }
}
