package com.example.jetpackcomposelesson.route

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposelesson.screens.CartScreen
import com.example.jetpackcomposelesson.screens.HomeScreen
import com.example.jetpackcomposelesson.screens.product.ProductScreen
import com.example.jetpackcomposelesson.screens.SettingScreen
import com.example.jetpackcomposelesson.screens.auth.LoginScreen
import com.example.jetpackcomposelesson.screens.auth.RegisterScreen
import com.example.jetpackcomposelesson.screens.product.ProductDetailScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController, paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
//        startDestination = BottomBarScreen.Home.route,
        startDestination = "Auth",
        modifier = Modifier.padding(paddingValues)
    ) {
        navigation(
            startDestination = "Login",
            route = "Auth",
        ) {
            composable(route = "Login") {
                LoginScreen(navController)
            }
            composable(route = "Register") {
                RegisterScreen(navController)
            }
        }

        navigation(
            startDestination = BottomBarScreen.Home.route,
            route = "Main",
        ) {
            composable(route = BottomBarScreen.Home.route) {
                HomeScreen(navController)
            }
            composable(route = BottomBarScreen.Product.route) {
                ProductScreen(navController)
            }
            composable(route = BottomBarScreen.Cart.route) {
                CartScreen(navController)
            }
            composable(route = BottomBarScreen.Setting.route) {
                SettingScreen(navController)
            }
        }

        composable(route = "Product Detail") {
            ProductDetailScreen(navController)
        }
    }
}