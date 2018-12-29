package com.github.satoshun.example

import android.os.Bundle
import android.view.View
import com.github.satoshun.example.feature.sub1.Sub1Router
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : BaseActivity() {
  @Inject lateinit var sub1Router: Sub1Router

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    findViewById<View>(R.id.route).setOnClickListener {
      val intent = sub1Router.routeToSub1(this)
      startActivity(intent)
    }
  }
}
