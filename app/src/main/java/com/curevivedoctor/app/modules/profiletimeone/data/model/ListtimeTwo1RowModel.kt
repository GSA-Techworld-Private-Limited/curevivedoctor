package com.curevivedoctor.app.modules.profiletimeone.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class ListtimeTwo1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_7_00am_8_00_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_off)

)
