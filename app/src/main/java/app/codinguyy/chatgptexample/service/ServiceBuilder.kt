package app.codinguyy.chatgptexample.service

import app.codinguyy.chatgptexample.BuildConfig
import app.codinguyy.chatgptexample.service.data.TestApi
import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ServiceBuilder {

    fun buildService(): TestApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .baseUrl(BuildConfig.BASE_URL)
            .client(getOkHttpClient())
            .build()
            .create(TestApi::class.java)
    }

    private fun getOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .writeTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .callTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(HeadersInterceptor())
            .addInterceptor(HttpLoggingInterceptor.getHttpLoggingInterceptor())
            .build()
}
