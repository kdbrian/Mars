package io.github.junrdev.mars.service.model

import com.google.gson.annotations.SerializedName

data class PhotoManifestRemoteModel(
    @field:SerializedName ("landing_date") val landingDate : String,
    @field:SerializedName("launch_date") val launchDate : String,
    @field:SerializedName("max_date") val maxDate : String,
    @field:SerializedName("max_sol") val maxSol : String,
    @field:SerializedName("name") val name : String,
    @field:SerializedName("total_photos") val totalPhotos : Int,
    val photos : List<ManifestPhotoRemoteModel> ,
    val status : String
)
