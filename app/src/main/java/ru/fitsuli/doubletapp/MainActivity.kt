package ru.fitsuli.doubletapp

import android.R.attr.tag
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.core.view.WindowCompat
import ru.fitsuli.doubletapp.databinding.ActivityMainBinding

class MainActivity : LoggingActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(
                this, ActivityNoConfigChange::class.java
            ).apply {
                putExtras(
                    Bundle().apply {
                         putInt("count", binding.counter.text.toString().toInt())
                    }
                )
            }
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("count", binding.counter.text.toString().toInt())
        super.onSaveInstanceState(outState)
    }

    @SuppressLint("SetTextI18n")
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        binding.counter.text = (savedInstanceState.getInt("count", 0) + 1).toString()
        super.onRestoreInstanceState(savedInstanceState)
    }
}