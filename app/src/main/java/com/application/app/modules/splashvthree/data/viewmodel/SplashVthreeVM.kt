package com.application.app.modules.splashvthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splashvthree.`data`.model.SplashVthreeModel
import org.koin.core.KoinComponent

class SplashVthreeVM : ViewModel(), KoinComponent {
  val splashVthreeModel: MutableLiveData<SplashVthreeModel> = MutableLiveData(SplashVthreeModel())

  var navArguments: Bundle? = null
}
