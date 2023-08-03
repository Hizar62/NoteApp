package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(Note.InvalidNoteException::class)
    suspend operator fun invoke(note : Note){
        if (note.title.isBlank()){
            throw Note.InvalidNoteException("The Title of note can't be empty")
        }
        if(note.content.isBlank()){
            throw Note.InvalidNoteException("The Content of note can't be empty")

        }


        repository.insertNote(note)
    }
}