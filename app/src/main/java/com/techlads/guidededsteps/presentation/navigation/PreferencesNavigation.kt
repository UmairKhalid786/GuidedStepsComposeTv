package com.techlads.guidededsteps.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.techlads.guidededsteps.presentation.preferences.about.AboutScreen
import com.techlads.guidededsteps.presentation.preferences.logout.LogoutScreen
import com.techlads.guidededsteps.presentation.preferences.permissions.PermissionsScreen
import com.techlads.guidededsteps.presentation.preferences.profiles.ProfileScreen

@Composable
fun PreferencesNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Preferences.Profile.title) {
        // e.g will add auth routes here if when we will extend project
        composable(
            Preferences.Profile.title) {
            ProfileScreen()
        }
        composable(
            Preferences.Permissions.title) {
            PermissionsScreen()
        }
        composable(
            Preferences.About.title) {
            AboutScreen()
        }
        composable(
            Preferences.Logout.title) {
            LogoutScreen()
        }
    }
}
