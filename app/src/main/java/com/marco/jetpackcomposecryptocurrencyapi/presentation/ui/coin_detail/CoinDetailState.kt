package com.marco.jetpackcomposecryptocurrencyapi.presentation.ui.coin_detail

import com.marco.jetpackcomposecryptocurrencyapi.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)