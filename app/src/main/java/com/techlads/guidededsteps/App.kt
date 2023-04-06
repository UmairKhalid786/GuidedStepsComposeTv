package com.techlads.guidededsteps

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.techlads.guidededsteps.presentation.main.PreferencesScreen
import com.techlads.guidededsteps.theme.Material3Theme

@Composable
fun App() {
    Material3Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            PreferencesScreen()
        }
    }
}