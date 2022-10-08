package com.application.app.modules.profile.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJohndoeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_johndoe2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPosts: String? = MyApp.getInstance().resources.getString(R.string.lbl_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_followers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1552: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_552)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollows: String? = MyApp.getInstance().resources.getString(R.string.lbl_follows)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredTwentyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_128)

)
