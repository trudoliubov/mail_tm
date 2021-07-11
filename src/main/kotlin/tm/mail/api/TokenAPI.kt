package tm.mail.api

import com.jayway.restassured.RestAssured.given
import tm.mail.model.token.Token
import tm.mail.model.token.TokenRoot

class TokenAPI {
    private val token = "token"

    fun getToken(address: String, password: String): TokenRoot {
        return given()
            .headers("Content-Type", "application/json")
            .body(Token(address, password))
            .post(token).`as`(TokenRoot::class.java)
    }
}