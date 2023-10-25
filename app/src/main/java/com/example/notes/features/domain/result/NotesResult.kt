package com.example.notes.features.domain.result


data class NotesResult(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    val id: Int,
)
