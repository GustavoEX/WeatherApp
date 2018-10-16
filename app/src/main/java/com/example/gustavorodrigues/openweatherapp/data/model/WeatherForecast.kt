package com.example.gustavorodrigues.openweatherapp.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "weather_data")
data class WeatherForecast(
        @PrimaryKey
        @NonNull
        @SerializedName("city")
        @Expose
        var location: City,
        @SerializedName("cnt")
        @Expose
        var count: Int,
        var list: List<Forecast>
)