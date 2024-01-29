package com.example.zdsexample.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zdsexample.R

@Composable
fun ZDSImageViewer(
    painter: Painter,
    contentDescription: String
) {
    val imageModifier = Modifier
        .size(150.dp)
        .border(border = BorderStroke(1.dp, Color.Black))
        .background(Color.Gray)
    Surface {
        Image(
            painter = painter,
            contentDescription = contentDescription,
            contentScale = ContentScale.Fit,
            modifier = imageModifier
        )
    }
}

@Preview
@Composable
//Example of how to use ZDSImageViewer compose component in kotlin code
fun IVPreview() {
ZDSImageViewer(painter =
    painterResource(R.drawable.stackspot_ai), contentDescription = "Image description"
)
}

