package com.example.notes.features.presentation.notes

import com.example.notes.features.data.entity.NoteEntity
import com.example.notes.features.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: NoteEntity) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
