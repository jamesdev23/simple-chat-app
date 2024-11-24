package com.jnrdev.simplechat.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jnrdev.simplechat.presentation.components.BasicButton
import com.jnrdev.simplechat.ui.theme.SimpleChatTheme

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Login(navController: NavHostController) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign In",
            modifier = Modifier.width(300.dp),
            textAlign = TextAlign.Center,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Sign in to continue",
            modifier = Modifier.width(300.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                modifier = Modifier.width(300.dp).padding(8.dp),
                placeholder = { Text(text = "Email") },
                onValueChange = {},
                value = "",
                singleLine = true
            )
            OutlinedTextField(
                modifier = Modifier.width(300.dp).padding(8.dp),
                placeholder = { Text(text = "Password") },
                onValueChange = {},
                value = "",
                singleLine = true,
                visualTransformation = VisualTransformation.None
            )
            BasicButton(
                text = "Sign In",
                onClick = { navController.navigate("chat-room") }
            )
        }

    }
}

@Preview(showBackground = true)
@Composable fun LoginPreview() {
    SimpleChatTheme {
        Login(navController = rememberNavController())
    }
}