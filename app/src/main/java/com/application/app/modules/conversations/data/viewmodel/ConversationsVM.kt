package com.application.app.modules.conversations.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.conversations.`data`.model.ConversationsModel
import com.application.app.modules.conversations.`data`.model.ConversationsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ConversationsVM : ViewModel(), KoinComponent {
  val conversationsModel: MutableLiveData<ConversationsModel> =
      MutableLiveData(ConversationsModel())

  var navArguments: Bundle? = null

  val conversationsList: MutableLiveData<MutableList<ConversationsRowModel>> =
      MutableLiveData(mutableListOf())
}
