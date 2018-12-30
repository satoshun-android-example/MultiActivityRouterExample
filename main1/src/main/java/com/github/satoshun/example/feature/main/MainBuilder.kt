package com.github.satoshun.example.feature.main

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
  includes = [MainActivityModule::class]
)
interface MainBuilder

@Module
internal interface MainActivityModule {
  @ContributesAndroidInjector fun contributeMainActivity(): MainActivity

  @Binds fun bindMainRouter(impl: MainRouterImpl): MainRouter
}
