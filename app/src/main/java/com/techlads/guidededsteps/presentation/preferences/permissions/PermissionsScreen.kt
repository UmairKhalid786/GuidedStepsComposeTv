package com.techlads.guidededsteps.presentation.preferences.permissions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.tv.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.tv.material3.LocalContentColor
import com.techlads.guidededsteps.presentation.data.Preference
import com.techlads.guidededsteps.presentation.preferences.PreferencesContainer
import com.techlads.guidededsteps.presentation.widgets.Button
import com.techlads.guidededsteps.presentation.widgets.CheckBox

@Composable
fun PermissionsScreen() {
    PreferencesContainer(preference = Preference.PERMISSIONS) {
        Column {

            Spacer(modifier = Modifier.size(16.dp))
            CheckBox(
                text = "Disable analytics collection",
                disabledText = "Allow analytics collection"
            ) {}

            Spacer(modifier = Modifier.size(8.dp))
            CheckBox(
                text = "Disable screensaver",
                disabledText = "Enable screensaver"
            ) {}

            Spacer(modifier = Modifier.size(8.dp))
            CheckBox(
                text = "Disable deeplinking",
                disabledText = "Allow deeplinking"
            ) {}

            Spacer(modifier = Modifier.size(32.dp))

            Text(text = "Please read following permissions carefully", color = LocalContentColor.current.copy(alpha = 0.3f))

            Spacer(modifier = Modifier.size(16.dp))
            Row {
                Button(text = "Save") {

                }
                Spacer(modifier = Modifier.size(8.dp))
                Button(text = "Cancel") {

                }
            }
        }
    }
}

@Preview
@Composable
private fun PermissionsScreenPrev() {
    PermissionsScreen()
}