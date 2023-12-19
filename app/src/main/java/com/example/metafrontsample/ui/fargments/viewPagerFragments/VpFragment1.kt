package com.example.metafrontsample.ui.fargments.viewPagerFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.metafrontsample.R
import com.example.metafrontsample.databinding.FragmentVp1Binding
import com.example.metafrontsample.model.ViewPagerModel


class VpFragment1(var model: ViewPagerModel) : Fragment() {

    val binding: FragmentVp1Binding by lazy {
        FragmentVp1Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            tv1.text = model.text1
            tv2.text = model.text2
        }

    }
}