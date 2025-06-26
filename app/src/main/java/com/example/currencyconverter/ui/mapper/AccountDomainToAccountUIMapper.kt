package com.example.currencyconverter.ui.mapper

import com.example.currencyconverter.domain.entity.AccountDomain
import com.example.currencyconverter.ui.models.AccountUI

/**
 * @author d.borodin
 */

class AccountDomainToAccountUIMapper : (AccountDomain) -> AccountUI  {

    override fun invoke(accountDomain: AccountDomain): AccountUI {
        return AccountUI(
            code = accountDomain.code,
            amount = accountDomain.amount
        )
    }
}