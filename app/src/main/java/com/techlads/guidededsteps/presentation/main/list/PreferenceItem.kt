package com.techlads.guidededsteps.presentation.main.list

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.keyframes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlads.guidededsteps.presentation.data.Preference

@Composable
fun PreferenceItem(item: Preference, onItemClick: (Preference) -> Unit) {

    val isFocused = remember {
        mutableStateOf(false)
    }

    val scale = animateFloatAsState(
        animationSpec = keyframes {
            this.delayMillis = 200
        },
        targetValue = if (isFocused.value) 1.05f else 1f
    )

    val padding = animateDpAsState(
        targetValue = if (isFocused.value) 24.dp else 16.dp
    )

    val background = animateColorAsState(
        targetValue = if (isFocused.value) Color.Black.copy(alpha = 1f) else Color.Transparent
    )

    Text(
        item.title,
        Modifier
            .padding(start = 16.dp, bottom = 8.dp)
            .clip(MaterialTheme.shapes.small)
            .border(
                border = BorderStroke(
                    1.dp,
                    color = if (isFocused.value) Color.White.copy(alpha = 0.2f) else Color.Transparent
                ), shape = MaterialTheme.shapes.small
            )
            .fillMaxWidth()
            .onFocusChanged {
                isFocused.value = it.isFocused
            }
            .graphicsLayer(
                scaleX = scale.value,
                scaleY = scale.value
            )
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(bounded = true, color = background.value)
            ) {
                onItemClick(item)
            }
            .padding(horizontal = padding.value, vertical = 12.dp),
        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Thin)
    )
}

@Preview
@Composable
private fun PreferenceItemPrev() {
    PreferenceItem(Preference.PROFILE) {}
}