package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.dataSource.remote.RatesService
import com.example.currencyconverter.data.mapper.RateDtoToRateDomainMapper
import com.example.currencyconverter.domain.entity.RateDomain
import com.example.currencyconverter.domain.repository.RateRepository
import javax.inject.Inject

/**
 * @author d.borodin
 */

class RateRepositoryImpl @Inject constructor(
    val ratesService: RatesService,
    val mapper: RateDtoToRateDomainMapper): RateRepository {
    override suspend fun getRates(code: String, amount: Double): List<RateDomain> {
        return ratesService.getRates(code, amount).map { mapper(it) }
    }
}