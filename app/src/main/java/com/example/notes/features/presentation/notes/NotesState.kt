package com.example.notes.features.presentation.notes

import com.example.notes.features.data.entity.NoteEntity
import com.example.notes.features.domain.utils.NoteOrder
import com.example.notes.features.domain.utils.OrderType

data class NotesState(
    val notes: List<NoteEntity> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,
)
