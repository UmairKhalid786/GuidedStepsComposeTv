package com.techlads.guidededsteps.presentation.preferences

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ProfileScreen() {
    PreferencesContainer {
        Text("Profile")
    }
}

@androidx.compose.ui.tooling.preview.Preview
@Composable
fun ProfileScreenPrev() {
    ProfileScreen()
}