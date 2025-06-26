package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.dataSource.room.account.dao.AccountDao
import com.example.currencyconverter.data.mapper.AccountDboToAccountDomainMapper
import com.example.currencyconverter.data.mapper.AccountDomainToAccountDboMapper
import com.example.currencyconverter.domain.entity.AccountDomain
import com.example.currencyconverter.domain.repository.AccountRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * @author d.borodin
 */

class AccountRepositoryImpl @Inject constructor(

    val dao: AccountDao,
    val mapperDboToDomain: AccountDboToAccountDomainMapper,
    val mapperDomainToDbo: AccountDomainToAccountDboMapper,
): AccountRepository {

    override suspend fun getListAccounts(): Flow<List<AccountDomain>> {
        return dao.getAllAsFlow().map { list -> list.map { mapperDboToDomain(it) } }
    }

    override suspend fun setAccount(account: AccountDomain) {
        dao.insertAll(mapperDomainToDbo(account))
    }
}