package com.github.satoshun.example

import android.os.Bundle
import android.view.View
import com.github.satoshun.example.feature.sub1.Sub1RouterImpl

class MainActivity : BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    findViewById<View>(R.id.route).setOnClickListener {
      val intent = Sub1RouterImpl.routeToSub1(this)
      startActivity(intent)
    }
  }
}
