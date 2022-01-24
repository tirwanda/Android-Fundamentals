package com.example.android_fundamentals

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnable = intent?.getBooleanExtra("state", false) ?: return
        if (isAirplaneModeEnable) {
            Toast.makeText(context, "Airplane Mode enabled", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Airplane Mode disable", Toast.LENGTH_SHORT).show()
        }
    }
}