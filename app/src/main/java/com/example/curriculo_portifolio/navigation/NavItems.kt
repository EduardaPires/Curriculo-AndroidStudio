package com.example.curriculo_portifolio.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItem(
        label = "Início",
        icon = Icons.Default.Home,
        route = Screens.PortfolioContent.name
    ),
    NavItem(
        label = "Habilidades",
        icon = Icons.Default.Star,
        route = Screens.Habilidades.name
    ),
    NavItem(
        label = "Projetos",
        icon = Icons.Default.Create,
        route = Screens.Projetos.name
    )
)


