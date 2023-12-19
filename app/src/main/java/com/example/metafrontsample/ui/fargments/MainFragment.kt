package com.example.metafrontsample.ui.fargments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.metafrontsample.R
import com.example.metafrontsample.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters

    val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    private val navHost: NavHostFragment by lazy {
        childFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
    }

    private val navController: NavController by lazy {
        navHost.navController
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
        setUpBottomNavigation()
    }

    private fun setUpBottomNavigation() {
        binding.bottomNav.setupWithNavController(navController)


        binding.bottomNav.setOnItemSelectedListener { item ->
            val navOption =
                NavOptions.Builder().setPopUpTo(navController.currentDestination?.id!!, true)
                    .build()
            when (item.itemId) {
                R.id.home -> {
                    if (navController.currentDestination?.id != R.id.home) {
                        navController.navigate(R.id.bottomNavigationHomeFragmnet, null, navOption)
                    }
                }

                R.id.faq -> {
                    if (navController.currentDestination?.id != R.id.faq) {
                        navController.navigate(R.id.bottomNaviagtionFaqFragment, null, navOption)
                    }
                }
            }
            true
        }
    }

}