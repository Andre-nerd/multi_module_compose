package com.example.sql_ktor_no_kmp.di

import com.example.sql_ktor_no_kmp.data.database.DatabaseDriverFactory
import com.example.sql_ktor_no_kmp.presentation.viewmodel.ApiViewModel
import com.example.sql_ktor_no_kmp.presentation.viewmodel.DatabaseViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<DatabaseDriverFactory> { DatabaseDriverFactory(get()) }
    single<ru.example.ktor.data.api.ApiServiceProvider> { ru.example.ktor.data.api.ApiServiceProvider() }
    single<ru.example.ktor.data.api.ApiService> { ru.example.ktor.data.api.ApiServiceImpl(get()) }
    viewModel { DatabaseViewModel(get()) }
    viewModel { ApiViewModel(get()) }
}