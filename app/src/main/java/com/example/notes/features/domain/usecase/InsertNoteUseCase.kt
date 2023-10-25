package com.example.notes.features.domain.usecase

import com.example.notes.features.data.entity.NoteEntity
import com.example.notes.features.data.exception.InvalidNoteException
import com.example.notes.features.domain.repository.NotesRepository

class InsertNoteUseCase(
    private val repository: NotesRepository
) {
    suspend operator fun invoke(note: NoteEntity) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note = note)
    }

}
