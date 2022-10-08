package com.application.app.modules.splashvtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySplashVtwoBinding
import com.application.app.modules.splashvtwo.`data`.viewmodel.SplashVtwoVM
import kotlin.String
import kotlin.Unit

class SplashVtwoActivity : BaseActivity<ActivitySplashVtwoBinding>(R.layout.activity_splash_vtwo) {
  private val viewModel: SplashVtwoVM by viewModels<SplashVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
