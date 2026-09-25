// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
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
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Store a session. Facts are extracted from whatever you send — the body is taken as any JSON value
 * and stored whole, so a framework's own transcript shape works unchanged. `messages` of
 * `role`/`content` is the conventional shape, not a requirement. An empty object or a null body is
 * refused. Carry a `session_id` to name the session: re-ingesting the same one replaces what it
 * held. Omit it and a session is opened and returned. Extraction runs asynchronously — poll the
 * returned operation.
 */
class ProfileIngestParams
private constructor(
    private val namespace: String,
    private val profileId: String?,
    private val sessionId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun namespace(): String = namespace

    fun profileId(): Optional<String> = Optional.ofNullable(profileId)

    /**
     * Names the session. Re-ingesting the same session replaces what it held and keeps its
     * `source_id`. Omit it to have one derived from the content and returned. No whitespace,
     * control characters, or any of / \ # ? %.
     */
    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

    /**
     * The session's messages, in whatever shape your framework produces. Any JSON value but null is
     * accepted and stored whole, as long as it holds something to remember: a body with no content
     * anywhere in it -- `{}`, `[]`, `""`, `{"messages": []}` -- is a 422.
     */
    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProfileIngestParams].
         *
         * The following fields are required:
         * ```java
         * .namespace()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProfileIngestParams]. */
    class Builder internal constructor() {

        private var namespace: String? = null
        private var profileId: String? = null
        private var sessionId: String? = null
        private var body: Body? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(profileIngestParams: ProfileIngestParams) = apply {
            namespace = profileIngestParams.namespace
            profileId = profileIngestParams.profileId
            sessionId = profileIngestParams.sessionId
            body = profileIngestParams.body
            additionalHeaders = profileIngestParams.additionalHeaders.toBuilder()
            additionalQueryParams = profileIngestParams.additionalQueryParams.toBuilder()
        }

        fun namespace(namespace: String) = apply { this.namespace = namespace }

        fun profileId(profileId: String?) = apply { this.profileId = profileId }

        /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
        fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

        /**
         * Names the session. Re-ingesting the same session replaces what it held and keeps its
         * `source_id`. Omit it to have one derived from the content and returned. No whitespace,
         * control characters, or any of / \ # ? %.
         */
        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * The session's messages, in whatever shape your framework produces. Any JSON value but
         * null is accepted and stored whole, as long as it holds something to remember: a body with
         * no content anywhere in it -- `{}`, `[]`, `""`, `{"messages": []}` -- is a 422.
         */
        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofUnionMember0(unionMember0)`. */
        fun body(unionMember0: Body.UnionMember0) = body(Body.ofUnionMember0(unionMember0))

        /** Alias for calling [body] with `Body.ofUnionMember1(unionMember1)`. */
        fun body(unionMember1: Body.UnionMember1) = body(Body.ofUnionMember1(unionMember1))

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ProfileIngestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .namespace()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProfileIngestParams =
            ProfileIngestParams(
                checkRequired("namespace", namespace),
                profileId,
                sessionId,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> namespace
            1 -> profileId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                sessionId?.let { put("session_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * The session's messages, in whatever shape your framework produces. Any JSON value but null is
     * accepted and stored whole, as long as it holds something to remember: a body with no content
     * anywhere in it -- `{}`, `[]`, `""`, `{"messages": []}` -- is a 422.
     */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
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
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = body.accept(new Body.Visitor<Optional<String>>() {
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
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
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

            return other is Body &&
                unionMember0 == other.unionMember0 &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Body{unionMember0=$unionMember0}"
                unionMember1 != null -> "Body{unionMember1=$unionMember1}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Body(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Body(unionMember1 = unionMember1)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Body(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Body(unionMember1 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
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
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && additionalProperties == other.additionalProperties
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
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
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
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
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
                        override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

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
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
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
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> UnionMember1(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
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

        return other is ProfileIngestParams &&
            namespace == other.namespace &&
            profileId == other.profileId &&
            sessionId == other.sessionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            namespace,
            profileId,
            sessionId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ProfileIngestParams{namespace=$namespace, profileId=$profileId, sessionId=$sessionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
