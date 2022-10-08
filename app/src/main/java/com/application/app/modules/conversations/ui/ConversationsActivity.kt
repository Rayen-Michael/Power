package com.application.app.modules.conversations.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityConversationsBinding
import com.application.app.modules.conversations.`data`.model.ConversationsRowModel
import com.application.app.modules.conversations.`data`.viewmodel.ConversationsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ConversationsActivity :
    BaseActivity<ActivityConversationsBinding>(R.layout.activity_conversations) {
  private val viewModel: ConversationsVM by viewModels<ConversationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val conversationsAdapter =
    ConversationsAdapter(viewModel.conversationsList.value?:mutableListOf())
    binding.recyclerConversations.adapter = conversationsAdapter
    conversationsAdapter.setOnItemClickListener(
    object : ConversationsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ConversationsRowModel) {
        onClickRecyclerConversations(view, position, item)
      }
    }
    )
    viewModel.conversationsList.observe(this) {
      conversationsAdapter.updateData(it)
    }
    binding.conversationsVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerConversations(
    view: View,
    position: Int,
    item: ConversationsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchbarListener(): Unit {
    binding.searchViewSearchbar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "CONVERSATIONS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ConversationsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
