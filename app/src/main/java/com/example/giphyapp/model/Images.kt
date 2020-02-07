package com.example.giphyapp.model


import com.google.gson.annotations.SerializedName


data class Images(

	@field:SerializedName("preview")
	val preview: Preview? = null,

	@field:SerializedName("original")
	val original: Original? = null,

	@field:SerializedName("preview_gif")
	val previewGif: PreviewGif? = null,

	@field:SerializedName("fixed_height_small")
	val fixedHeightSmall: FixedHeightSmall? = null,

	@field:SerializedName("looping")
	val looping: Looping? = null,

	@field:SerializedName("downsized_still")
	val downsizedStill: DownsizedStill? = null,

	@field:SerializedName("fixed_width")
	val fixedWidth: FixedWidth? = null,

	@field:SerializedName("downsized_large")
	val downsizedLarge: DownsizedLarge? = null,

	@field:SerializedName("fixed_height_downsampled")
	val fixedHeightDownsampled: FixedHeightDownsampled? = null,

	@field:SerializedName("fixed_height_small_still")
	val fixedHeightSmallStill: FixedHeightSmallStill? = null,

	@field:SerializedName("downsized_medium")
	val downsizedMedium: DownsizedMedium? = null,

	@field:SerializedName("fixed_height")
	val fixedHeight: FixedHeight? = null,

	@field:SerializedName("fixed_width_downsampled")
	val fixedWidthDownsampled: FixedWidthDownsampled? = null,

	@field:SerializedName("downsized_small")
	val downsizedSmall: DownsizedSmall? = null,

	@field:SerializedName("fixed_width_small")
	val fixedWidthSmall: FixedWidthSmall? = null,

	@field:SerializedName("original_mp4")
	val originalMp4: OriginalMp4? = null,

	@field:SerializedName("fixed_height_still")
	val fixedHeightStill: FixedHeightStill? = null,

	@field:SerializedName("preview_webp")
	val previewWebp: PreviewWebp? = null,

	@field:SerializedName("fixed_width_small_still")
	val fixedWidthSmallStill: FixedWidthSmallStill? = null,

	@field:SerializedName("480w_still")
	val jsonMember480wStill: JsonMember480wStill? = null,

	@field:SerializedName("fixed_width_still")
	val fixedWidthStill: FixedWidthStill? = null,

	@field:SerializedName("downsized")
	val downsized: Downsized? = null,

	@field:SerializedName("original_still")
	val originalStill: OriginalStill? = null
)