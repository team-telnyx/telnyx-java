// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.telnyxagents

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class TelnyxAgentData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val runId: JsonField<String>,
    private val telnyxAgentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("telnyx_agent_id")
        @ExcludeMissing
        telnyxAgentId: JsonField<String> = JsonMissing.of(),
    ) : this(createdAt, runId, telnyxAgentId, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxAgentId(): String = telnyxAgentId.getRequired("telnyx_agent_id")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [telnyxAgentId].
     *
     * Unlike [telnyxAgentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("telnyx_agent_id")
    @ExcludeMissing
    fun _telnyxAgentId(): JsonField<String> = telnyxAgentId

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
         * Returns a mutable builder for constructing an instance of [TelnyxAgentData].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .runId()
         * .telnyxAgentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelnyxAgentData]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var runId: JsonField<String>? = null
        private var telnyxAgentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telnyxAgentData: TelnyxAgentData) = apply {
            createdAt = telnyxAgentData.createdAt
            runId = telnyxAgentData.runId
            telnyxAgentId = telnyxAgentData.telnyxAgentId
            additionalProperties = telnyxAgentData.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun telnyxAgentId(telnyxAgentId: String) = telnyxAgentId(JsonField.of(telnyxAgentId))

        /**
         * Sets [Builder.telnyxAgentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxAgentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun telnyxAgentId(telnyxAgentId: JsonField<String>) = apply {
            this.telnyxAgentId = telnyxAgentId
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
         * Returns an immutable instance of [TelnyxAgentData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .runId()
         * .telnyxAgentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TelnyxAgentData =
            TelnyxAgentData(
                checkRequired("createdAt", createdAt),
                checkRequired("runId", runId),
                checkRequired("telnyxAgentId", telnyxAgentId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TelnyxAgentData = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        runId()
        telnyxAgentId()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (telnyxAgentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelnyxAgentData &&
            createdAt == other.createdAt &&
            runId == other.runId &&
            telnyxAgentId == other.telnyxAgentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, runId, telnyxAgentId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelnyxAgentData{createdAt=$createdAt, runId=$runId, telnyxAgentId=$telnyxAgentId, additionalProperties=$additionalProperties}"
}
