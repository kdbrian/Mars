package io.github.junrdev.mars.ui.manifestlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.junrdev.mars.data.ManifestRoverManifestRepo
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MarsRoverManifestViewModel @Inject constructor(
    private val manifestRoverManifestRepo: ManifestRoverManifestRepo
) : ViewModel() {

    fun getMarsRoverManifest(roverName : String){
        viewModelScope.launch {
            manifestRoverManifestRepo.getMarsRoverManifest(roverName).collect{

            }
        }
    }
}