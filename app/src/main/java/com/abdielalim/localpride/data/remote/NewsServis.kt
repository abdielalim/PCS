package com.abdielalim.localpride.data.remote

import com.abdielalim.localpride.data.model.NewsList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsServis {
    @GET("/native/localpride")
    fun listNews() : Call<NewsList>

    @GET("/native/localpride")
    fun  detailNews(@Query("url") url: String) : Call<NewsList>

    @GET("/native/localpride")
    fun searchNews(@Query("q") query: String) : Call<NewsList>
}