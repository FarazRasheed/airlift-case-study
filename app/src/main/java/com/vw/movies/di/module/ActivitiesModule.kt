package com.vw.movies.di.module

import com.vw.movies.di.module.activitiesModule.*
import com.vw.movies.ui.home.MovieListActivity
import com.vw.movies.ui.home.MovieDetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {


    @ContributesAndroidInjector(modules = [MoviesActivityModule::class])
    internal abstract fun contributeLearningPathwayActivity(): MovieListActivity
    @ContributesAndroidInjector(modules = [MovieDetailActivityModule::class])
    internal abstract fun contributeLessonDetailActivity(): MovieDetailActivity

}