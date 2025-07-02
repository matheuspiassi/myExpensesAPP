package com.example.despesas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.despesas.ui.theme.DespesasTheme
import com.example.despesas.view.ListaObjetos
import com.example.despesas.view.SalvarObjeto

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DespesasTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "listaObjetos"){
                    composable(
                        route = "listaObjetos"
                    ){
                        ListaObjetos(navController)
                    }
                    composable(
                        route = "salvarObjeto"
                    ){
                        SalvarObjeto(navController)
                    }
                }
            }
        }
    }
}

