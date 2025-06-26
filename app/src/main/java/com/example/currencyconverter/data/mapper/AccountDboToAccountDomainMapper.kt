package com.example.currencyconverter.data.mapper

import com.example.currencyconverter.data.dataSource.room.account.dbo.AccountDbo
import com.example.currencyconverter.domain.entity.AccountDomain

/**
 * @author d.borodin
 */

class AccountDboToAccountDomainMapper : (AccountDbo) -> AccountDomain  {

    override fun invoke(accountDbo: AccountDbo): AccountDomain {
        return AccountDomain(
            code = accountDbo.code,
            amount = accountDbo.amount
        )
    }
}