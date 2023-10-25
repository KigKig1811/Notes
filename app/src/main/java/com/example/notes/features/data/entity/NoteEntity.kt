package com.example.notes.features.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notes.ui.theme.BabyBlue
import com.example.notes.ui.theme.LightGreen
import com.example.notes.ui.theme.RedOrange
import com.example.notes.ui.theme.RedPink
import com.example.notes.ui.theme.Violet

@Entity
data class NoteEntity(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}


