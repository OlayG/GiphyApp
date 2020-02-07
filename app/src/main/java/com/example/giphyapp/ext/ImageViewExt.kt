package com.example.giphyapp.ext

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

fun ImageView.loadGif(url: String) {
    Glide.with(this)
        .load(url)
        .transform(RoundedCorners(8))
        .into(this)
}