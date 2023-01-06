package app.codinguyy.chatgptexample.service // ktlint-disable filename

import okhttp3.logging.HttpLoggingInterceptor

object HttpLoggingInterceptor {
    fun getHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }
}
