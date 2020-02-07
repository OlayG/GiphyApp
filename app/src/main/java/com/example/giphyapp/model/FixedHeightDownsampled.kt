package com.example.giphyapp.model


import com.google.gson.annotations.SerializedName


data class FixedHeightDownsampled(

	@field:SerializedName("size")
	val size: String? = null,

	@field:SerializedName("width")
	val width: String? = null,

	@field:SerializedName("webp")
	val webp: String? = null,

	@field:SerializedName("webp_size")
	val webpSize: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: String? = null
)