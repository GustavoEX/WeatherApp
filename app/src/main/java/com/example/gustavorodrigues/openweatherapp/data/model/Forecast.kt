package com.example.gustavorodrigues.openweatherapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat

data class Forecast(
        @SerializedName("dt")
        @Expose
        var dt: Long,
        @SerializedName("dt_txt")
        @Expose
        var date: String,
        @SerializedName("main")
        @Expose
        var weatherDetails: WeatherDetails,
        @SerializedName("weather")
        @Expose
        var forecastDetails: List<Weather>,
        @SerializedName("clouds")
        @Expose
        var cloudiness: Cloud,
        var wind: Wind
) {
    fun getDateInFormat(): String {
        val dateString = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date)
        val format = SimpleDateFormat("dd/MM - HH:mm")
        return format.format(dateString)
    }
}