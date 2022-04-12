package com.example.test

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {

    private val logClient: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
        .build()


    private val retro = Retrofit.Builder()
        .baseUrl("http://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(logClient)
        .build()

    fun getRetro(): SomeDataStore {
        return retro.create(SomeDataStore::class.java)
    }
}