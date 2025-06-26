package com.example.currencyconverter.ui.mapper

import com.example.currencyconverter.domain.entity.TransactionDomain
import com.example.currencyconverter.ui.models.TransactionUI

/**
 * @author d.borodin
 */

class TransactionUIToTransactionDomainMapper : (TransactionUI) -> TransactionDomain {

    override fun invoke(transactionUI: TransactionUI): TransactionDomain {
        return TransactionDomain(
            id = transactionUI.id,
            from = transactionUI.from,
            to = transactionUI.to,
            fromAmount = transactionUI.fromAmount,
            toAmount = transactionUI.toAmount,
            dateTime = transactionUI.dateTime,
        )
    }
}