package io.github.junrdev.mars.data

import io.github.junrdev.mars.domain.model.RoverManifestUiState
import io.github.junrdev.mars.domain.model.toUiModel
import io.github.mars.service.ManifestRoverService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ManifestRoverManifestRepo @Inject constructor(
    private val manifestRoverService: ManifestRoverService
) {

    fun getMarsRoverManifest(roverName: String): kotlinx.coroutines.flow.Flow<RoverManifestUiState> {
        return flow {
            try {
                emit(
                    toUiModel(manifestRoverService.getMarsRoverManifest(roverName.lowercase()))
                )
            } catch (t: Throwable) {
                emit(RoverManifestUiState.Error)
            }
        }
    }
}