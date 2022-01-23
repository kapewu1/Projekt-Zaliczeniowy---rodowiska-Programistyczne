package com.example.paweljablonski.cryptoapp.domain.model

import com.example.paweljablonski.cryptoapp.data.remote.dto.CoinDto

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)

