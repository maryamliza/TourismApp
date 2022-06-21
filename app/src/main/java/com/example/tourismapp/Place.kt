package com.example.tourismapp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Place(
    var name: String,
    @SerializedName("image") var imageUrl: String,
    var status: String,
    var description: String,
    var distance: Double,
    var latitude: Double,
    var longitude: Double,
    var openTime: String, // 09:15
    var closeTime: String, //   23:45
) : Parcelable {

    fun getOpenStatus(): String {
        val now = Calendar.getInstance() // 9:05
        val hh = now.get(Calendar.HOUR_OF_DAY) // 9
        val mm = now.get(Calendar.MINUTE) // 5
        val nowString = String.format("%02d%02d", hh, mm) // 09:05

        if (nowString > openTime && nowString < closeTime) {
            return "abierto"
        } else {
            return "cerrado"
        }
    }
}