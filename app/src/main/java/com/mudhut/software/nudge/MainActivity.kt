package com.mudhut.software.nudge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.mudhut.software.nudge.authentication.viewmodels.AuthViewModel
import com.mudhut.software.nudge.navigation.NavigationComposable
import com.mudhut.software.nudge.ui.theme.NudgeAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NudgeAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NavigationComposable()
                }
            }
        }
    }
}
