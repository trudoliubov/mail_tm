package tm.mail.api

import com.jayway.restassured.RestAssured.given
import tm.mail.model.account.Account
import tm.mail.model.account.AccountRoot

class AccountAPI {
    private val account = "accounts"

    fun getAccount(address:String, password:String): AccountRoot {
        return given()
            .headers("Content-Type", "application/json")
            .body(Account(address, password))
            .post(account).`as`(AccountRoot::class.java)
    }
}