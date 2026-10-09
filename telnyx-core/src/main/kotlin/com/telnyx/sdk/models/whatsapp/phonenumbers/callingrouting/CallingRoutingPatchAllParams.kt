// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting

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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set or clear the connection that inbound WhatsApp calls to a BYON (Bring Your Own Number) phone
 * number are delivered to.
 *
 * The update is processed asynchronously. A `202` response means the request was accepted, not that
 * the routing changed. Check the result with `GET /whatsapp/phone_numbers/{id}/calling_routing`,
 * which can return the previous value immediately after an update. An update for a number that is
 * not a WhatsApp Calling number in the account returns 404.
 *
 * The connection must belong to the same account and must not be a WhatsApp connection. Send
 * `connection_id: null` to clear the routing; omitting `connection_id` is rejected. Numbers active
 * on Telnyx are rejected, because they route through their own connection assignment.
 *
 * Sub-users need update permission on connections, and read permission to check the result with
 * `GET`.
 */
class CallingRoutingPatchAllParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
     * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large IDs
     * exact. Non-null values are returned as strings. `null` clears the routing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<ConnectionId> = body.connectionId()

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionId(): JsonField<ConnectionId> = body._connectionId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallingRoutingPatchAllParams].
         *
         * The following fields are required:
         * ```java
         * .connectionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallingRoutingPatchAllParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callingRoutingPatchAllParams: CallingRoutingPatchAllParams) = apply {
            id = callingRoutingPatchAllParams.id
            body = callingRoutingPatchAllParams.body.toBuilder()
            additionalHeaders = callingRoutingPatchAllParams.additionalHeaders.toBuilder()
            additionalQueryParams = callingRoutingPatchAllParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [connectionId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
         * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large
         * IDs exact. Non-null values are returned as strings. `null` clears the routing.
         */
        fun connectionId(connectionId: ConnectionId?) = apply { body.connectionId(connectionId) }

        /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
        fun connectionId(connectionId: Optional<ConnectionId>) =
            connectionId(connectionId.getOrNull())

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [ConnectionId] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionId(connectionId: JsonField<ConnectionId>) = apply {
            body.connectionId(connectionId)
        }

        /** Alias for calling [connectionId] with `ConnectionId.ofString(string)`. */
        fun connectionId(string: String) = apply { body.connectionId(string) }

        /** Alias for calling [connectionId] with `ConnectionId.ofInteger(integer)`. */
        fun connectionId(integer: Long) = apply { body.connectionId(integer) }

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
         * Returns an immutable instance of [CallingRoutingPatchAllParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .connectionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallingRoutingPatchAllParams =
            CallingRoutingPatchAllParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connectionId: JsonField<ConnectionId>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<ConnectionId> = JsonMissing.of()
        ) : this(connectionId, mutableMapOf())

        /**
         * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
         * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large
         * IDs exact. Non-null values are returned as strings. `null` clears the routing.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<ConnectionId> = connectionId.getOptional("connection_id")

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<ConnectionId> = connectionId

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
             * .connectionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var connectionId: JsonField<ConnectionId>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                connectionId = body.connectionId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
             * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep
             * large IDs exact. Non-null values are returned as strings. `null` clears the routing.
             */
            fun connectionId(connectionId: ConnectionId?) =
                connectionId(JsonField.ofNullable(connectionId))

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<ConnectionId>) =
                connectionId(connectionId.getOrNull())

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [ConnectionId] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<ConnectionId>) = apply {
                this.connectionId = connectionId
            }

            /** Alias for calling [connectionId] with `ConnectionId.ofString(string)`. */
            fun connectionId(string: String) = connectionId(ConnectionId.ofString(string))

            /** Alias for calling [connectionId] with `ConnectionId.ofInteger(integer)`. */
            fun connectionId(integer: Long) = connectionId(ConnectionId.ofInteger(integer))

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
             * .connectionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("connectionId", connectionId),
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            connectionId().ifPresent { it.validate() }
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
        internal fun validity(): Int = (connectionId.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                connectionId == other.connectionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(connectionId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{connectionId=$connectionId, additionalProperties=$additionalProperties}"
    }

    /**
     * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
     * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large IDs
     * exact. Non-null values are returned as strings. `null` clears the routing.
     */
    @JsonDeserialize(using = ConnectionId.Deserializer::class)
    @JsonSerialize(using = ConnectionId.Serializer::class)
    class ConnectionId
    private constructor(
        private val string: String? = null,
        private val integer: Long? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
         * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large
         * IDs exact. Non-null values are returned as strings. `null` clears the routing.
         */
        fun string(): Optional<String> = Optional.ofNullable(string)

        /**
         * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
         * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large
         * IDs exact. Non-null values are returned as strings. `null` clears the routing.
         */
        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun isString(): Boolean = string != null

        fun isInteger(): Boolean = integer != null

        /**
         * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
         * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large
         * IDs exact. Non-null values are returned as strings. `null` clears the routing.
         */
        fun asString(): String = string.getOrThrow("string")

        /**
         * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
         * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep large
         * IDs exact. Non-null values are returned as strings. `null` clears the routing.
         */
        fun asInteger(): Long = integer.getOrThrow("integer")

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
         * Optional<String> result = connectionId.accept(new ConnectionId.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
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
                string != null -> visitor.visitString(string)
                integer != null -> visitor.visitInteger(integer)
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
        fun validate(): ConnectionId = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitInteger(integer: Long) {}
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
                    override fun visitString(string: String) = 1

                    override fun visitInteger(integer: Long) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectionId && string == other.string && integer == other.integer
        }

        override fun hashCode(): Int = Objects.hash(string, integer)

        override fun toString(): String =
            when {
                string != null -> "ConnectionId{string=$string}"
                integer != null -> "ConnectionId{integer=$integer}"
                _json != null -> "ConnectionId{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ConnectionId")
            }

        companion object {

            /**
             * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
             * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep
             * large IDs exact. Non-null values are returned as strings. `null` clears the routing.
             */
            @JvmStatic fun ofString(string: String) = ConnectionId(string = string)

            /**
             * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
             * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep
             * large IDs exact. Non-null values are returned as strings. `null` clears the routing.
             */
            @JvmStatic fun ofInteger(integer: Long) = ConnectionId(integer = integer)
        }

        /**
         * An interface that defines how to map each variant of [ConnectionId] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /**
             * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
             * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep
             * large IDs exact. Non-null values are returned as strings. `null` clears the routing.
             */
            fun visitString(string: String): T

            /**
             * ID of the connection to deliver inbound WhatsApp calls to: a positive integer up to
             * 9223372036854775807, sent as a decimal string or an integer. Send a string to keep
             * large IDs exact. Non-null values are returned as strings. `null` clears the routing.
             */
            fun visitInteger(integer: Long): T

            /**
             * Maps an unknown variant of [ConnectionId] to a value of type [T].
             *
             * An instance of [ConnectionId] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown ConnectionId: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ConnectionId>(ConnectionId::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ConnectionId {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ConnectionId(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                ConnectionId(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ConnectionId(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ConnectionId>(ConnectionId::class) {

            override fun serialize(
                value: ConnectionId,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.integer != null -> generator.writeObject(value.integer)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ConnectionId")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallingRoutingPatchAllParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallingRoutingPatchAllParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
