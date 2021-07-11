package tm.mail.model.domain

import com.fasterxml.jackson.annotation.JsonProperty

class DomainRoot {
    @JsonProperty("@context")
    var context: String? = null

    @JsonProperty("@id")
    var idDomain: String? = null

    @JsonProperty("@type")
    var type: String? = null

    @JsonProperty("hydra:member")
    var hydraMember: List<HydraMemberDomain>? = null

    @JsonProperty("hydra:totalItems")
    var hydraTotalItems = 0
}