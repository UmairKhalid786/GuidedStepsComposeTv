package com.techlads.guidededsteps.presentation.main.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.techlads.guidededsteps.presentation.navigation.PreferencesNavigation

@Composable
fun PreferenceDetail(modifier: Modifier, navController: NavHostController) {
    Box(modifier.fillMaxSize()) {
        PreferencesNavigation(navController)
    }
}

@Preview
@Composable
private fun PreferenceDetailPrev() {
    PreferenceDetail(Modifier, rememberNavController())
}