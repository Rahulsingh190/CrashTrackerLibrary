package com.crash.tracker

class CrashHandler(
    private val crashTracker: CrashTracker,
) : Thread.UncaughtExceptionHandler {

    override fun uncaughtException(thread: Thread, exception: Throwable) {
        crashTracker.reportCrash(exception)
        System.exit(1)
    }
}
