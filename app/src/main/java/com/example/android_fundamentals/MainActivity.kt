package com.example.android_fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        btnCount.setOnClickListener{
            count++
            tvCount.text = "Let's, Count Together= $count"
        }
    }
}