package com.devcomentry.jetpackcomposeexample

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun StatePreview() {
    StateDemo()
}


@Composable
fun StateDemo() {

    val text = remember {
        mutableStateOf("")
    }
    val otherValue = remember {
        mutableStateOf(0)
    }
    Log.d("STATE_DEMO", "Call state demo")

    Column {

        Button(
            onClick = {
                otherValue.value += 1
            },
        ) {
            Text("${otherValue.value}")
            Log.d("STATE_DEMO", "Call after increase value")

        }
        TextField(
            value = text.value,
            onValueChange = { text.value = it }
        )
    }
}