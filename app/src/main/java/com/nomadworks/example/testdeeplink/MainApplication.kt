package com.nomadworks.example.testdeeplink

import android.app.Application
import android.content.IntentFilter
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import timber.log.Timber
import com.airbnb.deeplinkdispatch.DeepLinkHandler
import com.nomadworks.example.testdeeplink.deeplink.DeepLinkDebugReceiver


class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initTimber()
        initDeepLinkLogger()

        Timber.d("[deep] hey, what's up?")
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }

    private fun initDeepLinkLogger() {
        val intentFilter = IntentFilter(DeepLinkHandler.ACTION)
        LocalBroadcastManager.getInstance(this).registerReceiver(DeepLinkDebugReceiver(), intentFilter)
    }
}
