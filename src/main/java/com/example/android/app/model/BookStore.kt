package com.example.android.app.model

import com.google.gson.annotations.SerializedName

data class BookStore(
    @SerializedName("Books")
    val books: List<Book>,
    @SerializedName("Magazines")
    val magazines: List<Magazine>
)
