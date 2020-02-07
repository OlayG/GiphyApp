package com.example.giphyapp.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

import com.example.giphyapp.R
import com.example.giphyapp.ext.loadGif
import com.example.giphyapp.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_gif.*

/**
 * A simple [Fragment] subclass.
 */
class GifFragment : Fragment() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(MainViewModel::class.java)
    }
    private var url: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_gif, container, false)


    override fun onStart() {
        super.onStart()
        setUpObservers()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        etQuery.setText("Circus")
        btnLoad.setOnClickListener {
            viewModel.getGifs(etQuery.text.toString())
        }
        ivGif.setOnClickListener {
            url?.let {
                val action = GifFragmentDirections.actionGifFragmentToFullGifFragment(it)
                view.findNavController().navigate(action)
            } ?: run {
                Toast.makeText(context, "No Gif", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setUpObservers() {
        viewModel.giphyResponse.observe(this, Observer { gifResponse ->
            gifResponse.data?.first()?.images?.original?.url?.let {
                ivGif.loadGif(it)
                url = it
            }
        })
        viewModel.errorResponse.observe(this, Observer {

        })
        viewModel.loadingState.observe(this, Observer { show ->
            progress.visibility = if (show) View.VISIBLE else View.GONE
        })
    }

}
