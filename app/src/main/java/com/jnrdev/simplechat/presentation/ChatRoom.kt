package com.jnrdev.simplechat.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jnrdev.simplechat.data.Chat
import com.jnrdev.simplechat.presentation.components.BasicChat
import com.jnrdev.simplechat.ui.theme.SimpleChatTheme



@Composable
fun ChatRoom(navController: NavHostController) {

    // TODO: tbc later

    val chat = Chat(
        senderId = "1",
        receiverId = "2",
        message = "Hello, world!",
        messageSendAt = System.currentTimeMillis()
    )
    val chatList = listOf(chat, chat, chat)
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Chat Room",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(chatList.size) { index ->
                BasicChat(chat = chatList[index])
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatRoomPreview() {
    SimpleChatTheme {
        ChatRoom(navController = rememberNavController())
    }
}