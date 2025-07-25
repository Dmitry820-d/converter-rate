package com.example.currencyconverter.ui.models

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author d.borodin
 */

data class TransactionUI (
    val id: Int? = null,
    val from: String,
    val to: String,
    val fromAmount: Double,
    val toAmount: Double,
    val dateTime: LocalDateTime,
){
    companion object {
        fun convertDouble(value: Double): Double {
            return "%.5f".format(value).toDouble()
        }
        fun convertDate(time: LocalDateTime) : String {
            val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")
            val formattedDateTime = time.format(formatter)
            return formattedDateTime
        }
    }
}