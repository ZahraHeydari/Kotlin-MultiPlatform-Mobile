package com.kmp.emojihub.di

import com.kmp.emojihub.data.EmojiHubRepository
import com.kmp.emojihub.data.httpClient
import com.kmp.emojihub.viewmodel.EmojiHubViewModel
import com.kmp.emojihub.viewmodel.SharedViewModel
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.definition.Definition
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.qualifier.Qualifier
import org.koin.dsl.module

expect inline fun <reified T : SharedViewModel> Module.sharedViewModel(
    qualifier: Qualifier? = null,
    noinline definition: Definition<T>
): KoinDefinition<T>

val appModule = module {
    single {
        httpClient {
            expectSuccess = true // To throw exception in case of error occurrence
            defaultRequest {
                url("https://emojihub.yurace.pro") // Base URL for all requests
            }
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                })
            }
            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.ALL
            }
        }
    }

    single {
        EmojiHubRepository(get())
    }

    sharedViewModel {
        EmojiHubViewModel(get())
    }
}