package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.R
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.base.ViewHolderBinder
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.model.Catalog
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ItemMenuBinding
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.utlis.toIndonesianFormat

class CatalogListViewHolder(
    private val binding: ItemMenuBinding
): ViewHolder(binding.root), ViewHolderBinder<Catalog> {
    override fun bind(item: Catalog) {
        item.let {
            binding.ivCatalog.load(it.imageUrl){
                placeholder(R.drawable.img_loading_picture)
                error(R.drawable.img_error)
            }
            binding.tvCatalogName.text = it.name
            binding.tvCatalogPrice.text = it.price.toIndonesianFormat()
        }
    }
}