// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Configuration for a generic connector. A config update replaces the complete object, not
 * individual keys. Unknown config keys are discarded. Authentication credentials must be nonblank
 * strings when required by the selected auth_type.
 */
@JsonDeserialize(using = GenericPayConnectorConfig.Deserializer::class)
@JsonSerialize(using = GenericPayConnectorConfig.Serializer::class)
class GenericPayConnectorConfig
private constructor(
    private val basicAuthenticationAlsoTheValidationDefault:
        BasicAuthenticationAlsoTheValidationDefault? =
        null,
    private val bearerAuthentication: BearerAuthentication? = null,
    private val noProcessorAuthentication: NoProcessorAuthentication? = null,
    private val _json: JsonValue? = null,
) {

    fun basicAuthenticationAlsoTheValidationDefault():
        Optional<BasicAuthenticationAlsoTheValidationDefault> =
        Optional.ofNullable(basicAuthenticationAlsoTheValidationDefault)

    fun bearerAuthentication(): Optional<BearerAuthentication> =
        Optional.ofNullable(bearerAuthentication)

    fun noProcessorAuthentication(): Optional<NoProcessorAuthentication> =
        Optional.ofNullable(noProcessorAuthentication)

    fun isBasicAuthenticationAlsoTheValidationDefault(): Boolean =
        basicAuthenticationAlsoTheValidationDefault != null

    fun isBearerAuthentication(): Boolean = bearerAuthentication != null

    fun isNoProcessorAuthentication(): Boolean = noProcessorAuthentication != null

    fun asBasicAuthenticationAlsoTheValidationDefault():
        BasicAuthenticationAlsoTheValidationDefault =
        basicAuthenticationAlsoTheValidationDefault.getOrThrow(
            "basicAuthenticationAlsoTheValidationDefault"
        )

    fun asBearerAuthentication(): BearerAuthentication =
        bearerAuthentication.getOrThrow("bearerAuthentication")

    fun asNoProcessorAuthentication(): NoProcessorAuthentication =
        noProcessorAuthentication.getOrThrow("noProcessorAuthentication")

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
     * Optional<String> result = genericPayConnectorConfig.accept(new GenericPayConnectorConfig.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitBasicAuthenticationAlsoTheValidationDefault(BasicAuthenticationAlsoTheValidationDefault basicAuthenticationAlsoTheValidationDefault) {
     *         return Optional.of(basicAuthenticationAlsoTheValidationDefault.toString());
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
            basicAuthenticationAlsoTheValidationDefault != null ->
                visitor.visitBasicAuthenticationAlsoTheValidationDefault(
                    basicAuthenticationAlsoTheValidationDefault
                )
            bearerAuthentication != null -> visitor.visitBearerAuthentication(bearerAuthentication)
            noProcessorAuthentication != null ->
                visitor.visitNoProcessorAuthentication(noProcessorAuthentication)
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
    fun validate(): GenericPayConnectorConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitBasicAuthenticationAlsoTheValidationDefault(
                    basicAuthenticationAlsoTheValidationDefault:
                        BasicAuthenticationAlsoTheValidationDefault
                ) {
                    basicAuthenticationAlsoTheValidationDefault.validate()
                }

                override fun visitBearerAuthentication(bearerAuthentication: BearerAuthentication) {
                    bearerAuthentication.validate()
                }

                override fun visitNoProcessorAuthentication(
                    noProcessorAuthentication: NoProcessorAuthentication
                ) {
                    noProcessorAuthentication.validate()
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
                override fun visitBasicAuthenticationAlsoTheValidationDefault(
                    basicAuthenticationAlsoTheValidationDefault:
                        BasicAuthenticationAlsoTheValidationDefault
                ) = basicAuthenticationAlsoTheValidationDefault.validity()

                override fun visitBearerAuthentication(bearerAuthentication: BearerAuthentication) =
                    bearerAuthentication.validity()

                override fun visitNoProcessorAuthentication(
                    noProcessorAuthentication: NoProcessorAuthentication
                ) = noProcessorAuthentication.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GenericPayConnectorConfig &&
            basicAuthenticationAlsoTheValidationDefault ==
                other.basicAuthenticationAlsoTheValidationDefault &&
            bearerAuthentication == other.bearerAuthentication &&
            noProcessorAuthentication == other.noProcessorAuthentication
    }

    override fun hashCode(): Int =
        Objects.hash(
            basicAuthenticationAlsoTheValidationDefault,
            bearerAuthentication,
            noProcessorAuthentication,
        )

    override fun toString(): String =
        when {
            basicAuthenticationAlsoTheValidationDefault != null ->
                "GenericPayConnectorConfig{basicAuthenticationAlsoTheValidationDefault=$basicAuthenticationAlsoTheValidationDefault}"
            bearerAuthentication != null ->
                "GenericPayConnectorConfig{bearerAuthentication=$bearerAuthentication}"
            noProcessorAuthentication != null ->
                "GenericPayConnectorConfig{noProcessorAuthentication=$noProcessorAuthentication}"
            _json != null -> "GenericPayConnectorConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid GenericPayConnectorConfig")
        }

    companion object {

        @JvmStatic
        fun ofBasicAuthenticationAlsoTheValidationDefault(
            basicAuthenticationAlsoTheValidationDefault: BasicAuthenticationAlsoTheValidationDefault
        ) =
            GenericPayConnectorConfig(
                basicAuthenticationAlsoTheValidationDefault =
                    basicAuthenticationAlsoTheValidationDefault
            )

        @JvmStatic
        fun ofBearerAuthentication(bearerAuthentication: BearerAuthentication) =
            GenericPayConnectorConfig(bearerAuthentication = bearerAuthentication)

        @JvmStatic
        fun ofNoProcessorAuthentication(noProcessorAuthentication: NoProcessorAuthentication) =
            GenericPayConnectorConfig(noProcessorAuthentication = noProcessorAuthentication)
    }

    /**
     * An interface that defines how to map each variant of [GenericPayConnectorConfig] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitBasicAuthenticationAlsoTheValidationDefault(
            basicAuthenticationAlsoTheValidationDefault: BasicAuthenticationAlsoTheValidationDefault
        ): T

        fun visitBearerAuthentication(bearerAuthentication: BearerAuthentication): T

        fun visitNoProcessorAuthentication(noProcessorAuthentication: NoProcessorAuthentication): T

        /**
         * Maps an unknown variant of [GenericPayConnectorConfig] to a value of type [T].
         *
         * An instance of [GenericPayConnectorConfig] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown GenericPayConnectorConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<GenericPayConnectorConfig>(GenericPayConnectorConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): GenericPayConnectorConfig {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(
                                node,
                                jacksonTypeRef<BasicAuthenticationAlsoTheValidationDefault>(),
                            )
                            ?.let {
                                GenericPayConnectorConfig(
                                    basicAuthenticationAlsoTheValidationDefault = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<BearerAuthentication>())?.let {
                            GenericPayConnectorConfig(bearerAuthentication = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NoProcessorAuthentication>())?.let {
                            GenericPayConnectorConfig(noProcessorAuthentication = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> GenericPayConnectorConfig(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<GenericPayConnectorConfig>(GenericPayConnectorConfig::class) {

        override fun serialize(
            value: GenericPayConnectorConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.basicAuthenticationAlsoTheValidationDefault != null ->
                    generator.writeObject(value.basicAuthenticationAlsoTheValidationDefault)
                value.bearerAuthentication != null ->
                    generator.writeObject(value.bearerAuthentication)
                value.noProcessorAuthentication != null ->
                    generator.writeObject(value.noProcessorAuthentication)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid GenericPayConnectorConfig")
            }
        }
    }

    class BasicAuthenticationAlsoTheValidationDefault
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val password: JsonField<String>,
        private val username: JsonField<String>,
        private val token: JsonValue,
        private val authType: JsonField<AuthType>,
        private val endpointUrl: JsonField<String>,
        private val timeout: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("username")
            @ExcludeMissing
            username: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token") @ExcludeMissing token: JsonValue = JsonMissing.of(),
            @JsonProperty("auth_type")
            @ExcludeMissing
            authType: JsonField<AuthType> = JsonMissing.of(),
            @JsonProperty("endpoint_url")
            @ExcludeMissing
            endpointUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
        ) : this(password, username, token, authType, endpointUrl, timeout, mutableMapOf())

        /**
         * Basic password.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun password(): String = password.getRequired("password")

        /**
         * Basic username.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun username(): String = username.getRequired("username")

        /**
         * Nonblank string required for bearer authentication. Write-only; omitted from responses.
         * Re-send when replacing a bearer-auth config.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = basicAuthenticationAlsoTheValidationDefault.token().convert(MyClass.class);
         * ```
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonValue = token

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authType(): Optional<AuthType> = authType.getOptional("auth_type")

        /**
         * HTTP or HTTPS processor URL with a host. Use HTTPS to protect payment data in transit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

        /**
         * Processor HTTP timeout in milliseconds. Omitted or null uses 10000; null is removed
         * before storage. Not the IVR digit-gather timeout.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Long> = timeout.getOptional("timeout")

        /**
         * Returns the raw JSON value of [password].
         *
         * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

        /**
         * Returns the raw JSON value of [authType].
         *
         * Unlike [authType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth_type") @ExcludeMissing fun _authType(): JsonField<AuthType> = authType

        /**
         * Returns the raw JSON value of [endpointUrl].
         *
         * Unlike [endpointUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endpoint_url")
        @ExcludeMissing
        fun _endpointUrl(): JsonField<String> = endpointUrl

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

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
             * [BasicAuthenticationAlsoTheValidationDefault].
             *
             * The following fields are required:
             * ```java
             * .password()
             * .username()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BasicAuthenticationAlsoTheValidationDefault]. */
        class Builder internal constructor() {

            private var password: JsonField<String>? = null
            private var username: JsonField<String>? = null
            private var token: JsonValue = JsonMissing.of()
            private var authType: JsonField<AuthType> = JsonMissing.of()
            private var endpointUrl: JsonField<String> = JsonMissing.of()
            private var timeout: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                basicAuthenticationAlsoTheValidationDefault:
                    BasicAuthenticationAlsoTheValidationDefault
            ) = apply {
                password = basicAuthenticationAlsoTheValidationDefault.password
                username = basicAuthenticationAlsoTheValidationDefault.username
                token = basicAuthenticationAlsoTheValidationDefault.token
                authType = basicAuthenticationAlsoTheValidationDefault.authType
                endpointUrl = basicAuthenticationAlsoTheValidationDefault.endpointUrl
                timeout = basicAuthenticationAlsoTheValidationDefault.timeout
                additionalProperties =
                    basicAuthenticationAlsoTheValidationDefault.additionalProperties.toMutableMap()
            }

            /** Basic password. */
            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            /** Basic username. */
            fun username(username: String) = username(JsonField.of(username))

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

            /**
             * Nonblank string required for bearer authentication. Write-only; omitted from
             * responses. Re-send when replacing a bearer-auth config.
             */
            fun token(token: JsonValue) = apply { this.token = token }

            fun authType(authType: AuthType) = authType(JsonField.of(authType))

            /**
             * Sets [Builder.authType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authType] with a well-typed [AuthType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authType(authType: JsonField<AuthType>) = apply { this.authType = authType }

            /**
             * HTTP or HTTPS processor URL with a host. Use HTTPS to protect payment data in
             * transit.
             */
            fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

            /**
             * Sets [Builder.endpointUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpointUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                this.endpointUrl = endpointUrl
            }

            /**
             * Processor HTTP timeout in milliseconds. Omitted or null uses 10000; null is removed
             * before storage. Not the IVR digit-gather timeout.
             */
            fun timeout(timeout: Long?) = timeout(JsonField.ofNullable(timeout))

            /**
             * Alias for [Builder.timeout].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeout(timeout: Long) = timeout(timeout as Long?)

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<Long>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

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
             * Returns an immutable instance of [BasicAuthenticationAlsoTheValidationDefault].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .password()
             * .username()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BasicAuthenticationAlsoTheValidationDefault =
                BasicAuthenticationAlsoTheValidationDefault(
                    checkRequired("password", password),
                    checkRequired("username", username),
                    token,
                    authType,
                    endpointUrl,
                    timeout,
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
        fun validate(): BasicAuthenticationAlsoTheValidationDefault = apply {
            if (validated) {
                return@apply
            }

            password()
            username()
            authType().ifPresent { it.validate() }
            endpointUrl()
            timeout()
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
            (if (password.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0) +
                (authType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0)

        class AuthType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BASIC = of("basic")

                @JvmStatic fun of(value: String) = AuthType(JsonField.of(value))
            }

            /** An enum containing [AuthType]'s known values. */
            enum class Known {
                BASIC
            }

            /**
             * An enum containing [AuthType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AuthType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BASIC,
                /**
                 * An enum member indicating that [AuthType] was instantiated with an unknown value.
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
                    BASIC -> Value.BASIC
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
                    BASIC -> Known.BASIC
                    else -> throw TelnyxInvalidDataException("Unknown AuthType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
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
            fun validate(): AuthType = apply {
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

                return other is AuthType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BasicAuthenticationAlsoTheValidationDefault &&
                password == other.password &&
                username == other.username &&
                token == other.token &&
                authType == other.authType &&
                endpointUrl == other.endpointUrl &&
                timeout == other.timeout &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                password,
                username,
                token,
                authType,
                endpointUrl,
                timeout,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BasicAuthenticationAlsoTheValidationDefault{password=$password, username=$username, token=$token, authType=$authType, endpointUrl=$endpointUrl, timeout=$timeout, additionalProperties=$additionalProperties}"
    }

    class BearerAuthentication
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val authType: JsonValue,
        private val endpointUrl: JsonField<String>,
        private val password: JsonValue,
        private val timeout: JsonField<Long>,
        private val username: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_type") @ExcludeMissing authType: JsonValue = JsonMissing.of(),
            @JsonProperty("endpoint_url")
            @ExcludeMissing
            endpointUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("password") @ExcludeMissing password: JsonValue = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonValue = JsonMissing.of(),
        ) : this(token, authType, endpointUrl, password, timeout, username, mutableMapOf())

        /**
         * Processor bearer token.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("bearer")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("auth_type") @ExcludeMissing fun _authType(): JsonValue = authType

        /**
         * HTTP or HTTPS processor URL with a host. Use HTTPS to protect payment data in transit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

        /**
         * Nonblank string required for basic authentication. Write-only; omitted from responses.
         * Re-send when replacing a basic-auth config.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = bearerAuthentication.password().convert(MyClass.class);
         * ```
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonValue = password

        /**
         * Processor HTTP timeout in milliseconds. Omitted or null uses 10000; null is removed
         * before storage. Not the IVR digit-gather timeout.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Long> = timeout.getOptional("timeout")

        /**
         * Nonblank string required for basic authentication. Returned in connector responses.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = bearerAuthentication.username().convert(MyClass.class);
         * ```
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonValue = username

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [endpointUrl].
         *
         * Unlike [endpointUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endpoint_url")
        @ExcludeMissing
        fun _endpointUrl(): JsonField<String> = endpointUrl

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

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
             * Returns a mutable builder for constructing an instance of [BearerAuthentication].
             *
             * The following fields are required:
             * ```java
             * .token()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BearerAuthentication]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var authType: JsonValue = JsonValue.from("bearer")
            private var endpointUrl: JsonField<String> = JsonMissing.of()
            private var password: JsonValue = JsonMissing.of()
            private var timeout: JsonField<Long> = JsonMissing.of()
            private var username: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bearerAuthentication: BearerAuthentication) = apply {
                token = bearerAuthentication.token
                authType = bearerAuthentication.authType
                endpointUrl = bearerAuthentication.endpointUrl
                password = bearerAuthentication.password
                timeout = bearerAuthentication.timeout
                username = bearerAuthentication.username
                additionalProperties = bearerAuthentication.additionalProperties.toMutableMap()
            }

            /** Processor bearer token. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("bearer")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authType(authType: JsonValue) = apply { this.authType = authType }

            /**
             * HTTP or HTTPS processor URL with a host. Use HTTPS to protect payment data in
             * transit.
             */
            fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

            /**
             * Sets [Builder.endpointUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpointUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                this.endpointUrl = endpointUrl
            }

            /**
             * Nonblank string required for basic authentication. Write-only; omitted from
             * responses. Re-send when replacing a basic-auth config.
             */
            fun password(password: JsonValue) = apply { this.password = password }

            /**
             * Processor HTTP timeout in milliseconds. Omitted or null uses 10000; null is removed
             * before storage. Not the IVR digit-gather timeout.
             */
            fun timeout(timeout: Long?) = timeout(JsonField.ofNullable(timeout))

            /**
             * Alias for [Builder.timeout].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeout(timeout: Long) = timeout(timeout as Long?)

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<Long>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            /**
             * Nonblank string required for basic authentication. Returned in connector responses.
             */
            fun username(username: JsonValue) = apply { this.username = username }

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
             * Returns an immutable instance of [BearerAuthentication].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BearerAuthentication =
                BearerAuthentication(
                    checkRequired("token", token),
                    authType,
                    endpointUrl,
                    password,
                    timeout,
                    username,
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
        fun validate(): BearerAuthentication = apply {
            if (validated) {
                return@apply
            }

            token()
            _authType().let {
                if (it != JsonValue.from("bearer")) {
                    throw TelnyxInvalidDataException("'authType' is invalid, received $it")
                }
            }
            endpointUrl()
            timeout()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                authType.let { if (it == JsonValue.from("bearer")) 1 else 0 } +
                (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BearerAuthentication &&
                token == other.token &&
                authType == other.authType &&
                endpointUrl == other.endpointUrl &&
                password == other.password &&
                timeout == other.timeout &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                authType,
                endpointUrl,
                password,
                timeout,
                username,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BearerAuthentication{token=$token, authType=$authType, endpointUrl=$endpointUrl, password=$password, timeout=$timeout, username=$username, additionalProperties=$additionalProperties}"
    }

    class NoProcessorAuthentication
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val authType: JsonValue,
        private val token: JsonValue,
        private val endpointUrl: JsonField<String>,
        private val password: JsonValue,
        private val timeout: JsonField<Long>,
        private val username: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth_type") @ExcludeMissing authType: JsonValue = JsonMissing.of(),
            @JsonProperty("token") @ExcludeMissing token: JsonValue = JsonMissing.of(),
            @JsonProperty("endpoint_url")
            @ExcludeMissing
            endpointUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("password") @ExcludeMissing password: JsonValue = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonValue = JsonMissing.of(),
        ) : this(authType, token, endpointUrl, password, timeout, username, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("none")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("auth_type") @ExcludeMissing fun _authType(): JsonValue = authType

        /**
         * Nonblank string required for bearer authentication. Write-only; omitted from responses.
         * Re-send when replacing a bearer-auth config.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = noProcessorAuthentication.token().convert(MyClass.class);
         * ```
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonValue = token

        /**
         * HTTP or HTTPS processor URL with a host. Use HTTPS to protect payment data in transit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

        /**
         * Nonblank string required for basic authentication. Write-only; omitted from responses.
         * Re-send when replacing a basic-auth config.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = noProcessorAuthentication.password().convert(MyClass.class);
         * ```
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonValue = password

        /**
         * Processor HTTP timeout in milliseconds. Omitted or null uses 10000; null is removed
         * before storage. Not the IVR digit-gather timeout.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Long> = timeout.getOptional("timeout")

        /**
         * Nonblank string required for basic authentication. Returned in connector responses.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = noProcessorAuthentication.username().convert(MyClass.class);
         * ```
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonValue = username

        /**
         * Returns the raw JSON value of [endpointUrl].
         *
         * Unlike [endpointUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endpoint_url")
        @ExcludeMissing
        fun _endpointUrl(): JsonField<String> = endpointUrl

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

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
             * [NoProcessorAuthentication].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NoProcessorAuthentication]. */
        class Builder internal constructor() {

            private var authType: JsonValue = JsonValue.from("none")
            private var token: JsonValue = JsonMissing.of()
            private var endpointUrl: JsonField<String> = JsonMissing.of()
            private var password: JsonValue = JsonMissing.of()
            private var timeout: JsonField<Long> = JsonMissing.of()
            private var username: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(noProcessorAuthentication: NoProcessorAuthentication) = apply {
                authType = noProcessorAuthentication.authType
                token = noProcessorAuthentication.token
                endpointUrl = noProcessorAuthentication.endpointUrl
                password = noProcessorAuthentication.password
                timeout = noProcessorAuthentication.timeout
                username = noProcessorAuthentication.username
                additionalProperties = noProcessorAuthentication.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("none")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authType(authType: JsonValue) = apply { this.authType = authType }

            /**
             * Nonblank string required for bearer authentication. Write-only; omitted from
             * responses. Re-send when replacing a bearer-auth config.
             */
            fun token(token: JsonValue) = apply { this.token = token }

            /**
             * HTTP or HTTPS processor URL with a host. Use HTTPS to protect payment data in
             * transit.
             */
            fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

            /**
             * Sets [Builder.endpointUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpointUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                this.endpointUrl = endpointUrl
            }

            /**
             * Nonblank string required for basic authentication. Write-only; omitted from
             * responses. Re-send when replacing a basic-auth config.
             */
            fun password(password: JsonValue) = apply { this.password = password }

            /**
             * Processor HTTP timeout in milliseconds. Omitted or null uses 10000; null is removed
             * before storage. Not the IVR digit-gather timeout.
             */
            fun timeout(timeout: Long?) = timeout(JsonField.ofNullable(timeout))

            /**
             * Alias for [Builder.timeout].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeout(timeout: Long) = timeout(timeout as Long?)

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<Long>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            /**
             * Nonblank string required for basic authentication. Returned in connector responses.
             */
            fun username(username: JsonValue) = apply { this.username = username }

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
             * Returns an immutable instance of [NoProcessorAuthentication].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): NoProcessorAuthentication =
                NoProcessorAuthentication(
                    authType,
                    token,
                    endpointUrl,
                    password,
                    timeout,
                    username,
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
        fun validate(): NoProcessorAuthentication = apply {
            if (validated) {
                return@apply
            }

            _authType().let {
                if (it != JsonValue.from("none")) {
                    throw TelnyxInvalidDataException("'authType' is invalid, received $it")
                }
            }
            endpointUrl()
            timeout()
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
            authType.let { if (it == JsonValue.from("none")) 1 else 0 } +
                (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NoProcessorAuthentication &&
                authType == other.authType &&
                token == other.token &&
                endpointUrl == other.endpointUrl &&
                password == other.password &&
                timeout == other.timeout &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                authType,
                token,
                endpointUrl,
                password,
                timeout,
                username,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NoProcessorAuthentication{authType=$authType, token=$token, endpointUrl=$endpointUrl, password=$password, timeout=$timeout, username=$username, additionalProperties=$additionalProperties}"
    }
}
