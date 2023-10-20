package com.kmp.emojihub.viewmodel

import com.kmp.emojihub.data.EmojiItem
import com.kmp.emojihub.data.getMockResponses

class EmojiHubViewModel : SharedViewModel() {
    val items: List<EmojiItem> = getMockResponses()
}