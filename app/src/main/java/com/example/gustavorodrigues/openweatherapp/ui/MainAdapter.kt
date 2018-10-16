package com.example.gustavorodrigues.openweatherapp.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.gustavorodrigues.openweatherapp.data.model.Forecast
import com.example.gustavorodrigues.openweatherapp.databinding.ItemWeatherBinding


class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemWeatherBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val forecast = list[position]
        holder.bind(forecast)
    }

    private val list = mutableListOf<Forecast>()

    fun setData(data: List<Forecast>) {
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemWeatherBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(forecast: Forecast) {
            binding.forecast = forecast
            binding.executePendingBindings()
        }
    }
}