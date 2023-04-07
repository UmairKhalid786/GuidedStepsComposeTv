package com.techlads.guidededsteps.presentation.data

import com.techlads.guidededsteps.presentation.navigation.Preferences

sealed class Preference(val title: String, val screen: String) {
    object PROFILE : Preference("Profile", Preferences.Profile.title)
    object PERMISSIONS : Preference("Permissions", Preferences.Permissions.title)
    object ABOUT :  Preference("About", Preferences.About.title)
    object DELETE_ACCOUNT :  Preference("Delete Account", Preferences.Logout.title)
}