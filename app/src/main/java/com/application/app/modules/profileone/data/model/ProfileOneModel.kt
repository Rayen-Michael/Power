package com.application.app.modules.profileone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndroidTutoria: String? =
      MyApp.getInstance().resources.getString(R.string.msg_android_tutoria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.msg_qwertyuio_gmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSIGNOUT: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)

)
