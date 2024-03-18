package com.example.ppb3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ppb3.ui.theme.PPB3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PPB3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val message = "Happy Birthday, Rudy! \uD83C\uDF89 Have a chalk-tastic day full of magical adventures! \uD83C\uDF1F"
                    Greeting(recipient = "Rudy", message = message, sender = "Snap")
                }
            }
        }
    }
}

@Composable
fun Greeting(sender: String, recipient: String, message: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF404632))
    ) {
        Text(
            text = "Happy Birthday $recipient!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFD2D7DA)
        )
        Text(
            text = message,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFFD2D7DA),
            modifier = Modifier
                .padding(vertical = 5.dp)
        )
        Text(
            text = sender,
            fontSize = 20.sp,
            color = Color(0xFFD2D7DA),
            modifier = Modifier
                .align(alignment = Alignment.End)
                .padding(end = 49.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PPB3Theme {
        val message = "Happy Birthday, Rudy! \uD83C\uDF89 Have a chalk-tastic day full of magical adventures! \uD83C\uDF1F"
        Greeting(recipient = "Rudy", message = message, sender = "Snap")
    }
}