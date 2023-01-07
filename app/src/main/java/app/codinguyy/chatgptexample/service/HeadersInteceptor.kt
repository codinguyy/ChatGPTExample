package app.codinguyy.chatgptexample.service // ktlint-disable filename

import okhttp3.Interceptor
import okhttp3.Response

class HeadersInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

        request = request.newBuilder()
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer <YOUR-KEY>")
            .build()

        return chain.proceed(request)
    }
}
