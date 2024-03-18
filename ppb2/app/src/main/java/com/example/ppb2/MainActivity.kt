package com.example.ppb2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.ppb2.ui.theme.PPB2Theme
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PPB2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Nuzul Abatony", "5025201107", "PPB I")
                }
            }
        }
    }
}

@Composable
fun Greeting(nama: String, nrp: String, kelas: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF141D2B))
    ) {
        Text(
            text = "Hello Android!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFC5F467)
        )
        Text(
            text = "Nama: $nama",
            fontSize = 20.sp,
            color = Color(0xFFC5F467)
        )
        Text(
            text = "NRP: $nrp",
            fontSize = 20.sp,
            color = Color(0xFFC5F467)
        )
        Text(
            text = "Kelas: $kelas",
            fontSize = 20.sp,
            color = Color(0xFFC5F467)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PPB2Theme {
        Greeting("Nuzul Abatony", "5025201107", "PPB I")
    }
}