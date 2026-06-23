// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * External SIP peer settings used by Telnyx when registering to your PBX and routing outbound
 * calls.
 */
class UacExternalSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authUsername: JsonField<String>,
    private val expirationSec: JsonField<Long>,
    private val fromUser: JsonField<String>,
    private val outboundProxy: JsonField<String>,
    private val password: JsonField<String>,
    private val proxy: JsonField<String>,
    private val transport: JsonField<Transport>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth_username")
        @ExcludeMissing
        authUsername: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiration_sec")
        @ExcludeMissing
        expirationSec: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("from_user") @ExcludeMissing fromUser: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outbound_proxy")
        @ExcludeMissing
        outboundProxy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proxy") @ExcludeMissing proxy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transport")
        @ExcludeMissing
        transport: JsonField<Transport> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(
        authUsername,
        expirationSec,
        fromUser,
        outboundProxy,
        password,
        proxy,
        transport,
        username,
        mutableMapOf(),
    )

    /**
     * The authentication username used in SIP digest authentication. If not set, the Username value
     * will be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authUsername(): Optional<String> = authUsername.getOptional("auth_username")

    /**
     * The registration interval, in seconds, indicating how often the system refreshes the SIP
     * registration with the external SIP peer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expirationSec(): Optional<Long> = expirationSec.getOptional("expiration_sec")

    /**
     * The user portion of the SIP From header used in outbound requests. This controls the caller
     * identity presented to the external SIP peer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromUser(): Optional<String> = fromUser.getOptional("from_user")

    /**
     * An optional SIP proxy used to route outbound requests before reaching the external SIP peer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outboundProxy(): Optional<String> = outboundProxy.getOptional("outbound_proxy")

    /**
     * The SIP password used for digest authentication with the external SIP peer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = password.getOptional("password")

    /**
     * The SIP proxy address of the external SIP peer used for registrations and outbound call
     * routing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxy(): Optional<String> = proxy.getOptional("proxy")

    /**
     * The transport protocol used for SIP signaling when communicating with the external SIP peer.
     * One of UDP, TLS, or TCP.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transport(): Optional<Transport> = transport.getOptional("transport")

    /**
     * The SIP username used to authenticate with the external SIP peer for registrations and
     * outbound calls. Must start with a letter or number and contain only letters, numbers,
     * hyphens, and underscores.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): Optional<String> = username.getOptional("username")

    /**
     * Returns the raw JSON value of [authUsername].
     *
     * Unlike [authUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_username")
    @ExcludeMissing
    fun _authUsername(): JsonField<String> = authUsername

    /**
     * Returns the raw JSON value of [expirationSec].
     *
     * Unlike [expirationSec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiration_sec")
    @ExcludeMissing
    fun _expirationSec(): JsonField<Long> = expirationSec

    /**
     * Returns the raw JSON value of [fromUser].
     *
     * Unlike [fromUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from_user") @ExcludeMissing fun _fromUser(): JsonField<String> = fromUser

    /**
     * Returns the raw JSON value of [outboundProxy].
     *
     * Unlike [outboundProxy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outbound_proxy")
    @ExcludeMissing
    fun _outboundProxy(): JsonField<String> = outboundProxy

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

    /**
     * Returns the raw JSON value of [proxy].
     *
     * Unlike [proxy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("proxy") @ExcludeMissing fun _proxy(): JsonField<String> = proxy

    /**
     * Returns the raw JSON value of [transport].
     *
     * Unlike [transport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transport") @ExcludeMissing fun _transport(): JsonField<Transport> = transport

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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

        /** Returns a mutable builder for constructing an instance of [UacExternalSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UacExternalSettings]. */
    class Builder internal constructor() {

        private var authUsername: JsonField<String> = JsonMissing.of()
        private var expirationSec: JsonField<Long> = JsonMissing.of()
        private var fromUser: JsonField<String> = JsonMissing.of()
        private var outboundProxy: JsonField<String> = JsonMissing.of()
        private var password: JsonField<String> = JsonMissing.of()
        private var proxy: JsonField<String> = JsonMissing.of()
        private var transport: JsonField<Transport> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uacExternalSettings: UacExternalSettings) = apply {
            authUsername = uacExternalSettings.authUsername
            expirationSec = uacExternalSettings.expirationSec
            fromUser = uacExternalSettings.fromUser
            outboundProxy = uacExternalSettings.outboundProxy
            password = uacExternalSettings.password
            proxy = uacExternalSettings.proxy
            transport = uacExternalSettings.transport
            username = uacExternalSettings.username
            additionalProperties = uacExternalSettings.additionalProperties.toMutableMap()
        }

        /**
         * The authentication username used in SIP digest authentication. If not set, the Username
         * value will be used.
         */
        fun authUsername(authUsername: String?) = authUsername(JsonField.ofNullable(authUsername))

        /** Alias for calling [Builder.authUsername] with `authUsername.orElse(null)`. */
        fun authUsername(authUsername: Optional<String>) = authUsername(authUsername.getOrNull())

        /**
         * Sets [Builder.authUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authUsername] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authUsername(authUsername: JsonField<String>) = apply {
            this.authUsername = authUsername
        }

        /**
         * The registration interval, in seconds, indicating how often the system refreshes the SIP
         * registration with the external SIP peer.
         */
        fun expirationSec(expirationSec: Long?) = expirationSec(JsonField.ofNullable(expirationSec))

        /**
         * Alias for [Builder.expirationSec].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expirationSec(expirationSec: Long) = expirationSec(expirationSec as Long?)

        /** Alias for calling [Builder.expirationSec] with `expirationSec.orElse(null)`. */
        fun expirationSec(expirationSec: Optional<Long>) = expirationSec(expirationSec.getOrNull())

        /**
         * Sets [Builder.expirationSec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationSec] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expirationSec(expirationSec: JsonField<Long>) = apply {
            this.expirationSec = expirationSec
        }

        /**
         * The user portion of the SIP From header used in outbound requests. This controls the
         * caller identity presented to the external SIP peer.
         */
        fun fromUser(fromUser: String?) = fromUser(JsonField.ofNullable(fromUser))

        /** Alias for calling [Builder.fromUser] with `fromUser.orElse(null)`. */
        fun fromUser(fromUser: Optional<String>) = fromUser(fromUser.getOrNull())

        /**
         * Sets [Builder.fromUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromUser] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fromUser(fromUser: JsonField<String>) = apply { this.fromUser = fromUser }

        /**
         * An optional SIP proxy used to route outbound requests before reaching the external SIP
         * peer.
         */
        fun outboundProxy(outboundProxy: String?) =
            outboundProxy(JsonField.ofNullable(outboundProxy))

        /** Alias for calling [Builder.outboundProxy] with `outboundProxy.orElse(null)`. */
        fun outboundProxy(outboundProxy: Optional<String>) =
            outboundProxy(outboundProxy.getOrNull())

        /**
         * Sets [Builder.outboundProxy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outboundProxy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outboundProxy(outboundProxy: JsonField<String>) = apply {
            this.outboundProxy = outboundProxy
        }

        /** The SIP password used for digest authentication with the external SIP peer. */
        fun password(password: String) = password(JsonField.of(password))

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

        /**
         * The SIP proxy address of the external SIP peer used for registrations and outbound call
         * routing.
         */
        fun proxy(proxy: String) = proxy(JsonField.of(proxy))

        /**
         * Sets [Builder.proxy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun proxy(proxy: JsonField<String>) = apply { this.proxy = proxy }

        /**
         * The transport protocol used for SIP signaling when communicating with the external SIP
         * peer. One of UDP, TLS, or TCP.
         */
        fun transport(transport: Transport?) = transport(JsonField.ofNullable(transport))

        /** Alias for calling [Builder.transport] with `transport.orElse(null)`. */
        fun transport(transport: Optional<Transport>) = transport(transport.getOrNull())

        /**
         * Sets [Builder.transport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transport] with a well-typed [Transport] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transport(transport: JsonField<Transport>) = apply { this.transport = transport }

        /**
         * The SIP username used to authenticate with the external SIP peer for registrations and
         * outbound calls. Must start with a letter or number and contain only letters, numbers,
         * hyphens, and underscores.
         */
        fun username(username: String) = username(JsonField.of(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { this.username = username }

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
         * Returns an immutable instance of [UacExternalSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UacExternalSettings =
            UacExternalSettings(
                authUsername,
                expirationSec,
                fromUser,
                outboundProxy,
                password,
                proxy,
                transport,
                username,
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
    fun validate(): UacExternalSettings = apply {
        if (validated) {
            return@apply
        }

        authUsername()
        expirationSec()
        fromUser()
        outboundProxy()
        password()
        proxy()
        transport().ifPresent { it.validate() }
        username()
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
        (if (authUsername.asKnown().isPresent) 1 else 0) +
            (if (expirationSec.asKnown().isPresent) 1 else 0) +
            (if (fromUser.asKnown().isPresent) 1 else 0) +
            (if (outboundProxy.asKnown().isPresent) 1 else 0) +
            (if (password.asKnown().isPresent) 1 else 0) +
            (if (proxy.asKnown().isPresent) 1 else 0) +
            (transport.asKnown().getOrNull()?.validity() ?: 0) +
            (if (username.asKnown().isPresent) 1 else 0)

    /**
     * The transport protocol used for SIP signaling when communicating with the external SIP peer.
     * One of UDP, TLS, or TCP.
     */
    class Transport @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UDP = of("UDP")

            @JvmField val TLS = of("TLS")

            @JvmField val TCP = of("TCP")

            @JvmStatic fun of(value: String) = Transport(JsonField.of(value))
        }

        /** An enum containing [Transport]'s known values. */
        enum class Known {
            UDP,
            TLS,
            TCP,
        }

        /**
         * An enum containing [Transport]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Transport] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UDP,
            TLS,
            TCP,
            /**
             * An enum member indicating that [Transport] was instantiated with an unknown value.
             */
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
                UDP -> Value.UDP
                TLS -> Value.TLS
                TCP -> Value.TCP
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
                UDP -> Known.UDP
                TLS -> Known.TLS
                TCP -> Known.TCP
                else -> throw TelnyxInvalidDataException("Unknown Transport: $value")
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
        fun validate(): Transport = apply {
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

            return other is Transport && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UacExternalSettings &&
            authUsername == other.authUsername &&
            expirationSec == other.expirationSec &&
            fromUser == other.fromUser &&
            outboundProxy == other.outboundProxy &&
            password == other.password &&
            proxy == other.proxy &&
            transport == other.transport &&
            username == other.username &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authUsername,
            expirationSec,
            fromUser,
            outboundProxy,
            password,
            proxy,
            transport,
            username,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UacExternalSettings{authUsername=$authUsername, expirationSec=$expirationSec, fromUser=$fromUser, outboundProxy=$outboundProxy, password=$password, proxy=$proxy, transport=$transport, username=$username, additionalProperties=$additionalProperties}"
}
