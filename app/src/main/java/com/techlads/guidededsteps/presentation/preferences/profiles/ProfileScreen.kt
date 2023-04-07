package com.techlads.guidededsteps.presentation.preferences.profiles

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.tv.material3.LocalContentColor
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.techlads.guidededsteps.R
import com.techlads.guidededsteps.presentation.data.Preference
import com.techlads.guidededsteps.presentation.preferences.PreferencesContainer
import com.techlads.guidededsteps.presentation.widgets.Button

@Composable
fun ProfileScreen() {
    PreferencesContainer(preference = Preference.PROFILE) {
        ProfilesContent()
    }
}

@Composable
fun ProfilesContent() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier.size(100.dp),
            colorFilter = ColorFilter.tint(LocalContentColor.current),
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = "User profile"
        )
        Spacer(modifier = Modifier.size(20.dp))
        UserDetails()
    }
}

@Composable
fun UserDetails() {
    Column {
        Text(text = "Umair Khalid", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = "Android Developer", style = MaterialTheme.typography.labelSmall,
            color = LocalContentColor.current.copy(alpha = 0.4f)
        )
        Text(
            text = "Github: https://github.com/UmairKhalid786",
            style = MaterialTheme.typography.labelSmall,
            color = LocalContentColor.current.copy(alpha = 0.4f)
        )
        Spacer(modifier = Modifier.size(20.dp))
        Row {
            Button(text = "Save") {

            }
            Spacer(modifier = Modifier.size(8.dp))
            Button(text = "Cancel") {

            }
        }
    }
}

@androidx.compose.ui.tooling.preview.Preview
@Composable
fun ProfileScreenPrev() {
    ProfileScreen()
}