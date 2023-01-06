package app.codinguyy.chatgptexample.service.data.repsonse

import com.google.gson.annotations.SerializedName

data class ResponseData(
    val id: String = "",

    @SerializedName("object")
    var objekt: String = "",

    var created: Int = 0,

    var model: String = "",

    var choices: MutableList<Choices> = mutableListOf(),

    var usage: Usage = Usage()
)
