package com.nomadworks.example.testdeeplink.deeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.deeplinkdispatch.DeepLinkHandler

@DeepLinkHandler(ExampleDeepLinkModule::class)
class DeepLinkActivityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Note: DeepLinkDelegate and ExampleDeepLinkModuleRegistry are auto generated
        val deepLinkDelegate = DeepLinkDelegate(ExampleDeepLinkModuleRegistry())
        deepLinkDelegate.dispatchFrom(this)
        finish()
    }
}
