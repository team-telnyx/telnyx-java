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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentTestingConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val testUrl: JsonField<String>,
    private val additionalInformation: JsonField<String>,
    private val messageId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("test_url") @ExcludeMissing testUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additional_information")
        @ExcludeMissing
        additionalInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
    ) : this(testUrl, additionalInformation, messageId, mutableMapOf())

    /**
     * A publicly accessible test video or evidence URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun testUrl(): String = testUrl.getRequired("test_url")

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
    fun messageId(): Optional<String> = messageId.getOptional("message_id")

    /**
     * Returns the raw JSON value of [testUrl].
     *
     * Unlike [testUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_url") @ExcludeMissing fun _testUrl(): JsonField<String> = testUrl

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
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

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
         * Returns a mutable builder for constructing an instance of [AgentTestingConfiguration].
         *
         * The following fields are required:
         * ```java
         * .testUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentTestingConfiguration]. */
    class Builder internal constructor() {

        private var testUrl: JsonField<String>? = null
        private var additionalInformation: JsonField<String> = JsonMissing.of()
        private var messageId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentTestingConfiguration: AgentTestingConfiguration) = apply {
            testUrl = agentTestingConfiguration.testUrl
            additionalInformation = agentTestingConfiguration.additionalInformation
            messageId = agentTestingConfiguration.messageId
            additionalProperties = agentTestingConfiguration.additionalProperties.toMutableMap()
        }

        /** A publicly accessible test video or evidence URL. */
        fun testUrl(testUrl: String) = testUrl(JsonField.of(testUrl))

        /**
         * Sets [Builder.testUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun testUrl(testUrl: JsonField<String>) = apply { this.testUrl = testUrl }

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

        fun messageId(messageId: String?) = messageId(JsonField.ofNullable(messageId))

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

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
         * Returns an immutable instance of [AgentTestingConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .testUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentTestingConfiguration =
            AgentTestingConfiguration(
                checkRequired("testUrl", testUrl),
                additionalInformation,
                messageId,
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
    fun validate(): AgentTestingConfiguration = apply {
        if (validated) {
            return@apply
        }

        testUrl()
        additionalInformation()
        messageId()
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
        (if (testUrl.asKnown().isPresent) 1 else 0) +
            (if (additionalInformation.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentTestingConfiguration &&
            testUrl == other.testUrl &&
            additionalInformation == other.additionalInformation &&
            messageId == other.messageId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(testUrl, additionalInformation, messageId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentTestingConfiguration{testUrl=$testUrl, additionalInformation=$additionalInformation, messageId=$messageId, additionalProperties=$additionalProperties}"
}
