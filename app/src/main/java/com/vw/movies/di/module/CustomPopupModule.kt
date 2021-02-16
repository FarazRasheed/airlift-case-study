package com.vw.movies.di.module

import com.vw.movies.utils.CustomPopups
import dagger.Module
import dagger.Provides

@Module
class CustomPopupModule {

    @Provides
    fun provideCustomPopups(): CustomPopups {
        return CustomPopups()
    }
}