package com.example.curriculo_portifolio.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
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
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.curriculo_portifolio.R

private infix fun Unit.align(centerHorizontally: Alignment.Horizontal) {
}

@Composable
fun Projetos() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF121824))) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),

            ) {

            Text(text = "Confira meus projetos",
                fontFamily = FontFamily.Monospace,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 5.dp)
                    .align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.labelLarge
                    .copy(fontSize = 23.sp, fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Int projetos = 5",
                fontFamily = FontFamily.Monospace,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 5.dp)
                    .align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.labelLarge
                    .copy(fontSize = 17.sp),
                textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(8.dp))
        }
        Row {
            Column {
                var isClicked by remember { mutableStateOf(false) }
                var text by remember { mutableStateOf("") }
                val texto = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFEC9651)
                        )
                    ) {
                        append("Jogo 2d Unity\n ")
                    }
                    append("Experiência com desenvolvimento de jogos usando Unity")
                }
                Spacer(modifier = Modifier.height(130.dp))
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .pointerInput(Unit) {
                            detectTapGestures { offset ->
                                if (offset.x >= 0 && offset.y >= 0) {
                                    isClicked = !isClicked
                                    text = if (isClicked) "$texto" else ""
                                }
                            }
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.jogo),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .graphicsLayer(
                                alpha = if (isClicked) 0.5f else 1.0f,
                            )
                    )

                    if (isClicked) {
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .border(2.dp, Color(0xFFEC9651))
                        ) {
                            Text(
                                text = texto,
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White,
                                fontFamily = FontFamily.Monospace,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp)

                            )
                        }
                }
            }


                var isClicked1 by remember { mutableStateOf(false) }
                var text1 by remember { mutableStateOf("") }
                val texto1 = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFEC9651)
                        )
                    ) {
                        append("SW sistema\n ")
                    }
                    append("Sistema que separa remédios na dose correta de forma automatizada")
                }
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .pointerInput(Unit) {
                            detectTapGestures { offset ->
                                if (offset.x >= 0 && offset.y >= 0) {
                                    isClicked1 = !isClicked1
                                    text1 = if (isClicked1) "$texto1" else ""
                                }
                            }
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sw),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                            .graphicsLayer(
                                alpha = if (isClicked1) 0.5f else 1.0f,
                            )
                    )

                    if (isClicked1) {
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .border(2.dp, Color(0xFFEC9651))
                        ) {
                            Text(
                                text = texto1,
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp)
                            )
                        }
                    }
                }


                var isClicked2 by remember { mutableStateOf(false) }
                var text2 by remember { mutableStateOf("") }
                val texto2 = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFEC9651)
                        )
                    ) {
                        append("Home's Food\n ")
                    }
                    append("Aplicativo de entregas e pedidos de comida de caseira")
                }
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .pointerInput(Unit) {
                            detectTapGestures { offset ->
                                if (offset.x >= 0 && offset.y >= 0) {
                                    isClicked2 = !isClicked2
                                    text2 = if (isClicked2) "$texto2" else ""
                                }
                            }
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.homesfood),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                            .graphicsLayer(
                                alpha = if (isClicked2) 0.5f else 1.0f,
                            )
                    )

                    if (isClicked2) {
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .border(2.dp, Color(0xFFEC9651))
                        ) {
                            Text(
                                text = texto2,
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .background(Color(0xFF0D0F1A))
                        .size(200.dp)
                ) {
                }
        }
            Column {
                var isClicked3 by remember { mutableStateOf(false) }
                var text3 by remember { mutableStateOf("") }
                val texto3 = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFEC9651)
                        )
                    ) {
                        append("Bulls and Cows\n ")
                    }
                    append("Jogo de adivinhação de números de 4 algarismos")
                }
                Spacer(modifier = Modifier.height(130.dp))
                Box(
                    modifier = Modifier
                        .height(100.dp)

                        .pointerInput(Unit) {
                            detectTapGestures { offset ->
                                if (offset.x >= 0 && offset.y >= 0) {
                                    isClicked3 = !isClicked3
                                    text3 = if (isClicked3) "$texto3" else ""
                                }
                            }
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bullscows),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                            .graphicsLayer(
                                alpha = if (isClicked3) 0.5f else 1.0f,
                            )
                    )

                    if (isClicked3) {
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .border(2.dp, Color(0xFFEC9651))
                        ) {
                            Text(
                                text = texto3,
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp)
                            )
                        }
                    }
                }



                var isClicked4 by remember { mutableStateOf(false) }
                var text4 by remember { mutableStateOf("") }
                val texto4 = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFEC9651)
                        )
                    ) {
                        append("Dug's Recipes\n ")
                    }
                    append("Site que disponibiliza receitas para todos os níveis e preferência")
                }
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .pointerInput(Unit) {
                            detectTapGestures { offset ->
                                if (offset.x >= 0 && offset.y >= 0) {
                                    isClicked4 = !isClicked4
                                    text4 = if (isClicked4) "$texto4" else ""
                                }
                            }
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dugs),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)

                            .graphicsLayer(
                                alpha = if (isClicked4) 0.5f else 1.0f,
                            )
                    )

                    if (isClicked4) {
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .border(2.dp, Color(0xFFEC9651))
                        ) {
                            Text(
                                text = texto4,
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(3.dp))
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .background(Color(0xFF0D0F1A))
                        .size(200.dp)
                ) {
                }
                Spacer(modifier = Modifier.height(5.dp))
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .background(Color(0xFF0D0F1A))
                        .size(200.dp)
                ) {
                }
            }
    }
}
}



@Preview
@Composable
fun ProjetosPreview() {
    Projetos()
}