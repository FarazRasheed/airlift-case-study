package com.vw.movies.di.module.activitiesModule

import com.vw.movies.ui.home.MoviesAdapter
import com.vw.movies.ui.home.MovieListActivity
import com.vw.movies.utils.ProgressHUD
import dagger.Module
import dagger.Provides

@Module
class MoviesActivityModule {

    @Provides
    fun provideLoader(activity: MovieListActivity): ProgressHUD {
        return ProgressHUD(activity)
    }

    @Provides
    fun provideLearningAdapter(): MoviesAdapter {
        return MoviesAdapter()
    }

}