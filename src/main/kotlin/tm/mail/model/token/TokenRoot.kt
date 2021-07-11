package tm.mail.model.token

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class TokenRoot {
    val token:String? = null
    val id:String? = null
}