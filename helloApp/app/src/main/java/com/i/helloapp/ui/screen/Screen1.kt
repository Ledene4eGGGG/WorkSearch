package com.i.helloapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.i.helloapp.R
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.i.helloapp.ui.theme.HelloAppTheme

@Composable
fun Screen1(
    onClick: () -> Unit,
) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        GreetingImage(
            message = "Экран 1",
            from = stringResource(R.string.happy_birthday_text),
            modifier = Modifier
                .background(color = Color.Yellow)
                .clickable { onClick.invoke() }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HelloAppTheme {
        GreetingImage(
            message = "Экран 1",
            from = "С днём рождения!!!",
            modifier = Modifier
                .background(color = Color.Yellow)
        )
    }
}
