package ru.fitsuli.doubletapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

open class LoggingActivity : ComponentActivity() {

    private val tag = "DoubletappLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "onCreate()")
        writeTimestampToFile("lifecycle.txt", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart()")
        writeTimestampToFile("lifecycle.txt", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart()")
        writeTimestampToFile("lifecycle.txt", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume()")
        writeTimestampToFile("lifecycle.txt", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause()")
        writeTimestampToFile("lifecycle.txt", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop()")
        writeTimestampToFile("lifecycle.txt", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy()")
        writeTimestampToFile("lifecycle.txt", "onDestroy")
    }
}