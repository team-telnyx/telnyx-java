// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** The active block of the period. `null` when the period is not blocked. */
class SpendLimitBlock
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val blockedUntil: JsonField<LocalDate>,
    private val detectedAt: JsonField<OffsetDateTime>,
    private val limitUsd: JsonField<String>,
    private val spendUsd: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("blocked_until")
        @ExcludeMissing
        blockedUntil: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("detected_at")
        @ExcludeMissing
        detectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("limit_usd") @ExcludeMissing limitUsd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend_usd") @ExcludeMissing spendUsd: JsonField<String> = JsonMissing.of(),
    ) : this(blockedUntil, detectedAt, limitUsd, spendUsd, mutableMapOf())

    /**
     * Exclusive end of the block: it is lifted at 00:00 UTC on this date at the latest.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blockedUntil(): LocalDate = blockedUntil.getRequired("blocked_until")

    /**
     * When the block started.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun detectedAt(): OffsetDateTime = detectedAt.getRequired("detected_at")

    /**
     * The limit in USD that the spend went above, as a decimal string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limitUsd(): String = limitUsd.getRequired("limit_usd")

    /**
     * Spend in USD when the block started, as a decimal string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendUsd(): String = spendUsd.getRequired("spend_usd")

    /**
     * Returns the raw JSON value of [blockedUntil].
     *
     * Unlike [blockedUntil], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked_until")
    @ExcludeMissing
    fun _blockedUntil(): JsonField<LocalDate> = blockedUntil

    /**
     * Returns the raw JSON value of [detectedAt].
     *
     * Unlike [detectedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detected_at")
    @ExcludeMissing
    fun _detectedAt(): JsonField<OffsetDateTime> = detectedAt

    /**
     * Returns the raw JSON value of [limitUsd].
     *
     * Unlike [limitUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit_usd") @ExcludeMissing fun _limitUsd(): JsonField<String> = limitUsd

    /**
     * Returns the raw JSON value of [spendUsd].
     *
     * Unlike [spendUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_usd") @ExcludeMissing fun _spendUsd(): JsonField<String> = spendUsd

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
         * Returns a mutable builder for constructing an instance of [SpendLimitBlock].
         *
         * The following fields are required:
         * ```java
         * .blockedUntil()
         * .detectedAt()
         * .limitUsd()
         * .spendUsd()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendLimitBlock]. */
    class Builder internal constructor() {

        private var blockedUntil: JsonField<LocalDate>? = null
        private var detectedAt: JsonField<OffsetDateTime>? = null
        private var limitUsd: JsonField<String>? = null
        private var spendUsd: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spendLimitBlock: SpendLimitBlock) = apply {
            blockedUntil = spendLimitBlock.blockedUntil
            detectedAt = spendLimitBlock.detectedAt
            limitUsd = spendLimitBlock.limitUsd
            spendUsd = spendLimitBlock.spendUsd
            additionalProperties = spendLimitBlock.additionalProperties.toMutableMap()
        }

        /** Exclusive end of the block: it is lifted at 00:00 UTC on this date at the latest. */
        fun blockedUntil(blockedUntil: LocalDate) = blockedUntil(JsonField.of(blockedUntil))

        /**
         * Sets [Builder.blockedUntil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedUntil] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blockedUntil(blockedUntil: JsonField<LocalDate>) = apply {
            this.blockedUntil = blockedUntil
        }

        /** When the block started. */
        fun detectedAt(detectedAt: OffsetDateTime) = detectedAt(JsonField.of(detectedAt))

        /**
         * Sets [Builder.detectedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detectedAt(detectedAt: JsonField<OffsetDateTime>) = apply {
            this.detectedAt = detectedAt
        }

        /** The limit in USD that the spend went above, as a decimal string. */
        fun limitUsd(limitUsd: String) = limitUsd(JsonField.of(limitUsd))

        /**
         * Sets [Builder.limitUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitUsd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limitUsd(limitUsd: JsonField<String>) = apply { this.limitUsd = limitUsd }

        /** Spend in USD when the block started, as a decimal string. */
        fun spendUsd(spendUsd: String) = spendUsd(JsonField.of(spendUsd))

        /**
         * Sets [Builder.spendUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendUsd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spendUsd(spendUsd: JsonField<String>) = apply { this.spendUsd = spendUsd }

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
         * Returns an immutable instance of [SpendLimitBlock].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .blockedUntil()
         * .detectedAt()
         * .limitUsd()
         * .spendUsd()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpendLimitBlock =
            SpendLimitBlock(
                checkRequired("blockedUntil", blockedUntil),
                checkRequired("detectedAt", detectedAt),
                checkRequired("limitUsd", limitUsd),
                checkRequired("spendUsd", spendUsd),
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
    fun validate(): SpendLimitBlock = apply {
        if (validated) {
            return@apply
        }

        blockedUntil()
        detectedAt()
        limitUsd()
        spendUsd()
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
        (if (blockedUntil.asKnown().isPresent) 1 else 0) +
            (if (detectedAt.asKnown().isPresent) 1 else 0) +
            (if (limitUsd.asKnown().isPresent) 1 else 0) +
            (if (spendUsd.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendLimitBlock &&
            blockedUntil == other.blockedUntil &&
            detectedAt == other.detectedAt &&
            limitUsd == other.limitUsd &&
            spendUsd == other.spendUsd &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(blockedUntil, detectedAt, limitUsd, spendUsd, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendLimitBlock{blockedUntil=$blockedUntil, detectedAt=$detectedAt, limitUsd=$limitUsd, spendUsd=$spendUsd, additionalProperties=$additionalProperties}"
}
