package com.example.notes.features.presentation.update_note

import androidx.lifecycle.ViewModel
import com.example.notes.features.domain.usecase.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UpdateNoteViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
) : ViewModel() {}
