package com.techlads.guidededsteps.presentation.preferences.logout

import androidx.tv.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.techlads.guidededsteps.presentation.data.Preference
import com.techlads.guidededsteps.presentation.preferences.PreferencesContainer

@Composable
fun LogoutScreen() {
    PreferencesContainer(preference = Preference.LOGOUT) {
        Text("Logout")
    }
}

@Preview
@Composable
private fun LogoutScreenPrev() {
    LogoutScreen()
}