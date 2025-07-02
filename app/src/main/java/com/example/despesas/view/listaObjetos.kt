package com.example.despesas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material.DrawerDefaults.backgroundColor
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.despesas.R
import com.example.despesas.ui.theme.Background
import com.example.despesas.ui.theme.Buttons
import com.example.despesas.ui.theme.Cabecalho

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListaObjetos(
    navController: NavController
){
        Scaffold (
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Expenses",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Cabecalho)
                )
            },
            contentColor = Background,
            floatingActionButton = {
                FloatingActionButton(onClick ={
                    navController.navigate("salvarObjeto")
                }, backgroundColor = Buttons
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_add),
                        contentDescription = "Icone de salvar Objeto"
                    )
                }
            }
        ){

        }
}



