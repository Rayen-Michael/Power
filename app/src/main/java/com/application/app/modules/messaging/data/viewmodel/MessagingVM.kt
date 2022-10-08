package com.application.app.modules.messaging.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.messaging.`data`.model.MessagingModel
import org.koin.core.KoinComponent

class MessagingVM : ViewModel(), KoinComponent {
  val messagingModel: MutableLiveData<MessagingModel> = MutableLiveData(MessagingModel())

  var navArguments: Bundle? = null
}
