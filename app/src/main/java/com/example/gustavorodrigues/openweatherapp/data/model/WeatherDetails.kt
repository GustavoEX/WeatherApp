package com.example.gustavorodrigues.openweatherapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WeatherDetails(
        @SerializedName("temp")
        @Expose
        var temperature: Float,
        @SerializedName("temp_min")
        @Expose
        var minTemp: Float,
        @SerializedName("temp_max")
        @Expose
        var maxTemp: Float,
        var humidity: Int
) {
    fun getTemperature(): String {
        return "${this.temperature}ºC"
    }

    fun getMinTemp(): String {
        return "Min: ${this.minTemp}ºC"
    }

    fun getMaxTemp(): String {
        return "Max: ${this.maxTemp}ºC"
    }

    fun getHumidity(): String {
        return "Humidity: ${this.humidity}%"
    }
}
