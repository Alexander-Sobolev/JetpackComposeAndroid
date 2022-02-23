package com.example.jpc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jpc.ui.theme.JPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListenItem(name = "Zac Efr", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac Efr", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac Efr", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
                ListenItem(name = "Zac", prof = "Actor")
            }
        }
    }
}


@Composable
private fun ListenItem(name: String, prof: String) {
    var counter = remember {
        mutableStateOf(0)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                counter.value++
            },
        shape = RoundedCornerShape(16.dp),
        elevation = 5.dp
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.zac),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                    )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = counter.value.toString())
                    Text(text = prof)
                }
            }
        }
    }
}

