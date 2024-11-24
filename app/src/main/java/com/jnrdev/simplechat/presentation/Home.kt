package com.jnrdev.simplechat.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jnrdev.simplechat.presentation.components.BasicButton
import com.jnrdev.simplechat.ui.theme.SimpleChatTheme

@Composable
fun Home(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // logo part
        Column(
            modifier = Modifier
                .weight(0.5f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Simple Chat App",
                modifier = Modifier.width(300.dp),
                textAlign = TextAlign.Center,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold

            )
        }

        // nav part
        Column(
            modifier = Modifier
                .weight(0.5f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BasicButton(
                text = "Login",
                onClick = { navController.navigate("login") }
            )
            BasicButton(
                text = "Register",
                onClick = { navController.navigate("register") }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    SimpleChatTheme {
        Home(navController = rememberNavController())
    }

}