package com.example.notes.features.domain.usecase

import com.example.notes.features.data.entity.NoteEntity
import com.example.notes.features.domain.repository.NotesRepository

class DeleteNoteUseCase(private val repository: NotesRepository) {
    suspend operator fun invoke(note: NoteEntity) {
        repository.deleteNote(note = note)
    }
}
