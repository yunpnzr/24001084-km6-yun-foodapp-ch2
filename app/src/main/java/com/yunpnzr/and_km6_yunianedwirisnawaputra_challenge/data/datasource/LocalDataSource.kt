package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.datasource

import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.R
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.model.Catalog
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.model.Category

interface AppDataSource{
    fun getCategoryDataSource(): List<Category>
    fun getCatalogDataSource(): List<Catalog>
}

class AppDataSourceImpl: AppDataSource{

    //data category menu
    override fun getCategoryDataSource(): List<Category> {
        return mutableListOf(
            Category(image = R.drawable.img_rice, name = "Nasi"),
            Category(image = R.drawable.img_noodle, name = "Mie"),
            Category(image = R.drawable.img_snack, name = "Snack"),
            Category(image = R.drawable.img_drink, name = "Minuman")
        )
    }

    //data catalog
    override fun getCatalogDataSource(): List<Catalog> {
        return mutableListOf(
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1RQcRk8UjZkcbKe_8vmb3XfK-svR3QrNY&export=view&authuser=0",
                name = "Sate Usus",
                price = 5000.0,
                desc = "Ini sate usus",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1eu8mbuc3ZDuPiJ2r1ELvhpHAsX-tqpar&export=view&authuser=0",
                name = "Dimsum",
                price = 10000.0,
                desc = "Ini dimsum",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1vB709TQgbDzqoiMn-5Iu3d6mn4c494zN&export=view&authuser=0",
                name = "Jus Strawberry",
                price = 3000.0,
                desc = "Ini jus strawberry",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1X0YKUs6msey2bwFM3x8t2LUJBbX9dTj8&export=view&authuser=0",
                name = "Spagetti",
                price = 20000.0,
                desc = "Ini spagetti",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=16MMMGFGibGoBsNYsgJVmSz_s_L_MISOA&export=view&authuser=0",
                name = "Sushi",
                price = 25000.0,
                desc = "Ini sushi",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1SO60nogOjeO_68qwVJVFX6UF3oXu-tZt&export=view&authuser=0",
                name = "Pizza",
                price = 75000.0,
                desc = "Ini pizza",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1PWs_2btvP7abKJewQsV-Lpa9DfaKnt0Y&export=view&authuser=0",
                name = "Mi Rebus",
                price = 8000.0,
                desc = "Ini mi rebus",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1usBxG61FSPI5vpflWykD_9x9_WLe14db&export=view&authuser=0",
                name = "Sate Ayam",
                price = 45000.0,
                desc = "Ini sate ayam",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1k5k1bTwXQRdeShcLJJHw1ZISlvy6HJud&export=view&authuser=0",
                name = "Ayam Bakar",
                price = 50000.0,
                desc = "Ini ayam bakar",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=18GrDzdnK0i1pSYyP40xqdD5mMSZeIfqO&export=view&authuser=0",
                name = "Ayam Goreng Keju",
                price = 25000.0,
                desc = "Ini ayam goreng keju",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1QpcZQ5G0QmlBDMt3f8sXfMinL-LOWE-m&export=view&authuser=0",
                name = "Kentang Goreng",
                price = 10000.0,
                desc = "Ini kentang goreng",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1zkY5NLxWoNeSQnwZ4SiQgaO-Wj7NOgVV&export=view&authuser=0",
                name = "Kopi",
                price = 8000.0,
                desc = "Ini kopi",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1NfDpyo9AuWJFFDpe4x6Pudizy2H0aAAg&export=view&authuser=0",
                name = "Cheese Burger",
                price = 30000.0,
                desc = "Ini cheese burger",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Catalog(
                imageUrl = "https://drive.usercontent.google.com/download?id=1PWiYYX7JgDFoglZZac7Aft0_JDjJmWSV&export=view&authuser=0",
                name = "Ayam Kecap",
                price = 25000.0,
                desc = "Ini ayam kecap",
                marketAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                mapUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            )
        )
    }

}