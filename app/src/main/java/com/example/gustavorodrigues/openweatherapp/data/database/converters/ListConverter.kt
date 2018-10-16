package com.example.gustavorodrigues.openweatherapp.data.database.converters

import android.arch.persistence.room.TypeConverter
import com.example.gustavorodrigues.openweatherapp.data.model.Forecast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ListConverter {
    val gson = Gson()

    @TypeConverter
    fun fromStringToList(value: String): List<Forecast> {
        val listType = object : TypeToken<List<Forecast>>() {}.type
        return gson.fromJson(value, listType)
    }

    @TypeConverter
    fun fromListToString(value: List<Forecast>): String {
        return gson.toJson(value)
    }
}