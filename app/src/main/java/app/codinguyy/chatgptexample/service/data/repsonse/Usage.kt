package app.codinguyy.chatgptexample.service.data.repsonse

data class Usage(
    var prompt_tokens: Int = 1,
    var completion_tokens: Int = 1,
    var total_tokens: Int = 1
)
