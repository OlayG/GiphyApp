package com.example.giphyapp.model


import com.google.gson.annotations.SerializedName


data class DownsizedLarge(

	@field:SerializedName("size")
	val size: String? = null,

	@field:SerializedName("width")
	val width: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: String? = null
)