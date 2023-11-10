package com.kmp.emojihub.data

import kotlinx.serialization.Serializable

@Serializable
data class EmojiItem(
    val category: String,
    val group: String,
    val htmlCode: List<String>,
    val name: String,
    val unicode: List<String>
)