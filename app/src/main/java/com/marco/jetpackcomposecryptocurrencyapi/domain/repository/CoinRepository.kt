package com.marco.jetpackcomposecryptocurrencyapi.domain.repository

import com.marco.jetpackcomposecryptocurrencyapi.data.remote.dto.CoinDetailDto
import com.marco.jetpackcomposecryptocurrencyapi.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}