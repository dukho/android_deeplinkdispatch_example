package com.nomadworks.example.testdeeplink.notification

interface NotificationHelper {
    fun createChannel()
    fun showAssistanceRequired(title: String, content: String, deeplink: String? = null)
}
