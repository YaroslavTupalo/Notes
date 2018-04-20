package com.yaroslavtupalo.moxydagger.utils

import android.content.Context
import com.yaroslavtupalo.moxydagger.app.MyApp

private val prefs by lazy {
    MyApp.context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
}

fun getNotesSortMethodName(defaultValue: String): String = prefs.getString("sort_method", defaultValue)

fun setNotesSortMethod(sortMethod: String) {
    prefs.edit().putString("sort_method", sortMethod).apply()
}