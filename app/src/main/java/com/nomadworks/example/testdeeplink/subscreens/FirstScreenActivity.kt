package com.nomadworks.example.testdeeplink.subscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nomadworks.example.testdeeplink.R
import com.nomadworks.example.testdeeplink.notification.NotificationHelper
import com.nomadworks.example.testdeeplink.notification.NotificationHelperImpl

class FirstScreenActivity : AppCompatActivity() {
    lateinit var notificationHelper: NotificationHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        notificationHelper = NotificationHelperImpl(applicationContext)
    }
}
