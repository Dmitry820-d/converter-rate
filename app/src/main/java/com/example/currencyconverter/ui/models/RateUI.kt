package com.example.currencyconverter.ui.models

/**
 * @author d.borodin
 */

data class RateUI(
    val currency: String,
    val value: Double,
    val balance: Double = 0.0,
    val totalAccount: Double = 0.0
){
    companion object {
        fun convertDouble(value: Double): Double {
            return "%.5f".format(value).toDouble()
        }
        val defaultRate: RateUI = RateUI("EUR", 1.0)
    }
}