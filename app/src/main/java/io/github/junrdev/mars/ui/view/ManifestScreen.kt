package io.github.junrdev.mars.ui.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import io.github.junrdev.mars.ui.manifestlist.MarsRoverManifestViewModel


@Composable
fun ManifestScreen(
    rover : String,
    marsRoverManifestViewModel: MarsRoverManifestViewModel
) {
    if (rover != null){

        LaunchedEffect(Unit){
            marsRoverManifestViewModel.getMarsRoverManifest(rover)
        }

    }

    Text(text = rover)
}


@Preview
@Composable
fun ManifestScreenPreview() {

}