package io.github.junrdev.mars.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.mars.service.ManifestRoverService

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesMarsRoverManifestService(): ManifestRoverService = ManifestRoverService.create()

}