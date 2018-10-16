package com.example.gustavorodrigues.openweatherapp.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {

//    val handler = DataHandler.instance.weatherHandler
//    private lateinit var forecastData : RetrofitLiveData<WeatherForecast>
//
//    init {
//        setLocation("")
//    }
//
//    fun getWeatherData() : RetrofitLiveData<WeatherForecast> {
//        return forecastData
//    }
//
//    fun setLocation(location : String) {
//       forecastData = handler.getWeatherData(location)
//    }
//
//    override fun onCleared() {
//        mockData.cancel()
//    }
}