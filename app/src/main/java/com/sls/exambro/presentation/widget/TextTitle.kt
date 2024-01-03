package com.sls.exambro.presentation.widget

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TextTitle(
    text: String,
    modifier: Modifier,
    textAlign: TextAlign
) {
    Text(
        modifier = modifier,
        textAlign = textAlign,
        style = MaterialTheme.typography.bodyLarge,
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )
}