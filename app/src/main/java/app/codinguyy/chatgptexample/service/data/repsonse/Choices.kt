package app.codinguyy.chatgptexample.service.data.repsonse

data class Choices(
    var text: String = "",
    var index: Int = 0,
    var logprobs: String? = null,
    var finish_reason: String = "length"

)
