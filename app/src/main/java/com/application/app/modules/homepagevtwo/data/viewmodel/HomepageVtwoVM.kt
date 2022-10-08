package com.application.app.modules.homepagevtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.homepagevtwo.`data`.model.HomepageVtwoModel
import org.koin.core.KoinComponent

class HomepageVtwoVM : ViewModel(), KoinComponent {
  val homepageVtwoModel: MutableLiveData<HomepageVtwoModel> = MutableLiveData(HomepageVtwoModel())

  var navArguments: Bundle? = null
}
