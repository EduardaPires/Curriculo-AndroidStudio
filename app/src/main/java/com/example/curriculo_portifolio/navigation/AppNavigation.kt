package com.example.curriculo_portifolio.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.curriculo_portifolio.R
import com.example.curriculo_portifolio.screens.Habilidades
import com.example.curriculo_portifolio.screens.PortfolioContent
import com.example.curriculo_portifolio.screens.Projetos

private fun Modifier.background(b: Boolean, onClick: () -> Unit, icon: () -> Unit, label: () -> Unit) {
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(){
    val navController : NavHostController = rememberNavController()
    Scaffold(
        topBar = {

            NavigationBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue),
                containerColor = Color(0xFF0D0F1A)
            ){
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                listOfNavItems.forEach{ navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any{it.route == navItem.route} == true,
                        onClick = {
                                  navController.navigate(navItem.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                               Icon(imageVector = navItem.icon,
                                   contentDescription = null,
                                   tint = Color(0xFFEC9651))
                        },
                        label = {
                            Text(text = navItem.label,
                                color = Color(0xFFEC9651))
                        }

                    )
                }
            }
        }
    ) {paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.PortfolioContent.name,
            modifier = Modifier
                .padding(paddingValues)
        ){
            composable(route = Screens.PortfolioContent.name){
                PortfolioContent()
            }
            composable(route = Screens.Habilidades.name){
                Habilidades()
            }
            composable(route = Screens.Projetos.name){
                Projetos()
            }
        }
    }
}



@Preview
@Composable
fun PreviewAppNavigation() {
    AppNavigation()
}