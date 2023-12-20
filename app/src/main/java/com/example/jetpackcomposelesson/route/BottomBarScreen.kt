package com.example.jetpackcomposelesson.route

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    var route: String,
    val title: String,
    val icon: ImageVector,
) {
    object Home : BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Product : BottomBarScreen(
        route = "Product",
        title = "Product",
        icon = Icons.Default.Place
    )

    object Cart : BottomBarScreen(
        route = "Cart",
        title = "Cart",
        icon = Icons.Default.ShoppingCart
    )

    object Setting : BottomBarScreen(
        route = "Setting",
        title = "Setting",
        icon = Icons.Default.Settings
    )
}
