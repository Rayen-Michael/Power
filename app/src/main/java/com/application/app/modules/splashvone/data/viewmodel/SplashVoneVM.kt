package com.application.app.modules.splashvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splashvone.`data`.model.SplashVoneModel
import org.koin.core.KoinComponent

class SplashVoneVM : ViewModel(), KoinComponent {
  val splashVoneModel: MutableLiveData<SplashVoneModel> = MutableLiveData(SplashVoneModel())

  var navArguments: Bundle? = null
}
