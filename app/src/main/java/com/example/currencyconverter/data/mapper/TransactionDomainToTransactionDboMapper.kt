package com.example.currencyconverter.data.mapper

import com.example.currencyconverter.data.dataSource.room.transaction.dbo.TransactionDbo
import com.example.currencyconverter.domain.entity.TransactionDomain

/**
 * @author d.borodin
 */

class TransactionDomainToTransactionDboMapper : (TransactionDomain) -> TransactionDbo {

    override fun invoke(transactionDbo: TransactionDomain): TransactionDbo {
        return TransactionDbo(
            id = transactionDbo.id,
            from = transactionDbo.from,
            to = transactionDbo.to,
            fromAmount = transactionDbo.fromAmount,
            toAmount = transactionDbo.toAmount,
            dateTime = transactionDbo.dateTime,
        )
    }
}