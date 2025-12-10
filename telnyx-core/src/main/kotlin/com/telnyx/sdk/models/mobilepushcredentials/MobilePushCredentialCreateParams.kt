// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new mobile push credential */
class MobilePushCredentialCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobilePushCredentialCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MobilePushCredentialCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mobilePushCredentialCreateParams: MobilePushCredentialCreateParams) =
            apply {
                body = mobilePushCredentialCreateParams.body
                additionalHeaders = mobilePushCredentialCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    mobilePushCredentialCreateParams.additionalQueryParams.toBuilder()
            }

        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofCreateIosPushCredentialRequest(createIosPushCredentialRequest)`.
         */
        fun body(createIosPushCredentialRequest: Body.CreateIosPushCredentialRequest) =
            body(Body.ofCreateIosPushCredentialRequest(createIosPushCredentialRequest))

        /**
         * Alias for calling [body] with
         * `Body.ofCreateAndroidPushCredentialRequest(createAndroidPushCredentialRequest)`.
         */
        fun body(createAndroidPushCredentialRequest: Body.CreateAndroidPushCredentialRequest) =
            body(Body.ofCreateAndroidPushCredentialRequest(createAndroidPushCredentialRequest))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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
         * Returns an immutable instance of [MobilePushCredentialCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MobilePushCredentialCreateParams =
            MobilePushCredentialCreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val createIosPushCredentialRequest: CreateIosPushCredentialRequest? = null,
        private val createAndroidPushCredentialRequest: CreateAndroidPushCredentialRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        fun createIosPushCredentialRequest(): Optional<CreateIosPushCredentialRequest> =
            Optional.ofNullable(createIosPushCredentialRequest)

        fun createAndroidPushCredentialRequest(): Optional<CreateAndroidPushCredentialRequest> =
            Optional.ofNullable(createAndroidPushCredentialRequest)

        fun isCreateIosPushCredentialRequest(): Boolean = createIosPushCredentialRequest != null

        fun isCreateAndroidPushCredentialRequest(): Boolean =
            createAndroidPushCredentialRequest != null

        fun asCreateIosPushCredentialRequest(): CreateIosPushCredentialRequest =
            createIosPushCredentialRequest.getOrThrow("createIosPushCredentialRequest")

        fun asCreateAndroidPushCredentialRequest(): CreateAndroidPushCredentialRequest =
            createAndroidPushCredentialRequest.getOrThrow("createAndroidPushCredentialRequest")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                createIosPushCredentialRequest != null ->
                    visitor.visitCreateIosPushCredentialRequest(createIosPushCredentialRequest)
                createAndroidPushCredentialRequest != null ->
                    visitor.visitCreateAndroidPushCredentialRequest(
                        createAndroidPushCredentialRequest
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCreateIosPushCredentialRequest(
                        createIosPushCredentialRequest: CreateIosPushCredentialRequest
                    ) {
                        createIosPushCredentialRequest.validate()
                    }

                    override fun visitCreateAndroidPushCredentialRequest(
                        createAndroidPushCredentialRequest: CreateAndroidPushCredentialRequest
                    ) {
                        createAndroidPushCredentialRequest.validate()
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
                    override fun visitCreateIosPushCredentialRequest(
                        createIosPushCredentialRequest: CreateIosPushCredentialRequest
                    ) = createIosPushCredentialRequest.validity()

                    override fun visitCreateAndroidPushCredentialRequest(
                        createAndroidPushCredentialRequest: CreateAndroidPushCredentialRequest
                    ) = createAndroidPushCredentialRequest.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                createIosPushCredentialRequest == other.createIosPushCredentialRequest &&
                createAndroidPushCredentialRequest == other.createAndroidPushCredentialRequest
        }

        override fun hashCode(): Int =
            Objects.hash(createIosPushCredentialRequest, createAndroidPushCredentialRequest)

        override fun toString(): String =
            when {
                createIosPushCredentialRequest != null ->
                    "Body{createIosPushCredentialRequest=$createIosPushCredentialRequest}"
                createAndroidPushCredentialRequest != null ->
                    "Body{createAndroidPushCredentialRequest=$createAndroidPushCredentialRequest}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofCreateIosPushCredentialRequest(
                createIosPushCredentialRequest: CreateIosPushCredentialRequest
            ) = Body(createIosPushCredentialRequest = createIosPushCredentialRequest)

            @JvmStatic
            fun ofCreateAndroidPushCredentialRequest(
                createAndroidPushCredentialRequest: CreateAndroidPushCredentialRequest
            ) = Body(createAndroidPushCredentialRequest = createAndroidPushCredentialRequest)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCreateIosPushCredentialRequest(
                createIosPushCredentialRequest: CreateIosPushCredentialRequest
            ): T

            fun visitCreateAndroidPushCredentialRequest(
                createAndroidPushCredentialRequest: CreateAndroidPushCredentialRequest
            ): T

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
                            tryDeserialize(node, jacksonTypeRef<CreateIosPushCredentialRequest>())
                                ?.let { Body(createIosPushCredentialRequest = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<CreateAndroidPushCredentialRequest>(),
                                )
                                ?.let {
                                    Body(createAndroidPushCredentialRequest = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
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
                    value.createIosPushCredentialRequest != null ->
                        generator.writeObject(value.createIosPushCredentialRequest)
                    value.createAndroidPushCredentialRequest != null ->
                        generator.writeObject(value.createAndroidPushCredentialRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class CreateIosPushCredentialRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val alias: JsonField<String>,
            private val certificate: JsonField<String>,
            private val privateKey: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("certificate")
                @ExcludeMissing
                certificate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("private_key")
                @ExcludeMissing
                privateKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(alias, certificate, privateKey, type, mutableMapOf())

            /**
             * Alias to uniquely identify the credential
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun alias(): String = alias.getRequired("alias")

            /**
             * Certificate as received from APNs
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun certificate(): String = certificate.getRequired("certificate")

            /**
             * Corresponding private key to the certificate as received from APNs
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun privateKey(): String = privateKey.getRequired("private_key")

            /**
             * Type of mobile push credential. Should be <code>ios</code> here
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [alias].
             *
             * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

            /**
             * Returns the raw JSON value of [certificate].
             *
             * Unlike [certificate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("certificate")
            @ExcludeMissing
            fun _certificate(): JsonField<String> = certificate

            /**
             * Returns the raw JSON value of [privateKey].
             *
             * Unlike [privateKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("private_key")
            @ExcludeMissing
            fun _privateKey(): JsonField<String> = privateKey

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * [CreateIosPushCredentialRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .certificate()
                 * .privateKey()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreateIosPushCredentialRequest]. */
            class Builder internal constructor() {

                private var alias: JsonField<String>? = null
                private var certificate: JsonField<String>? = null
                private var privateKey: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createIosPushCredentialRequest: CreateIosPushCredentialRequest) =
                    apply {
                        alias = createIosPushCredentialRequest.alias
                        certificate = createIosPushCredentialRequest.certificate
                        privateKey = createIosPushCredentialRequest.privateKey
                        type = createIosPushCredentialRequest.type
                        additionalProperties =
                            createIosPushCredentialRequest.additionalProperties.toMutableMap()
                    }

                /** Alias to uniquely identify the credential */
                fun alias(alias: String) = alias(JsonField.of(alias))

                /**
                 * Sets [Builder.alias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alias] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun alias(alias: JsonField<String>) = apply { this.alias = alias }

                /** Certificate as received from APNs */
                fun certificate(certificate: String) = certificate(JsonField.of(certificate))

                /**
                 * Sets [Builder.certificate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.certificate] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun certificate(certificate: JsonField<String>) = apply {
                    this.certificate = certificate
                }

                /** Corresponding private key to the certificate as received from APNs */
                fun privateKey(privateKey: String) = privateKey(JsonField.of(privateKey))

                /**
                 * Sets [Builder.privateKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privateKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun privateKey(privateKey: JsonField<String>) = apply {
                    this.privateKey = privateKey
                }

                /** Type of mobile push credential. Should be <code>ios</code> here */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [CreateIosPushCredentialRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .certificate()
                 * .privateKey()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreateIosPushCredentialRequest =
                    CreateIosPushCredentialRequest(
                        checkRequired("alias", alias),
                        checkRequired("certificate", certificate),
                        checkRequired("privateKey", privateKey),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreateIosPushCredentialRequest = apply {
                if (validated) {
                    return@apply
                }

                alias()
                certificate()
                privateKey()
                type().validate()
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
                (if (alias.asKnown().isPresent) 1 else 0) +
                    (if (certificate.asKnown().isPresent) 1 else 0) +
                    (if (privateKey.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Type of mobile push credential. Should be <code>ios</code> here */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IOS = of("ios")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    IOS
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IOS,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IOS -> Value.IOS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IOS -> Known.IOS
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreateIosPushCredentialRequest &&
                    alias == other.alias &&
                    certificate == other.certificate &&
                    privateKey == other.privateKey &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(alias, certificate, privateKey, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateIosPushCredentialRequest{alias=$alias, certificate=$certificate, privateKey=$privateKey, type=$type, additionalProperties=$additionalProperties}"
        }

        class CreateAndroidPushCredentialRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val alias: JsonField<String>,
            private val projectAccountJsonFile: JsonField<ProjectAccountJsonFile>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project_account_json_file")
                @ExcludeMissing
                projectAccountJsonFile: JsonField<ProjectAccountJsonFile> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(alias, projectAccountJsonFile, type, mutableMapOf())

            /**
             * Alias to uniquely identify the credential
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun alias(): String = alias.getRequired("alias")

            /**
             * Private key file in JSON format
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun projectAccountJsonFile(): ProjectAccountJsonFile =
                projectAccountJsonFile.getRequired("project_account_json_file")

            /**
             * Type of mobile push credential. Should be <code>android</code> here
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [alias].
             *
             * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

            /**
             * Returns the raw JSON value of [projectAccountJsonFile].
             *
             * Unlike [projectAccountJsonFile], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("project_account_json_file")
            @ExcludeMissing
            fun _projectAccountJsonFile(): JsonField<ProjectAccountJsonFile> =
                projectAccountJsonFile

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * [CreateAndroidPushCredentialRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .projectAccountJsonFile()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreateAndroidPushCredentialRequest]. */
            class Builder internal constructor() {

                private var alias: JsonField<String>? = null
                private var projectAccountJsonFile: JsonField<ProjectAccountJsonFile>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    createAndroidPushCredentialRequest: CreateAndroidPushCredentialRequest
                ) = apply {
                    alias = createAndroidPushCredentialRequest.alias
                    projectAccountJsonFile =
                        createAndroidPushCredentialRequest.projectAccountJsonFile
                    type = createAndroidPushCredentialRequest.type
                    additionalProperties =
                        createAndroidPushCredentialRequest.additionalProperties.toMutableMap()
                }

                /** Alias to uniquely identify the credential */
                fun alias(alias: String) = alias(JsonField.of(alias))

                /**
                 * Sets [Builder.alias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alias] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun alias(alias: JsonField<String>) = apply { this.alias = alias }

                /** Private key file in JSON format */
                fun projectAccountJsonFile(projectAccountJsonFile: ProjectAccountJsonFile) =
                    projectAccountJsonFile(JsonField.of(projectAccountJsonFile))

                /**
                 * Sets [Builder.projectAccountJsonFile] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectAccountJsonFile] with a well-typed
                 * [ProjectAccountJsonFile] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun projectAccountJsonFile(
                    projectAccountJsonFile: JsonField<ProjectAccountJsonFile>
                ) = apply { this.projectAccountJsonFile = projectAccountJsonFile }

                /** Type of mobile push credential. Should be <code>android</code> here */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [CreateAndroidPushCredentialRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .alias()
                 * .projectAccountJsonFile()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreateAndroidPushCredentialRequest =
                    CreateAndroidPushCredentialRequest(
                        checkRequired("alias", alias),
                        checkRequired("projectAccountJsonFile", projectAccountJsonFile),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreateAndroidPushCredentialRequest = apply {
                if (validated) {
                    return@apply
                }

                alias()
                projectAccountJsonFile().validate()
                type().validate()
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
                (if (alias.asKnown().isPresent) 1 else 0) +
                    (projectAccountJsonFile.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Private key file in JSON format */
            class ProjectAccountJsonFile
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
                     * Returns a mutable builder for constructing an instance of
                     * [ProjectAccountJsonFile].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ProjectAccountJsonFile]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(projectAccountJsonFile: ProjectAccountJsonFile) = apply {
                        additionalProperties =
                            projectAccountJsonFile.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [ProjectAccountJsonFile].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ProjectAccountJsonFile =
                        ProjectAccountJsonFile(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ProjectAccountJsonFile = apply {
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

                    return other is ProjectAccountJsonFile &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ProjectAccountJsonFile{additionalProperties=$additionalProperties}"
            }

            /** Type of mobile push credential. Should be <code>android</code> here */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ANDROID = of("android")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ANDROID
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANDROID,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANDROID -> Value.ANDROID
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ANDROID -> Known.ANDROID
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreateAndroidPushCredentialRequest &&
                    alias == other.alias &&
                    projectAccountJsonFile == other.projectAccountJsonFile &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(alias, projectAccountJsonFile, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateAndroidPushCredentialRequest{alias=$alias, projectAccountJsonFile=$projectAccountJsonFile, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobilePushCredentialCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MobilePushCredentialCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
