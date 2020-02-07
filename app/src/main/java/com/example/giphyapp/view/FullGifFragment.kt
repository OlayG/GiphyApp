package com.example.giphyapp.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.giphyapp.R
import com.example.giphyapp.ext.loadGif
import kotlinx.android.synthetic.main.fragment_full_gif.*

/**
 * A simple [Fragment] subclass.
 */
class FullGifFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_full_gif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FullGifFragmentArgs.fromBundle(arguments!!).gifUrl.let {
            ivFullGif.loadGif(it)
        }
    }

}
