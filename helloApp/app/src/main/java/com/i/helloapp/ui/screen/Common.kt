package com.i.helloapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.i.helloapp.R
import com.i.helloapp.ui.theme.Purple40

@Composable
fun GreetingText( message: String, from : String, modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Top) {
        Text(
            text = message,
            fontSize = 27.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
        )
        Text(
            text = from,
            fontSize = 66.sp,
            lineHeight = 56.sp,
            textAlign = TextAlign.Center,
            color = Purple40
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.s138)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(top = 250.dp)
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}
