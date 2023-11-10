package com.kmp.emojihub.data

import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class EmojiHubRepository {

    private val httpClient = httpClient {
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

    suspend fun getEmojis(): List<EmojiItem> {
        return try {
            httpClient.get(urlString = "/api/all").body()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }
}