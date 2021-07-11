package tm.mail.api

import com.jayway.restassured.RestAssured
import com.jayway.restassured.builder.RequestSpecBuilder
import tm.mail.api.AccountAPI
import tm.mail.api.DomainAPI
import tm.mail.api.MessageAPI
import tm.mail.api.TokenAPI

class API {
    companion object {
        init {
            RestAssured.requestSpecification = RequestSpecBuilder()
                .setBaseUri("https://api.mail.tm/")
                .setContentType("application/ld+json; charset=utf-8")
            .build()
        }
        val domain by lazy { DomainAPI() }
        val account by lazy { AccountAPI() }
        val token by lazy { TokenAPI() }
        val message by lazy { MessageAPI() }
    }
}