package com.example.gustavorodrigues.openweatherapp.ui

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

object DataBinder {
    @BindingAdapter("iconCode")
    @JvmStatic
    fun setImageUrl(imageView: ImageView, iconCode: String) {
        val context = imageView.context
        val url = "http://openweathermap.org/img/w/$iconCode.png"
        Glide.with(context).load(url).into(imageView)
    }
}