package com.sls.exambro.presentation.widget

import com.sls.exambro.R
import com.sls.exambro.data.Screens

data class BottomNavigationItem(
    val label: String = "",
    val iconResId: Int = R.drawable.ic_launcher_background, // Change to your drawable resource ID
    val route: String = ""
) {

    fun bottomNavigationItems(): List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = "Home",
                iconResId = R.drawable.ic_launcher_background,
                route = Screens.Home.route
            ),
            BottomNavigationItem(
                label = "Enterprenuer",
                iconResId = R.drawable.ic_launcher_background,
                route = Screens.Promotions.route
            ),
            BottomNavigationItem(
                label = "Inbox",
                iconResId = R.drawable.ic_launcher_background,
                route = Screens.Booking.route
            ),
            BottomNavigationItem(
                label = "Akun",
                iconResId = R.drawable.ic_launcher_background,
                route = Screens.Booking.route
            ),
        )
    }
}