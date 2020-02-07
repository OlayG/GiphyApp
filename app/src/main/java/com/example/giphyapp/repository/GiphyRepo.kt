package com.example.giphyapp.repository

import com.example.giphyapp.model.GiphyResponse
import com.example.giphyapp.retrofit.GiphyService
import com.example.giphyapp.retrofit.RetrofitInstance
import retrofit2.Call

object GiphyRepo {

    fun getGifs(query: String, limit: String): Call<GiphyResponse> =
        RetrofitInstance
            .getInstance()
            .create(GiphyService::class.java)
            .getGifs(query, limit)

}