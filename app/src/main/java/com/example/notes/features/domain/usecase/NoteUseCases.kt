package com.example.notes.features.domain.usecase

data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val deleteNotesUseCase: DeleteNoteUseCase,
    val insertNoteUseCase: InsertNoteUseCase,
)

