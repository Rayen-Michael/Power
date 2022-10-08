package com.application.app.modules.conversations.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowConversationsBinding
import com.application.app.modules.conversations.`data`.model.ConversationsRowModel
import kotlin.Int
import kotlin.collections.List

class ConversationsAdapter(
  var list: List<ConversationsRowModel>
) : RecyclerView.Adapter<ConversationsAdapter.RowConversationsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowConversationsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_conversations,parent,false)
    return RowConversationsVH(view)
  }

  override fun onBindViewHolder(holder: RowConversationsVH, position: Int) {
    val conversationsRowModel = ConversationsRowModel()
    // TODO uncomment following line after integration with data source
    // val conversationsRowModel = list[position]
    holder.binding.conversationsRowModel = conversationsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ConversationsRowModel>) {
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
      item: ConversationsRowModel
    ) {
    }
  }

  inner class RowConversationsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowConversationsBinding = RowConversationsBinding.bind(itemView)
  }
}
