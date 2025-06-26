package com.example.currencyconverter.ui.mapper

import com.example.currencyconverter.domain.entity.RateDomain
import com.example.currencyconverter.ui.models.RateUI

/**
 * @author d.borodin
 */

class RateDomainToRateUIMapper : (RateDomain) -> RateUI  {

    override fun invoke(rateDomain: RateDomain): RateUI {
        return RateUI(
            currency = rateDomain.currency,
            value = RateUI.convertDouble(rateDomain.value)
        )
    }


}