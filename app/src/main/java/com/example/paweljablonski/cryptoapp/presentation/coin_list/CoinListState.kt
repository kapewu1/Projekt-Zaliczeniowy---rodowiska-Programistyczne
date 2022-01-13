package com.example.paweljablonski.cryptoapp.presentation.coin_list

import com.example.paweljablonski.cryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""

)
