package com.example.android.app.model

import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("First_Name")
    val firstName: String,
    @SerializedName("Last_Name")
    val lastName: String
)
