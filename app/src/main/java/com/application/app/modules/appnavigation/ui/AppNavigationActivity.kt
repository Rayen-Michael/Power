package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.conversations.ui.ConversationsActivity
import com.application.app.modules.homepage.ui.HomepageActivity
import com.application.app.modules.homepagevtwo.ui.HomepageVtwoActivity
import com.application.app.modules.messaging.ui.MessagingActivity
import com.application.app.modules.profile.ui.ProfileActivity
import com.application.app.modules.profileone.ui.ProfileOneActivity
import com.application.app.modules.profiletwo.ui.ProfileTwoActivity
import com.application.app.modules.splashvone.ui.SplashVoneActivity
import com.application.app.modules.splashvthree.ui.SplashVthreeActivity
import com.application.app.modules.splashvtwo.ui.SplashVtwoActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSplashVTwo.setOnClickListener {
      val destIntent = SplashVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashVOne.setOnClickListener {
      val destIntent = SplashVoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMessaging.setOnClickListener {
      val destIntent = MessagingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomepage.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashVThree.setOnClickListener {
      val destIntent = SplashVthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfile.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConversations.setOnClickListener {
      val destIntent = ConversationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfileTwo.setOnClickListener {
      val destIntent = ProfileTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfileOne.setOnClickListener {
      val destIntent = ProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomepageVTwo.setOnClickListener {
      val destIntent = HomepageVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
