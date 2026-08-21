// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CollectionRetrieveDocumentsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chunkIndex: JsonField<Long>,
    private val chunkTotal: JsonField<Long>,
    private val ingestedAt: JsonField<OffsetDateTime>,
    private val metadata: JsonField<Metadata>,
    private val organizationId: JsonField<String>,
    private val recordCreatedAt: JsonField<OffsetDateTime>,
    private val recordId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val region: JsonField<String>,
    private val score: JsonField<Float>,
    private val text: JsonField<String>,
    private val userId: JsonField<String>,
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
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_created_at")
        @ExcludeMissing
        recordCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_id") @ExcludeMissing recordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("score") @ExcludeMissing score: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        chunkIndex,
        chunkTotal,
        ingestedAt,
        metadata,
        organizationId,
        recordCreatedAt,
        recordId,
        recordType,
        region,
        score,
        text,
        userId,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunkIndex(): Optional<Long> = chunkIndex.getOptional("chunk_index")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunkTotal(): Optional<Long> = chunkTotal.getOptional("chunk_total")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ingestedAt(): Optional<OffsetDateTime> = ingestedAt.getOptional("ingested_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordCreatedAt(): Optional<OffsetDateTime> =
        recordCreatedAt.getOptional("record_created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordId(): Optional<String> = recordId.getOptional("record_id")

    /**
     * The source record kind this chunk came from (e.g. `voice`, `meeting_bot`, `message`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * Relevance score (higher = more relevant) for ranked search. `0.0` for plain catalog listings
     * (when `query` is omitted).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun score(): Optional<Float> = score.getOptional("score")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

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
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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
         * [CollectionRetrieveDocumentsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionRetrieveDocumentsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var chunkIndex: JsonField<Long> = JsonMissing.of()
        private var chunkTotal: JsonField<Long> = JsonMissing.of()
        private var ingestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var recordCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var recordId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var score: JsonField<Float> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            collectionRetrieveDocumentsResponse: CollectionRetrieveDocumentsResponse
        ) = apply {
            id = collectionRetrieveDocumentsResponse.id
            chunkIndex = collectionRetrieveDocumentsResponse.chunkIndex
            chunkTotal = collectionRetrieveDocumentsResponse.chunkTotal
            ingestedAt = collectionRetrieveDocumentsResponse.ingestedAt
            metadata = collectionRetrieveDocumentsResponse.metadata
            organizationId = collectionRetrieveDocumentsResponse.organizationId
            recordCreatedAt = collectionRetrieveDocumentsResponse.recordCreatedAt
            recordId = collectionRetrieveDocumentsResponse.recordId
            recordType = collectionRetrieveDocumentsResponse.recordType
            region = collectionRetrieveDocumentsResponse.region
            score = collectionRetrieveDocumentsResponse.score
            text = collectionRetrieveDocumentsResponse.text
            userId = collectionRetrieveDocumentsResponse.userId
            additionalProperties =
                collectionRetrieveDocumentsResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun chunkIndex(chunkIndex: Long) = chunkIndex(JsonField.of(chunkIndex))

        /**
         * Sets [Builder.chunkIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkIndex] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chunkIndex(chunkIndex: JsonField<Long>) = apply { this.chunkIndex = chunkIndex }

        fun chunkTotal(chunkTotal: Long) = chunkTotal(JsonField.of(chunkTotal))

        /**
         * Sets [Builder.chunkTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkTotal] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chunkTotal(chunkTotal: JsonField<Long>) = apply { this.chunkTotal = chunkTotal }

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

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        fun recordId(recordId: String) = recordId(JsonField.of(recordId))

        /**
         * Sets [Builder.recordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recordId(recordId: JsonField<String>) = apply { this.recordId = recordId }

        /** The source record kind this chunk came from (e.g. `voice`, `meeting_bot`, `message`). */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /**
         * Relevance score (higher = more relevant) for ranked search. `0.0` for plain catalog
         * listings (when `query` is omitted).
         */
        fun score(score: Float) = score(JsonField.of(score))

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Float>) = apply { this.score = score }

        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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
         * Returns an immutable instance of [CollectionRetrieveDocumentsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CollectionRetrieveDocumentsResponse =
            CollectionRetrieveDocumentsResponse(
                id,
                chunkIndex,
                chunkTotal,
                ingestedAt,
                metadata,
                organizationId,
                recordCreatedAt,
                recordId,
                recordType,
                region,
                score,
                text,
                userId,
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
    fun validate(): CollectionRetrieveDocumentsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        chunkIndex()
        chunkTotal()
        ingestedAt()
        metadata().ifPresent { it.validate() }
        organizationId()
        recordCreatedAt()
        recordId()
        recordType()
        region()
        score()
        text()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (chunkIndex.asKnown().isPresent) 1 else 0) +
            (if (chunkTotal.asKnown().isPresent) 1 else 0) +
            (if (ingestedAt.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (recordCreatedAt.asKnown().isPresent) 1 else 0) +
            (if (recordId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (if (score.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

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

        return other is CollectionRetrieveDocumentsResponse &&
            id == other.id &&
            chunkIndex == other.chunkIndex &&
            chunkTotal == other.chunkTotal &&
            ingestedAt == other.ingestedAt &&
            metadata == other.metadata &&
            organizationId == other.organizationId &&
            recordCreatedAt == other.recordCreatedAt &&
            recordId == other.recordId &&
            recordType == other.recordType &&
            region == other.region &&
            score == other.score &&
            text == other.text &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chunkIndex,
            chunkTotal,
            ingestedAt,
            metadata,
            organizationId,
            recordCreatedAt,
            recordId,
            recordType,
            region,
            score,
            text,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CollectionRetrieveDocumentsResponse{id=$id, chunkIndex=$chunkIndex, chunkTotal=$chunkTotal, ingestedAt=$ingestedAt, metadata=$metadata, organizationId=$organizationId, recordCreatedAt=$recordCreatedAt, recordId=$recordId, recordType=$recordType, region=$region, score=$score, text=$text, userId=$userId, additionalProperties=$additionalProperties}"
}
