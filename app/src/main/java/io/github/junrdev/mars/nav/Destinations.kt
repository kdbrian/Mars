package io.github.junrdev.mars.nav

import androidx.navigation.NavController
import io.github.junrdev.mars.nav.Destinations.Home
import io.github.junrdev.mars.nav.Destinations.Manifest

object Destinations {
    const val Home = "home"
    const val Manifest = "manifest/{rover}"
}


class Action(navController: NavController){
    val home : () -> Unit = { navController.navigate(Home)}
    val manifest : (rover : String) -> Unit = { rover ->  navController.navigate("${Manifest}/$rover")}
}
