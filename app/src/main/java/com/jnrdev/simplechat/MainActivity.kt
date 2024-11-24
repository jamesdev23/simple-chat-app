package com.jnrdev.simplechat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jnrdev.simplechat.presentation.ChatRoom
import com.jnrdev.simplechat.presentation.FriendList
import com.jnrdev.simplechat.presentation.Home
import com.jnrdev.simplechat.presentation.Login
import com.jnrdev.simplechat.presentation.Register
import com.jnrdev.simplechat.ui.theme.SimpleChatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleChatTheme {
                SimpleChatApp()
            }
        }
    }
}

@Composable
fun SimpleChatApp() {
    val navController = rememberNavController()
//    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) {
        NavHost(
            modifier = Modifier.padding(it),
            navController = navController,
            startDestination = "home"
        ) {
            composable("home") {
                Home(navController)
            }
            composable("login") {
                Login(navController)
            }
            composable("register") {
                Register(navController)
            }
            composable("chat-room") {
                ChatRoom(navController)
            }
            composable("friend-list") {
                FriendList(navController)
            }
        }
    }
}