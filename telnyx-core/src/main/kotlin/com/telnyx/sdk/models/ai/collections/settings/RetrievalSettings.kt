// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** How documents are retrieved when searching the collection. */
class RetrievalSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val retrievalType: JsonField<RetrievalType>,
    private val topK: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("retrieval_type")
        @ExcludeMissing
        retrievalType: JsonField<RetrievalType> = JsonMissing.of(),
        @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
    ) : this(retrievalType, topK, mutableMapOf())

    /**
     * Retrieval strategy. `vector` runs semantic similarity search; `hybrid` combines vector
     * similarity with keyword matching; `keyword` runs lexical (BM25) matching.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retrievalType(): Optional<RetrievalType> = retrievalType.getOptional("retrieval_type")

    /**
     * Number of top results to retrieve (1–50).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topK(): Optional<Long> = topK.getOptional("top_k")

    /**
     * Returns the raw JSON value of [retrievalType].
     *
     * Unlike [retrievalType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retrieval_type")
    @ExcludeMissing
    fun _retrievalType(): JsonField<RetrievalType> = retrievalType

    /**
     * Returns the raw JSON value of [topK].
     *
     * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

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

        /** Returns a mutable builder for constructing an instance of [RetrievalSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrievalSettings]. */
    class Builder internal constructor() {

        private var retrievalType: JsonField<RetrievalType> = JsonMissing.of()
        private var topK: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(retrievalSettings: RetrievalSettings) = apply {
            retrievalType = retrievalSettings.retrievalType
            topK = retrievalSettings.topK
            additionalProperties = retrievalSettings.additionalProperties.toMutableMap()
        }

        /**
         * Retrieval strategy. `vector` runs semantic similarity search; `hybrid` combines vector
         * similarity with keyword matching; `keyword` runs lexical (BM25) matching.
         */
        fun retrievalType(retrievalType: RetrievalType) = retrievalType(JsonField.of(retrievalType))

        /**
         * Sets [Builder.retrievalType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievalType] with a well-typed [RetrievalType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun retrievalType(retrievalType: JsonField<RetrievalType>) = apply {
            this.retrievalType = retrievalType
        }

        /** Number of top results to retrieve (1–50). */
        fun topK(topK: Long) = topK(JsonField.of(topK))

        /**
         * Sets [Builder.topK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

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
         * Returns an immutable instance of [RetrievalSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RetrievalSettings =
            RetrievalSettings(retrievalType, topK, additionalProperties.toMutableMap())
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
    fun validate(): RetrievalSettings = apply {
        if (validated) {
            return@apply
        }

        retrievalType().ifPresent { it.validate() }
        topK()
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
        (retrievalType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (topK.asKnown().isPresent) 1 else 0)

    /**
     * Retrieval strategy. `vector` runs semantic similarity search; `hybrid` combines vector
     * similarity with keyword matching; `keyword` runs lexical (BM25) matching.
     */
    class RetrievalType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val VECTOR = of("vector")

            @JvmField val HYBRID = of("hybrid")

            @JvmField val KEYWORD = of("keyword")

            @JvmStatic fun of(value: String) = RetrievalType(JsonField.of(value))
        }

        /** An enum containing [RetrievalType]'s known values. */
        enum class Known {
            VECTOR,
            HYBRID,
            KEYWORD,
        }

        /**
         * An enum containing [RetrievalType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RetrievalType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VECTOR,
            HYBRID,
            KEYWORD,
            /**
             * An enum member indicating that [RetrievalType] was instantiated with an unknown
             * value.
             */
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
                VECTOR -> Value.VECTOR
                HYBRID -> Value.HYBRID
                KEYWORD -> Value.KEYWORD
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
                VECTOR -> Known.VECTOR
                HYBRID -> Known.HYBRID
                KEYWORD -> Known.KEYWORD
                else -> throw TelnyxInvalidDataException("Unknown RetrievalType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RetrievalType = apply {
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

            return other is RetrievalType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalSettings &&
            retrievalType == other.retrievalType &&
            topK == other.topK &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(retrievalType, topK, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetrievalSettings{retrievalType=$retrievalType, topK=$topK, additionalProperties=$additionalProperties}"
}
