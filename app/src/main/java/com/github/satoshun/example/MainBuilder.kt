package com.github.satoshun.example

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainBuilder {
  @ContributesAndroidInjector
  fun contributeMainActivity(): MainActivity
}
