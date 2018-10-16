package com.example.gustavorodrigues.openweatherapp.data.repository

import android.app.Application
import com.example.gustavorodrigues.openweatherapp.data.database.WeatherDatabase


class WeatherRepository(application: Application) {
    private val dao = WeatherDatabase.getInstance(application).forecastDao()
    private val weatherData = dao.getWeatherData()
//    private val retrofitDataHandler =
}