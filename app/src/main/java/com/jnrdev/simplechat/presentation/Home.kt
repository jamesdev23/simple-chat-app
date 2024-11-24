package com.jnrdev.simplechat.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jnrdev.simplechat.ui.theme.SimpleChatTheme

@Composable
fun Home(
    navController: NavHostController
) {
    Column {
        Text(text = "Simple Chat App")
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    SimpleChatTheme {
        Home(navController = rememberNavController())
    }

}