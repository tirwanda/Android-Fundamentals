package com.example.android_fundamentals

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStartService.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                tvServiceInfo.text = "Service is Running"
            }
        }

        btnStopService.setOnClickListener {
            Intent(this, MyService::class.java).also {
                stopService(it)
                tvServiceInfo.text = "Service is Stopped"
            }
        }

        btnSendData.setOnClickListener {
            Intent(this, MyService::class.java).also {
                val dataString = etData.text.toString()
                it.putExtra("EXTRA_DATA", dataString)
                startService(it)
            }
        }
    }
}