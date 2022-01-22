package com.example.android_fundamentals

import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class MyIntentService : JobIntentService() {

    init {
        instance = this
    }
    companion object {
        private lateinit var instance: MyIntentService
        var isRunning = false

        fun stopService() {
            Log.d("MyIntentService", "Service is Stopping..")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleWork(intent: Intent) {
        try {
            isRunning = true
            while (isRunning) {
                Log.d("MyIntentService", "Service is running")
                Thread.sleep(1000)
            }
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }
}