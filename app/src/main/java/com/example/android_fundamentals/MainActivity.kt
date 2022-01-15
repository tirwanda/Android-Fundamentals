package com.example.android_fundamentals

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.miAddContact -> Toast.makeText(this, "Add Contact is Clicked", Toast.LENGTH_SHORT).show()
            R.id.miFavorites -> Toast.makeText(this, "Favorites is Clicked", Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this, "Settings is Clicked", Toast.LENGTH_SHORT).show()
            R.id.miFeedback -> Toast.makeText(this, "Give Feedback is Clicked", Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
        }
        return true
    }
}