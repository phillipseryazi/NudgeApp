package com.mudhut.software.nudge.authentication.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

class AuthViewModel : ViewModel() {
    var email by mutableStateOf("")
    var password by mutableStateOf("")

    fun onEmailChanged(value: String) {
        email = value
    }

    fun onPasswordChanged(value: String) {
        password = value
    }
}
