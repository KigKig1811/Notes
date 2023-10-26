package com.example.notes.features.presentation.update_note

import androidx.compose.ui.focus.FocusState

sealed class UpdateNoteEvent{
    data class EnteredTitle(val value: String): UpdateNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): UpdateNoteEvent()
    data class EnteredContent(val value: String): UpdateNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): UpdateNoteEvent()
    data class ChangeColor(val color: Int): UpdateNoteEvent()
    object SaveNote: UpdateNoteEvent()
}
