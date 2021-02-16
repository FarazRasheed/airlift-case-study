package com.vw.movies.di.module

import com.vw.movies.services.networkServices.NetworkService
import com.vw.movies.services.repositories.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoriesModule {

    @Provides
    @Singleton
    fun provideRepository(networkService : NetworkService): Repository {
        return Repository(networkService)
    }
}