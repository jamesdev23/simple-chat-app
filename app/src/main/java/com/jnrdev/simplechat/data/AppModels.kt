package com.jnrdev.simplechat.data

data class User (
    val userId: String,
    val name: String,
    val email: String,
    val registeredAt: Long
)

data class Chat (
    val senderId: String,
    val receiverId: String,
    val message: String,
    val messageSendAt: Long
)

data class ChatRoom (
    val chatRoomId: String,
    val userId: String,
    val createdAt: Long
)
