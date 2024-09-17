package com.example.bienvenidoalcurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign


import com.example.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BienvenidoAlCursoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ribit),  // Reemplaza con tu recurso de imagen
            contentDescription = "Icon perfil",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nombre
        Text(
            text = "Nadia Torres",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Título
        Text(
            text = "Diseñadora y Desarolladora de Software",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF4CAF50),  // Verde similar al estilo de Android
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Información de contacto
        ContactInfoRow(icon = Icons.Filled.Phone, info = "+11 (123) 444 555 666")
        ContactInfoRow(icon = Icons.Filled.Share, info = "@AndroidDev")
        ContactInfoRow(icon = Icons.Filled.Email, info = "nadia.torres@android.com")
    }
}

@Composable
fun ContactInfoRow(icon: ImageVector, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color(0xFF4CAF50)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = info,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BienvenidoAlCursoTheme {
        BusinessCard()
    }
}
