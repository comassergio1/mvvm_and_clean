package com.example.mvvm_and_clean.di

import com.example.mvvm_and_clean.data.remote.RandomUserRepositoryImpl
import com.example.mvvm_and_clean.domain.repository.RandomUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRandomUserRepository(
        randomUserRepositoryImpl: RandomUserRepositoryImpl
    ): RandomUserRepository
}