package com.example.android.app.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("Authors")
    val authors: List<Author>,
    @SerializedName("Edition")
    val edition: Int,
    @SerializedName("ISBN")
    val iSBN: String,
    @SerializedName("Price")
    val price: Int,
    @SerializedName("Remark")
    val remark: String,
    @SerializedName("Title")
    val title: String
)
