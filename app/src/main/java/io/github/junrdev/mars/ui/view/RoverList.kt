package io.github.mars.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.mars.domain.model.RoverUiModel
import io.github.mars.domain.model.roverUiModelList

@Preview
@Composable
fun RoverPreview() {
    RoverList(){}
}

@Composable
fun RoverList(
    onClick: (rover: String) -> Unit
) {
    Surface(color = MaterialTheme.colorScheme.onBackground, modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(count = roverUiModelList.size) {
                Rover(roverUiModelList[it], onClick)
            }
        }
    }
}

@Composable
fun Rover(
    roverUiModel: RoverUiModel,
    onClick: (rover: String) -> Unit
) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clickable { onClick(roverUiModel.name) }) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = roverUiModel.name, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Image(
                painter = painterResource(id = roverUiModel.img),
                contentDescription = roverUiModel.name
            )

            Text(text = "Landing date : ${roverUiModel.landingDate}", fontSize = 12.sp)
            Text(text = "Distance travelled : ${roverUiModel.distance}", fontSize = 12.sp)
        }
    }
}
