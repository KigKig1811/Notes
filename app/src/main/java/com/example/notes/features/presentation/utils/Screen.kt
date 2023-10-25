package com.example.notes.features.presentation.utils

sealed class Screen(val route: String) {
    object NotesScreen: Screen(route = "notes_screen")
    object UpdateScreen: Screen(route = "update_screen")
}
