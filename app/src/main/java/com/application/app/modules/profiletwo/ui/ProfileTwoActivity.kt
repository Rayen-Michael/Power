package com.application.app.modules.profiletwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProfileTwoBinding
import com.application.app.modules.profiletwo.`data`.model.Photogrid1RowModel
import com.application.app.modules.profiletwo.`data`.viewmodel.ProfileTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileTwoActivity : BaseActivity<ActivityProfileTwoBinding>(R.layout.activity_profile_two) {
  private val viewModel: ProfileTwoVM by viewModels<ProfileTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val photoGridAdapter = PhotoGridAdapter(viewModel.photoGridList.value?:mutableListOf())
    binding.recyclerPhotoGrid.adapter = photoGridAdapter
    photoGridAdapter.setOnItemClickListener(
    object : PhotoGridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Photogrid1RowModel) {
        onClickRecyclerPhotoGrid(view, position, item)
      }
    }
    )
    viewModel.photoGridList.observe(this) {
      photoGridAdapter.updateData(it)
    }
    binding.profileTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPhotoGrid(
    view: View,
    position: Int,
    item: Photogrid1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
