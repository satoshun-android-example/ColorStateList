package com.github.satoshun.example.main.colorstatelistshapesolid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.satoshun.example.databinding.ColorStateListAlphaFragBinding
import com.github.satoshun.example.databinding.ColorStateListShapeSolidFragBinding

class ColorStateListShapeSolidFragment : Fragment() {
  private lateinit var binding: ColorStateListShapeSolidFragBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = ColorStateListShapeSolidFragBinding.inflate(
      inflater,
      container,
      false
    )
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
  }
}
