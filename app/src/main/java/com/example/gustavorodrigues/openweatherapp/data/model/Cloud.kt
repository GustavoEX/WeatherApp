package com.example.gustavorodrigues.openweatherapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Cloud(
        @SerializedName("all")
        @Expose
        var cloudPercentage: Int
) {

    fun getCloudness(): String {
        return "Cloudiness: $cloudPercentage %"
    }
}
