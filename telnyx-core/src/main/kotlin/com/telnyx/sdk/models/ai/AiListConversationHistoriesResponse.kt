// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A single search result representing one chunk of a conversation history record. Records are split
 * into chunks of up to 480 tokens with 64-token overlap at ingestion time.
 */
class AiListConversationHistoriesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chunkIndex: JsonField<Long>,
    private val chunkTotal: JsonField<Long>,
    private val ingestedAt: JsonField<OffsetDateTime>,
    private val organizationId: JsonField<String>,
    private val recordCreatedAt: JsonField<OffsetDateTime>,
    private val recordId: JsonField<String>,
    private val region: JsonField<Region>,
    private val score: JsonField<Float>,
    private val text: JsonField<String>,
    private val userId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chunk_index") @ExcludeMissing chunkIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("chunk_total") @ExcludeMissing chunkTotal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ingested_at")
        @ExcludeMissing
        ingestedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_created_at")
        @ExcludeMissing
        recordCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_id") @ExcludeMissing recordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
        @JsonProperty("score") @ExcludeMissing score: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
    ) : this(
        id,
        chunkIndex,
        chunkTotal,
        ingestedAt,
        organizationId,
        recordCreatedAt,
        recordId,
        region,
        score,
        text,
        userId,
        metadata,
        mutableMapOf(),
    )

    /**
     * Unique chunk identifier.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Zero-based index of this chunk within the parent record.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunkIndex(): Long = chunkIndex.getRequired("chunk_index")

    /**
     * Total number of chunks the parent record was split into.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunkTotal(): Long = chunkTotal.getRequired("chunk_total")

    /**
     * When the record was chunked, embedded, and indexed (ISO 8601).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ingestedAt(): OffsetDateTime = ingestedAt.getRequired("ingested_at")

    /**
     * Identifier of the organization that owns this record.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * When the original record was created (ISO 8601).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordCreatedAt(): OffsetDateTime = recordCreatedAt.getRequired("record_created_at")

    /**
     * Identifier of the parent record. Multiple chunks from the same record share this ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordId(): String = recordId.getRequired("record_id")

    /**
     * The region where this record is stored.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun region(): Region = region.getRequired("region")

    /**
     * Cosine similarity score between the query vector and this chunk's vector. Higher values
     * indicate greater semantic relevance.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun score(): Float = score.getRequired("score")

    /**
     * The text content of this chunk (up to 480 tokens).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * Identifier of the user who owns this record.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Arbitrary metadata attached to the record at ingestion time. Filterable via
     * filter[field]=value query parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [chunkIndex].
     *
     * Unlike [chunkIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunk_index") @ExcludeMissing fun _chunkIndex(): JsonField<Long> = chunkIndex

    /**
     * Returns the raw JSON value of [chunkTotal].
     *
     * Unlike [chunkTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunk_total") @ExcludeMissing fun _chunkTotal(): JsonField<Long> = chunkTotal

    /**
     * Returns the raw JSON value of [ingestedAt].
     *
     * Unlike [ingestedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ingested_at")
    @ExcludeMissing
    fun _ingestedAt(): JsonField<OffsetDateTime> = ingestedAt

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [recordCreatedAt].
     *
     * Unlike [recordCreatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_created_at")
    @ExcludeMissing
    fun _recordCreatedAt(): JsonField<OffsetDateTime> = recordCreatedAt

    /**
     * Returns the raw JSON value of [recordId].
     *
     * Unlike [recordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_id") @ExcludeMissing fun _recordId(): JsonField<String> = recordId

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Float> = score

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns a mutable builder for constructing an instance of
         * [AiListConversationHistoriesResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chunkIndex()
         * .chunkTotal()
         * .ingestedAt()
         * .organizationId()
         * .recordCreatedAt()
         * .recordId()
         * .region()
         * .score()
         * .text()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiListConversationHistoriesResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var chunkIndex: JsonField<Long>? = null
        private var chunkTotal: JsonField<Long>? = null
        private var ingestedAt: JsonField<OffsetDateTime>? = null
        private var organizationId: JsonField<String>? = null
        private var recordCreatedAt: JsonField<OffsetDateTime>? = null
        private var recordId: JsonField<String>? = null
        private var region: JsonField<Region>? = null
        private var score: JsonField<Float>? = null
        private var text: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            aiListConversationHistoriesResponse: AiListConversationHistoriesResponse
        ) = apply {
            id = aiListConversationHistoriesResponse.id
            chunkIndex = aiListConversationHistoriesResponse.chunkIndex
            chunkTotal = aiListConversationHistoriesResponse.chunkTotal
            ingestedAt = aiListConversationHistoriesResponse.ingestedAt
            organizationId = aiListConversationHistoriesResponse.organizationId
            recordCreatedAt = aiListConversationHistoriesResponse.recordCreatedAt
            recordId = aiListConversationHistoriesResponse.recordId
            region = aiListConversationHistoriesResponse.region
            score = aiListConversationHistoriesResponse.score
            text = aiListConversationHistoriesResponse.text
            userId = aiListConversationHistoriesResponse.userId
            metadata = aiListConversationHistoriesResponse.metadata
            additionalProperties =
                aiListConversationHistoriesResponse.additionalProperties.toMutableMap()
        }

        /** Unique chunk identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Zero-based index of this chunk within the parent record. */
        fun chunkIndex(chunkIndex: Long) = chunkIndex(JsonField.of(chunkIndex))

        /**
         * Sets [Builder.chunkIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkIndex] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chunkIndex(chunkIndex: JsonField<Long>) = apply { this.chunkIndex = chunkIndex }

        /** Total number of chunks the parent record was split into. */
        fun chunkTotal(chunkTotal: Long) = chunkTotal(JsonField.of(chunkTotal))

        /**
         * Sets [Builder.chunkTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkTotal] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chunkTotal(chunkTotal: JsonField<Long>) = apply { this.chunkTotal = chunkTotal }

        /** When the record was chunked, embedded, and indexed (ISO 8601). */
        fun ingestedAt(ingestedAt: OffsetDateTime) = ingestedAt(JsonField.of(ingestedAt))

        /**
         * Sets [Builder.ingestedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ingestedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ingestedAt(ingestedAt: JsonField<OffsetDateTime>) = apply {
            this.ingestedAt = ingestedAt
        }

        /** Identifier of the organization that owns this record. */
        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        /** When the original record was created (ISO 8601). */
        fun recordCreatedAt(recordCreatedAt: OffsetDateTime) =
            recordCreatedAt(JsonField.of(recordCreatedAt))

        /**
         * Sets [Builder.recordCreatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordCreatedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordCreatedAt(recordCreatedAt: JsonField<OffsetDateTime>) = apply {
            this.recordCreatedAt = recordCreatedAt
        }

        /** Identifier of the parent record. Multiple chunks from the same record share this ID. */
        fun recordId(recordId: String) = recordId(JsonField.of(recordId))

        /**
         * Sets [Builder.recordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recordId(recordId: JsonField<String>) = apply { this.recordId = recordId }

        /** The region where this record is stored. */
        fun region(region: Region) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [Region] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<Region>) = apply { this.region = region }

        /**
         * Cosine similarity score between the query vector and this chunk's vector. Higher values
         * indicate greater semantic relevance.
         */
        fun score(score: Float) = score(JsonField.of(score))

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Float>) = apply { this.score = score }

        /** The text content of this chunk (up to 480 tokens). */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /** Identifier of the user who owns this record. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /**
         * Arbitrary metadata attached to the record at ingestion time. Filterable via
         * filter[field]=value query parameters.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
         * Returns an immutable instance of [AiListConversationHistoriesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chunkIndex()
         * .chunkTotal()
         * .ingestedAt()
         * .organizationId()
         * .recordCreatedAt()
         * .recordId()
         * .region()
         * .score()
         * .text()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiListConversationHistoriesResponse =
            AiListConversationHistoriesResponse(
                checkRequired("id", id),
                checkRequired("chunkIndex", chunkIndex),
                checkRequired("chunkTotal", chunkTotal),
                checkRequired("ingestedAt", ingestedAt),
                checkRequired("organizationId", organizationId),
                checkRequired("recordCreatedAt", recordCreatedAt),
                checkRequired("recordId", recordId),
                checkRequired("region", region),
                checkRequired("score", score),
                checkRequired("text", text),
                checkRequired("userId", userId),
                metadata,
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
    fun validate(): AiListConversationHistoriesResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        chunkIndex()
        chunkTotal()
        ingestedAt()
        organizationId()
        recordCreatedAt()
        recordId()
        region().validate()
        score()
        text()
        userId()
        metadata().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (chunkIndex.asKnown().isPresent) 1 else 0) +
            (if (chunkTotal.asKnown().isPresent) 1 else 0) +
            (if (ingestedAt.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (recordCreatedAt.asKnown().isPresent) 1 else 0) +
            (if (recordId.asKnown().isPresent) 1 else 0) +
            (region.asKnown().getOrNull()?.validity() ?: 0) +
            (if (score.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0)

    /** The region where this record is stored. */
    class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USA = of("USA")

            @JvmField val DEU = of("DEU")

            @JvmField val AUS = of("AUS")

            @JvmField val UAE = of("UAE")

            @JvmStatic fun of(value: String) = Region(JsonField.of(value))
        }

        /** An enum containing [Region]'s known values. */
        enum class Known {
            USA,
            DEU,
            AUS,
            UAE,
        }

        /**
         * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Region] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USA,
            DEU,
            AUS,
            UAE,
            /** An enum member indicating that [Region] was instantiated with an unknown value. */
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
                USA -> Value.USA
                DEU -> Value.DEU
                AUS -> Value.AUS
                UAE -> Value.UAE
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
                USA -> Known.USA
                DEU -> Known.DEU
                AUS -> Known.AUS
                UAE -> Known.UAE
                else -> throw TelnyxInvalidDataException("Unknown Region: $value")
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
        fun validate(): Region = apply {
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

            return other is Region && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Arbitrary metadata attached to the record at ingestion time. Filterable via
     * filter[field]=value query parameters.
     */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiListConversationHistoriesResponse &&
            id == other.id &&
            chunkIndex == other.chunkIndex &&
            chunkTotal == other.chunkTotal &&
            ingestedAt == other.ingestedAt &&
            organizationId == other.organizationId &&
            recordCreatedAt == other.recordCreatedAt &&
            recordId == other.recordId &&
            region == other.region &&
            score == other.score &&
            text == other.text &&
            userId == other.userId &&
            metadata == other.metadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chunkIndex,
            chunkTotal,
            ingestedAt,
            organizationId,
            recordCreatedAt,
            recordId,
            region,
            score,
            text,
            userId,
            metadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AiListConversationHistoriesResponse{id=$id, chunkIndex=$chunkIndex, chunkTotal=$chunkTotal, ingestedAt=$ingestedAt, organizationId=$organizationId, recordCreatedAt=$recordCreatedAt, recordId=$recordId, region=$region, score=$score, text=$text, userId=$userId, metadata=$metadata, additionalProperties=$additionalProperties}"
}
