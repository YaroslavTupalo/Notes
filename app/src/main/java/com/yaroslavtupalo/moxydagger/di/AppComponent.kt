package com.yaroslavtupalo.moxydagger.di

import com.yaroslavtupalo.moxydagger.mvp.moxy.presenters.MainPresenter
import com.yaroslavtupalo.moxydagger.mvp.moxy.presenters.NotePresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NoteDaoModule::class])
interface AppComponent {
    fun inject(mainPresenter: MainPresenter)

    fun inject(notePresenter: NotePresenter)
}