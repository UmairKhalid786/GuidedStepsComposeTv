package com.techlads.guidededsteps.presentation.preferences

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LogoutScreen() {
    PreferencesContainer {
        Text("Logout")
    }
}

@Preview
@Composable
private fun LogoutScreenPrev() {
    LogoutScreen()
}