package com.nomadworks.example.testdeeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nomadworks.example.testdeeplink.databinding.ActivityMainBinding
import com.nomadworks.example.testdeeplink.notification.NotificationHelper
import com.nomadworks.example.testdeeplink.notification.NotificationHelperImpl

class MainActivity : AppCompatActivity() {
    private lateinit var notificationHelper: NotificationHelper
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        notificationHelper = NotificationHelperImpl(applicationContext)

        viewBinding.btnNotification1.setOnClickListener {
            notificationHelper.createChannel()
            notificationHelper.showAssistanceRequired("Link #1", "Hey, this is the first link test")
        }

        viewBinding.btnNotification2.setOnClickListener {
            notificationHelper.createChannel()
            notificationHelper.showAssistanceRequired("Link #2", "Hey, this is the second link test")
        }
    }
}
