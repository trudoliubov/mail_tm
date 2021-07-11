package tm.mail.api

import com.jayway.restassured.RestAssured.given
import tm.mail.model.domain.DomainRoot

class DomainAPI {
    private val domains ="domains"

    fun getDomains(count: Int? = null): DomainRoot {
        return given()
            .param("page", count)
            .get(domains).`as`(DomainRoot::class.java)
    }
}