package com.techlads.guidededsteps

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.techlads.guidededsteps.presentation.main.PreferencesScreen
import com.techlads.guidededsteps.theme.Material3Theme

@Composable
fun App() {
    Material3Theme {
        PreferencesScreen()
    }
}

@Preview
@Composable
private fun AppPrev() {
    App()
}