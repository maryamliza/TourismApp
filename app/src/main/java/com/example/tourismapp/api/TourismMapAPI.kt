package com.example.tourismapp.api

import com.example.tourismapp.Place
import retrofit2.Call
import retrofit2.http.GET

interface TourismMapAPI {
    @GET("places")
    fun getPlaces(): Call <List<Place>>
}