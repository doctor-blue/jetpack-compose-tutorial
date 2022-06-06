package com.devcomentry.jetpackcomposeexample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun RowPreview() {
    RowDemo()
}

@Composable
fun RowDemo() {
    Row {
        Column {
            Text("Line 1")
            Text("Line 2")
            Row {
                Text("Line 5")
                Text("Line 6")
            }
        }
        Column {
            Text("Line 3")
            Text("Line 4")

        }
    }
}