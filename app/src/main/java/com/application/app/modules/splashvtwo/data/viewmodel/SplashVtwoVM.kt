package com.application.app.modules.splashvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splashvtwo.`data`.model.SplashVtwoModel
import org.koin.core.KoinComponent

class SplashVtwoVM : ViewModel(), KoinComponent {
  val splashVtwoModel: MutableLiveData<SplashVtwoModel> = MutableLiveData(SplashVtwoModel())

  var navArguments: Bundle? = null
}
