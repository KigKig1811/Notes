package com.example.notes.features.data.repository

import com.example.notes.features.data.data_resource.NotesDao
import com.example.notes.features.data.entity.NoteEntity
import com.example.notes.features.domain.repository.NotesRepository
import kotlinx.coroutines.flow.Flow

class NotesRepositoryImpl(
    private val dao: NotesDao
) : NotesRepository {
    override fun getNotes(): Flow<List<NoteEntity>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(noteId: Int): NoteEntity? {
        return dao.getNoteById(id = noteId)
    }

    override suspend fun insertNote(note: NoteEntity) {
        return dao.insertNote(note = note)
    }

    override suspend fun deleteNote(note: NoteEntity) {
        return dao.deleteNote(note = note)
    }

}
