// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentCampaignConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val companyOverview: JsonField<String>,
    private val additionalInformation: JsonField<String>,
    private val agentOverview: JsonField<String>,
    private val consentSettings: JsonField<AgentConsentConfiguration>,
    private val interactions: JsonField<List<AgentInteraction>>,
    private val messageExamples: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("company_overview")
        @ExcludeMissing
        companyOverview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additional_information")
        @ExcludeMissing
        additionalInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_overview")
        @ExcludeMissing
        agentOverview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consent_settings")
        @ExcludeMissing
        consentSettings: JsonField<AgentConsentConfiguration> = JsonMissing.of(),
        @JsonProperty("interactions")
        @ExcludeMissing
        interactions: JsonField<List<AgentInteraction>> = JsonMissing.of(),
        @JsonProperty("message_examples")
        @ExcludeMissing
        messageExamples: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        companyOverview,
        additionalInformation,
        agentOverview,
        consentSettings,
        interactions,
        messageExamples,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun companyOverview(): String = companyOverview.getRequired("company_overview")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalInformation(): Optional<String> =
        additionalInformation.getOptional("additional_information")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentOverview(): Optional<String> = agentOverview.getOptional("agent_overview")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun consentSettings(): Optional<AgentConsentConfiguration> =
        consentSettings.getOptional("consent_settings")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interactions(): Optional<List<AgentInteraction>> = interactions.getOptional("interactions")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageExamples(): Optional<List<String>> = messageExamples.getOptional("message_examples")

    /**
     * Returns the raw JSON value of [companyOverview].
     *
     * Unlike [companyOverview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_overview")
    @ExcludeMissing
    fun _companyOverview(): JsonField<String> = companyOverview

    /**
     * Returns the raw JSON value of [additionalInformation].
     *
     * Unlike [additionalInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additional_information")
    @ExcludeMissing
    fun _additionalInformation(): JsonField<String> = additionalInformation

    /**
     * Returns the raw JSON value of [agentOverview].
     *
     * Unlike [agentOverview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_overview")
    @ExcludeMissing
    fun _agentOverview(): JsonField<String> = agentOverview

    /**
     * Returns the raw JSON value of [consentSettings].
     *
     * Unlike [consentSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("consent_settings")
    @ExcludeMissing
    fun _consentSettings(): JsonField<AgentConsentConfiguration> = consentSettings

    /**
     * Returns the raw JSON value of [interactions].
     *
     * Unlike [interactions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interactions")
    @ExcludeMissing
    fun _interactions(): JsonField<List<AgentInteraction>> = interactions

    /**
     * Returns the raw JSON value of [messageExamples].
     *
     * Unlike [messageExamples], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_examples")
    @ExcludeMissing
    fun _messageExamples(): JsonField<List<String>> = messageExamples

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentCampaignConfiguration].
         *
         * The following fields are required:
         * ```java
         * .companyOverview()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentCampaignConfiguration]. */
    class Builder internal constructor() {

        private var companyOverview: JsonField<String>? = null
        private var additionalInformation: JsonField<String> = JsonMissing.of()
        private var agentOverview: JsonField<String> = JsonMissing.of()
        private var consentSettings: JsonField<AgentConsentConfiguration> = JsonMissing.of()
        private var interactions: JsonField<MutableList<AgentInteraction>>? = null
        private var messageExamples: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentCampaignConfiguration: AgentCampaignConfiguration) = apply {
            companyOverview = agentCampaignConfiguration.companyOverview
            additionalInformation = agentCampaignConfiguration.additionalInformation
            agentOverview = agentCampaignConfiguration.agentOverview
            consentSettings = agentCampaignConfiguration.consentSettings
            interactions = agentCampaignConfiguration.interactions.map { it.toMutableList() }
            messageExamples = agentCampaignConfiguration.messageExamples.map { it.toMutableList() }
            additionalProperties = agentCampaignConfiguration.additionalProperties.toMutableMap()
        }

        fun companyOverview(companyOverview: String) =
            companyOverview(JsonField.of(companyOverview))

        /**
         * Sets [Builder.companyOverview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyOverview] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyOverview(companyOverview: JsonField<String>) = apply {
            this.companyOverview = companyOverview
        }

        fun additionalInformation(additionalInformation: String?) =
            additionalInformation(JsonField.ofNullable(additionalInformation))

        /**
         * Alias for calling [Builder.additionalInformation] with
         * `additionalInformation.orElse(null)`.
         */
        fun additionalInformation(additionalInformation: Optional<String>) =
            additionalInformation(additionalInformation.getOrNull())

        /**
         * Sets [Builder.additionalInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            this.additionalInformation = additionalInformation
        }

        fun agentOverview(agentOverview: String?) =
            agentOverview(JsonField.ofNullable(agentOverview))

        /** Alias for calling [Builder.agentOverview] with `agentOverview.orElse(null)`. */
        fun agentOverview(agentOverview: Optional<String>) =
            agentOverview(agentOverview.getOrNull())

        /**
         * Sets [Builder.agentOverview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentOverview] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentOverview(agentOverview: JsonField<String>) = apply {
            this.agentOverview = agentOverview
        }

        fun consentSettings(consentSettings: AgentConsentConfiguration?) =
            consentSettings(JsonField.ofNullable(consentSettings))

        /** Alias for calling [Builder.consentSettings] with `consentSettings.orElse(null)`. */
        fun consentSettings(consentSettings: Optional<AgentConsentConfiguration>) =
            consentSettings(consentSettings.getOrNull())

        /**
         * Sets [Builder.consentSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consentSettings] with a well-typed
         * [AgentConsentConfiguration] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun consentSettings(consentSettings: JsonField<AgentConsentConfiguration>) = apply {
            this.consentSettings = consentSettings
        }

        fun interactions(interactions: List<AgentInteraction>) =
            interactions(JsonField.of(interactions))

        /**
         * Sets [Builder.interactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interactions] with a well-typed `List<AgentInteraction>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun interactions(interactions: JsonField<List<AgentInteraction>>) = apply {
            this.interactions = interactions.map { it.toMutableList() }
        }

        /**
         * Adds a single [AgentInteraction] to [interactions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInteraction(interaction: AgentInteraction) = apply {
            interactions =
                (interactions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("interactions", it).add(interaction)
                }
        }

        fun messageExamples(messageExamples: List<String>) =
            messageExamples(JsonField.of(messageExamples))

        /**
         * Sets [Builder.messageExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageExamples] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageExamples(messageExamples: JsonField<List<String>>) = apply {
            this.messageExamples = messageExamples.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [messageExamples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessageExample(messageExample: String) = apply {
            messageExamples =
                (messageExamples ?: JsonField.of(mutableListOf())).also {
                    checkKnown("messageExamples", it).add(messageExample)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AgentCampaignConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .companyOverview()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentCampaignConfiguration =
            AgentCampaignConfiguration(
                checkRequired("companyOverview", companyOverview),
                additionalInformation,
                agentOverview,
                consentSettings,
                (interactions ?: JsonMissing.of()).map { it.toImmutable() },
                (messageExamples ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AgentCampaignConfiguration = apply {
        if (validated) {
            return@apply
        }

        companyOverview()
        additionalInformation()
        agentOverview()
        consentSettings().ifPresent { it.validate() }
        interactions().ifPresent { it.forEach { it.validate() } }
        messageExamples()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (companyOverview.asKnown().isPresent) 1 else 0) +
            (if (additionalInformation.asKnown().isPresent) 1 else 0) +
            (if (agentOverview.asKnown().isPresent) 1 else 0) +
            (consentSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (interactions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (messageExamples.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentCampaignConfiguration &&
            companyOverview == other.companyOverview &&
            additionalInformation == other.additionalInformation &&
            agentOverview == other.agentOverview &&
            consentSettings == other.consentSettings &&
            interactions == other.interactions &&
            messageExamples == other.messageExamples &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            companyOverview,
            additionalInformation,
            agentOverview,
            consentSettings,
            interactions,
            messageExamples,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentCampaignConfiguration{companyOverview=$companyOverview, additionalInformation=$additionalInformation, agentOverview=$agentOverview, consentSettings=$consentSettings, interactions=$interactions, messageExamples=$messageExamples, additionalProperties=$additionalProperties}"
}
