package tm.mail.api

import com.jayway.restassured.RestAssured.given
import tm.mail.model.messageId.MessageIdRoot

class MessageIdAPI {

    private val messageId = "messages/{id}"

    fun getMessage(id:String?, token:String?): MessageIdRoot{
        return given()
            .auth().oauth2(token)
            .pathParam("id", id)
            .get(messageId).`as`(MessageIdRoot::class.java)
    }
}