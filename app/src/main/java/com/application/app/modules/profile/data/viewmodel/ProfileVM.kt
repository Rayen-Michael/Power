package com.application.app.modules.profile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.profile.`data`.model.PhotogridRowModel
import com.application.app.modules.profile.`data`.model.ProfileModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileVM : ViewModel(), KoinComponent {
  val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())

  var navArguments: Bundle? = null

  val photoGridList: MutableLiveData<MutableList<PhotogridRowModel>> =
      MutableLiveData(mutableListOf())
}
