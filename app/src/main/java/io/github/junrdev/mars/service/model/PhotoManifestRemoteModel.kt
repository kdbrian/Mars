package io.github.mars.service.model

data class PhotoManifestRemoteModel(
    @field:SerializedName("landing_date") val landing_Date : String,
    @field:SerializedName("launch_date") val launchDate : String,
    @field:SerializedName("max_date") val maxDate : String,
    @field:SerializedName("max_sol") val maxSol : String,
    @field:SerializedName("name") val name : String,
    @field:SerializedName("total_photos") val name : Int,
    val photos : List<>,
    val status : String
)
