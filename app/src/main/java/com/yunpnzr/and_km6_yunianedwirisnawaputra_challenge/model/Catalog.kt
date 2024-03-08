package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.model

import androidx.annotation.DrawableRes
import java.util.UUID

data class Catalog(
    var id: String = UUID.randomUUID().toString(),
    @DrawableRes
    var image: Int,
    var name: String,
    var price: Double
)
