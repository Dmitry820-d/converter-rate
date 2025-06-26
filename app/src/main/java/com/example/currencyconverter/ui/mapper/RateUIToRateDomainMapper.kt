package com.example.currencyconverter.ui.mapper

import com.example.currencyconverter.domain.entity.RateDomain
import com.example.currencyconverter.ui.models.RateUI

/**
 * @author d.borodin
 */

class RateUIToRateDomainMapper : (RateUI) -> RateDomain  {

    override fun invoke(rateUI: RateUI): RateDomain {
        return RateDomain(
            currency = rateUI.currency,
            value = rateUI.value
        )
    }
}