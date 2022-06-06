package com.devcomentry.jetpackcomposeexample

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showSystemUi = true)
fun ColumnPreview() {
    ColumnDemo()
}

@Composable
fun ColumnDemo() {
    Column {
        Text("Line 1", color = Color.Green)
        Text("Line 2", color = Color.Blue)
    }
}