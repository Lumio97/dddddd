package com.example.dddd.data

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface SimpleApi {
    companion object{
        val SERVER_HOST = "https://jsonplaceholder.typicode.com/"
    }
    @GET("/posts")
    fun getAllPosts(): Call<List<Post>>

    @GET("/posts")
    fun getPostsByUserId(@Query("userId")userId: Int): Call<List<Post>>

    @POST("/posts")
    fun createNewPost(@Body post: Post):Call<Post>
}