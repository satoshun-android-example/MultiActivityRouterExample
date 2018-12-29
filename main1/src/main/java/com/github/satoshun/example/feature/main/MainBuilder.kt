package com.github.satoshun.example.feature.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainBuilder {
  @ContributesAndroidInjector
  fun contributeMainActivity(): MainActivity
}
