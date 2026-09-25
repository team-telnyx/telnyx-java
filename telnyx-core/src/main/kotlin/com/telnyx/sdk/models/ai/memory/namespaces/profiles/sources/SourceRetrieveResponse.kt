// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SourceRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [SourceRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sourceRetrieveResponse: SourceRetrieveResponse) = apply {
            data = sourceRetrieveResponse.data
            additionalProperties = sourceRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [SourceRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SourceRetrieveResponse =
            SourceRetrieveResponse(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): SourceRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val content: JsonField<Content>,
        private val memoryCount: JsonField<Long>,
        private val sessionId: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
            @JsonProperty("memory_count")
            @ExcludeMissing
            memoryCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
        ) : this(id, content, memoryCount, sessionId, createdAt, updatedAt, mutableMapOf())

        /**
         * Identifies one source within its profile: an ingested session, or one remembered fact.
         * Returned by `ingest` and `remember` when the write is accepted. Re-ingesting a session
         * keeps its source id.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * What was stored, in the shape it was sent: an ingested JSON body as JSON, a string body
         * or a remembered fact as a string. A session ingested before formats were recorded is
         * returned as the text it was stored as.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): Content = content.getRequired("content")

        /**
         * Memories extracted from this source. A memory derived from several sources is not counted
         * here.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memoryCount(): Long = memoryCount.getRequired("memory_count")

        /**
         * The session this source was ingested as. Null for a remembered fact.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

        /**
         * When the source was first stored.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * When the source was last written; re-ingesting moves it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        /**
         * Returns the raw JSON value of [memoryCount].
         *
         * Unlike [memoryCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memory_count")
        @ExcludeMissing
        fun _memoryCount(): JsonField<Long> = memoryCount

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .content()
             * .memoryCount()
             * .sessionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var content: JsonField<Content>? = null
            private var memoryCount: JsonField<Long>? = null
            private var sessionId: JsonField<String>? = null
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                content = data.content
                memoryCount = data.memoryCount
                sessionId = data.sessionId
                createdAt = data.createdAt
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Identifies one source within its profile: an ingested session, or one remembered
             * fact. Returned by `ingest` and `remember` when the write is accepted. Re-ingesting a
             * session keeps its source id.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * What was stored, in the shape it was sent: an ingested JSON body as JSON, a string
             * body or a remembered fact as a string. A session ingested before formats were
             * recorded is returned as the text it was stored as.
             */
            fun content(content: Content) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

            /** Alias for calling [content] with `Content.ofUnionMember0(unionMember0)`. */
            fun content(unionMember0: Content.UnionMember0) =
                content(Content.ofUnionMember0(unionMember0))

            /** Alias for calling [content] with `Content.ofUnionMember1(unionMember1)`. */
            fun content(unionMember1: Content.UnionMember1) =
                content(Content.ofUnionMember1(unionMember1))

            /**
             * Memories extracted from this source. A memory derived from several sources is not
             * counted here.
             */
            fun memoryCount(memoryCount: Long) = memoryCount(JsonField.of(memoryCount))

            /**
             * Sets [Builder.memoryCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryCount(memoryCount: JsonField<Long>) = apply { this.memoryCount = memoryCount }

            /** The session this source was ingested as. Null for a remembered fact. */
            fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

            /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
            fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            /** When the source was first stored. */
            fun createdAt(createdAt: String?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<String>) = createdAt(createdAt.getOrNull())

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** When the source was last written; re-ingesting moves it. */
            fun updatedAt(updatedAt: String?) = updatedAt(JsonField.ofNullable(updatedAt))

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<String>) = updatedAt(updatedAt.getOrNull())

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .content()
             * .memoryCount()
             * .sessionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("content", content),
                    checkRequired("memoryCount", memoryCount),
                    checkRequired("sessionId", sessionId),
                    createdAt,
                    updatedAt,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            content().validate()
            memoryCount()
            sessionId()
            createdAt()
            updatedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                (if (memoryCount.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /**
         * What was stored, in the shape it was sent: an ingested JSON body as JSON, a string body
         * or a remembered fact as a string. A session ingested before formats were recorded is
         * returned as the text it was stored as.
         */
        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
        private constructor(
            private val unionMember0: UnionMember0? = null,
            private val unionMember1: UnionMember1? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

            fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

            fun isUnionMember0(): Boolean = unionMember0 != null

            fun isUnionMember1(): Boolean = unionMember1 != null

            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

            fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = content.accept(new Content.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
             *         return Optional.of(unionMember0.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                    unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                    else -> visitor.unknown(_json)
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
            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnionMember0(unionMember0: UnionMember0) {
                            unionMember0.validate()
                        }

                        override fun visitUnionMember1(unionMember1: UnionMember1) {
                            unionMember1.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitUnionMember0(unionMember0: UnionMember0) =
                            unionMember0.validity()

                        override fun visitUnionMember1(unionMember1: UnionMember1) =
                            unionMember1.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    unionMember0 == other.unionMember0 &&
                    unionMember1 == other.unionMember1
            }

            override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1)

            override fun toString(): String =
                when {
                    unionMember0 != null -> "Content{unionMember0=$unionMember0}"
                    unionMember1 != null -> "Content{unionMember1=$unionMember1}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) =
                    Content(unionMember0 = unionMember0)

                @JvmStatic
                fun ofUnionMember1(unionMember1: UnionMember1) =
                    Content(unionMember1 = unionMember1)
            }

            /**
             * An interface that defines how to map each variant of [Content] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitUnionMember0(unionMember0: UnionMember0): T

                fun visitUnionMember1(unionMember1: UnionMember1): T

                /**
                 * Maps an unknown variant of [Content] to a value of type [T].
                 *
                 * An instance of [Content] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Content: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                    Content(unionMember0 = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                    Content(unionMember1 = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants.
                        0 -> Content(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Content>(Content::class) {

                override fun serialize(
                    value: Content,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                        value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            class UnionMember0
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

                    /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UnionMember0]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unionMember0: UnionMember0) = apply {
                        additionalProperties = unionMember0.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [UnionMember0].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): UnionMember0 = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnionMember0 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(using = UnionMember1.Deserializer::class)
            @JsonSerialize(using = UnionMember1.Serializer::class)
            class UnionMember1
            private constructor(
                private val jsonValues: List<JsonValue>? = null,
                private val string: String? = null,
                private val number: Double? = null,
                private val bool: Boolean? = null,
                private val _json: JsonValue? = null,
            ) {

                fun jsonValues(): Optional<List<JsonValue>> = Optional.ofNullable(jsonValues)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                fun isJsonValues(): Boolean = jsonValues != null

                fun isString(): Boolean = string != null

                fun isNumber(): Boolean = number != null

                fun isBool(): Boolean = bool != null

                fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

                fun asString(): String = string.getOrThrow("string")

                fun asNumber(): Double = number.getOrThrow("number")

                fun asBool(): Boolean = bool.getOrThrow("bool")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.telnyx.sdk.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = unionMember1.accept(new UnionMember1.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitJsonValues(List<JsonValue> jsonValues) {
                 *         return Optional.of(jsonValues.toString());
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
                 * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        jsonValues != null -> visitor.visitJsonValues(jsonValues)
                        string != null -> visitor.visitString(string)
                        number != null -> visitor.visitNumber(number)
                        bool != null -> visitor.visitBool(bool)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): UnionMember1 = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitJsonValues(jsonValues: List<JsonValue>) {}

                            override fun visitString(string: String) {}

                            override fun visitNumber(number: Double) {}

                            override fun visitBool(bool: Boolean) {}
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitJsonValues(jsonValues: List<JsonValue>) =
                                jsonValues.size

                            override fun visitString(string: String) = 1

                            override fun visitNumber(number: Double) = 1

                            override fun visitBool(bool: Boolean) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnionMember1 &&
                        jsonValues == other.jsonValues &&
                        string == other.string &&
                        number == other.number &&
                        bool == other.bool
                }

                override fun hashCode(): Int = Objects.hash(jsonValues, string, number, bool)

                override fun toString(): String =
                    when {
                        jsonValues != null -> "UnionMember1{jsonValues=$jsonValues}"
                        string != null -> "UnionMember1{string=$string}"
                        number != null -> "UnionMember1{number=$number}"
                        bool != null -> "UnionMember1{bool=$bool}"
                        _json != null -> "UnionMember1{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid UnionMember1")
                    }

                companion object {

                    @JvmStatic
                    fun ofJsonValues(jsonValues: List<JsonValue>) =
                        UnionMember1(jsonValues = jsonValues.toImmutable())

                    @JvmStatic fun ofString(string: String) = UnionMember1(string = string)

                    @JvmStatic fun ofNumber(number: Double) = UnionMember1(number = number)

                    @JvmStatic fun ofBool(bool: Boolean) = UnionMember1(bool = bool)
                }

                /**
                 * An interface that defines how to map each variant of [UnionMember1] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitJsonValues(jsonValues: List<JsonValue>): T

                    fun visitString(string: String): T

                    fun visitNumber(number: Double): T

                    fun visitBool(bool: Boolean): T

                    /**
                     * Maps an unknown variant of [UnionMember1] to a value of type [T].
                     *
                     * An instance of [UnionMember1] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown UnionMember1: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<UnionMember1>(UnionMember1::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): UnionMember1 {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        UnionMember1(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                        UnionMember1(jsonValues = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        UnionMember1(number = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                        UnionMember1(bool = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> UnionMember1(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<UnionMember1>(UnionMember1::class) {

                    override fun serialize(
                        value: UnionMember1,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.jsonValues != null -> generator.writeObject(value.jsonValues)
                            value.string != null -> generator.writeObject(value.string)
                            value.number != null -> generator.writeObject(value.number)
                            value.bool != null -> generator.writeObject(value.bool)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid UnionMember1")
                        }
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                content == other.content &&
                memoryCount == other.memoryCount &&
                sessionId == other.sessionId &&
                createdAt == other.createdAt &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                content,
                memoryCount,
                sessionId,
                createdAt,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, content=$content, memoryCount=$memoryCount, sessionId=$sessionId, createdAt=$createdAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SourceRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SourceRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
