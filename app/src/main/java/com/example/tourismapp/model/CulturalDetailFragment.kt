package com.example.tourismapp.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.tourismapp.Place
import com.example.tourismapp.R
import com.example.tourismapp.databinding.FragmentCulturalDetailBinding

class CulturalDetailFragment : Fragment() {

    private lateinit var binding: FragmentCulturalDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCulturalDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        val place = Place()
        binding.tvNameCultural.text = place.name

    }

}
