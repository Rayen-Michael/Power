package com.application.app.modules.messaging.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class MessagingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCharlieKelly: String? = MyApp.getInstance().resources.getString(R.string.lbl_charlie_kelly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnline: String? = MyApp.getInstance().resources.getString(R.string.lbl_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnlineOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheyaredoing: String? =
      MyApp.getInstance().resources.getString(R.string.msg_they_are_doing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeethelionso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_the_lions_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteamessage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_a_message)

)
