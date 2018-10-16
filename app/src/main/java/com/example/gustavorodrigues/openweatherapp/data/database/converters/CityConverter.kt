package com.example.gustavorodrigues.openweatherapp.data.database.converters

import android.arch.persistence.room.TypeConverter
import com.example.gustavorodrigues.openweatherapp.data.model.City
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CityConverter {
    val gson = Gson()
    @TypeConverter
    fun fromStringToCity(value: String): City {
        val cityType = object : TypeToken<City>() {}.type
        return gson.fromJson(value, cityType)
    }

    @TypeConverter
    fun fromCityToString(value: City): String {
        return gson.toJson(value)
    }
}