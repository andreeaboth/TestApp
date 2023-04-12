package com.example.domain.repository

interface SportsRepository {

    suspend fun getTeamById(id: Int)
}