package com.kmp.emojihub.data

data class ResponseItem(val emojiList: ArrayList<EmojiItem>)

data class EmojiItem(
    val category: String,
    val group: String,
    val htmlCode: List<String>,
    val name: String,
    val unicode: List<String>
)

fun getMockResponses() = listOf(
    EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128512;"),
        name = "grinning face",
        unicode = listOf("U+1F600")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128513;"),
        name = "grinning face with smiling eyes",
        unicode = listOf("U+1F601")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128514;"),
        name = "face with tears of joy",
        unicode = listOf("U+1F602")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#129315;"),
        name = "rolling on the floor laughing",
        unicode = listOf("U+1F923")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128515;"),
        name = "smiling face with open mouth",
        unicode = listOf("U+1F603")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128521;"),
        name = "winking face",
        unicode = listOf("U+1F609")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128522;"),
        name = "smiling face with smiling eyes",
        unicode = listOf("U+1F60A")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128523;"),
        name = "face savouring delicious food",
        unicode = listOf("U+1F60B")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128536;"),
        name = "face throwing a kiss",
        unicode = listOf("U+1F618")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#128578;"),
        name = "slightly smiling face",
        unicode = listOf("U+1F642")
    ), EmojiItem(
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("&#129303;"),
        name = "hugging face",
        unicode = listOf("U+1F917")
    ), EmojiItem(
        category = "smileys and people",
        group = "face neutral",
        htmlCode = listOf("&#129300;"),
        name = "thinking face",
        unicode = listOf("U+1F914")
    ), EmojiItem(
        category = "smileys and people",
        group = "face neutral",
        htmlCode = listOf("&#128528;"),
        name = "neutral face",
        unicode = listOf("U+1F610")
    ), EmojiItem(
        category = "smileys and people",
        group = "face neutral",
        htmlCode = listOf("&#128529;"),
        name = "expressionless face",
        unicode = listOf("U+1F611")
    ), EmojiItem(
        category = "smileys and people",
        group = "face neutral",
        htmlCode = listOf("&#128566;"),
        name = "face without mouth",
        unicode = listOf("U+1F636")
    ), EmojiItem(
        category = "smileys and people",
        group = "face neutral",
        htmlCode = listOf("&#128580;"),
        name = "face with rolling eyes",
        unicode = listOf("U+1F644")
    )
)