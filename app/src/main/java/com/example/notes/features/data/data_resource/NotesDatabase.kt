package com.example.notes.features.data.data_resource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notes.features.data.entity.NoteEntity

@Database(
    entities = [NoteEntity::class],
    version = 1
)
abstract class NotesDatabase : RoomDatabase() {

    abstract val notesDao: NotesDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}
