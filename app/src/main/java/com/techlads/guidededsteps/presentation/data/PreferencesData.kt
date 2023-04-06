package com.techlads.guidededsteps.presentation.data

import com.techlads.guidededsteps.presentation.navigation.Preferences.*

object PreferencesData {
    val data by lazy {
        listOf(
            Preference("Profile", Profile.title),
            Preference("Permissions", Permissions.title),
            Preference("About", About.title),
            Preference("Logout", Logout.title),
        )
    }
}

