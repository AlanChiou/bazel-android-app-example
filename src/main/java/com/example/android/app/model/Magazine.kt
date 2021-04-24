package com.example.android.app.model

import com.google.gson.annotations.SerializedName

data class Magazine(
    @SerializedName("Month")
    val month: String,
    @SerializedName("Title")
    val title: String,
    @SerializedName("Year")
    val year: Int
)
