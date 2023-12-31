
package com.example.mvvmtemplate.di

import com.example.mvvmtemplate.network.LoginApi
import com.example.mvvmtemplate.repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CelebrityModule {

    @Provides
    @Singleton
    internal fun provideCarListRepository(service: LoginApi): LoginRepository {
        return LoginRepository(service)
    }
}
