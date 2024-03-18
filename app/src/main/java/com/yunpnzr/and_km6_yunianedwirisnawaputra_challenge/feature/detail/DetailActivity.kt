package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.feature.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.R
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.model.Catalog
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //getData()
    }

    /*private fun getData() {
        val item = intent.extras?.getParcelable<Catalog>(DetailFragment.EXTRAS_ITEM)
        Toast.makeText(this, item?.name, Toast.LENGTH_SHORT).show()
    }

    companion object{
        const val EXTRAS_ITEM = "EXTRAS_ITEM"
    }*/
}