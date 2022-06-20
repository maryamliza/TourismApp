package com.example.tourismapp

import android.widget.ImageView

data class Place (
    var name: String,
    var imageUrl: String,
    var status: String,
    var description: String,
    var distance: Double,
    var latitude: Double,
    var longitude: Double,
)