package com.crash.tracker

import com.google.gson.Gson

object CrashTracker {

    private var crashReportUrl: String? = null

    fun initialize(url: String) {
        crashReportUrl = url
        val handler = CrashHandler(this)
        Thread.setDefaultUncaughtExceptionHandler(handler)
    }

    fun reportCrash(exception: Throwable) {
        val report = CrashReport(exception)
        if (crashReportUrl != null) {
            val reportData = serializeCrashReport(report)
            uploadCrashReport(reportData, crashReportUrl!!)
        }
    }

    private fun serializeCrashReport(report: CrashReport): String {
        val gson = Gson()
        return gson.toJson(report)
    }

    private fun uploadCrashReport(data: String, url: String) {
        ApiCaller(url).reportCrash(data)
    }
}