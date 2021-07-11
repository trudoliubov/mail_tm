package tm.mail

import tm.mail.api.API

object Main {
val commonUtils by lazy { CommonUtils() }
    @JvmStatic
    fun main(args: Array<String>) {
        val email = commonUtils.generateEmail()
        val domain = "@" + API.domain.getDomains(1).hydraMember?.get(0)?.domain
        val account = API.account.getAccount(email + domain, email).address.toString()
        val token = API.token.getToken(account, email).token.toString()
        val messages = API.message.getMessages(token,1)
    }
}