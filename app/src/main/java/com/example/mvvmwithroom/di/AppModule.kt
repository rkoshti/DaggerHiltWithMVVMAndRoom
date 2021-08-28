package com.example.mvvmwithroom.di

import android.content.Context
import androidx.room.Room
import com.example.mvvmwithroom.db.UserDatabase
import com.example.mvvmwithroom.other.AppConstants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideUserDb(@ApplicationContext app:Context) = Room.databaseBuilder(
        app,
        UserDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideUserDao(userDb : UserDatabase) = userDb.getUserDao()

}