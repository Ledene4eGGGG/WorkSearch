package com.i.helloapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.i.helloapp.ui.screen.Screen1
import com.i.helloapp.ui.screen.Screen2
import com.i.helloapp.ui.screen.Screen3
import com.i.helloapp.ui.theme.HelloAppTheme
import com.i.helloapp.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val screen = remember { mutableStateOf(1) }

            HelloAppTheme {
                when (screen.value) {
                    1 -> {
                        Screen1(
                            onClick = {
                                screen.value = 2
                            }
                        )
                    }
                    2 -> {
                        Screen2(
                            onClick = {
                                screen.value = 3
                            }
                        )
                    }
                    3 -> {
                        Screen3()
                    }
                }
            }
        }
    }
}
