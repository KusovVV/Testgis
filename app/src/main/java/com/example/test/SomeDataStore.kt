package com.example.test

import retrofit2.http.GET

interface SomeDataStore {

    @GET("/posts")
    suspend fun someGet() : List<Post>

}
