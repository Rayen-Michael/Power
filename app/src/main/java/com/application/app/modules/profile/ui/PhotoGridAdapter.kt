package com.application.app.modules.profile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowPhotogridBinding
import com.application.app.modules.profile.`data`.model.PhotogridRowModel
import kotlin.Int
import kotlin.collections.List

class PhotoGridAdapter(
  var list: List<PhotogridRowModel>
) : RecyclerView.Adapter<PhotoGridAdapter.RowPhotogridVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPhotogridVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_photogrid,parent,false)
    return RowPhotogridVH(view)
  }

  override fun onBindViewHolder(holder: RowPhotogridVH, position: Int) {
    val photogridRowModel = PhotogridRowModel()
    // TODO uncomment following line after integration with data source
    // val photogridRowModel = list[position]
    holder.binding.photogridRowModel = photogridRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PhotogridRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: PhotogridRowModel
    ) {
    }
  }

  inner class RowPhotogridVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPhotogridBinding = RowPhotogridBinding.bind(itemView)
  }
}
