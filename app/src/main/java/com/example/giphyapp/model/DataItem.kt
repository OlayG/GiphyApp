package com.example.giphyapp.model


import com.google.gson.annotations.SerializedName


data class DataItem(

	@field:SerializedName("import_datetime")
	val importDatetime: String? = null,

	@field:SerializedName("images")
	val images: Images? = null,

	@field:SerializedName("embed_url")
	val embedUrl: String? = null,

	@field:SerializedName("trending_datetime")
	val trendingDatetime: String? = null,

	@field:SerializedName("bitly_url")
	val bitlyUrl: String? = null,

	@field:SerializedName("rating")
	val rating: String? = null,

	@field:SerializedName("is_sticker")
	val isSticker: Int? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("bitly_gif_url")
	val bitlyGifUrl: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("source_tld")
	val sourceTld: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("analytics")
	val analytics: Analytics? = null,

	@field:SerializedName("source_post_url")
	val sourcePostUrl: String? = null,

	@field:SerializedName("content_url")
	val contentUrl: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("username")
	val username: String? = null
)