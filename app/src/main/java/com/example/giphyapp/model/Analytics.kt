package com.example.giphyapp.model

import com.google.gson.annotations.SerializedName

data class Analytics(

	@field:SerializedName("onclick")
	val onclick: Onclick? = null,

	@field:SerializedName("onsent")
	val onsent: Onsent? = null,

	@field:SerializedName("onload")
	val onload: Onload? = null
)