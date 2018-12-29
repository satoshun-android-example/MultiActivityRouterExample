package com.github.satoshun.example.feature.sub1

import android.content.Context
import android.content.Intent

object Sub1Router {
  fun routeToSub1(context: Context): Intent {
    return Intent(context, Sub1Activity::class.java)
  }
}
