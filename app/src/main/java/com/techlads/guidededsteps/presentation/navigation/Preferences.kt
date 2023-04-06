package com.techlads.guidededsteps.presentation.navigation

sealed class Preferences(val title: String) {
    object Profile : Preferences("profile")
    object Permissions : Preferences("permissions")
    object About : Preferences("about")
    object Logout : Preferences("logout")
}