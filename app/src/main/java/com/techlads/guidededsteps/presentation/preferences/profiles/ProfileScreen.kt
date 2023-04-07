package com.techlads.guidededsteps.presentation.preferences.profiles

import androidx.compose.runtime.Composable
import androidx.tv.material3.Text
import com.techlads.guidededsteps.presentation.data.Preference
import com.techlads.guidededsteps.presentation.preferences.PreferencesContainer

@Composable
fun ProfileScreen() {
    PreferencesContainer(preference = Preference.PROFILE) {
        ProfilesContent()
    }
}

@Composable
fun ProfilesContent() {
    Text(text = "Profiles")
}

@androidx.compose.ui.tooling.preview.Preview
@Composable
fun ProfileScreenPrev() {
    ProfileScreen()
}