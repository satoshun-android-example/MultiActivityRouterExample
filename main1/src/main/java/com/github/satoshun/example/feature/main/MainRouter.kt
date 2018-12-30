package com.github.satoshun.example.feature.main

import android.content.Context
import android.content.Intent
import javax.inject.Inject

internal class MainRouterImpl @Inject constructor() : MainRouter {
  override fun routeToMain(context: Context): Intent {
    return Intent(context, MainActivity::class.java)
  }
}
