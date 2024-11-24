package com.jnrdev.simplechat.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jnrdev.simplechat.data.Chat
import com.jnrdev.simplechat.ui.theme.SimpleChatTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun BasicChat(chat: Chat) {
    val formattedTimestamp = formatTimestampToMonthDayYear(chat.messageSendAt)
    OutlinedCard(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
    ) {
        Column (
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text(
                text = chat.message,
                fontWeight = FontWeight.Bold
            )
            Text(text = formattedTimestamp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicChatPreview() {
    SimpleChatTheme {
        val chat = Chat(
            senderId = "1",
            receiverId = "2",
            message = "Hello, world!",
            messageSendAt = System.currentTimeMillis()
        )
        BasicChat(chat = chat)
    }
}

// format timestamp to month day year
fun formatTimestampToMonthDayYear(timestamp: Long): String {
    val date = Date(timestamp)
    val dateFormat = SimpleDateFormat("MMMM dd, yyyy, hh:mm a", Locale.getDefault())
    return dateFormat.format(date)
}