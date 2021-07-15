package tm.mail

import tm.mail.api.API

object Main {
val commonUtils by lazy { CommonUtils() }
    @JvmStatic
    fun main(args: Array<String>) {
        val email = commonUtils.generateEmail()
        val password = email
        val domain = "@" + API.domain.getDomains(1).hydraMember?.get(0)?.domain
        val account = API.account.getAccount(email + domain, password).address.toString()
        val token = API.token.getToken(account, email).token.toString()
        val messageId = API.messages.getMessages(token,1).hydraMember?.get(0)?.id
        val message = API.messageId.getMessage(messageId, token).text
    }
}