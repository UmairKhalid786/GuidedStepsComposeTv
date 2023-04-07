package com.techlads.guidededsteps.theme

import androidx.tv.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.LocalContentColor
import androidx.tv.material3.darkColorScheme

@OptIn(ExperimentalTvMaterial3Api::class)
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Neutral10
)

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun Material3Theme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
    ) {
        CompositionLocalProvider(
            LocalContentColor provides White.copy(alpha = 0.7f)
        ){
            content()
        }
    }
}