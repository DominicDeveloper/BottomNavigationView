package com.asadbek.bottomnavigationview

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.asadbek.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_1 -> binding.main.setBackgroundColor(Color.RED)
                R.id.menu_2 -> binding.main.setBackgroundColor(Color.BLUE)
                R.id.menu_3 -> binding.main.setBackgroundColor(Color.CYAN)
                R.id.menu_4 -> binding.main.setBackgroundColor(Color.GREEN)
            }
            true
        }

    }
}