package com.kmp.emojihub.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

actual open class SharedViewModel: ViewModel() {

    actual val sharedViewModelScope: CoroutineScope = this.viewModelScope

    actual override fun onCleared() {
        super.onCleared()
    }
}