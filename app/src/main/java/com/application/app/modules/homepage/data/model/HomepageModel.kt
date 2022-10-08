package com.application.app.modules.homepage.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSocially: String? = MyApp.getInstance().resources.getString(R.string.lbl_socially)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDennisReynolds: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dennis_reynolds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2hrsago: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_hrs_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt52K: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_2k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCharlieKelly: String? = MyApp.getInstance().resources.getString(R.string.lbl_charlie_kelly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4hrsago: String? = MyApp.getInstance().resources.getString(R.string.lbl_4hrs_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt52KOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_2k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt11K: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_1k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeHundredSixtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_362)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etButtoncommentsValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonsavedValue: String? = null
)
