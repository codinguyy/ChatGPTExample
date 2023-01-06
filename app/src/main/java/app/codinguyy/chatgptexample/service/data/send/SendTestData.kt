package app.codinguyy.chatgptexample.service.data.send

data class SendTestData(
    var model: String = "text-davinci-003",
    var prompt: String = "Say this is a test",
    var temperature: Int = 0,
    var max_tokens: Int = 7
)
