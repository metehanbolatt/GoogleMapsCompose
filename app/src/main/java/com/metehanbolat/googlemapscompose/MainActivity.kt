package com.metehanbolat.googlemapscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.googlemapscompose.ui.theme.GoogleMapsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleMapsComposeTheme {
                MapScreen()
            }
        }
    }
}
