package com.example.gustavorodrigues.openweatherapp.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import com.example.gustavorodrigues.openweatherapp.data.database.converters.CityConverter
import com.example.gustavorodrigues.openweatherapp.data.database.converters.ListConverter
import com.example.gustavorodrigues.openweatherapp.data.database.dao.ForecastDao
import com.example.gustavorodrigues.openweatherapp.data.model.WeatherForecast

@Database(entities = [WeatherForecast::class], version = 1, exportSchema = false)
@TypeConverters(ListConverter::class, CityConverter::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun forecastDao(): ForecastDao

    companion object {
        private var instance: WeatherDatabase? = null
        fun getInstance(context: Context): WeatherDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                        context.applicationContext,
                        WeatherDatabase::class.java,
                        "database")
                        .build()
            }
            return instance!!
        }
    }
}