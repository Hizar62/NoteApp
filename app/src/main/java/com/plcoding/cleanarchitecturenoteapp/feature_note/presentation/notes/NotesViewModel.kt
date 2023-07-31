package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes

import androidx.constraintlayout.solver.state.State
import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.Stack
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
): ViewModel(){

    private val _state = mutableListOf(NoteState())
    val state: State<NoteState> = _state




    fun onEvent(event: NotesEvent){
        when(event){
            is NotesEvent.Order ->{

            }
            is NotesEvent.DeleteNote ->{

            }
            is NotesEvent.RestoreNote ->{

            }
            is NotesEvent.ToggleOrderSection ->{

            }
        }
    }

}