package com.github.satoshun.example.feature.sub1

import dagger.Binds
import dagger.Module

@Module
interface Sub1Builder {
  @Binds fun bindSub1Router(impl: Sub1RouterImpl): Sub1Router
}
