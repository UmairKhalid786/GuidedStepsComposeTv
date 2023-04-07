package com.techlads.guidededsteps.presentation.main

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.techlads.guidededsteps.presentation.main.detail.PreferenceDetail
import com.techlads.guidededsteps.presentation.main.list.PreferencesList

@Composable
fun PreferencesScreen() {
    val navController = rememberNavController()
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
        style = MaterialTheme.typography.headlineMedium
    )
}


