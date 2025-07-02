package com.example.despesas.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.despesas.ui.theme.Black
import com.example.despesas.ui.theme.Cabecalho

@Composable
fun CaixaDeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier, label = {
            Text(text = "Name")
        },
        maxLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Black,
            focusedBorderColor = Cabecalho,
            focusedLabelColor = Cabecalho,
            backgroundColor = Color.White,
            cursorColor = Cabecalho
        ),

    )
}

@Composable
@Preview
private fun CaixaDeTextoPreview(){
    CaixaDeTexto(
        value = "",
        onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        label = "Nome")
}