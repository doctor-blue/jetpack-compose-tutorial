package com.devcomentry.jetpackcomposeexample

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun ListDemo() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
//    LazyComlumnDemo(
//       list
//    )

    LazyRowDemo(list)
}


@Composable
fun LazyComlumnDemo(
    list: List<Int>
) {
    LazyColumn {
        items(list) {
            Text("Line $it")
        }
    }
}

@Composable
fun LazyRowDemo(
    list: List<Int>
) {
    LazyRow {
        items(list) {
            Text("Line $it")
        }
    }
}