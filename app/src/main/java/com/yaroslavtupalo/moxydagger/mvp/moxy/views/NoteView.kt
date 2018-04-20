package com.yaroslavtupalo.moxydagger.mvp.moxy.views

import com.arellomobile.mvp.MvpView
import com.yaroslavtupalo.moxydagger.mvp.moxy.orm.Note

interface NoteView : MvpView {

    fun showNote(note: Note)

    fun onNoteSaved()

    fun onNoteDeleted()

    fun showNoteInfoDialog(noteInfo: String)

    fun hideNoteInfoDialog()

    fun showNoteDeleteDialog()

    fun hideNoteDeleteDialog()

}
