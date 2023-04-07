package com.techlads.guidededsteps.presentation.preferences.about

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.techlads.guidededsteps.presentation.data.Preference
import com.techlads.guidededsteps.presentation.preferences.PreferencesContainer


@Composable
fun AboutScreen() {
    PreferencesContainer(preference = Preference.ABOUT) {

    }
}

@Preview
@Composable
private fun AboutScreenPrev() {
    AboutScreen()
}