package com.yaroslavtupalo.moxydagger.app

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.reactiveandroid.ReActiveAndroid
import com.reactiveandroid.ReActiveConfig
import com.reactiveandroid.internal.database.DatabaseConfig
import com.yaroslavtupalo.moxydagger.di.AppComponent
import com.yaroslavtupalo.moxydagger.di.DaggerAppComponent
import com.yaroslavtupalo.moxydagger.di.NoteDaoModule
import com.yaroslavtupalo.moxydagger.mvp.moxy.orm.AppDatabase
import com.yaroslavtupalo.moxydagger.mvp.moxy.orm.Note

class MyApp: Application() {

    companion object {
        lateinit var graph: AppComponent

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()

        context = this

        graph = DaggerAppComponent.builder().noteDaoModule(NoteDaoModule()).build()

        val appDatabaseConfig = DatabaseConfig.Builder(AppDatabase::class.java)
                .addModelClasses(Note::class.java)
                .build()

        ReActiveAndroid.init(ReActiveConfig.Builder(this)
                .addDatabaseConfigs(appDatabaseConfig)
                .build())
    }
}