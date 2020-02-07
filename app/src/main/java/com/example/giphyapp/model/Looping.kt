package com.example.giphyapp.model


import com.google.gson.annotations.SerializedName


data class Looping(

	@field:SerializedName("mp4")
	val mp4: String? = null,

	@field:SerializedName("mp4_size")
	val mp4Size: String? = null
)