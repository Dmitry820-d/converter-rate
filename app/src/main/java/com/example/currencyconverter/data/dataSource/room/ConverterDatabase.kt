package com.example.currencyconverter.data.dataSource.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.currencyconverter.data.dataSource.room.account.dao.AccountDao
import com.example.currencyconverter.data.dataSource.room.account.dbo.AccountDbo
import com.example.currencyconverter.data.dataSource.room.converter.Converters
import com.example.currencyconverter.data.dataSource.room.transaction.dao.TransactionDao
import com.example.currencyconverter.data.dataSource.room.transaction.dbo.TransactionDbo

/**
 * @author d.borodin
 */

@Database(entities = [AccountDbo::class, TransactionDbo::class], version = 1)
@TypeConverters(Converters::class)
abstract class ConverterDatabase: RoomDatabase() {
    abstract fun accountDao(): AccountDao
    abstract fun transactionDao(): TransactionDao

    companion object {
        const val DATABASE_NAME = "converter_db.db"
    }
}