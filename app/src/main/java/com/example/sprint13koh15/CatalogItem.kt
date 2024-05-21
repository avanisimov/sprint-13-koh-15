package com.example.sprint13koh15

data class CatalogItem(
    val id: String,
    val imageUrl: String,
    val name: String,
    val price: Long,
    val unit: String,
) {
    val floatPrice: Float
        get() = "${price / 100}.${price % 100}".toFloat()
}

fun getStringPrice(price: Float): String {
    return String.format("%.2f", price).replace(".", ",")
}
