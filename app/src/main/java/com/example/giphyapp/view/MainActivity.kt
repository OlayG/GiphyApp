package com.example.giphyapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.giphyapp.R
import com.example.giphyapp.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etQuery.setText("Monkey")
        btnLoad.setOnClickListener {
            viewModel.getGifs(etQuery.text.toString())
        }

        setUpObservers()
    }

    private fun setUpObservers() {
        viewModel.giphyResponse.observe(this, Observer { gifResponse ->
            val url = gifResponse.data?.first()?.images?.original?.url
            Glide.with(this)
                .load(url)
                .transform(RoundedCorners(8))
                .into(ivGif)
        })
        viewModel.errorResponse.observe(this, Observer {

        })
        viewModel.loadingState.observe(this, Observer { show ->
            progress.visibility = if (show) View.VISIBLE else View.GONE
        })
    }
}
