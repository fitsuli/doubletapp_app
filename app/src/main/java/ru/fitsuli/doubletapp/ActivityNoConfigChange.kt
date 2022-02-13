package ru.fitsuli.doubletapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.view.WindowCompat
import ru.fitsuli.doubletapp.databinding.ActivityNoConfigChangeBinding

class ActivityNoConfigChange : LoggingActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        val binding = ActivityNoConfigChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        if (extras != null) {
            val count = extras.getInt("count", 0)
            binding.counter.text = (count*count).toString()
        }

        binding.button.setOnClickListener {
            finishAfterTransition()
        }
    }
}