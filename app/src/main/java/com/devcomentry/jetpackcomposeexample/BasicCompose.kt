package com.devcomentry.jetpackcomposeexample

import androidx.compose.foundation.Image
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun Demo() {
//    TextDemo()
//    ButtonDemo()
//    ImageDemo()
}

@Composable
fun TextDemo() {
    Text("Hello", fontSize = 16.sp, color = Color.Cyan)
}

@Composable
fun ButtonDemo() {
    Button(
        onClick = {

        },
        elevation = ButtonDefaults.elevation(20.dp)

    ) {
        Text("Click here", color = Color.Green)
    }
}

@Composable
fun ImageDemo() {
    Image(
        painter = painterResource(R.drawable.ic_baseline_adb_24),
        contentDescription = "Hello",
        contentScale = ContentScale.Fit,
        colorFilter = ColorFilter.tint(Color.Green)
    )
}








