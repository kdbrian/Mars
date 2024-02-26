package io.github.junrdev.mars.service.model

import com.google.gson.annotations.SerializedName

data class RoverManifestRemoteModel (
    @field:SerializedName("photo_manifest") val  photoManifestRemoteModel: PhotoManifestRemoteModel,

)