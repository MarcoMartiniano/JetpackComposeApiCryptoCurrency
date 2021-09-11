package com.marco.jetpackcomposecryptocurrencyapi.data.repository

import com.marco.jetpackcomposecryptocurrencyapi.data.remote.CoinPaprikaApi
import com.marco.jetpackcomposecryptocurrencyapi.data.remote.dto.CoinDetailDto
import com.marco.jetpackcomposecryptocurrencyapi.data.remote.dto.CoinDto
import com.marco.jetpackcomposecryptocurrencyapi.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}