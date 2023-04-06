package com.techlads.guidededsteps.presentation.main

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.techlads.guidededsteps.presentation.main.detail.PreferenceDetail
import com.techlads.guidededsteps.presentation.main.list.PreferencesList

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PreferencesScreen() {

    val navController = rememberAnimatedNavController()

    Row {
        PreferenceDetail(Modifier.weight(1.3f), navController)
        PreferencesList(Modifier.weight(0.7f), navController)
    }
}

@Composable
fun Heading() {
    Text(
        "Preferences",
        Modifier.padding(16.dp),
        style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.ExtraBold)
    )
}


