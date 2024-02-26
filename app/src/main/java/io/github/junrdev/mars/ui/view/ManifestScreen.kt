package io.github.mars.ui.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ManifestScreen(
    rover : String
) {

    Text(text = rover)
}


@Preview
@Composable
fun ManifestScreenPreview() {

}