package com.i.helloapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Arrangement.Top
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.text.util.LocalePreferences.CalendarType.CalendarTypes
import com.i.helloapp.ui.theme.HelloAppTheme

@Composable
fun Screen4() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
       Square()
        }
    }

@Composable
fun Square1(message1 : String, message2: String, color: Color, modifier: Modifier) {
    Column {
        Text(
            text = message1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = message2,
            modifier = Modifier
                .padding(all = 16.dp)
        )
    }


}

@Composable
fun Square() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Square1(
                message1 = "Text composable",
                message2 = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF),
                modifier = Modifier
            )
            Square1(
                message1 = "Image composable",
                message2 = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFEADDFF),
                modifier = Modifier
            )
        }
        Row(Modifier.weight(1f)) {
            Square1(
                message1 = "Row composable",
                message2 = "A layout composable that places its children in a horizontal sequence.",
                color = Color(0xFFB69DF8),
                modifier = Modifier
            )
            Square1(
                message1 = "Column composable",
                message2 = "A layout composable that places its children in a vertical sequence.",
                color = Color(0xFFF6EDFF),
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SquarePreview() {
    HelloAppTheme {
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val mh = maxHeight
            val mw = maxWidth
            Column(modifier = Modifier.fillMaxSize()) {
                Row(modifier = Modifier.height(mh / 2).align(Alignment.CenterHorizontally)) {
                    Column(modifier = Modifier
                        .width(mw / 2)
                        .background(Color.Red)
                        .align(Alignment.CenterVertically)
                        .fillMaxHeight()
                    ) {
                        Square1(
                            message1 = "Text composable",
                            message2 = "Displays text and follows the recommended Material Design guidelines.",
                            color = Color(0xFFEADDFF),
                            modifier = Modifier
                        )
                    }
                    Column(modifier = Modifier
                        .width(mw / 2)
                        .background(Color.Green)
                        .align(Alignment.CenterVertically)
                        .fillMaxHeight()
                    ) {
                        Square1(
                            message1 = "Text composable",
                            message2 = "Displays text and follows the recommended Material Design guidelines.",
                            color = Color(0xFFEADDFF),
                            modifier = Modifier
                        )
                    }
                }
                Row(modifier = Modifier.height(mh / 2)) {
                    Column(modifier = Modifier
                        .width(mw / 2)
                        .background(Color.Gray)
                        .align(Alignment.CenterVertically)
                        .fillMaxHeight()
                    ) {
                        Square1(
                            message1 = "Text composable",
                            message2 = "Displays text and follows the recommended Material Design guidelines.",
                            color = Color(0xFFEADDFF),
                            modifier = Modifier
                        )
                    }
                    Column(modifier = Modifier
                        .width(mw / 2)
                        .background(Color.Cyan)
                        .align(Alignment.CenterVertically)
                        .fillMaxHeight()
                    ) {
                        Square1(
                            message1 = "Text composable",
                            message2 = "Displays text and follows the recommended Material Design guidelines.",
                            color = Color(0xFFEADDFF),
                            modifier = Modifier
                        )
                    }
                }
            }
        }
//        Column(Modifier.fillMaxWidth()) {
//            Row(Modifier.weight(1f)) {
//                Square1(
//                    message1 = "Text composable",
//                    message2 = "Displays text and follows the recommended Material Design guidelines.",
//                    color = Color(0xFFEADDFF),
//                    modifier = Modifier
//                )
//                Square1(
//                    message1 = "Image composable",
//                    message2 = "Creates a composable that lays out and draws a given Painter class object.",
//                    color = Color(0xFFD0BCFF),
//                    modifier = Modifier
//                )
//            }
//            Row(Modifier.weight(1f)) {
//                Square1(
//                    message1 = "Row composable",
//                    message2 = "A layout composable that places its children in a horizontal sequence.",
//                    color = Color(0xFFB69DF8),
//                    modifier = Modifier
//                )
//                Square1(
//                    message1 = "Column composable",
//                    message2 = "A layout composable that places its children in a vertical sequence.",
//                    color = Color(0xFFF6EDFF),
//                    modifier = Modifier
//                )
//            }
//        }
    }
}
