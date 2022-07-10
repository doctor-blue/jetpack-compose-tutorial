package com.devcomentry.jetpackcomposeexample

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {
//            TextDemo()
//            ButtonDemo()
//            ImageDemo()
            StateDemo()

        }
    }


}