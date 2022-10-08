package com.application.app.modules.conversations.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ConversationsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMalenaTudi: String? = MyApp.getInstance().resources.getString(R.string.lbl_malena_tudi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyhowsitg: String? = MyApp.getInstance().resources.getString(R.string.msg_hey_how_s_it_g)

)
