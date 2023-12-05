package com.example.curriculo_portifolio.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.curriculo_portifolio.R

private infix fun Unit.align(centerHorizontally: Alignment.Horizontal) {
}

@Composable
fun PortfolioContent() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF121824))) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),

        ) {
            Image(
                painter = painterResource(id = R.drawable.eu),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .padding(15.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterHorizontally)
                    .border(
                        BorderStroke(4.dp, Color(0xFFEC9651)),
                        CircleShape
                    ),

            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "String nome = Maria\nEduarda Azenha Pires",
                fontFamily = FontFamily.Monospace,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 5.dp)
                    .align(Alignment.CenterHorizontally),
                    style = MaterialTheme.typography.labelLarge
                    .copy(fontSize = 23.sp, fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(8.dp))

            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(text = "< ", fontFamily = FontFamily.Monospace,
                    color = Color(0xFFEC9651),
                    style = MaterialTheme.typography.labelLarge
                        .copy(fontSize = 50.sp, fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center)
                Text(text = " Estudante de Ciência\n da Computação ", fontFamily = FontFamily.Monospace,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    style = MaterialTheme.typography.labelLarge
                        .copy(fontSize = 17.sp, fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center)
                Text(text = " >", fontFamily = FontFamily.Monospace,
                    color = Color(0xFFEC9651),


                    style = MaterialTheme.typography.labelLarge
                        .copy(fontSize = 50.sp, fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center)
            }

            Row (   modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
               
                IconButton(
                    onClick = {
                        // Ação a ser executada quando o botão é clicado
                    },
                    modifier = Modifier
                        .size(70.dp)
                        .padding(16.dp)
                        .background(
                            color = Color.White,
                           shape = CircleShape
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.linkedinp),
                        contentDescription = "linkedin button"
                    )
                }
                IconButton(
                    onClick = {
                        // Ação a ser executada quando o botão é clicado
                    },
                    modifier = Modifier
                        .size(50.dp)
                        .padding(16.dp, top = 20.dp)
                        .background(
                            color = Color.White,
                            shape = CircleShape
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.github),
                        contentDescription = "github button"
                    )
                }
            }




            Button(
                onClick = { },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 30.dp, start = 5.dp)
                    .scale(1.2f),
                contentPadding = PaddingValues(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor  = Color(0xFFEC9651), contentColor = Color.White)
            ) {
                Text("Download CV")
            }
        }
    }
}


@Composable
fun PortfolioNavItem(text: String, icon: ImageVector) {
    Row(
        modifier = Modifier.clickable(
            onClick = { },

            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text, style = MaterialTheme.typography.labelLarge)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PortfolioContent()

}