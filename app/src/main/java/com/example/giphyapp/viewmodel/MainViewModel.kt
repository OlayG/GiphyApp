package com.example.giphyapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.giphyapp.model.GiphyResponse
import com.example.giphyapp.repository.GiphyRepo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    private val _giphyResponse = MutableLiveData<GiphyResponse>()
    val giphyResponse: LiveData<GiphyResponse> = _giphyResponse

    private val _errorResponse = MutableLiveData<String>()
    val errorResponse: LiveData<String> = _errorResponse

    private val _loadingState = MutableLiveData<Boolean>()
    val loadingState: LiveData<Boolean> = _loadingState

    fun getGifs(query: String, limit: String = "1") {
        _loadingState.value = true
        GiphyRepo.getGifs(query, limit)
            .enqueue(object : Callback<GiphyResponse> {
                override fun onFailure(call: Call<GiphyResponse>, t: Throwable) {
                    _loadingState.value = false
                    _errorResponse.value = t.localizedMessage
                }

                override fun onResponse(
                    call: Call<GiphyResponse>,
                    response: Response<GiphyResponse>
                ) {
                    _loadingState.value = false
                    response.body()?.let { giphyResponse ->
                        _giphyResponse.value = giphyResponse
                    } ?: run {
                        _errorResponse.value = "No results found"
                    }
                }

            })
    }
}