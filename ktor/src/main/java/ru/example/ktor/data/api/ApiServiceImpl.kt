package ru.example.ktor.data.api


import io.ktor.client.call.body
import io.ktor.client.request.get
import ru.example.core.domain.UserActivity

class ApiServiceImpl(private val apiServiceProvider: ApiServiceProvider):ApiService {
    override suspend fun getUserActivity(): UserActivity {
        return apiServiceProvider.httpClient.get("https://www.boredapi.com/api/activity/").body()
    }
}