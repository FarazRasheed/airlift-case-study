package com.vw.movies.di.module.activitiesModule

import com.vw.movies.ui.home.MovieDetailActivity
import com.vw.movies.utils.ProgressHUD
import dagger.Module
import dagger.Provides

@Module
class MovieDetailActivityModule {

    @Provides
    fun provideLoader(activity: MovieDetailActivity): ProgressHUD {
        return ProgressHUD(activity)
    }


}