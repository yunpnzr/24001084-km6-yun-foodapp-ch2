package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.base.ViewHolderBinder
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.data.model.Catalog
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ItemGridMenuBinding
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ItemMenuBinding

class CatalogAdapter(
    private val listMode: Int = LIST_MODE
): RecyclerView.Adapter<ViewHolder>() {

    companion object{
        const val GRID_MODE = 1
        const val LIST_MODE = 2
    }

    private var asyncDiffer = AsyncListDiffer(
        this, object : DiffUtil.ItemCallback<Catalog>(){
            override fun areItemsTheSame(oldItem: Catalog, newItem: Catalog): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Catalog, newItem: Catalog): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

        }
    )

    fun submitData(data: List<Catalog>) {
        asyncDiffer.submitList(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (listMode == GRID_MODE) {
            CatalogGridViewHolder (
                ItemGridMenuBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        } else {
            CatalogListViewHolder(
                ItemMenuBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemCount(): Int = asyncDiffer.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder !is ViewHolderBinder<*>) return
        (holder as ViewHolderBinder<Catalog>).bind(asyncDiffer.currentList[position])
    }

}

/*
class CatalogAdapter:
    RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>(){

    private val data = mutableListOf<Catalog>()

    fun submitDataCatalog(items: List<Catalog>){
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogViewHolder(
            ItemGridMenuBinding.inflate(
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
        private val binding: ItemGridMenuBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Catalog) {
            binding.ivCatalog.setImageResource(item.imageUrl)
            binding.tvCatalogName.text = item.name
            binding.tvCatalogPrice.text = item.price.toIndonesianFormat()
        }
    }

}*/
