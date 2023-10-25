package com.example.notes.di

import android.app.Application
import androidx.room.Room
import com.example.notes.features.data.data_resource.NotesDatabase
import com.example.notes.features.data.repository.NotesRepositoryImpl
import com.example.notes.features.domain.repository.NotesRepository
import com.example.notes.features.domain.usecase.GetNoteUseCase
import com.example.notes.features.domain.usecase.GetNotesUseCase
import com.example.notes.features.domain.usecase.InsertNoteUseCase
import com.example.notes.features.domain.usecase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNotesDatabase(app: Application): NotesDatabase {
        return Room.databaseBuilder(
            app,
            NotesDatabase::class.java,
            NotesDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(database: NotesDatabase): NotesRepository {
        return NotesRepositoryImpl(dao = database.notesDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NotesRepository): NoteUseCases {
        return NoteUseCases(
            getNotesUseCase = GetNotesUseCase(
                repository = repository
            ),
            getNoteUseCase = GetNoteUseCase(
                repository = repository
            ),
            deleteNotesUseCase = GetNotesUseCase(
                repository = repository
            ),
            insertNoteUseCase = InsertNoteUseCase(
                repository = repository
            )
        )
    }
}
