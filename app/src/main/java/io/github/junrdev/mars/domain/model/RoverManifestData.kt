package io.github.junrdev.mars.domain.model

import io.github.junrdev.mars.service.model.RoverManifestRemoteModel


fun toUiModel(roverManifestRemoteModel: RoverManifestRemoteModel): RoverManifestUiState {
    return RoverManifestUiState.success(
        roverManifestRemoteModel.photoManifestRemoteModel.photos.map {
            RoverManifestUiModel(
                sol = it.sol.toString(),
                earthDate = it.earthDate,
                photoNumber = it.totalPhotos.toString()
            )
        }.sorted()
    )
}