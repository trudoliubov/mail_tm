package tm.mail.model.message

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
class HydraMemberMessage {
    @JsonProperty("@id")
    var idMessage: String? = null
    @JsonProperty("@type")
    var type: String? = null
    var id: String? = null
    var accountId: String? = null
    var msgid: String? = null
    @JsonFormat(with = [JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY])
    var from: List<From>? = null
    var to: List<To>? = null
    var subject: String? = null
    var intro: String? = null
    var seen = false
    var isDeleted = false
    var hasAttachments = false
    var size = 0
    var downloadUrl: String? = null
    var createdAt: Date? = null
    var updatedAt: Date? = null
}