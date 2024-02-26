package io.github.junrdev.mars.domain.model

import androidx.annotation.DrawableRes

data class RoverUiModel(
    val name : String,
    @DrawableRes val img : Int,
    val landingDate : String,
    val distance : String
)
