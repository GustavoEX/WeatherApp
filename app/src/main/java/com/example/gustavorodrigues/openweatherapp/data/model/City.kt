package com.example.gustavorodrigues.openweatherapp.data.model

import android.arch.persistence.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["cityName", "countryCode"])
data class City(
        @SerializedName("name")
        @Expose
        var cityName: String,
        @SerializedName("country")
        @Expose
        var countryCode: String
)