package com.application.app.modules.homepagevtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityHomepageVtwoBinding
import com.application.app.modules.homepagevtwo.`data`.viewmodel.HomepageVtwoVM
import kotlin.String
import kotlin.Unit

class HomepageVtwoActivity :
    BaseActivity<ActivityHomepageVtwoBinding>(R.layout.activity_homepage_vtwo) {
  private val viewModel: HomepageVtwoVM by viewModels<HomepageVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGE_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
