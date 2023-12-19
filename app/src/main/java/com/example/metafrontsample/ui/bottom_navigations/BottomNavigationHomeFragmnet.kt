package com.example.metafrontsample.ui.bottom_navigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.metafrontsample.R
import com.example.metafrontsample.databinding.FragmentBottomNavigationHomeFragmnetBinding
import com.example.metafrontsample.ui.adapters.innerAdapters.ExpandableAdapter
import com.example.metafrontsample.ui.adapters.innerAdapters.InfoListAdapter
import com.example.metafrontsample.ui.adapters.innerAdapters.SliderAdapter
import com.example.metafrontsample.ui.adapters.innerAdapters.VideoAdapter
import com.example.metafrontsample.ui.bottom_navigations.viewModels.BottomNavigationHomeFragmentViewModel


class BottomNavigationHomeFragmnet : Fragment() {

    val binding: FragmentBottomNavigationHomeFragmnetBinding by lazy {
        FragmentBottomNavigationHomeFragmnetBinding.inflate(layoutInflater)
    }

    private val mainViewModel : BottomNavigationHomeFragmentViewModel by viewModels()

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
            lifecycleOwner = this@BottomNavigationHomeFragmnet
        }
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        with(binding) {
            rvMain.layoutManager = LinearLayoutManager(requireContext())
            val expandableAdapter = ExpandableAdapter()
            val videoAdapter = VideoAdapter()
            val sliderAdapter = SliderAdapter(requireActivity())
            val infoAdapter = InfoListAdapter()
            val adapter = ConcatAdapter(expandableAdapter, sliderAdapter)
            rvMain.adapter = adapter
        }


    }

}