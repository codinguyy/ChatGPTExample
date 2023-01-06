package app.codinguyy.chatgptexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import app.codinguyy.chatgptexample.service.data.repsonse.ResponseData
import app.codinguyy.chatgptexample.repository.Repository

class FirstFragmentViewModel(val repository: Repository) : ViewModel() {

    fun sendTestData(): LiveData<ResponseData> {
        return repository.sendTestData()
    }
}
