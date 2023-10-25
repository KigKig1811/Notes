package com.example.notes.features.domain.usecase

import com.example.notes.features.data.entity.NoteEntity
import com.example.notes.features.domain.repository.NotesRepository

class GetNoteUseCase(private val repository: NotesRepository) {
    suspend operator fun invoke(noteId: Int): NoteEntity? {
        return repository.getNoteById(noteId = noteId)
    }
}
