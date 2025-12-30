package com.example.littlelemonfinal.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemonfinal.presentation.component.LemonButton
import com.example.littlelemonfinal.presentation.component.LemonLogo
import com.example.littlelemonfinal.presentation.component.Poster
import com.example.littlelemonfinal.presentation.component.TextInput
import com.example.littlelemonfinal.presentation.component.Title
import com.example.littlelemonfinal.ui.theme.LittleLemonFinalTheme

@Composable
fun RegisterUIScreen(
    onRegisterClickAction: (Triple<String, String, String>) -> Unit
) {
    var firstName by remember { mutableStateOf("") }
    val onFirstNameChange: (String) -> Unit = {
        firstName = it
    }

    var lastName by remember { mutableStateOf("") }
    val onLastNameChange: (String) -> Unit = {
        lastName = it
    }

    var email by remember { mutableStateOf("") }
    val onEmailChange: (String) -> Unit = {
        email = it
    }

    Column(modifier = Modifier.fillMaxSize()) {
        LemonLogo(
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 30.dp)
        )
        Poster()
        Title(
            modifier = Modifier.padding(
                vertical = 40.dp,
                horizontal = 10.dp
            )
        )
        TextInput(
            modifier = Modifier.padding(
                horizontal = 20.dp,
                vertical = 10.dp
            ),
            value = firstName,
            onValueChange = onFirstNameChange,
            label = "First name",
        )
        TextInput(
            modifier = Modifier.padding(
                horizontal = 20.dp,
                vertical = 10.dp
            ),
            value = lastName,
            onValueChange = onLastNameChange,
            label = "Last name",

        )
        TextInput(
            modifier = Modifier.padding(
                horizontal = 20.dp,
                vertical = 10.dp
            ),
            value = email,
            onValueChange = onEmailChange,
            label = "Email",

        )
        Spacer(modifier = Modifier.weight(1f))
        LemonButton(
            modifier = Modifier.fillMaxWidth()
                .padding(
                    horizontal = 20.dp,
                    vertical = 30.dp
                ),
            text = "Register",
            onClick = {
                onRegisterClickAction(
                    Triple(
                        firstName,
                        lastName,
                        email
                    )
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RegisterUIScreenPreview() {
    LittleLemonFinalTheme {
        RegisterUIScreen({})
    }
}