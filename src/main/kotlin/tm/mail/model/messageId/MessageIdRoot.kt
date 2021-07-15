package tm.mail.model.messageId

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import tm.mail.model.message.From
import tm.mail.model.message.To
import java.util.*


@JsonIgnoreProperties(ignoreUnknown = true)
class MessageIdRoot {
    @JsonProperty("@context")
    var context: String? = null

    @JsonProperty("@id")
    var idMessage: String? = null

    @JsonProperty("@type")
    var type: String? = null
    var id: String? = null
    var accountId: String? = null
    var msgid: String? = null
    var from: From? = null
    var to: List<To>? = null
    var cc: List<Any>? = null
    var bcc: List<Any>? = null
    var subject: String? = null
    var seen = false
    var flagged = false
    var isDeleted = false
    var verifications: List<Any>? = null
    var retention = false
    var retentionDate: Date? = null
    var text: String? = null
    var html: List<String>? = null
    var hasAttachments = false
    var attachments: List<Any>? = null
    var size = 0
    var downloadUrl: String? = null
    var createdAt: Date? = null
    var updatedAt: Date? = null
}