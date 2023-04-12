package com.example.data.api

import com.example.data.model.Team
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SportApi {
    @GET("lookupteam.php")
    suspend fun getTeam(@Query("id") id: Int): Response<Team>
}