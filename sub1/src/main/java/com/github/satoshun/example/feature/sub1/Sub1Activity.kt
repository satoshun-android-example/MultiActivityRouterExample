package com.github.satoshun.example.feature.sub1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Sub1Activity : AppCompatActivity(),
  Sub1Contract.View {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val presenter = object : Sub1Contract.Presenter {}
  }
}
