package com.kmp.emojihub.android

import android.text.Html
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kmp.emojihub.viewmodel.EmojiHubViewModel

@Composable
fun EmojiHubScreen() {
    val emojiHubViewModel: EmojiHubViewModel = viewModel()

    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "EmojiHub")
        })
    }, content = { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(emojiHubViewModel.items.size) { index ->
                Item(emojiHubViewModel, index)
            }
        }
    })
}

@Composable
private fun Item(
    emojiHubViewModel: EmojiHubViewModel,
    index: Int
) {
    Column(Modifier.padding(end = 16.dp, start = 16.dp, top = 10.dp)) {
        val emojiItem = emojiHubViewModel.items[index]
        Text(text = "Name: ${emojiItem.name}")
        Text(text = "Group: ${emojiItem.group}")
        Text(text = "Category: ${emojiItem.category}")
        Text(text = Html.fromHtml(emojiItem.htmlCode[0]).toString())
        Spacer(modifier = Modifier.padding(8.dp))
        Divider(color = Color.LightGray, thickness = 1.dp)
    }
}