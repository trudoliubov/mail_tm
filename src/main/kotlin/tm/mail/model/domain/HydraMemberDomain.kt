package tm.mail.model.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
//@JsonIgnoreProperties(ignoreUnknown = true)
class HydraMemberDomain {
    @JsonProperty("@id")
    var idDomain: String? = null

    @JsonProperty("@type")
    var type: String? = null

    var id: String? = null
    var domain: String? = null
    @JsonProperty("isActive")
    var isActive:Boolean = false
    @JsonProperty("isPrivate")
    var isPrivate:Boolean = false
    var createdAt: Date? = null
    var updatedAt: Date? = null
}