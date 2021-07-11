package tm.mail.api

import com.jayway.restassured.RestAssured.given
import tm.mail.model.message.MessageRoot

class MessageAPI {
    private val message = "messages"

    fun getMessages(token: String, count: Int): MessageRoot{
        return given()
            .auth().oauth2(token)
            .param("page", count)
            .get(message).`as`(MessageRoot::class.java)
    }
}