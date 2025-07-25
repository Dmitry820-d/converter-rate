package com.example.currencyconverter.ui.mapper

import com.example.currencyconverter.domain.entity.TransactionDomain
import com.example.currencyconverter.ui.models.TransactionUI

/**
 * @author d.borodin
 */

class TransactionDomainToTransactionUIMapper : (TransactionDomain) -> TransactionUI {

    override fun invoke(transactionDomain: TransactionDomain): TransactionUI {
        return TransactionUI(
            id = transactionDomain.id,
            from = transactionDomain.from,
            to = transactionDomain.to,
            fromAmount = transactionDomain.fromAmount,
            toAmount = transactionDomain.toAmount,
            dateTime = transactionDomain.dateTime,
        )
    }
}