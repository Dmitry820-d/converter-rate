package com.example.currencyconverter.di

import com.example.currencyconverter.ui.mapper.AccountDomainToAccountUIMapper
import com.example.currencyconverter.ui.mapper.AccountUIToAccountDomainMapper
import com.example.currencyconverter.ui.mapper.RateDomainToRateUIMapper
import com.example.currencyconverter.ui.mapper.RateUIToRateDomainMapper
import com.example.currencyconverter.ui.mapper.TransactionDomainToTransactionUIMapper
import com.example.currencyconverter.ui.mapper.TransactionUIToTransactionDomainMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author d.borodin
 */

@Module
@InstallIn(SingletonComponent:: class)
interface UIModule {
    companion object {
        @Provides
        @Singleton
        fun provideRateDomainToRateUIMapper(): RateDomainToRateUIMapper {
            return RateDomainToRateUIMapper()
        }
        @Provides
        @Singleton
        fun provideRateUIToRateDomainMapper(): RateUIToRateDomainMapper {
            return RateUIToRateDomainMapper()
        }
        @Provides
        @Singleton
        fun provideAccountDomainToAccountUIMapper(): AccountDomainToAccountUIMapper {
            return AccountDomainToAccountUIMapper()
        }
        @Provides
        @Singleton
        fun provideAccountUIToAccountDomainMapper(): AccountUIToAccountDomainMapper {
            return AccountUIToAccountDomainMapper()
        }
        @Provides
        @Singleton
        fun provideTransactionDomainToTransactionUIMapper(): TransactionDomainToTransactionUIMapper {
            return TransactionDomainToTransactionUIMapper()
        }
        @Provides
        @Singleton
        fun provideTransactionUIToTransactionDomainMapper(): TransactionUIToTransactionDomainMapper {
            return TransactionUIToTransactionDomainMapper()
        }
    }
}