package com.example.tourismapp.model


import com.example.tourismapp.api.TourismMapAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitManager {

    private const val baseUrl = "https://private-a6b37-maryamapi.apiary-mock.com/"

    fun getService(): TourismMapAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(TourismMapAPI::class.java)
    }
}

fun <T> Call<T>.onSuccess(block: (T) -> Unit) {
    this.enqueue(object: Callback<T> {
        override fun onResponse(call: Call<T>, response: Response<T>) {
            val body = response.body()
            body?.let { block(it) }
        }

        override fun onFailure(call: Call<T>, t: Throwable) {
            t.printStackTrace()
        }
    })
}
