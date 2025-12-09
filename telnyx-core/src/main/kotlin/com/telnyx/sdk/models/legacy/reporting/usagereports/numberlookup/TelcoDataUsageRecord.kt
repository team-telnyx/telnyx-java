// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

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

class TelcoDataUsageRecord
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aggregations: JsonField<List<TelcoDataAggregation>>,
    private val recordType: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aggregations")
        @ExcludeMissing
        aggregations: JsonField<List<TelcoDataAggregation>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(aggregations, recordType, userId, mutableMapOf())

    /**
     * List of aggregations by lookup type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregations(): Optional<List<TelcoDataAggregation>> =
        aggregations.getOptional("aggregations")

    /**
     * Record type identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * User ID
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [aggregations].
     *
     * Unlike [aggregations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregations")
    @ExcludeMissing
    fun _aggregations(): JsonField<List<TelcoDataAggregation>> = aggregations

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /** Returns a mutable builder for constructing an instance of [TelcoDataUsageRecord]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelcoDataUsageRecord]. */
    class Builder internal constructor() {

        private var aggregations: JsonField<MutableList<TelcoDataAggregation>>? = null
        private var recordType: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telcoDataUsageRecord: TelcoDataUsageRecord) = apply {
            aggregations = telcoDataUsageRecord.aggregations.map { it.toMutableList() }
            recordType = telcoDataUsageRecord.recordType
            userId = telcoDataUsageRecord.userId
            additionalProperties = telcoDataUsageRecord.additionalProperties.toMutableMap()
        }

        /** List of aggregations by lookup type */
        fun aggregations(aggregations: List<TelcoDataAggregation>) =
            aggregations(JsonField.of(aggregations))

        /**
         * Sets [Builder.aggregations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregations] with a well-typed
         * `List<TelcoDataAggregation>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun aggregations(aggregations: JsonField<List<TelcoDataAggregation>>) = apply {
            this.aggregations = aggregations.map { it.toMutableList() }
        }

        /**
         * Adds a single [TelcoDataAggregation] to [aggregations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAggregation(aggregation: TelcoDataAggregation) = apply {
            aggregations =
                (aggregations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aggregations", it).add(aggregation)
                }
        }

        /** Record type identifier */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** User ID */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [TelcoDataUsageRecord].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TelcoDataUsageRecord =
            TelcoDataUsageRecord(
                (aggregations ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TelcoDataUsageRecord = apply {
        if (validated) {
            return@apply
        }

        aggregations().ifPresent { it.forEach { it.validate() } }
        recordType()
        userId()
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
        (aggregations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelcoDataUsageRecord &&
            aggregations == other.aggregations &&
            recordType == other.recordType &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(aggregations, recordType, userId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelcoDataUsageRecord{aggregations=$aggregations, recordType=$recordType, userId=$userId, additionalProperties=$additionalProperties}"
}
