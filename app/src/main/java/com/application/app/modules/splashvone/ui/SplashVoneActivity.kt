package com.application.app.modules.splashvone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySplashVoneBinding
import com.application.app.modules.splashvone.`data`.viewmodel.SplashVoneVM
import kotlin.String
import kotlin.Unit

class SplashVoneActivity : BaseActivity<ActivitySplashVoneBinding>(R.layout.activity_splash_vone) {
  private val viewModel: SplashVoneVM by viewModels<SplashVoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashVoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_VONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashVoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
