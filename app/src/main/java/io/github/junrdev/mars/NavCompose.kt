package io.github.mars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.mars.nav.Action
import io.github.mars.nav.Destinations.Home
import io.github.mars.ui.view.ManifestScreen
import io.github.mars.ui.view.RoverList


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
                rover = backstackentry.arguments?.getString("rover")!!
            )
        }

    }
}
