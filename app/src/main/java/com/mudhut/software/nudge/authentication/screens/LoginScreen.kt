package com.mudhut.software.nudge.authentication.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mudhut.software.nudge.authentication.viewmodels.AuthViewModel

@Composable
fun LoginScreen(navController: NavController, viewModel: AuthViewModel) {

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Register Here",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp)
            )
            LoginTextField(
                label = "Email",
                modifier = Modifier
                    .padding(start = 32.dp, top = 16.dp, end = 32.dp, bottom = 8.dp)
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            LoginTextField(
                label = "Password",
                modifier = Modifier
                    .padding(start = 32.dp, top = 8.dp, end = 32.dp, bottom = 16.dp)
                    .fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,

                ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(end = 4.dp)
                ) {
                    Text("Login")
                }
                Button(
                    onClick = {
                        navController.popBackStack()
                    },
                    modifier = Modifier.padding(end = 32.dp)
                ) {
                    Text("Register")
                }
            }

        }
    }
}

@Composable
fun LoginTextField(
    label: String,
    modifier: Modifier,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    var textFieldValue by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = textFieldValue,
        onValueChange = { textFieldValue = it },
        modifier = modifier,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        label = { Text(label) },
        singleLine = true
    )
}

@Composable
@Preview
fun LoginScreenPreview() {
    val navController = rememberNavController()
    LoginScreen(
        navController = navController,
        viewModel = viewModel()
    )
}
