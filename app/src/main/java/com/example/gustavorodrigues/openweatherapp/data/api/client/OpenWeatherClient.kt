package com.example.gustavorodrigues.openweatherapp.data.api.client

import com.example.gustavorodrigues.openweatherapp.data.model.WeatherForecast
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherClient {
    @GET("data/2.5/forecast")
    fun getWeatherData(
            @Query("q")
            location: String,
            @Query("units")
            units: String = "metric",
            @Query("appid")
            appid: String = "63e35e740b610400e1b0bc2987f7a237"
    ): Call<WeatherForecast>
}