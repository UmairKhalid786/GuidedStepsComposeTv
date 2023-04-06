package com.techlads.guidededsteps.presentation.preferences

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PermissionsScreen() {
    PreferencesContainer {
        Text("Permission")
    }
}

@Preview
@Composable
private fun PermissionsScreenPrev() {
    PermissionsScreen()
}