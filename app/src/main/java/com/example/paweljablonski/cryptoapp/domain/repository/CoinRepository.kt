package com.example.paweljablonski.cryptoapp.domain.repository

import com.example.paweljablonski.cryptoapp.data.remote.dto.CoinDetailDto
import com.example.paweljablonski.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}