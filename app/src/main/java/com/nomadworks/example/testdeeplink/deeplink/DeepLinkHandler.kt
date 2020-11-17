package com.nomadworks.example.testdeeplink.deeplink

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.app.TaskStackBuilder
import com.airbnb.deeplinkdispatch.DeepLink
import com.nomadworks.example.testdeeplink.MainActivity
import com.nomadworks.example.testdeeplink.subscreens.FirstScreenActivity
import com.nomadworks.example.testdeeplink.subscreens.SecondScreenActivity

object DeepLinkHandler {
    // Without backstack - backbutton just exits the app
    @JvmStatic
    @DeepLink("$SCHEME://$HOST/$SCREEN1")
    fun intentForScreen1(context: Context, extras: Bundle): Intent {
        return Intent(context, FirstScreenActivity::class.java).apply {
            setAction(Intent.ACTION_VIEW)
        }
    }

    @JvmStatic
    @DeepLink("$SCHEME://$HOST/$SCREEN2")
    fun intentForScreen2(context: Context, extras: Bundle): TaskStackBuilder {
        val parentIntent = Intent(context, MainActivity::class.java).apply {
            setAction(Intent.ACTION_VIEW)
        }
        val targetIntent = Intent(context, SecondScreenActivity::class.java).apply {
            setAction(Intent.ACTION_VIEW)
        }
        val taskStackBuilder = TaskStackBuilder.create(context)
        taskStackBuilder.addNextIntent(parentIntent)
        taskStackBuilder.addNextIntent(targetIntent)

        return taskStackBuilder
    }
}


