package app.codinguyy.chatgptexample.service.data


import app.codinguyy.chatgptexample.service.data.repsonse.ResponseData
import app.codinguyy.chatgptexample.service.data.send.SendTestData
import retrofit2.http.Body
import retrofit2.http.POST

interface TestApi {

    @POST("completions")
    suspend fun sendTestData(@Body prompt: SendTestData): ResponseData
}
