package com.example.gchatt_app.composable.navigation

sealed class Screen(val route:String){
    object FirstScreen: Screen(route = "first_screen")
    object RegisterPage: Screen(route = "register_page")
    object Login: Screen(route = "login")
    object Otp: Screen(route = "otp")
    object Welcome: Screen(route = "welcome")
}
