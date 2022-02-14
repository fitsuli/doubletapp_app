package ru.fitsuli.doubletapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

open class LoggingActivity : ComponentActivity() {

    private val tag = "DoubletappLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "onCreate()")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(tag, "onStart()")
        super.onStart()
    }

    override fun onRestart() {
        Log.d(tag, "onRestart()")
        super.onRestart()
    }

    override fun onResume() {
        Log.d(tag, "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "onDestroy()")
        super.onDestroy()
    }
}