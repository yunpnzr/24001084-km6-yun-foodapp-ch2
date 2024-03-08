package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data

import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.R
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.model.Catalog
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.model.Category

class LocalDataSource {

    fun categoryDataSource() = listOf(
        Category(image = R.drawable.img_rice, name = "Nasi"),
        Category(image = R.drawable.img_noodle, name = "Mie"),
        Category(image = R.drawable.img_snack, name = "Snack"),
        Category(image = R.drawable.img_drink, name = "Minuman")
    )

    fun listCatalogDataSource() = listOf(
        Catalog(image = R.drawable.img_chicken_grill, name = "Ayam Bakar", price = 50000.0),
        Catalog(image = R.drawable.img_chicken_smash, name = "Ayam Geprek", price = 40000.0),
        Catalog(image = R.drawable.img_fried_chicken, name = "Ayam Goreng", price = 40000.0),
        Catalog(image = R.drawable.img_satay, name = "Sate Usus Ayam", price = 5000.0),
        Catalog(image = R.drawable.img_chicken_porridge, name = "Bubur Ayam", price = 10000.0),
        Catalog(image = R.drawable.img_rabbit_satay, name = "Sate Kelinci Pak Angling", price = 20000.0)
    )

}