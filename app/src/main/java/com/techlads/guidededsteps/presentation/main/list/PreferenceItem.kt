package com.techlads.guidededsteps.presentation.main.list

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.keyframes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlads.guidededsteps.presentation.data.Preference
import com.techlads.guidededsteps.presentation.navigation.Preferences


@Composable
fun PreferenceItem(item: Preference, onItemClick: (Preference) -> Unit) {

    val isFocused = remember {
        mutableStateOf(false)
    }

    val scale = animateFloatAsState(
        animationSpec = keyframes {
            this.delayMillis = 100
        },
        targetValue = if (isFocused.value) 1.05f else 1f
    )
    val padding = animateDpAsState(
        targetValue = if (isFocused.value) 32.dp else 16.dp
    )

    Text(
        item.title,
        Modifier
            .fillMaxWidth()
            .onFocusChanged {
                isFocused.value = it.isFocused
            }
            .scale(scale.value)
            .clickable {
                onItemClick(item)
            }
            .padding(horizontal = padding.value, vertical = 8.dp),
        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Light)
    )
}

@Preview
@Composable
private fun PreferenceItemPrev() {
    PreferenceItem(Preference("About", Preferences.About.title)){}
}