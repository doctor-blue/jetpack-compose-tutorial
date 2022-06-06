package com.devcomentry.jetpackcomposeexample

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
private fun BoxPreview() {
    BoxDemo()
}

@Composable
fun BoxDemo() {
    Box(
        modifier = Modifier.background(color = Color.Green)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_baseline_adb_24),
            contentDescription = "",
            modifier = Modifier.background(color = Color.Blue)
        )
        Text("Hello world", color = Color.White)
        Text(
            "Zo!", color = Color.Red,
            modifier = Modifier.background(color = Color.Gray)
        )
    }
}

