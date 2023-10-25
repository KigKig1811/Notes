package com.example.notes.features.domain.repository

import com.example.notes.features.data.entity.NoteEntity
import kotlinx.coroutines.flow.Flow


interface NotesRepository {
    fun getNotes(): Flow<List<NoteEntity>>

    suspend fun getNoteById(noteId: Int): NoteEntity?

    suspend fun insertNote(note: NoteEntity)

    suspend fun deleteNote(note: NoteEntity)
}
