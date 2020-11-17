package com.nomadworks.example.testdeeplink.deeplink

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.airbnb.deeplinkdispatch.DeepLinkHandler
import timber.log.Timber

class DeepLinkDebugReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val deepLinkUri = intent.getStringExtra(DeepLinkHandler.EXTRA_URI)
        if (intent.getBooleanExtra(DeepLinkHandler.EXTRA_SUCCESSFUL, false)) {
            Timber.i("[deep] Success deep linking: $deepLinkUri")
        } else {
            val errorMessage = intent.getStringExtra(DeepLinkHandler.EXTRA_ERROR_MESSAGE)
            Timber.e("[deep] Error deep linking: $deepLinkUri with error message +$errorMessage")
        }
    }
}
