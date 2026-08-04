// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = EmailBlockListPageResponse.Deserializer::class)
@JsonSerialize(using = EmailBlockListPageResponse.Serializer::class)
class EmailBlockListPageResponse
private constructor(
    private val offset: EmailBlockListOffsetResponse? = null,
    private val cursor: EmailBlockListCursorResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun offset(): Optional<EmailBlockListOffsetResponse> = Optional.ofNullable(offset)

    fun cursor(): Optional<EmailBlockListCursorResponse> = Optional.ofNullable(cursor)

    fun isOffset(): Boolean = offset != null

    fun isCursor(): Boolean = cursor != null

    fun asOffset(): EmailBlockListOffsetResponse = offset.getOrThrow("offset")

    fun asCursor(): EmailBlockListCursorResponse = cursor.getOrThrow("cursor")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.telnyx.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = emailBlockListPageResponse.accept(new EmailBlockListPageResponse.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitOffset(EmailBlockListOffsetResponse offset) {
     *         return Optional.of(offset.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            offset != null -> visitor.visitOffset(offset)
            cursor != null -> visitor.visitCursor(cursor)
            else -> visitor.unknown(_json)
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
    fun validate(): EmailBlockListPageResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitOffset(offset: EmailBlockListOffsetResponse) {
                    offset.validate()
                }

                override fun visitCursor(cursor: EmailBlockListCursorResponse) {
                    cursor.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitOffset(offset: EmailBlockListOffsetResponse) = offset.validity()

                override fun visitCursor(cursor: EmailBlockListCursorResponse) = cursor.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailBlockListPageResponse &&
            offset == other.offset &&
            cursor == other.cursor
    }

    override fun hashCode(): Int = Objects.hash(offset, cursor)

    override fun toString(): String =
        when {
            offset != null -> "EmailBlockListPageResponse{offset=$offset}"
            cursor != null -> "EmailBlockListPageResponse{cursor=$cursor}"
            _json != null -> "EmailBlockListPageResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EmailBlockListPageResponse")
        }

    companion object {

        @JvmStatic
        fun ofOffset(offset: EmailBlockListOffsetResponse) =
            EmailBlockListPageResponse(offset = offset)

        @JvmStatic
        fun ofCursor(cursor: EmailBlockListCursorResponse) =
            EmailBlockListPageResponse(cursor = cursor)
    }

    /**
     * An interface that defines how to map each variant of [EmailBlockListPageResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitOffset(offset: EmailBlockListOffsetResponse): T

        fun visitCursor(cursor: EmailBlockListCursorResponse): T

        /**
         * Maps an unknown variant of [EmailBlockListPageResponse] to a value of type [T].
         *
         * An instance of [EmailBlockListPageResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown EmailBlockListPageResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<EmailBlockListPageResponse>(EmailBlockListPageResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EmailBlockListPageResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<EmailBlockListOffsetResponse>())?.let {
                            EmailBlockListPageResponse(offset = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<EmailBlockListCursorResponse>())?.let {
                            EmailBlockListPageResponse(cursor = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> EmailBlockListPageResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<EmailBlockListPageResponse>(EmailBlockListPageResponse::class) {

        override fun serialize(
            value: EmailBlockListPageResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.offset != null -> generator.writeObject(value.offset)
                value.cursor != null -> generator.writeObject(value.cursor)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EmailBlockListPageResponse")
            }
        }
    }

    class EmailBlockListOffsetResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<EmailBlock>>,
        private val meta: JsonField<OffsetMeta>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<EmailBlock>> = JsonMissing.of(),
            @JsonProperty("meta") @ExcludeMissing meta: JsonField<OffsetMeta> = JsonMissing.of(),
        ) : this(data, meta, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): List<EmailBlock> = data.getRequired("data")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meta(): OffsetMeta = meta.getRequired("meta")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<EmailBlock>> = data

        /**
         * Returns the raw JSON value of [meta].
         *
         * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<OffsetMeta> = meta

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
             * [EmailBlockListOffsetResponse].
             *
             * The following fields are required:
             * ```java
             * .data()
             * .meta()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EmailBlockListOffsetResponse]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<EmailBlock>>? = null
            private var meta: JsonField<OffsetMeta>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(emailBlockListOffsetResponse: EmailBlockListOffsetResponse) = apply {
                data = emailBlockListOffsetResponse.data.map { it.toMutableList() }
                meta = emailBlockListOffsetResponse.meta
                additionalProperties =
                    emailBlockListOffsetResponse.additionalProperties.toMutableMap()
            }

            fun data(data: List<EmailBlock>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<EmailBlock>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<EmailBlock>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmailBlock] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: EmailBlock) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            fun meta(meta: OffsetMeta) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [OffsetMeta] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meta(meta: JsonField<OffsetMeta>) = apply { this.meta = meta }

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
             * Returns an immutable instance of [EmailBlockListOffsetResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .data()
             * .meta()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EmailBlockListOffsetResponse =
                EmailBlockListOffsetResponse(
                    checkRequired("data", data).map { it.toImmutable() },
                    checkRequired("meta", meta),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): EmailBlockListOffsetResponse = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            meta().validate()
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
            (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (meta.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EmailBlockListOffsetResponse &&
                data == other.data &&
                meta == other.meta &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmailBlockListOffsetResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
    }

    class EmailBlockListCursorResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<EmailBlock>>,
        private val meta: JsonField<Meta>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<EmailBlock>> = JsonMissing.of(),
            @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        ) : this(data, meta, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): List<EmailBlock> = data.getRequired("data")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meta(): Meta = meta.getRequired("meta")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<EmailBlock>> = data

        /**
         * Returns the raw JSON value of [meta].
         *
         * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
             * [EmailBlockListCursorResponse].
             *
             * The following fields are required:
             * ```java
             * .data()
             * .meta()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EmailBlockListCursorResponse]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<EmailBlock>>? = null
            private var meta: JsonField<Meta>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(emailBlockListCursorResponse: EmailBlockListCursorResponse) = apply {
                data = emailBlockListCursorResponse.data.map { it.toMutableList() }
                meta = emailBlockListCursorResponse.meta
                additionalProperties =
                    emailBlockListCursorResponse.additionalProperties.toMutableMap()
            }

            fun data(data: List<EmailBlock>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<EmailBlock>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<EmailBlock>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmailBlock] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: EmailBlock) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            fun meta(meta: Meta) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
             * Returns an immutable instance of [EmailBlockListCursorResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .data()
             * .meta()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EmailBlockListCursorResponse =
                EmailBlockListCursorResponse(
                    checkRequired("data", data).map { it.toImmutable() },
                    checkRequired("meta", meta),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): EmailBlockListCursorResponse = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            meta().validate()
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
            (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (meta.asKnown().getOrNull()?.validity() ?: 0)

        class Meta
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val hasNext: JsonField<Boolean>,
            private val hasPrevious: JsonField<Boolean>,
            private val pageSize: JsonField<Long>,
            private val nextCursor: JsonField<String>,
            private val previousCursor: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("has_next")
                @ExcludeMissing
                hasNext: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("has_previous")
                @ExcludeMissing
                hasPrevious: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("page_size")
                @ExcludeMissing
                pageSize: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("next_cursor")
                @ExcludeMissing
                nextCursor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("previous_cursor")
                @ExcludeMissing
                previousCursor: JsonField<String> = JsonMissing.of(),
            ) : this(hasNext, hasPrevious, pageSize, nextCursor, previousCursor, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun hasNext(): Boolean = hasNext.getRequired("has_next")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun hasPrevious(): Boolean = hasPrevious.getRequired("has_previous")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pageSize(): Long = pageSize.getRequired("page_size")

            /**
             * Omitted when `has_next` is false.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

            /**
             * Omitted when `has_previous` is false.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun previousCursor(): Optional<String> = previousCursor.getOptional("previous_cursor")

            /**
             * Returns the raw JSON value of [hasNext].
             *
             * Unlike [hasNext], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("has_next") @ExcludeMissing fun _hasNext(): JsonField<Boolean> = hasNext

            /**
             * Returns the raw JSON value of [hasPrevious].
             *
             * Unlike [hasPrevious], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("has_previous")
            @ExcludeMissing
            fun _hasPrevious(): JsonField<Boolean> = hasPrevious

            /**
             * Returns the raw JSON value of [pageSize].
             *
             * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

            /**
             * Returns the raw JSON value of [nextCursor].
             *
             * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("next_cursor")
            @ExcludeMissing
            fun _nextCursor(): JsonField<String> = nextCursor

            /**
             * Returns the raw JSON value of [previousCursor].
             *
             * Unlike [previousCursor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("previous_cursor")
            @ExcludeMissing
            fun _previousCursor(): JsonField<String> = previousCursor

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
                 * Returns a mutable builder for constructing an instance of [Meta].
                 *
                 * The following fields are required:
                 * ```java
                 * .hasNext()
                 * .hasPrevious()
                 * .pageSize()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Meta]. */
            class Builder internal constructor() {

                private var hasNext: JsonField<Boolean>? = null
                private var hasPrevious: JsonField<Boolean>? = null
                private var pageSize: JsonField<Long>? = null
                private var nextCursor: JsonField<String> = JsonMissing.of()
                private var previousCursor: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(meta: Meta) = apply {
                    hasNext = meta.hasNext
                    hasPrevious = meta.hasPrevious
                    pageSize = meta.pageSize
                    nextCursor = meta.nextCursor
                    previousCursor = meta.previousCursor
                    additionalProperties = meta.additionalProperties.toMutableMap()
                }

                fun hasNext(hasNext: Boolean) = hasNext(JsonField.of(hasNext))

                /**
                 * Sets [Builder.hasNext] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasNext] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasNext(hasNext: JsonField<Boolean>) = apply { this.hasNext = hasNext }

                fun hasPrevious(hasPrevious: Boolean) = hasPrevious(JsonField.of(hasPrevious))

                /**
                 * Sets [Builder.hasPrevious] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasPrevious] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasPrevious(hasPrevious: JsonField<Boolean>) = apply {
                    this.hasPrevious = hasPrevious
                }

                fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

                /**
                 * Sets [Builder.pageSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageSize] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

                /** Omitted when `has_next` is false. */
                fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

                /**
                 * Sets [Builder.nextCursor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nextCursor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nextCursor(nextCursor: JsonField<String>) = apply {
                    this.nextCursor = nextCursor
                }

                /** Omitted when `has_previous` is false. */
                fun previousCursor(previousCursor: String) =
                    previousCursor(JsonField.of(previousCursor))

                /**
                 * Sets [Builder.previousCursor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.previousCursor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun previousCursor(previousCursor: JsonField<String>) = apply {
                    this.previousCursor = previousCursor
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Meta].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .hasNext()
                 * .hasPrevious()
                 * .pageSize()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Meta =
                    Meta(
                        checkRequired("hasNext", hasNext),
                        checkRequired("hasPrevious", hasPrevious),
                        checkRequired("pageSize", pageSize),
                        nextCursor,
                        previousCursor,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Meta = apply {
                if (validated) {
                    return@apply
                }

                hasNext()
                hasPrevious()
                pageSize()
                nextCursor()
                previousCursor()
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
                (if (hasNext.asKnown().isPresent) 1 else 0) +
                    (if (hasPrevious.asKnown().isPresent) 1 else 0) +
                    (if (pageSize.asKnown().isPresent) 1 else 0) +
                    (if (nextCursor.asKnown().isPresent) 1 else 0) +
                    (if (previousCursor.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Meta &&
                    hasNext == other.hasNext &&
                    hasPrevious == other.hasPrevious &&
                    pageSize == other.pageSize &&
                    nextCursor == other.nextCursor &&
                    previousCursor == other.previousCursor &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    hasNext,
                    hasPrevious,
                    pageSize,
                    nextCursor,
                    previousCursor,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Meta{hasNext=$hasNext, hasPrevious=$hasPrevious, pageSize=$pageSize, nextCursor=$nextCursor, previousCursor=$previousCursor, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EmailBlockListCursorResponse &&
                data == other.data &&
                meta == other.meta &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmailBlockListCursorResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
    }
}
