// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LogMessageRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val logMessages: JsonField<List<LogMessage>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("log_messages")
        @ExcludeMissing
        logMessages: JsonField<List<LogMessage>> = JsonMissing.of()
    ) : this(logMessages, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logMessages(): Optional<List<LogMessage>> = logMessages.getOptional("log_messages")

    /**
     * Returns the raw JSON value of [logMessages].
     *
     * Unlike [logMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("log_messages")
    @ExcludeMissing
    fun _logMessages(): JsonField<List<LogMessage>> = logMessages

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
         * Returns a mutable builder for constructing an instance of [LogMessageRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogMessageRetrieveResponse]. */
    class Builder internal constructor() {

        private var logMessages: JsonField<MutableList<LogMessage>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logMessageRetrieveResponse: LogMessageRetrieveResponse) = apply {
            logMessages = logMessageRetrieveResponse.logMessages.map { it.toMutableList() }
            additionalProperties = logMessageRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun logMessages(logMessages: List<LogMessage>) = logMessages(JsonField.of(logMessages))

        /**
         * Sets [Builder.logMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logMessages] with a well-typed `List<LogMessage>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logMessages(logMessages: JsonField<List<LogMessage>>) = apply {
            this.logMessages = logMessages.map { it.toMutableList() }
        }

        /**
         * Adds a single [LogMessage] to [logMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogMessage(logMessage: LogMessage) = apply {
            logMessages =
                (logMessages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logMessages", it).add(logMessage)
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
         * Returns an immutable instance of [LogMessageRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogMessageRetrieveResponse =
            LogMessageRetrieveResponse(
                (logMessages ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): LogMessageRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        logMessages().ifPresent { it.forEach { it.validate() } }
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
        (logMessages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogMessageRetrieveResponse &&
            logMessages == other.logMessages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(logMessages, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogMessageRetrieveResponse{logMessages=$logMessages, additionalProperties=$additionalProperties}"
}
