package ru.example.ktor.data.api

import ru.example.core.domain.UserActivity

interface ApiService {
    suspend fun getUserActivity(): UserActivity
}