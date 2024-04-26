package com.crash.tracker

import android.os.Build
import java.text.SimpleDateFormat
import java.util.Date

data class CrashReport(val exception: Throwable) {
    val timestamp: String = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())
    val deviceData: String = getDeviceInfo()
    val stackTrace = exception.stackTraceToString()


    private fun getDeviceInfo(): String {
        val builder = StringBuilder()
        builder.appendLine("Brand: ${Build.BRAND}")
        builder.appendLine("Model: ${Build.MODEL}")
        builder.appendLine("OS Version: ${Build.VERSION.RELEASE}")
        return builder.toString()
    }
}
