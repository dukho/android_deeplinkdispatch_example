package com.nomadworks.example.testdeeplink

import android.app.Application
import timber.log.Timber

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initTimber()

        Timber.d("[deep] hey, what's up?")
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }
}
