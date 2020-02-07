package com.example.giphyapp.retrofit

import com.example.giphyapp.model.GiphyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyService {

    @GET(GIF_PATH)
    fun getGifs(
        @Query("q") query: String,
        @Query("limit") limit: String,
        @Query("api_key") apiKey: String = API_KEY
    ): Call<GiphyResponse>

    companion object {
        const val GIF_PATH = "/v1/gifs/search"
        const val API_KEY = "yBQBYcU50xilufwjAwSwbvxCahLU0ZDE"
    }
}