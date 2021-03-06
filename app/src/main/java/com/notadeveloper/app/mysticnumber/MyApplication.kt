package com.notadeveloper.app.mysticnumber

import android.app.Application
import com.facebook.stetho.Stetho

/**
 * Created by krsnv on 06-Aug-17.
 * Application Class To Initialize Stetho
 */
class MyApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    Stetho.initializeWithDefaults(this)
    // Normal app init code...
  }
}