package com.example.paweljablonski.cryptoapp.presentation.coin_detail

import com.example.paweljablonski.cryptoapp.domain.model.Coin
import com.example.paweljablonski.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""

)
