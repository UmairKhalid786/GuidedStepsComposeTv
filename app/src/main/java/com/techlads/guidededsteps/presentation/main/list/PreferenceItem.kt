package com.techlads.guidededsteps.presentation.main.list

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.tv.material3.*
import com.techlads.guidededsteps.presentation.data.Preference

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun PreferenceItem(
    item: Preference,
    onItemClick: (Preference) -> Unit
) {

    Surface(
        onClick = { onItemClick(item) },
        scale = ClickableSurfaceDefaults.scale(focusedScale = 1.05f),
        color = ClickableSurfaceDefaults.color(
            color = Color.Transparent
        ),
        glow = ClickableSurfaceDefaults.glow(focusedGlow = Glow(elevation = 5.dp, elevationColor = Color.Black)),
        shape = ClickableSurfaceDefaults.shape(
            shape = ShapeDefaults.Small,
            focusedShape = ShapeDefaults.Small
        ),
        modifier = Modifier
            .padding(
                start = 16.dp, bottom = 8.dp
            )
            .fillMaxWidth()
    ) {
        Text(
            item.title,
            Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth(),
        )
    }
}

@Preview
@Composable
private fun PreferenceItemPrev() {
    PreferenceItem(Preference.PROFILE) {}
}