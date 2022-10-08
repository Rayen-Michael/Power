package com.application.app.modules.conversations.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ConversationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMarilynHerwitz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_marilyn_herwitz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyigotnew: String? = MyApp.getInstance().resources.getString(R.string.msg_hey_i_got_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesiraeSaris: String? = MyApp.getInstance().resources.getString(R.string.lbl_desirae_saris)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoTreallytook: String? =
      MyApp.getInstance().resources.getString(R.string.msg_got_really_took)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)

)
