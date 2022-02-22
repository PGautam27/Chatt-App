package com.example.gchatt_app.composable.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gchatt_app.composable.*


@Composable
internal fun navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.FirstScreen.route){
        composable(route = Screen.FirstScreen.route){
            firstScreen(navController = navController)
        }
        composable(route = Screen.RegisterPage.route){
            registerPage(navController = navController)
        }
        composable(route = Screen.Login.route){
            login(navController = navController)
        }
        composable(route = Screen.Otp.route){
            otp(navController = navController)
        }
        composable(route =  Screen.Welcome.route){
            welcome()
        }
    }
}

