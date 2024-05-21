package com.example.sprint13koh15

import android.icu.text.CaseMap.Fold

data class CatalogItem(
    val id: String,
    val imageUrl: String,
    val name: String,
    val price: Long,
    val unit: String,
)

fun getFloatPrice(price: Long): Float {
    return "${price / 100}.${price % 100}".toFloat()
}

fun getStringPrice(price: Long): String {
    return String.format("%.2f", getFloatPrice(price)).replace(".", ",")
}
