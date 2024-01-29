package com.example.zdsexample

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zdsexample.ui.components.ZDSBody
import com.example.zdsexample.ui.components.ZDSButton
import com.example.zdsexample.ui.components.ZDSImageViewer

@Composable
fun InformativeContentScreen() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween) {
        Header()
        Body()
        Footer()
    }
}

@Composable
fun Header() {
    TopAppBar(
        title = { Text("StackSpot AI") },
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Composable
fun Body() {
    Column(Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        ZDSImageViewer(
            painter = painterResource(R.drawable.stackspot_ai),
            contentDescription = "StackSpot AI"
        )
        Spacer(modifier = Modifier.height(16.dp))
        ZDSBody("StackSpot AI is an innovative platform designed to streamline and enhance the development process. It leverages AI and other cutting-edge technologies to provide developers with powerful tools and resources.")
    }
}

@Composable
fun Footer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom
    ) {
        ZDSButton(
            onClick = { /* Handle Learn More action */ }
        ) {
            ZDSBody("Learn More")
        }
        ZDSButton(
            onClick = { /* Handle Get Started action */ }
        ) {
            ZDSBody("Get Started")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInformativeContentScreen() {
    InformativeContentScreen()
}