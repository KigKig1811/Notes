package com.example.notes.features.data.mapper

import com.example.notes.features.data.entity.NoteEntity
import com.example.notes.features.domain.result.NotesResult

class NoteMapper {
    fun mapToNoteResult(entity: NoteEntity) = NotesResult(
        title = entity.title,
        content = entity.content,
        timestamp = entity.timestamp,
        color = entity.color,
        id = entity.id ?: -1
    )
}
