package com.kmp.emojihub.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class EmojiHubRepository(private val httpClient: HttpClient) {

    suspend fun getEmojis(): List<EmojiItem> {
        return try {
            httpClient.get(urlString = "/api/all").body()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }
}