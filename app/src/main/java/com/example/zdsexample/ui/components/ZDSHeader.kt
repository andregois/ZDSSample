package com.example.zdsexample.ui.components

import androidx.compose.foundation.text.BasicText
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ZDSHeader(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    style: TextStyle = typography.bodyLarge,
    textAlign: TextAlign = TextAlign.Center
) {
    val textColor = color.takeOrElse {
        style.color.takeOrElse {
            LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
        }
    }
    val mergedStyle = style.copy(color = textColor, textAlign = textAlign)
    BasicText(
        text = text,
        modifier = modifier,
        style = mergedStyle,
    )
}

@Preview
@Composable
//Example of how to use ZDSHeader compose component in kotlin code
fun HeaderPreview() {
    ZDSHeader(
        text = "Header component title",
        modifier = Modifier,
        color = Color.Black,
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center
    )
}
