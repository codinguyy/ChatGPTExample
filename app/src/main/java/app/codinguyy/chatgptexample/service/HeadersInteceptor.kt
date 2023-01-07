package app.codinguyy.chatgptexample.service // ktlint-disable filename

import okhttp3.Interceptor
import okhttp3.Response

class HeadersInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

        request = request.newBuilder()
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer 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")
            .build()

        return chain.proceed(request)
    }
}
