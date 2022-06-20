package com.example.tourismapp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Place(
    var name: String,
    @SerializedName("image") var imageUrl: String,
    var status: String,
    var description: String,
    var distance: Double,
    var latitude: Double,
    var longitude: Double,
) : Parcelable