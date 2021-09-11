package com.marco.jetpackcomposecryptocurrencyapi.presentation.ui.coin_list

import com.marco.jetpackcomposecryptocurrencyapi.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)