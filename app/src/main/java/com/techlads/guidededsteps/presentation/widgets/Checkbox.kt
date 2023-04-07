package com.techlads.guidededsteps.presentation.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.tv.material3.*

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun CheckBox(
    modifier: Modifier = Modifier,
    text: String,
    disabledText: String = text,
    onClick: (Boolean) -> Unit
) {

    val isChecked = remember {
        mutableStateOf(false)
    }

    Row {
        Text(text = if (isChecked.value) disabledText else text)
        Spacer(modifier = Modifier.size(4.dp))
        Surface(modifier = modifier, checked = isChecked.value,
            shape = ToggleableSurfaceDefaults.shape(shape = RoundedCornerShape(2.dp)),
            onCheckedChange = {
                isChecked.value = it
                onClick(it)
            }) {
            Text(text = if (isChecked.value) "☑️" else "✅", Modifier.padding(0.dp))
        }
    }
}