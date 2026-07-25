package com.songloft.songloft_flutter

import android.app.Application
import io.flutter.plugin.common.MethodChannel

class SongloftApplication : Application() {

    companion object {
        var widgetActionChannel: MethodChannel? = null
    }

    override fun onCreate() {
        super.onCreate()
        BackendPatchManager.preloadIfStaged(this)
    }
}