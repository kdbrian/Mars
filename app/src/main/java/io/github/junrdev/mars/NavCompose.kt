package io.github.junrdev.mars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.junrdev.mars.nav.Action
import io.github.junrdev.mars.nav.Destinations.Home
import io.github.junrdev.mars.ui.view.ManifestScreen
import io.github.junrdev.mars.ui.view.RoverList


@Composable
fun NavCompose() {
    
    val navController = rememberNavController()

    val actions = remember (navController){
        Action(navController)
    }
    
    NavHost(navController = navController, startDestination = Home){

        composable(route = Home){
            RoverList(){
                actions.manifest(it)
            }
        }


//        retrieve rover name
        composable(route = Home){backstackentry ->
            ManifestScreen(
                rover = backstackentry.arguments?.getString("rover")!!,
                marsRoverManifestViewModel =    hiltViewModel()
            )
        }

    }
}
