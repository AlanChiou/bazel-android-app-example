package com.example.android.app.server

import com.example.android.app.model.BookStore
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface BookStoreService {

    @GET("ernestas-poskus/data-structures/master/JSON/Bookstore.json")
    fun getBookStore(): Call<BookStore>

    companion object {

        fun get(): BookStoreService {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(BookStoreService::class.java)
        }
    }
}
