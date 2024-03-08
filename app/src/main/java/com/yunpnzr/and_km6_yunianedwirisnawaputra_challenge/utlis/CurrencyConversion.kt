package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.utlis

import java.text.NumberFormat
import java.util.Locale

/*class CurrencyConversion {
    fun asIndonesianCurrency(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        return formatter.format(price).replace("Rp", "")
    }
}*/

fun Double?.doubleToCurrency(language: String, country: String): String? {
    return try {
        val localeID = Locale(language, country)
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)
        numberFormat.format(this).toString().replace("Rp","")
    } catch (e: Exception) {
        null
    }
}
fun Double?.toIndonesianFormat() = this.doubleToCurrency("in","ID")