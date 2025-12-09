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
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LogMessageListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val logMessages: JsonField<List<LogMessageListResponse>>,
    private val meta: JsonField<ExternalVoiceIntegrationsPaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("log_messages")
        @ExcludeMissing
        logMessages: JsonField<List<LogMessageListResponse>> = JsonMissing.of(),
        @JsonProperty("meta")
        @ExcludeMissing
        meta: JsonField<ExternalVoiceIntegrationsPaginationMeta> = JsonMissing.of(),
    ) : this(logMessages, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logMessages(): Optional<List<LogMessageListResponse>> =
        logMessages.getOptional("log_messages")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [logMessages].
     *
     * Unlike [logMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("log_messages")
    @ExcludeMissing
    fun _logMessages(): JsonField<List<LogMessageListResponse>> = logMessages

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta")
    @ExcludeMissing
    fun _meta(): JsonField<ExternalVoiceIntegrationsPaginationMeta> = meta

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
         * Returns a mutable builder for constructing an instance of [LogMessageListPageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogMessageListPageResponse]. */
    class Builder internal constructor() {

        private var logMessages: JsonField<MutableList<LogMessageListResponse>>? = null
        private var meta: JsonField<ExternalVoiceIntegrationsPaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logMessageListPageResponse: LogMessageListPageResponse) = apply {
            logMessages = logMessageListPageResponse.logMessages.map { it.toMutableList() }
            meta = logMessageListPageResponse.meta
            additionalProperties = logMessageListPageResponse.additionalProperties.toMutableMap()
        }

        fun logMessages(logMessages: List<LogMessageListResponse>) =
            logMessages(JsonField.of(logMessages))

        /**
         * Sets [Builder.logMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logMessages] with a well-typed
         * `List<LogMessageListResponse>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun logMessages(logMessages: JsonField<List<LogMessageListResponse>>) = apply {
            this.logMessages = logMessages.map { it.toMutableList() }
        }

        /**
         * Adds a single [LogMessageListResponse] to [logMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogMessage(logMessage: LogMessageListResponse) = apply {
            logMessages =
                (logMessages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logMessages", it).add(logMessage)
                }
        }

        fun meta(meta: ExternalVoiceIntegrationsPaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed
         * [ExternalVoiceIntegrationsPaginationMeta] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<ExternalVoiceIntegrationsPaginationMeta>) = apply {
            this.meta = meta
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
         * Returns an immutable instance of [LogMessageListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogMessageListPageResponse =
            LogMessageListPageResponse(
                (logMessages ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogMessageListPageResponse = apply {
        if (validated) {
            return@apply
        }

        logMessages().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (logMessages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogMessageListPageResponse &&
            logMessages == other.logMessages &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(logMessages, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogMessageListPageResponse{logMessages=$logMessages, meta=$meta, additionalProperties=$additionalProperties}"
}
