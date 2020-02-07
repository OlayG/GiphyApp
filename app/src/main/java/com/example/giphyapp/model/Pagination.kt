package com.example.giphyapp.model


import com.google.gson.annotations.SerializedName


data class Pagination(

	@field:SerializedName("offset")
	val offset: Int? = null,

	@field:SerializedName("total_count")
	val totalCount: Int? = null,

	@field:SerializedName("count")
	val count: Int? = null
)