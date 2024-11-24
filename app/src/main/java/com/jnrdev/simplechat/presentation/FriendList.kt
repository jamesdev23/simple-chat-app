package com.jnrdev.simplechat.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun FriendList(navController: NavHostController) {
    Column {
        Text(text = "Friend List")
    }
}