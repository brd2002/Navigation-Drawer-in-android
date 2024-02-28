package com.example.navigationdrawerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationdrawerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // to open navigation drawer on click menu button
        binding.toolBar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }
        // set on click listener on menu items
        binding.navView.setNavigationItemSelectedListener {
            binding.drawerLayout.close()
            it.isChecked = true
            when(it.itemId){
                R.id.profile -> {
                 startActivity(Intent(this , ProfileActivity::class.java))
                }
                R.id.check_heart -> {
                    startActivity(Intent(this, CheckHeartActivity::class.java))
                }
                R.id.medical_report -> {

                }
                R.id.share -> {
                }
                R.id.wallet -> {

                }
                R.id.calendar -> {

                }
                R.id.settings -> {
                    startActivity(Intent(this  , SettingsActivity::class.java))
                }
                R.id.contact_us -> {

                }
            }
            return@setNavigationItemSelectedListener true
        }
    }
}