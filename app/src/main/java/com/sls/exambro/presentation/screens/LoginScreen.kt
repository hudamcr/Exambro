package com.sls.exambro.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sls.exambro.R
import com.sls.exambro.presentation.screens.widget.TextFieldUsername
import com.sls.exambro.presentation.widget.TextTitle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var username = remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var checkTnc = remember { mutableStateOf(false) }
    val tncString = buildAnnotatedString {
        append("Dengan ini saya membaca, memahami dan menyetujui hal - hal yang tercantum pada ")
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Bold
            )
        ) {
            append("syarat dan ketentuan")
        }
        append(" dan ")
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Bold
            )
        ) {
            append("kebijakan privasi")
        }
        append(" yang berlaku")
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.sma1turen),
                contentDescription = "logo",
                Modifier.size(100.dp)
            )
            TextTitle(
                text = "SELAMAT DATANG\nCLASS CENTER",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 24.dp, bottom = 24.dp)
            )
            Column(
                modifier = Modifier
                    .border(
                        1.dp,
                        Color.Black,
                        RoundedCornerShape(15.dp)
                    )
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextTitle(
                    text = "LOGIN AKUN",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                TextFieldUsername(
                    inputWrapper = username.value,
                    onValueChange = {
                        username.value = it
                    })
                TextField(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth()
                        .border(
                            1.dp, Color.Black, RoundedCornerShape(8.dp)
                        ),
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    enabled = true,
                    placeholder = {
                        Text(
                            "Password",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    textStyle = MaterialTheme.typography.bodyMedium,
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White,
                        cursorColor = Color.Black,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        disabledTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 8.dp)
                ) {
                    Text(text = "Lupa Password ? ", fontSize = 12.sp)
                    Text(
                        text = "Reset",
                        color = Color.Blue,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Checkbox(
                        checked = checkTnc.value,
                        onCheckedChange = {
                            checkTnc.value = it
                        })
                    ClickableText(
                        style = TextStyle(fontSize = 10.sp),
                        text = tncString,
                        onClick = {

                        }
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .fillMaxWidth(),
                    onClick = {
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        disabledContainerColor = Color.DarkGray
                    ),
                ) {
                    Text("Login")
                }
            }
        }
    }
}