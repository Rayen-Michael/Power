package com.application.app.modules.profiletwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.profiletwo.`data`.model.Photogrid1RowModel
import com.application.app.modules.profiletwo.`data`.model.ProfileTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileTwoVM : ViewModel(), KoinComponent {
  val profileTwoModel: MutableLiveData<ProfileTwoModel> = MutableLiveData(ProfileTwoModel())

  var navArguments: Bundle? = null

  val photoGridList: MutableLiveData<MutableList<Photogrid1RowModel>> =
      MutableLiveData(mutableListOf())
}
