package com.application.app.modules.splashvthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySplashVthreeBinding
import com.application.app.modules.splashvthree.`data`.viewmodel.SplashVthreeVM
import kotlin.String
import kotlin.Unit

class SplashVthreeActivity :
    BaseActivity<ActivitySplashVthreeBinding>(R.layout.activity_splash_vthree) {
  private val viewModel: SplashVthreeVM by viewModels<SplashVthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashVthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_VTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashVthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
