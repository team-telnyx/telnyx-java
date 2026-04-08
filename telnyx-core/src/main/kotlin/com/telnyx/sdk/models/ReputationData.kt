// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Reputation metrics */
class ReputationData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val connectionScore: JsonField<Long>,
    private val engagementScore: JsonField<Long>,
    private val lastRefreshedAt: JsonField<OffsetDateTime>,
    private val maturityScore: JsonField<Long>,
    private val sentimentScore: JsonField<Long>,
    private val spamCategory: JsonField<String>,
    private val spamRisk: JsonField<SpamRisk>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("connection_score")
        @ExcludeMissing
        connectionScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("engagement_score")
        @ExcludeMissing
        engagementScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("last_refreshed_at")
        @ExcludeMissing
        lastRefreshedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("maturity_score")
        @ExcludeMissing
        maturityScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sentiment_score")
        @ExcludeMissing
        sentimentScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spam_category")
        @ExcludeMissing
        spamCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spam_risk") @ExcludeMissing spamRisk: JsonField<SpamRisk> = JsonMissing.of(),
    ) : this(
        connectionScore,
        engagementScore,
        lastRefreshedAt,
        maturityScore,
        sentimentScore,
        spamCategory,
        spamRisk,
        mutableMapOf(),
    )

    /**
     * Connection quality metric (0–100)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionScore(): Optional<Long> = connectionScore.getOptional("connection_score")

    /**
     * Engagement metric (0–100). Higher = more positive engagement
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun engagementScore(): Optional<Long> = engagementScore.getOptional("engagement_score")

    /**
     * Timestamp of the last reputation data refresh
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRefreshedAt(): Optional<OffsetDateTime> =
        lastRefreshedAt.getOptional("last_refreshed_at")

    /**
     * Maturity metric (0–100). Higher = more established number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maturityScore(): Optional<Long> = maturityScore.getOptional("maturity_score")

    /**
     * Sentiment metric (0–100). Higher = more positive sentiment
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sentimentScore(): Optional<Long> = sentimentScore.getOptional("sentiment_score")

    /**
     * Spam category classification (e.g., Telemarketing, Debt Collector)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spamCategory(): Optional<String> = spamCategory.getOptional("spam_category")

    /**
     * Overall spam risk level
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spamRisk(): Optional<SpamRisk> = spamRisk.getOptional("spam_risk")

    /**
     * Returns the raw JSON value of [connectionScore].
     *
     * Unlike [connectionScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_score")
    @ExcludeMissing
    fun _connectionScore(): JsonField<Long> = connectionScore

    /**
     * Returns the raw JSON value of [engagementScore].
     *
     * Unlike [engagementScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engagement_score")
    @ExcludeMissing
    fun _engagementScore(): JsonField<Long> = engagementScore

    /**
     * Returns the raw JSON value of [lastRefreshedAt].
     *
     * Unlike [lastRefreshedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_refreshed_at")
    @ExcludeMissing
    fun _lastRefreshedAt(): JsonField<OffsetDateTime> = lastRefreshedAt

    /**
     * Returns the raw JSON value of [maturityScore].
     *
     * Unlike [maturityScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maturity_score")
    @ExcludeMissing
    fun _maturityScore(): JsonField<Long> = maturityScore

    /**
     * Returns the raw JSON value of [sentimentScore].
     *
     * Unlike [sentimentScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sentiment_score")
    @ExcludeMissing
    fun _sentimentScore(): JsonField<Long> = sentimentScore

    /**
     * Returns the raw JSON value of [spamCategory].
     *
     * Unlike [spamCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spam_category")
    @ExcludeMissing
    fun _spamCategory(): JsonField<String> = spamCategory

    /**
     * Returns the raw JSON value of [spamRisk].
     *
     * Unlike [spamRisk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spam_risk") @ExcludeMissing fun _spamRisk(): JsonField<SpamRisk> = spamRisk

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

        /** Returns a mutable builder for constructing an instance of [ReputationData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReputationData]. */
    class Builder internal constructor() {

        private var connectionScore: JsonField<Long> = JsonMissing.of()
        private var engagementScore: JsonField<Long> = JsonMissing.of()
        private var lastRefreshedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var maturityScore: JsonField<Long> = JsonMissing.of()
        private var sentimentScore: JsonField<Long> = JsonMissing.of()
        private var spamCategory: JsonField<String> = JsonMissing.of()
        private var spamRisk: JsonField<SpamRisk> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reputationData: ReputationData) = apply {
            connectionScore = reputationData.connectionScore
            engagementScore = reputationData.engagementScore
            lastRefreshedAt = reputationData.lastRefreshedAt
            maturityScore = reputationData.maturityScore
            sentimentScore = reputationData.sentimentScore
            spamCategory = reputationData.spamCategory
            spamRisk = reputationData.spamRisk
            additionalProperties = reputationData.additionalProperties.toMutableMap()
        }

        /** Connection quality metric (0–100) */
        fun connectionScore(connectionScore: Long?) =
            connectionScore(JsonField.ofNullable(connectionScore))

        /**
         * Alias for [Builder.connectionScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun connectionScore(connectionScore: Long) = connectionScore(connectionScore as Long?)

        /** Alias for calling [Builder.connectionScore] with `connectionScore.orElse(null)`. */
        fun connectionScore(connectionScore: Optional<Long>) =
            connectionScore(connectionScore.getOrNull())

        /**
         * Sets [Builder.connectionScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionScore(connectionScore: JsonField<Long>) = apply {
            this.connectionScore = connectionScore
        }

        /** Engagement metric (0–100). Higher = more positive engagement */
        fun engagementScore(engagementScore: Long?) =
            engagementScore(JsonField.ofNullable(engagementScore))

        /**
         * Alias for [Builder.engagementScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun engagementScore(engagementScore: Long) = engagementScore(engagementScore as Long?)

        /** Alias for calling [Builder.engagementScore] with `engagementScore.orElse(null)`. */
        fun engagementScore(engagementScore: Optional<Long>) =
            engagementScore(engagementScore.getOrNull())

        /**
         * Sets [Builder.engagementScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engagementScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun engagementScore(engagementScore: JsonField<Long>) = apply {
            this.engagementScore = engagementScore
        }

        /** Timestamp of the last reputation data refresh */
        fun lastRefreshedAt(lastRefreshedAt: OffsetDateTime?) =
            lastRefreshedAt(JsonField.ofNullable(lastRefreshedAt))

        /** Alias for calling [Builder.lastRefreshedAt] with `lastRefreshedAt.orElse(null)`. */
        fun lastRefreshedAt(lastRefreshedAt: Optional<OffsetDateTime>) =
            lastRefreshedAt(lastRefreshedAt.getOrNull())

        /**
         * Sets [Builder.lastRefreshedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRefreshedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastRefreshedAt(lastRefreshedAt: JsonField<OffsetDateTime>) = apply {
            this.lastRefreshedAt = lastRefreshedAt
        }

        /** Maturity metric (0–100). Higher = more established number */
        fun maturityScore(maturityScore: Long?) = maturityScore(JsonField.ofNullable(maturityScore))

        /**
         * Alias for [Builder.maturityScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maturityScore(maturityScore: Long) = maturityScore(maturityScore as Long?)

        /** Alias for calling [Builder.maturityScore] with `maturityScore.orElse(null)`. */
        fun maturityScore(maturityScore: Optional<Long>) = maturityScore(maturityScore.getOrNull())

        /**
         * Sets [Builder.maturityScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maturityScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maturityScore(maturityScore: JsonField<Long>) = apply {
            this.maturityScore = maturityScore
        }

        /** Sentiment metric (0–100). Higher = more positive sentiment */
        fun sentimentScore(sentimentScore: Long?) =
            sentimentScore(JsonField.ofNullable(sentimentScore))

        /**
         * Alias for [Builder.sentimentScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sentimentScore(sentimentScore: Long) = sentimentScore(sentimentScore as Long?)

        /** Alias for calling [Builder.sentimentScore] with `sentimentScore.orElse(null)`. */
        fun sentimentScore(sentimentScore: Optional<Long>) =
            sentimentScore(sentimentScore.getOrNull())

        /**
         * Sets [Builder.sentimentScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentimentScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sentimentScore(sentimentScore: JsonField<Long>) = apply {
            this.sentimentScore = sentimentScore
        }

        /** Spam category classification (e.g., Telemarketing, Debt Collector) */
        fun spamCategory(spamCategory: String?) = spamCategory(JsonField.ofNullable(spamCategory))

        /** Alias for calling [Builder.spamCategory] with `spamCategory.orElse(null)`. */
        fun spamCategory(spamCategory: Optional<String>) = spamCategory(spamCategory.getOrNull())

        /**
         * Sets [Builder.spamCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spamCategory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spamCategory(spamCategory: JsonField<String>) = apply {
            this.spamCategory = spamCategory
        }

        /** Overall spam risk level */
        fun spamRisk(spamRisk: SpamRisk?) = spamRisk(JsonField.ofNullable(spamRisk))

        /** Alias for calling [Builder.spamRisk] with `spamRisk.orElse(null)`. */
        fun spamRisk(spamRisk: Optional<SpamRisk>) = spamRisk(spamRisk.getOrNull())

        /**
         * Sets [Builder.spamRisk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spamRisk] with a well-typed [SpamRisk] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spamRisk(spamRisk: JsonField<SpamRisk>) = apply { this.spamRisk = spamRisk }

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
         * Returns an immutable instance of [ReputationData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReputationData =
            ReputationData(
                connectionScore,
                engagementScore,
                lastRefreshedAt,
                maturityScore,
                sentimentScore,
                spamCategory,
                spamRisk,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReputationData = apply {
        if (validated) {
            return@apply
        }

        connectionScore()
        engagementScore()
        lastRefreshedAt()
        maturityScore()
        sentimentScore()
        spamCategory()
        spamRisk().ifPresent { it.validate() }
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
        (if (connectionScore.asKnown().isPresent) 1 else 0) +
            (if (engagementScore.asKnown().isPresent) 1 else 0) +
            (if (lastRefreshedAt.asKnown().isPresent) 1 else 0) +
            (if (maturityScore.asKnown().isPresent) 1 else 0) +
            (if (sentimentScore.asKnown().isPresent) 1 else 0) +
            (if (spamCategory.asKnown().isPresent) 1 else 0) +
            (spamRisk.asKnown().getOrNull()?.validity() ?: 0)

    /** Overall spam risk level */
    class SpamRisk @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LOW = of("low")

            @JvmField val MEDIUM = of("medium")

            @JvmField val HIGH = of("high")

            @JvmStatic fun of(value: String) = SpamRisk(JsonField.of(value))
        }

        /** An enum containing [SpamRisk]'s known values. */
        enum class Known {
            LOW,
            MEDIUM,
            HIGH,
        }

        /**
         * An enum containing [SpamRisk]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SpamRisk] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            /** An enum member indicating that [SpamRisk] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                else -> throw TelnyxInvalidDataException("Unknown SpamRisk: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): SpamRisk = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpamRisk && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReputationData &&
            connectionScore == other.connectionScore &&
            engagementScore == other.engagementScore &&
            lastRefreshedAt == other.lastRefreshedAt &&
            maturityScore == other.maturityScore &&
            sentimentScore == other.sentimentScore &&
            spamCategory == other.spamCategory &&
            spamRisk == other.spamRisk &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            connectionScore,
            engagementScore,
            lastRefreshedAt,
            maturityScore,
            sentimentScore,
            spamCategory,
            spamRisk,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReputationData{connectionScore=$connectionScore, engagementScore=$engagementScore, lastRefreshedAt=$lastRefreshedAt, maturityScore=$maturityScore, sentimentScore=$sentimentScore, spamCategory=$spamCategory, spamRisk=$spamRisk, additionalProperties=$additionalProperties}"
}
