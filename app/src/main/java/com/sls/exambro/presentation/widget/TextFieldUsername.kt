package com.sls.exambro.presentation.screens.widget

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sls.exambro.data.model.InputWrapper

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldUsername(
    inputWrapper: String,
    onValueChange: (value: String) -> Unit,
) {
    val username = remember { mutableStateOf(inputWrapper) }
    TextField(
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
            .border(
                1.dp, Color.Black, RoundedCornerShape(8.dp)
            ),
        value = username.value,
        onValueChange = {
            username.value = it
            onValueChange(it)
        },
        enabled = true,
        placeholder = {
            Text(
                "Masukkan NISN/NIS/NIK",
                color = Color.Gray,
                fontSize = 12.sp
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
}
