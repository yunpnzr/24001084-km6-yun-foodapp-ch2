package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.feature.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    //private val categoryAdapter = CategoryMenuAdapter()
    //private val catalogAdapter = CatalogAdapter()

    //private val dataCategory = AppDataSourceImpl().getCategoryDataSource()
    //private val dataCatalog = LocalDataSource().listCatalogDataSource()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //setListCategory()
        //setListCatalog()
        //setBottomNavigation()
    }

    //private fun setBottomNavigation() {
        //val navController = findNavController(R.id.nav_host)
        //binding.bnvMain.setupWithNavController(navController)
    //}

    /*private fun setListCatalog() {
        binding.layoutListMenu.rvCatalog.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.layoutListMenu.rvCatalog.apply {
            adapter = this@MainActivity.catalogAdapter
        }
        catalogAdapter.submitDataCatalog(dataCatalog)
    }*/

    /*private fun setListCategory() {
        binding.layoutMenu.rvCategory.apply {
            adapter = this@MainActivity.categoryAdapter
        }
        categoryAdapter.submitDataCategory(dataCategory)
    }*/
}