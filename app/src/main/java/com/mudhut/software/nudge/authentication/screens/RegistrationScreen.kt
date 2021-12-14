package com.mudhut.software.nudge.authentication.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
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
import com.mudhut.software.nudge.navigation.Destinations

@Composable
fun RegistrationScreen(navController: NavController, viewModel: AuthViewModel) {

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
            RegistrationTextField(
                label = "Email",
                modifier = Modifier
                    .padding(
                        start = 32.dp,
                        top = 16.dp,
                        end = 32.dp,
                        bottom = 8.dp
                    )
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                textFieldValue = viewModel.email,
                onValueChanged = { viewModel.onEmailChanged(it) }
            )
            RegistrationTextField(
                label = "Password",
                modifier = Modifier
                    .padding(
                        start = 32.dp,
                        top = 8.dp,
                        end = 32.dp,
                        bottom = 16.dp
                    )
                    .fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                textFieldValue = viewModel.password,
                onValueChanged = { viewModel.onPasswordChanged(it) }
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
                    navController.navigate(Destinations.LoginScreen.route)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(end = 32.dp)
                ) {
                    Text("Register")
                }
            }

        }
    }
}

@Composable
fun RegistrationTextField(
    label: String,
    modifier: Modifier,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    textFieldValue: String,
    onValueChanged: (String) -> Unit
) {
    OutlinedTextField(
        value = textFieldValue,
        onValueChange = onValueChanged,
        modifier = modifier,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        label = { Text(label) },
        singleLine = true
    )
}

@Composable
@Preview
fun RegistrationScreenPreview() {
//    val navController = rememberNavController()
//    RegistrationScreen(
//        navController = navController,
//        viewModel = viewModel()
//    )
}
