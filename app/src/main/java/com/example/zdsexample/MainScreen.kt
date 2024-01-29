package com.example.zdsexample

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zdsexample.ui.components.ZDSBody
import com.example.zdsexample.ui.components.ZDSButton
import com.example.zdsexample.ui.components.ZDSHeader

@Composable
fun MainScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        // ZDSHeader component
        ZDSHeader(
            text = "Header component title",
            modifier = Modifier,
            color = Color.Black,
            style = typography.titleLarge,
            textAlign = TextAlign.Center
        )
        
        // Spacer or padding can be added here if needed
        
        // ZDSBody component
        ZDSBody("This is the main body text.")
        
        // Spacer or padding can be added here if needed
        
        Spacer(modifier = Modifier.weight(1f)) // This pushes the button to the bottom
        
        // ZDSButton component at the bottom
        ZDSButton(
            onClick = { /* Handle click */ },
            enabled = true,
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium
        ) {
            ZDSBody("Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}