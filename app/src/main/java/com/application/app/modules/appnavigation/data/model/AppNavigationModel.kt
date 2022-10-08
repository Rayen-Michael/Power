package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplashVThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash_vthree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplashVTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash_vtwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomepage: String? = MyApp.getInstance().resources.getString(R.string.lbl_homepage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomepageVTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_homepage_vtwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConversations: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_conversations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessaging: String? = MyApp.getInstance().resources.getString(R.string.lbl_messaging)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile_two)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplashVOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash_vone)

)
