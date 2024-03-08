package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ItemListMenuBinding
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.model.Catalog
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.utlis.toIndonesianFormat

class CatalogAdapter:
    RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>(){

    private val data = mutableListOf<Catalog>()

    fun submitDataCatalog(items: List<Catalog>){
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogViewHolder(
            ItemListMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        holder.bind(data[position])
    }

    inner class CatalogViewHolder(
        private val binding: ItemListMenuBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Catalog) {
            binding.ivCatalog.setImageResource(item.image)
            binding.tvCatalogName.text = item.name
            //binding.tvCatalogPrice.text = NumberFormat.getCurrencyInstance(Locale("id", "ID")).format(item.price).replace("Rp","")
            //binding.tvCatalogPrice.text = CurrencyConversion().asIndonesianCurrency(item.price)
            binding.tvCatalogPrice.text = item.price.toIndonesianFormat()
        }
    }

}