package com.application.app.modules.messaging.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityMessagingBinding
import com.application.app.modules.messaging.`data`.viewmodel.MessagingVM
import kotlin.String
import kotlin.Unit

class MessagingActivity : BaseActivity<ActivityMessagingBinding>(R.layout.activity_messaging) {
  private val viewModel: MessagingVM by viewModels<MessagingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.messagingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MESSAGING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MessagingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
