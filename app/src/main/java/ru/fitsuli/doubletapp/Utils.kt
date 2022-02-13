package ru.fitsuli.doubletapp

import android.content.Context
import java.io.*
import java.text.SimpleDateFormat
import java.util.*

fun Context.writeTimestampToFile(fileName: String, content: String) {
    val currentTime: String = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
    writeToFilesDir(fileName, "$currentTime: $content")
}
fun Context.writeToFilesDir(fileName: String, content: String) {
    val file = File(getExternalFilesDir(null), fileName)
    file.appendText(content)
    file.appendText("\n")
}
