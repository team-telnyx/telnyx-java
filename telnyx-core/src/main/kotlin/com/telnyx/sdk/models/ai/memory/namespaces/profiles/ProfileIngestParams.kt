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

        /** Alias for calling [body] with `Body.ofIngestPayloadObject(ingestPayloadObject)`. */
        fun body(ingestPayloadObject: Body.IngestPayloadObject) =
            body(Body.ofIngestPayloadObject(ingestPayloadObject))

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
        private val ingestPayloadObject: IngestPayloadObject? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun ingestPayloadObject(): Optional<IngestPayloadObject> =
            Optional.ofNullable(ingestPayloadObject)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isIngestPayloadObject(): Boolean = ingestPayloadObject != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asIngestPayloadObject(): IngestPayloadObject =
            ingestPayloadObject.getOrThrow("ingestPayloadObject")

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
         *     public Optional<String> visitIngestPayloadObject(IngestPayloadObject ingestPayloadObject) {
         *         return Optional.of(ingestPayloadObject.toString());
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
                ingestPayloadObject != null -> visitor.visitIngestPayloadObject(ingestPayloadObject)
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
                    override fun visitIngestPayloadObject(
                        ingestPayloadObject: IngestPayloadObject
                    ) {
                        ingestPayloadObject.validate()
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
                    override fun visitIngestPayloadObject(
                        ingestPayloadObject: IngestPayloadObject
                    ) = ingestPayloadObject.validity()

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
                ingestPayloadObject == other.ingestPayloadObject &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(ingestPayloadObject, unionMember1)

        override fun toString(): String =
            when {
                ingestPayloadObject != null -> "Body{ingestPayloadObject=$ingestPayloadObject}"
                unionMember1 != null -> "Body{unionMember1=$unionMember1}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofIngestPayloadObject(ingestPayloadObject: IngestPayloadObject) =
                Body(ingestPayloadObject = ingestPayloadObject)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Body(unionMember1 = unionMember1)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitIngestPayloadObject(ingestPayloadObject: IngestPayloadObject): T

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
                            tryDeserialize(node, jacksonTypeRef<IngestPayloadObject>())?.let {
                                Body(ingestPayloadObject = it, _json = json)
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
                    value.ingestPayloadObject != null ->
                        generator.writeObject(value.ingestPayloadObject)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class IngestPayloadObject
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

                /**
                 * Returns a mutable builder for constructing an instance of [IngestPayloadObject].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [IngestPayloadObject]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ingestPayloadObject: IngestPayloadObject) = apply {
                    additionalProperties = ingestPayloadObject.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [IngestPayloadObject].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): IngestPayloadObject =
                    IngestPayloadObject(additionalProperties.toImmutable())
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
            fun validate(): IngestPayloadObject = apply {
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

                return other is IngestPayloadObject &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IngestPayloadObject{additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = UnionMember1.Deserializer::class)
        @JsonSerialize(using = UnionMember1.Serializer::class)
        class UnionMember1
        private constructor(
            private val ingestPayloadValue: List<JsonValue>? = null,
            private val ingestPayloadValue2: String? = null,
            private val ingestPayloadValue3: Double? = null,
            private val ingestPayloadValue4: Boolean? = null,
            private val _json: JsonValue? = null,
        ) {

            fun ingestPayloadValue(): Optional<List<JsonValue>> =
                Optional.ofNullable(ingestPayloadValue)

            fun ingestPayloadValue2(): Optional<String> = Optional.ofNullable(ingestPayloadValue2)

            fun ingestPayloadValue3(): Optional<Double> = Optional.ofNullable(ingestPayloadValue3)

            fun ingestPayloadValue4(): Optional<Boolean> = Optional.ofNullable(ingestPayloadValue4)

            fun isIngestPayloadValue(): Boolean = ingestPayloadValue != null

            fun isIngestPayloadValue2(): Boolean = ingestPayloadValue2 != null

            fun isIngestPayloadValue3(): Boolean = ingestPayloadValue3 != null

            fun isIngestPayloadValue4(): Boolean = ingestPayloadValue4 != null

            fun asIngestPayloadValue(): List<JsonValue> =
                ingestPayloadValue.getOrThrow("ingestPayloadValue")

            fun asIngestPayloadValue2(): String =
                ingestPayloadValue2.getOrThrow("ingestPayloadValue2")

            fun asIngestPayloadValue3(): Double =
                ingestPayloadValue3.getOrThrow("ingestPayloadValue3")

            fun asIngestPayloadValue4(): Boolean =
                ingestPayloadValue4.getOrThrow("ingestPayloadValue4")

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
             *     public Optional<String> visitIngestPayloadValue(List<JsonValue> ingestPayloadValue) {
             *         return Optional.of(ingestPayloadValue.toString());
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
                    ingestPayloadValue != null ->
                        visitor.visitIngestPayloadValue(ingestPayloadValue)
                    ingestPayloadValue2 != null ->
                        visitor.visitIngestPayloadValue2(ingestPayloadValue2)
                    ingestPayloadValue3 != null ->
                        visitor.visitIngestPayloadValue3(ingestPayloadValue3)
                    ingestPayloadValue4 != null ->
                        visitor.visitIngestPayloadValue4(ingestPayloadValue4)
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
                        override fun visitIngestPayloadValue(ingestPayloadValue: List<JsonValue>) {}

                        override fun visitIngestPayloadValue2(ingestPayloadValue2: String) {}

                        override fun visitIngestPayloadValue3(ingestPayloadValue3: Double) {}

                        override fun visitIngestPayloadValue4(ingestPayloadValue4: Boolean) {}
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
                        override fun visitIngestPayloadValue(ingestPayloadValue: List<JsonValue>) =
                            ingestPayloadValue.size

                        override fun visitIngestPayloadValue2(ingestPayloadValue2: String) = 1

                        override fun visitIngestPayloadValue3(ingestPayloadValue3: Double) = 1

                        override fun visitIngestPayloadValue4(ingestPayloadValue4: Boolean) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    ingestPayloadValue == other.ingestPayloadValue &&
                    ingestPayloadValue2 == other.ingestPayloadValue2 &&
                    ingestPayloadValue3 == other.ingestPayloadValue3 &&
                    ingestPayloadValue4 == other.ingestPayloadValue4
            }

            override fun hashCode(): Int =
                Objects.hash(
                    ingestPayloadValue,
                    ingestPayloadValue2,
                    ingestPayloadValue3,
                    ingestPayloadValue4,
                )

            override fun toString(): String =
                when {
                    ingestPayloadValue != null ->
                        "UnionMember1{ingestPayloadValue=$ingestPayloadValue}"
                    ingestPayloadValue2 != null ->
                        "UnionMember1{ingestPayloadValue2=$ingestPayloadValue2}"
                    ingestPayloadValue3 != null ->
                        "UnionMember1{ingestPayloadValue3=$ingestPayloadValue3}"
                    ingestPayloadValue4 != null ->
                        "UnionMember1{ingestPayloadValue4=$ingestPayloadValue4}"
                    _json != null -> "UnionMember1{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid UnionMember1")
                }

            companion object {

                @JvmStatic
                fun ofIngestPayloadValue(ingestPayloadValue: List<JsonValue>) =
                    UnionMember1(ingestPayloadValue = ingestPayloadValue.toImmutable())

                @JvmStatic
                fun ofIngestPayloadValue2(ingestPayloadValue2: String) =
                    UnionMember1(ingestPayloadValue2 = ingestPayloadValue2)

                @JvmStatic
                fun ofIngestPayloadValue3(ingestPayloadValue3: Double) =
                    UnionMember1(ingestPayloadValue3 = ingestPayloadValue3)

                @JvmStatic
                fun ofIngestPayloadValue4(ingestPayloadValue4: Boolean) =
                    UnionMember1(ingestPayloadValue4 = ingestPayloadValue4)
            }

            /**
             * An interface that defines how to map each variant of [UnionMember1] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitIngestPayloadValue(ingestPayloadValue: List<JsonValue>): T

                fun visitIngestPayloadValue2(ingestPayloadValue2: String): T

                fun visitIngestPayloadValue3(ingestPayloadValue3: Double): T

                fun visitIngestPayloadValue4(ingestPayloadValue4: Boolean): T

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
                                    UnionMember1(ingestPayloadValue2 = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                    UnionMember1(ingestPayloadValue = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    UnionMember1(ingestPayloadValue3 = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                    UnionMember1(ingestPayloadValue4 = it, _json = json)
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
                        value.ingestPayloadValue != null ->
                            generator.writeObject(value.ingestPayloadValue)
                        value.ingestPayloadValue2 != null ->
                            generator.writeObject(value.ingestPayloadValue2)
                        value.ingestPayloadValue3 != null ->
                            generator.writeObject(value.ingestPayloadValue3)
                        value.ingestPayloadValue4 != null ->
                            generator.writeObject(value.ingestPayloadValue4)
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
