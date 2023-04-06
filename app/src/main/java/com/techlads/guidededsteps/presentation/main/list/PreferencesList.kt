package com.techlads.guidededsteps.presentation.main.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.items
import com.techlads.guidededsteps.presentation.data.PreferencesData
import com.techlads.guidededsteps.presentation.main.Heading

@Composable
fun PreferencesList(modifier: Modifier, navController: NavHostController) {

    val data = remember {
        PreferencesData.data
    }

    Box(
        modifier
            .fillMaxHeight()
            .background(Color.DarkGray.copy(alpha = 0.6f)), contentAlignment = Alignment.Center
    ) {

        TvLazyColumn(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(bottom = 120.dp)
                .padding(horizontal = 24.dp)
        ) {

            item {
                Heading()
            }
            items(data) {
                PreferenceItem(it) {
                    navController.navigate(it.screen)
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreferencesListPrev() {
    PreferencesList(Modifier, rememberNavController())
}
