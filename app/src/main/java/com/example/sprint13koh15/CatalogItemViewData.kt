package com.example.sprint13koh15

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sprint13koh15.databinding.VCatalogItemBinding

data class CatalogItemViewData(
    val item: CatalogItem,
    val count: Int?,
) {
    val id = item.id
}

class CatalogItemViewHolder(
    parent: ViewGroup,
    val binding: VCatalogItemBinding = VCatalogItemBinding.inflate(
        LayoutInflater.from(
            parent.context
        ), parent, false
    )
) : RecyclerView.ViewHolder(
    binding.root
) {

    fun bind(viewData: CatalogItemViewData) {
        binding.root

        Glide
            .with(binding.root.context)
            .load(viewData.item.imageUrl)
            .into(binding.image)
        binding.title.text = viewData.item.name
        binding.price.text = "${getStringPrice(viewData.item.floatPrice)} Р/${viewData.item.unit}"

        if (viewData.count != null ) {
            binding.addToCart.isVisible = viewData.count == 0
            binding.countContainer.isVisible = viewData.count != 0
            binding.count.text = viewData.count.toString()
        }
    }

}