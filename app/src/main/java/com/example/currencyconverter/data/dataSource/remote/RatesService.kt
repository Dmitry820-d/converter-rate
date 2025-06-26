package com.example.currencyconverter.data.dataSource.remote

import com.example.currencyconverter.data.dataSource.remote.dto.RateDto

/**
 * @author d.borodin
 */

interface RatesService {
    suspend fun getRates(
        baseCurrencyCode: String,
        amount: Double
    ): List<RateDto>
}