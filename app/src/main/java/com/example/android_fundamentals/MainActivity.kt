package com.example.android_fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.miItemOne -> Toast.makeText(applicationContext, "Clicked Item One", Toast.LENGTH_SHORT ).show()
                R.id.miItemTwo -> Toast.makeText(applicationContext, "Clicked Item Two", Toast.LENGTH_SHORT ).show()
                R.id.miItemThree -> Toast.makeText(applicationContext, "Clicked Item Three", Toast.LENGTH_SHORT ).show()
                R.id.miItemFour -> Toast.makeText(applicationContext, "Clicked Item Four", Toast.LENGTH_SHORT ).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}