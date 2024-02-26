package io.github.mars.service

import io.github.junrdev.mars.service.model.RoverManifestRemoteModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import kotlin.math.log

interface ManifestRoverService {


    @GET("mars-photos/api/v1/manifest/{rover_name}?api_key=DEMO_KEY")
    suspend fun getMarsRoverManifest(@Path("rover_name") roverName: String): RoverManifestRemoteModel


    companion object {

        private val BASE_URL = "https://api.nasa.gov"

        fun create(): ManifestRoverService {

            val logger = HttpLoggingInterceptor()
            logger.level = HttpLoggingInterceptor.Level.NONE

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ManifestRoverService::class.java)

        }
    }

}