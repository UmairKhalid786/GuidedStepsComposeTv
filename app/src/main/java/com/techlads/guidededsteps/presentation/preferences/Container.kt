package com.techlads.guidededsteps.presentation.preferences

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.techlads.guidededsteps.presentation.data.Preference

@Composable
fun PreferencesContainer(
    modifier: Modifier = Modifier,
    preference: Preference,
    content: @Composable () -> Unit
) {
    Box(
        modifier
            .fillMaxSize()
            .padding(64.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Column {
            ContentHeading(title = preference.title)
            Spacer(modifier = Modifier.padding(8.dp))
            content()
        }
    }
}

@Composable
fun ContentHeading(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier
            .wrapContentWidth()
    )
}

@Preview
@Composable
fun ContentHeadingPrev() {
    ContentHeading(Preference.PROFILE.title)
}