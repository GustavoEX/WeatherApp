package com.example.gustavorodrigues.openweatherapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Weather(
        var id: Int,
        @SerializedName("main")
        @Expose
        var condition: String,
        var description: String,
        @SerializedName("icon")
        @Expose
        var iconCode: String
)
