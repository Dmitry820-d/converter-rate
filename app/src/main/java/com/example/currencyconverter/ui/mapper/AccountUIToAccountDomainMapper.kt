package com.example.currencyconverter.ui.mapper

import com.example.currencyconverter.domain.entity.AccountDomain
import com.example.currencyconverter.ui.models.AccountUI

/**
 * @author d.borodin
 */

class AccountUIToAccountDomainMapper : (AccountUI) -> AccountDomain  {

    override fun invoke(accountUI: AccountUI): AccountDomain {
        return AccountDomain(
            code = accountUI.code,
            amount = accountUI.amount
        )
    }
}