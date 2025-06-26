package com.example.currencyconverter.data.mapper

import com.example.currencyconverter.data.dataSource.remote.dto.RateDto
import com.example.currencyconverter.domain.entity.RateDomain

/**
 * @author d.borodin
 */

class RateDtoToRateDomainMapper : (RateDto) -> RateDomain  {

    override fun invoke(rateDto: RateDto): RateDomain {
        return RateDomain(
            currency = rateDto.currency,
            value = rateDto.value
        )
    }
}