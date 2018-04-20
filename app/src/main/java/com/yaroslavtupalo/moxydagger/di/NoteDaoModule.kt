package com.yaroslavtupalo.moxydagger.di

import com.yaroslavtupalo.moxydagger.mvp.moxy.orm.NoteDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NoteDaoModule {

    @Provides
    @Singleton
    fun provideNoteDao(): NoteDao = NoteDao()

}