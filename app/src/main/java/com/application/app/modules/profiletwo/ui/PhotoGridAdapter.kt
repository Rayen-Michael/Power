package com.application.app.modules.profiletwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowPhotogrid1Binding
import com.application.app.modules.profiletwo.`data`.model.Photogrid1RowModel
import kotlin.Int
import kotlin.collections.List

class PhotoGridAdapter(
  var list: List<Photogrid1RowModel>
) : RecyclerView.Adapter<PhotoGridAdapter.RowPhotogrid1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPhotogrid1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_photogrid1,parent,false)
    return RowPhotogrid1VH(view)
  }

  override fun onBindViewHolder(holder: RowPhotogrid1VH, position: Int) {
    val photogrid1RowModel = Photogrid1RowModel()
    // TODO uncomment following line after integration with data source
    // val photogrid1RowModel = list[position]
    holder.binding.photogrid1RowModel = photogrid1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Photogrid1RowModel>) {
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
      item: Photogrid1RowModel
    ) {
    }
  }

  inner class RowPhotogrid1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPhotogrid1Binding = RowPhotogrid1Binding.bind(itemView)
  }
}
