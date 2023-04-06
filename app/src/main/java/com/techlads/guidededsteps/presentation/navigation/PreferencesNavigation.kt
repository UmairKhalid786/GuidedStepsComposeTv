package com.techlads.guidededsteps.presentation.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.techlads.guidededsteps.presentation.preferences.*

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PreferencesNavigation(navController: NavHostController) {
    AnimatedNavHost(navController = navController, startDestination = Preferences.Profile.title) {
        // e.g will add auth routes here if when we will extend project
        composable(
            Preferences.Profile.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            ProfileScreen()
        }
        composable(
            Preferences.Permissions.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            PermissionsScreen()
        }
        composable(
            Preferences.About.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            AboutScreen()
        }
        composable(
            Preferences.Logout.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            LogoutScreen()
        }
    }
}


fun tabExitTransition(
    duration: Int = 500
) = fadeOut(tween(duration / 2, easing = LinearEasing))

fun tabEnterTransition(
    duration: Int = 500, delay: Int = duration - 350
) = fadeIn(tween(duration, duration - delay))
