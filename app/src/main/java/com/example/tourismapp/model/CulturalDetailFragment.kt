package com.example.tourismapp.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.tourismapp.Place
import com.example.tourismapp.R
import com.example.tourismapp.databinding.FragmentCulturalDetailBinding

class CulturalDetailFragment : Fragment() {

    private lateinit var binding: FragmentCulturalDetailBinding
    val args: CulturalDetailFragmentArgs by navArgs()

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
        val place= args.detail
        binding.tvNameCultural.text = place.name
        binding.tvDesCultural.text=place.description

        Glide.with(binding.ivPlaceCultural.context)
            .load(place.imageUrl)
            .into(binding.ivPlaceCultural)
    }

}
