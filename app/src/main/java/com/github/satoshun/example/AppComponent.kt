package com.github.satoshun.example

import com.github.satoshun.example.feature.sub1.Sub1Builder
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@dagger.Component(
  modules = [
    AndroidSupportInjectionModule::class,
    MainBuilder::class,
    Sub1Builder::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @dagger.Component.Builder
  abstract class Builder : AndroidInjector.Builder<App>()
}
