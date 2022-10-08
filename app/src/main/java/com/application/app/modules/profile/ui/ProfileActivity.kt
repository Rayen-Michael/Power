package com.application.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProfileBinding
import com.application.app.modules.profile.`data`.model.PhotogridRowModel
import com.application.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val photoGridAdapter = PhotoGridAdapter(viewModel.photoGridList.value?:mutableListOf())
    binding.recyclerPhotoGrid.adapter = photoGridAdapter
    photoGridAdapter.setOnItemClickListener(
    object : PhotoGridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PhotogridRowModel) {
        onClickRecyclerPhotoGrid(view, position, item)
      }
    }
    )
    viewModel.photoGridList.observe(this) {
      photoGridAdapter.updateData(it)
    }
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPhotoGrid(
    view: View,
    position: Int,
    item: PhotogridRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
