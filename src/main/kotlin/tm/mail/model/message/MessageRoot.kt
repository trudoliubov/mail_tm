package tm.mail.model.message

import com.fasterxml.jackson.annotation.JsonProperty

class MessageRoot {
    @JsonProperty("@context")
    var context: String? = null

    @JsonProperty("@id")
    var id: String? = null

    @JsonProperty("@type")
    var type: String? = null

    @JsonProperty("hydra:member")
    var hydraMember: List<HydraMemberMessage>? = null

    @JsonProperty("hydra:totalItems")
    var hydraTotalItems = 0
}