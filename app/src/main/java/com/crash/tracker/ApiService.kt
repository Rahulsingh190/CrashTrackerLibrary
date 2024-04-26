package com.crash.tracker

import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {

    @POST("v1/uploadCrash")
    fun reportCrash(@Part crashReport: String): Unit
}

