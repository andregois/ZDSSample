package com.example.zdsexample.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zdsexample.ui.theme.PrimaryColor
import com.example.zdsexample.R


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ZDSButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true, // not handled for simplicity
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    shape: Shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp), // configure type
    content: @Composable RowScope.() -> Unit, // content (Text for example)
) {

    Surface(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        color = PrimaryColor,
    ) {
        ProvideTextStyle(value = MaterialTheme.typography.bodyMedium) {
            Row(
                modifier = Modifier.padding(
                    horizontal = 16.dp,
                    vertical = 8.dp,
                ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                leadingIcon?.let {
                    leadingIcon()
                    Spacer(modifier = Modifier.width(8.dp))
                }
                content()
                trailingIcon?.let {
                    Spacer(modifier = Modifier.width(8.dp))
                    trailingIcon()
                }
            }
        }
    }
}

@Preview
@Composable
//Example of how to use ZDSButton compose component with icon in kotlin code
fun ButtonWithIconPreview() {
    ZDSButton(
        leadingIcon = { Icon(painterResource(R.drawable.ic_baseline_info_24), "") },
        onClick = {}) {
        ZDSBody(
            "Button with icon"
        )
    }
}

@Preview
@Composable
//Example of how to use ZDSButton compose component in kotlin code
fun ButtonPreview() {
    ZDSButton(
        onClick = {},
        enabled = true,
        modifier = Modifier,
        shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp),
        ) {
        ZDSBody(
            "Simple Button"
        )
    }
}