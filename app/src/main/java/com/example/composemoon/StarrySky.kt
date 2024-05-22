package com.example.composemoon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas


@Composable
fun Stars(starNum: Int) {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val list = remember { mutableStateListOf<Star>() }
    }
}

@Composable
fun Star(star: Star){

}

@Composable
fun StarrySky(modifier: Modifier, starNum: Int) {
    Box(modifier = modifier) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawIntoCanvas {
                drawRect(Color.Black)
            }
        }
//        Stars(starNum = starNum)
    }
}

class Star{

}