// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages

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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates the explicit read state of an account-scoped inbound message. Set `read_at` to `true` to
 * mark the message read at the server's current time, to an ISO 8601 timestamp to use that
 * timestamp, or to `null` to mark the message unread. Repeating the same update is idempotent.
 */
class MessageUpdateParams
private constructor(
    private val inboxId: String,
    private val messageId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): String = inboxId

    fun messageId(): Optional<String> = Optional.ofNullable(messageId)

    /**
     * Set to `true` for server time, an ISO 8601 timestamp for an explicit read time, or `null` to
     * mark unread.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readAt(): ReadAt = body.readAt()

    /**
     * Returns the raw JSON value of [readAt].
     *
     * Unlike [readAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readAt(): JsonField<ReadAt> = body._readAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .readAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageUpdateParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var messageId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageUpdateParams: MessageUpdateParams) = apply {
            inboxId = messageUpdateParams.inboxId
            messageId = messageUpdateParams.messageId
            body = messageUpdateParams.body.toBuilder()
            additionalHeaders = messageUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageUpdateParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String) = apply { this.inboxId = inboxId }

        fun messageId(messageId: String?) = apply { this.messageId = messageId }

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [readAt]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Set to `true` for server time, an ISO 8601 timestamp for an explicit read time, or `null`
         * to mark unread.
         */
        fun readAt(readAt: ReadAt) = apply { body.readAt(readAt) }

        /**
         * Sets [Builder.readAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readAt] with a well-typed [ReadAt] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun readAt(readAt: JsonField<ReadAt>) = apply { body.readAt(readAt) }

        /** Alias for calling [readAt] with `ReadAt.ofUnionMember0(unionMember0)`. */
        fun readAt(unionMember0: ReadAt.UnionMember0) = apply { body.readAt(unionMember0) }

        /** Alias for calling [readAt] with `ReadAt.ofOffsetDateTime(offsetDateTime)`. */
        fun readAt(offsetDateTime: OffsetDateTime) = apply { body.readAt(offsetDateTime) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [MessageUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .readAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageUpdateParams =
            MessageUpdateParams(
                checkRequired("inboxId", inboxId),
                messageId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId
            1 -> messageId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val readAt: JsonField<ReadAt>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("read_at") @ExcludeMissing readAt: JsonField<ReadAt> = JsonMissing.of()
        ) : this(readAt, mutableMapOf())

        /**
         * Set to `true` for server time, an ISO 8601 timestamp for an explicit read time, or `null`
         * to mark unread.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun readAt(): ReadAt = readAt.getRequired("read_at")

        /**
         * Returns the raw JSON value of [readAt].
         *
         * Unlike [readAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("read_at") @ExcludeMissing fun _readAt(): JsonField<ReadAt> = readAt

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .readAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var readAt: JsonField<ReadAt>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                readAt = body.readAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Set to `true` for server time, an ISO 8601 timestamp for an explicit read time, or
             * `null` to mark unread.
             */
            fun readAt(readAt: ReadAt) = readAt(JsonField.of(readAt))

            /**
             * Sets [Builder.readAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readAt] with a well-typed [ReadAt] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readAt(readAt: JsonField<ReadAt>) = apply { this.readAt = readAt }

            /** Alias for calling [readAt] with `ReadAt.ofUnionMember0(unionMember0)`. */
            fun readAt(unionMember0: ReadAt.UnionMember0) =
                readAt(ReadAt.ofUnionMember0(unionMember0))

            /** Alias for calling [readAt] with `ReadAt.ofOffsetDateTime(offsetDateTime)`. */
            fun readAt(offsetDateTime: OffsetDateTime) =
                readAt(ReadAt.ofOffsetDateTime(offsetDateTime))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .readAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("readAt", readAt), additionalProperties.toMutableMap())
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

            readAt().validate()
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
        @JvmSynthetic internal fun validity(): Int = (readAt.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                readAt == other.readAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(readAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{readAt=$readAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Set to `true` for server time, an ISO 8601 timestamp for an explicit read time, or `null` to
     * mark unread.
     */
    @JsonDeserialize(using = ReadAt.Deserializer::class)
    @JsonSerialize(using = ReadAt.Serializer::class)
    class ReadAt
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val offsetDateTime: OffsetDateTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

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
         * Optional<String> result = readAt.accept(new ReadAt.Visitor<Optional<String>>() {
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
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
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
        fun validate(): ReadAt = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}
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

                    override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReadAt &&
                unionMember0 == other.unionMember0 &&
                offsetDateTime == other.offsetDateTime
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, offsetDateTime)

        override fun toString(): String =
            when {
                unionMember0 != null -> "ReadAt{unionMember0=$unionMember0}"
                offsetDateTime != null -> "ReadAt{offsetDateTime=$offsetDateTime}"
                _json != null -> "ReadAt{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ReadAt")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = ReadAt(unionMember0 = unionMember0)

            @JvmStatic
            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                ReadAt(offsetDateTime = offsetDateTime)
        }

        /** An interface that defines how to map each variant of [ReadAt] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            /**
             * Maps an unknown variant of [ReadAt] to a value of type [T].
             *
             * An instance of [ReadAt] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown ReadAt: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ReadAt>(ReadAt::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ReadAt {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                ReadAt(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                ReadAt(offsetDateTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from integer).
                    0 -> ReadAt(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ReadAt>(ReadAt::class) {

            override fun serialize(
                value: ReadAt,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ReadAt")
                }
            }
        }

        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<Boolean>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

            companion object {

                @JvmField val TRUE = of(true)

                @JvmStatic fun of(value: Boolean) = UnionMember0(JsonField.of(value))
            }

            /** An enum containing [UnionMember0]'s known values. */
            enum class Known {
                TRUE
            }

            /**
             * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRUE,
                /**
                 * An enum member indicating that [UnionMember0] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TRUE -> Value.TRUE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TRUE -> Known.TRUE
                    else -> throw TelnyxInvalidDataException("Unknown UnionMember0: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asBoolean(): Boolean =
                _value().asBoolean().orElseThrow {
                    TelnyxInvalidDataException("Value is not a Boolean")
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

                return other is UnionMember0 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageUpdateParams &&
            inboxId == other.inboxId &&
            messageId == other.messageId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inboxId, messageId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageUpdateParams{inboxId=$inboxId, messageId=$messageId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
