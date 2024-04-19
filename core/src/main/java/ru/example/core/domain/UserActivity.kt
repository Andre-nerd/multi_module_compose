package ru.example.core.domain

import kotlinx.serialization.Serializable

@Serializable
data class UserActivity(
    val activity: String = "no info",
)
