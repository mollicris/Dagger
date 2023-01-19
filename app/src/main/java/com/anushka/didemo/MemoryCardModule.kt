package com.anushka.didemo

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providerMemoryCard():MemoryCard{
        return MemoryCard()
    }
}