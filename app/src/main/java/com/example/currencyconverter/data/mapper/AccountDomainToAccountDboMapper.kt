package com.example.currencyconverter.data.mapper

import com.example.currencyconverter.data.dataSource.room.account.dbo.AccountDbo
import com.example.currencyconverter.domain.entity.AccountDomain

/**
 * @author d.borodin
 */

class AccountDomainToAccountDboMapper : (AccountDomain) -> AccountDbo  {

    override fun invoke(accountDbo: AccountDomain): AccountDbo {
        return AccountDbo(
            code = accountDbo.code,
            amount = accountDbo.amount
        )
    }
}