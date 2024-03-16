package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Catalog(
    var id: String = UUID.randomUUID().toString(),
    //@DrawableRes
    var imageUrl: String,
    var name: String,
    var price: Double,
    var desc: String,
    var marketUrl: String
): Parcelable
