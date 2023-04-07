package com.techlads.guidededsteps.presentation.preferences.permissions

import androidx.tv.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.techlads.guidededsteps.presentation.data.Preference
import com.techlads.guidededsteps.presentation.preferences.PreferencesContainer

@Composable
fun PermissionsScreen() {
    PreferencesContainer(preference = Preference.PERMISSIONS) {
        Text("Permission")
    }
}

@Preview
@Composable
private fun PermissionsScreenPrev() {
    PermissionsScreen()
}