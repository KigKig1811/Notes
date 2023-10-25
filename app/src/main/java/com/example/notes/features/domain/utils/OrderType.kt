package com.example.notes.features.domain.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
