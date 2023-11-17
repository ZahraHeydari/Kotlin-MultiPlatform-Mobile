package com.kmp.emojihub.viewmodel

import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

class EmojiHubViewModelHelper : KoinComponent {

    private val emojiHubViewModel: EmojiHubViewModel = get()

    @NativeCoroutinesState
    val items = emojiHubViewModel.items
}