package com.i.helloapp.ui.screen

import android.preference.PreferenceActivity
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.i.helloapp.R
import com.i.helloapp.ui.theme.HelloAppTheme

@Composable
fun Screen3 () {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.onBackground

    ){
        Task(modifier = Modifier,
            )
    }
}



@Composable
fun Task( modifier: Modifier ) {
    val paint = painterResource(R.drawable.ic_task_completed)
    LazyColumn(
        modifier = Modifier.fillMaxSize(1f),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(19) {index ->
            Card {
                Text(text = "номер по списку: $index",
                    color = Color.Red,
                    modifier = Modifier.padding(all = 20.dp),
                )
            }

        }
    }

}





@Preview(showBackground = true)
@Composable
fun TaskPreview() {
    HelloAppTheme {
        Task(
            modifier = Modifier
        )
    }
}