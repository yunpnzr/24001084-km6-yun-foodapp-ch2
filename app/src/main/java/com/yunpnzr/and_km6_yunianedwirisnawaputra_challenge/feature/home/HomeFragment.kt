package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.R
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.adapter.CatalogAdapter
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.adapter.CategoryMenuAdapter
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.datasource.AppDataSourceImpl
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var catalogAdapter: CatalogAdapter? = null
    private var categoryMenuAdapter= CategoryMenuAdapter()
    private var isUsingListMode: Boolean = false

    private val dataCategory = AppDataSourceImpl().getCategoryDataSource()
    private val dataCatalog = AppDataSourceImpl().getCatalogDataSource()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListCategory()
        setListCatalog(isUsingListMode)

        setClickCatalog()

        setSearchBar()
    }

    private fun setSearchBar() {
        with(binding){
            layoutHeader.svMenu.setupWithSearchBar(layoutHeader.sbMenu)
        }
    }

    private fun setClickCatalog() {
        binding.layoutListMenu.ivSort.setOnClickListener{
            isUsingListMode = !isUsingListMode
            setGridOrList(isUsingListMode)
            setListCatalog(isUsingListMode)
        }
    }

    private fun setGridOrList(isUsingListMode: Boolean){
        binding.layoutListMenu.ivSort.setImageResource(
            if (isUsingListMode){
                R.drawable.ic_list_black
            } else {
                R.drawable.ic_grid_black
            }
        )
    }

    private fun setListCatalog(usingListMode: Boolean) {
        val listMode = if (isUsingListMode) {
            CatalogAdapter.LIST_MODE
        } else {
            CatalogAdapter.GRID_MODE
        }
        catalogAdapter = CatalogAdapter(
            listMode = listMode
        )
        binding.layoutListMenu.rvCatalog.apply {
            adapter = this@HomeFragment.catalogAdapter
            //layoutManager = StaggeredGridLayoutManager(if (usingListMode) 1 else 2, StaggeredGridLayoutManager.VERTICAL)
            if (usingListMode){
                layoutManager = LinearLayoutManager(requireContext())
            } else {
                layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            }
        }
        catalogAdapter?.submitData(dataCatalog)
    }

    private fun setListCategory() {
        binding.layoutMenu.rvCategory.apply {
            adapter = this@HomeFragment.categoryMenuAdapter
        }
        categoryMenuAdapter.submitDataCategory(dataCategory)
    }

}