package com.kmp.emojihub.viewmodel

import com.kmp.emojihub.data.EmojiHubRepository
import com.kmp.emojihub.data.EmojiItem
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class EmojiHubViewModel : SharedViewModel() {

    private val githubRepository = EmojiHubRepository()

    private val _items = MutableStateFlow<List<EmojiItem>>(listOf())

    @NativeCoroutinesState
    val items = _items.asStateFlow()

    init {
        sharedViewModelScope.launch {
            _items.update {
                githubRepository.getEmojis()
            }
        }
    }
}