package com.github.satoshun.example.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.MainFragBinding

class MainFragment : Fragment(R.layout.main_frag) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val binding = MainFragBinding.bind(view)

    binding.colorStateAlpha.setOnClickListener {
      findNavController().navigate(R.id.nav_color_state_list_alpha)
    }

    binding.shapeSolid.setOnClickListener {
      findNavController().navigate(R.id.nav_color_state_list_shape_solid)
    }
  }
}
