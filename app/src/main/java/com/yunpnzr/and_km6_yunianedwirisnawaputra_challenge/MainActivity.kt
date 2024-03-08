package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.adapter.CatalogAdapter
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.adapter.CategoryMenuAdapter
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.LocalDataSource
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val categoryAdapter = CategoryMenuAdapter()
    private val catalogAdapter = CatalogAdapter()

    private val dataCategory = LocalDataSource().categoryDataSource()
    private val dataCatalog = LocalDataSource().listCatalogDataSource()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setListCategory()
        setListCatalog()
    }

    private fun setListCatalog() {
        binding.layoutListMenu.rvCatalog.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.layoutListMenu.rvCatalog.apply {
            adapter = this@MainActivity.catalogAdapter
        }
        catalogAdapter.submitDataCatalog(dataCatalog)
    }

    private fun setListCategory() {
        binding.layoutMenu.rvCategory.apply {
            adapter = this@MainActivity.categoryAdapter
        }
        categoryAdapter.submitDataCategory(dataCategory)
    }
}