package tm.mail.model.account

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

class AccountRoot {
    @JsonProperty("@context")
    var context: String? = null

    @JsonProperty("@id")
    var idAccount: String? = null

    @JsonProperty("@type")
    var type: String? = null
    var id: String? = null
    var address: String? = null
    var quota = 0
    var used = 0
    @JsonProperty("isDisabled")
    var isDisabled = false
    @JsonProperty("isDeleted")
    var isDeleted = false
    var createdAt: Date? = null
    var updatedAt: Date? = null
}