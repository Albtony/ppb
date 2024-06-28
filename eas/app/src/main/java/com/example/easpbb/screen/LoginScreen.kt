package com.example.easpbb.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.easpbb.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val (isChecked, setChecked) = remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        // Background
        Column(modifier = Modifier.fillMaxSize()) {
            // First box (Red), ratio 4
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo1), // Replace with your logo resource ID
                    contentDescription = "Logo",
                    modifier = Modifier.size(300.dp) // Adjust size as needed
                )
            }

            // Second box (White), ratio 3
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White)
            )

            // Third box (Red), ratio 2
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .background(Color.Red)
            )
        }

        // Content
        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .offset(y = 200.dp)
                .border(0.2.dp, Color.Black, MaterialTheme.shapes.medium)
                .background(Color.White, MaterialTheme.shapes.medium),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Selamat Datang!",
                    fontSize = 25.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_light)),
                    modifier = Modifier.padding(vertical = 3.dp)
                )
                Text(
                    text = "Login",
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                    modifier = Modifier.padding(vertical = 3.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Nama Akun",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_light)),
                    modifier = Modifier.padding(top = 3.dp)
                )
                TextField(
                    value = "",
                    onValueChange = { /* Handle state update */ },
                    modifier = Modifier
                        .fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Masukan Nama Akun",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_light)),
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color.Black,
                        disabledLabelColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )
                Text(
                    text = "Kata Sandi",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_light)),
                    modifier = Modifier.padding(top = 3.dp)
                )
                TextField(
                    value = "",
                    onValueChange = { /* Handle state update */ },
                    modifier = Modifier
                        .fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Masukan Kata Sandi",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_light)),
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color.Black,
                        disabledLabelColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )
                Row {
                    Checkbox(
                        checked = isChecked,
                        onCheckedChange = { setChecked(it) },
                        colors = CheckboxDefaults.colors(
                            checkmarkColor = Color.Black,
                            checkedColor = Color.White // Adjust checked color as needed
                        ),
                        modifier = Modifier.offset(x = (-12).dp)
                    )
                    Text(
                        text = "Ingat Aku",
                        color = Color.Black,
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .offset(x = (-12).dp)
                    )
                }
                Button(
                    onClick = {
                        navController.navigate("main")
                    },
                    modifier = Modifier
                        .height(50.dp) // Adjust height as needed
                        .fillMaxWidth(), // Take full width available
                    shape = MaterialTheme.shapes.medium, // Apply medium rounded corners
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp) // Adjust content padding
                ) {
                    Text(
                        text = "Login",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.poppins)),
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {
                        navController.navigate("register")
                    },
                    modifier = Modifier
                        .height(50.dp) // Adjust height as needed
                        .fillMaxWidth(), // Take full width available
                    shape = MaterialTheme.shapes.medium, // Apply medium rounded corners
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp) // Adjust content padding
                ) {
                    Text(
                        text = "Register",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.poppins)),
                    )
                }
            }
        }
    }
}