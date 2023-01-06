package app.codinguyy.chatgptexample.repository

import android.util.Log
import androidx.lifecycle.liveData
import app.codinguyy.chatgptexample.service.ServiceBuilder
import app.codinguyy.chatgptexample.service.data.send.SendTestData

class Repository(private val promptApi: ServiceBuilder) {

    fun sendTestData() = liveData {
        try {
            val testData = SendTestData()
            val data = promptApi
                .buildService()
                .sendTestData(testData)
            emit(data)
        } catch (e: Exception) {
            Log.i("error", e.toString())
        }
    }
}
