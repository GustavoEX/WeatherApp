package com.example.gustavorodrigues.openweatherapp.data.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.gustavorodrigues.openweatherapp.data.model.WeatherForecast

@Dao
interface ForecastDao {
    @Query("SELECT * FROM weather_data")
    fun getWeatherData(): LiveData<WeatherForecast>
}