package com.devcomentry.jetpackcomposeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun ModifierPreview() {
    ModifierDemo()
}


@Composable
fun ModifierDemo() {
    Column() {
        Box(
            modifier = Modifier.size(50.dp)
                .background(
                    color = Color.Green
                ).padding(2.dp)
        ) {
            Box(
                modifier = Modifier.size(40.dp).background(
                    color = Color.Red
                ).padding(top = 10.dp)
            ) {}
        }
    }
}