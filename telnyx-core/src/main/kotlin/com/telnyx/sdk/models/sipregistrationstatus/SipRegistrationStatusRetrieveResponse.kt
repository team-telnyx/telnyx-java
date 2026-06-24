// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sipregistrationstatus

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

class SipRegistrationStatusRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val connectionId: JsonField<String>,
    private val connectionName: JsonField<String>,
    private val credentialType: JsonField<CredentialType>,
    private val credentialUsername: JsonField<String>,
    private val lastRegistrationResponse: JsonField<String>,
    private val registered: JsonField<Boolean>,
    private val sipRegistrationDetails: JsonField<SipRegistrationDetails>,
    private val sipRegistrationStatus: JsonField<SipRegistrationStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_name")
        @ExcludeMissing
        connectionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credential_type")
        @ExcludeMissing
        credentialType: JsonField<CredentialType> = JsonMissing.of(),
        @JsonProperty("credential_username")
        @ExcludeMissing
        credentialUsername: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_registration_response")
        @ExcludeMissing
        lastRegistrationResponse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registered")
        @ExcludeMissing
        registered: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sip_registration_details")
        @ExcludeMissing
        sipRegistrationDetails: JsonField<SipRegistrationDetails> = JsonMissing.of(),
        @JsonProperty("sip_registration_status")
        @ExcludeMissing
        sipRegistrationStatus: JsonField<SipRegistrationStatus> = JsonMissing.of(),
    ) : this(
        connectionId,
        connectionName,
        credentialType,
        credentialUsername,
        lastRegistrationResponse,
        registered,
        sipRegistrationDetails,
        sipRegistrationStatus,
        mutableMapOf(),
    )

    /**
     * Identifier of the connection associated with the credential.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

    /**
     * Human-readable connection name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionName(): Optional<String> = connectionName.getOptional("connection_name")

    /**
     * The credential type that was looked up.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentialType(): Optional<CredentialType> = credentialType.getOptional("credential_type")

    /**
     * SIP username used for the registration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentialUsername(): Optional<String> =
        credentialUsername.getOptional("credential_username")

    /**
     * SIP response from the last registration attempt.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRegistrationResponse(): Optional<String> =
        lastRegistrationResponse.getOptional("last_registration_response")

    /**
     * True if the endpoint is currently registered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registered(): Optional<Boolean> = registered.getOptional("registered")

    /**
     * Detailed registration information reported by the registrar. The populated fields depend on
     * `credential_type`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipRegistrationDetails(): Optional<SipRegistrationDetails> =
        sipRegistrationDetails.getOptional("sip_registration_details")

    /**
     * Human-readable registration status derived from the registrar state.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipRegistrationStatus(): Optional<SipRegistrationStatus> =
        sipRegistrationStatus.getOptional("sip_registration_status")

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [connectionName].
     *
     * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_name")
    @ExcludeMissing
    fun _connectionName(): JsonField<String> = connectionName

    /**
     * Returns the raw JSON value of [credentialType].
     *
     * Unlike [credentialType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credential_type")
    @ExcludeMissing
    fun _credentialType(): JsonField<CredentialType> = credentialType

    /**
     * Returns the raw JSON value of [credentialUsername].
     *
     * Unlike [credentialUsername], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credential_username")
    @ExcludeMissing
    fun _credentialUsername(): JsonField<String> = credentialUsername

    /**
     * Returns the raw JSON value of [lastRegistrationResponse].
     *
     * Unlike [lastRegistrationResponse], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("last_registration_response")
    @ExcludeMissing
    fun _lastRegistrationResponse(): JsonField<String> = lastRegistrationResponse

    /**
     * Returns the raw JSON value of [registered].
     *
     * Unlike [registered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("registered") @ExcludeMissing fun _registered(): JsonField<Boolean> = registered

    /**
     * Returns the raw JSON value of [sipRegistrationDetails].
     *
     * Unlike [sipRegistrationDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sip_registration_details")
    @ExcludeMissing
    fun _sipRegistrationDetails(): JsonField<SipRegistrationDetails> = sipRegistrationDetails

    /**
     * Returns the raw JSON value of [sipRegistrationStatus].
     *
     * Unlike [sipRegistrationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sip_registration_status")
    @ExcludeMissing
    fun _sipRegistrationStatus(): JsonField<SipRegistrationStatus> = sipRegistrationStatus

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
         * [SipRegistrationStatusRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SipRegistrationStatusRetrieveResponse]. */
    class Builder internal constructor() {

        private var connectionId: JsonField<String> = JsonMissing.of()
        private var connectionName: JsonField<String> = JsonMissing.of()
        private var credentialType: JsonField<CredentialType> = JsonMissing.of()
        private var credentialUsername: JsonField<String> = JsonMissing.of()
        private var lastRegistrationResponse: JsonField<String> = JsonMissing.of()
        private var registered: JsonField<Boolean> = JsonMissing.of()
        private var sipRegistrationDetails: JsonField<SipRegistrationDetails> = JsonMissing.of()
        private var sipRegistrationStatus: JsonField<SipRegistrationStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            sipRegistrationStatusRetrieveResponse: SipRegistrationStatusRetrieveResponse
        ) = apply {
            connectionId = sipRegistrationStatusRetrieveResponse.connectionId
            connectionName = sipRegistrationStatusRetrieveResponse.connectionName
            credentialType = sipRegistrationStatusRetrieveResponse.credentialType
            credentialUsername = sipRegistrationStatusRetrieveResponse.credentialUsername
            lastRegistrationResponse =
                sipRegistrationStatusRetrieveResponse.lastRegistrationResponse
            registered = sipRegistrationStatusRetrieveResponse.registered
            sipRegistrationDetails = sipRegistrationStatusRetrieveResponse.sipRegistrationDetails
            sipRegistrationStatus = sipRegistrationStatusRetrieveResponse.sipRegistrationStatus
            additionalProperties =
                sipRegistrationStatusRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Identifier of the connection associated with the credential. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /** Human-readable connection name. */
        fun connectionName(connectionName: String) = connectionName(JsonField.of(connectionName))

        /**
         * Sets [Builder.connectionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionName(connectionName: JsonField<String>) = apply {
            this.connectionName = connectionName
        }

        /** The credential type that was looked up. */
        fun credentialType(credentialType: CredentialType) =
            credentialType(JsonField.of(credentialType))

        /**
         * Sets [Builder.credentialType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialType] with a well-typed [CredentialType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentialType(credentialType: JsonField<CredentialType>) = apply {
            this.credentialType = credentialType
        }

        /** SIP username used for the registration. */
        fun credentialUsername(credentialUsername: String) =
            credentialUsername(JsonField.of(credentialUsername))

        /**
         * Sets [Builder.credentialUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialUsername] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentialUsername(credentialUsername: JsonField<String>) = apply {
            this.credentialUsername = credentialUsername
        }

        /** SIP response from the last registration attempt. */
        fun lastRegistrationResponse(lastRegistrationResponse: String) =
            lastRegistrationResponse(JsonField.of(lastRegistrationResponse))

        /**
         * Sets [Builder.lastRegistrationResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRegistrationResponse] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastRegistrationResponse(lastRegistrationResponse: JsonField<String>) = apply {
            this.lastRegistrationResponse = lastRegistrationResponse
        }

        /** True if the endpoint is currently registered. */
        fun registered(registered: Boolean) = registered(JsonField.of(registered))

        /**
         * Sets [Builder.registered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registered] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun registered(registered: JsonField<Boolean>) = apply { this.registered = registered }

        /**
         * Detailed registration information reported by the registrar. The populated fields depend
         * on `credential_type`.
         */
        fun sipRegistrationDetails(sipRegistrationDetails: SipRegistrationDetails) =
            sipRegistrationDetails(JsonField.of(sipRegistrationDetails))

        /**
         * Sets [Builder.sipRegistrationDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipRegistrationDetails] with a well-typed
         * [SipRegistrationDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun sipRegistrationDetails(sipRegistrationDetails: JsonField<SipRegistrationDetails>) =
            apply {
                this.sipRegistrationDetails = sipRegistrationDetails
            }

        /** Human-readable registration status derived from the registrar state. */
        fun sipRegistrationStatus(sipRegistrationStatus: SipRegistrationStatus) =
            sipRegistrationStatus(JsonField.of(sipRegistrationStatus))

        /**
         * Sets [Builder.sipRegistrationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipRegistrationStatus] with a well-typed
         * [SipRegistrationStatus] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun sipRegistrationStatus(sipRegistrationStatus: JsonField<SipRegistrationStatus>) = apply {
            this.sipRegistrationStatus = sipRegistrationStatus
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
         * Returns an immutable instance of [SipRegistrationStatusRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SipRegistrationStatusRetrieveResponse =
            SipRegistrationStatusRetrieveResponse(
                connectionId,
                connectionName,
                credentialType,
                credentialUsername,
                lastRegistrationResponse,
                registered,
                sipRegistrationDetails,
                sipRegistrationStatus,
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
    fun validate(): SipRegistrationStatusRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        connectionId()
        connectionName()
        credentialType().ifPresent { it.validate() }
        credentialUsername()
        lastRegistrationResponse()
        registered()
        sipRegistrationDetails().ifPresent { it.validate() }
        sipRegistrationStatus().ifPresent { it.validate() }
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
        (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (connectionName.asKnown().isPresent) 1 else 0) +
            (credentialType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (credentialUsername.asKnown().isPresent) 1 else 0) +
            (if (lastRegistrationResponse.asKnown().isPresent) 1 else 0) +
            (if (registered.asKnown().isPresent) 1 else 0) +
            (sipRegistrationDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (sipRegistrationStatus.asKnown().getOrNull()?.validity() ?: 0)

    /** The credential type that was looked up. */
    class CredentialType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val UAC_EXTERNAL_CREDENTIAL = of("uac_external_credential")

            @JvmField val TELEPHONY_CREDENTIAL = of("telephony_credential")

            @JvmStatic fun of(value: String) = CredentialType(JsonField.of(value))
        }

        /** An enum containing [CredentialType]'s known values. */
        enum class Known {
            UAC_EXTERNAL_CREDENTIAL,
            TELEPHONY_CREDENTIAL,
        }

        /**
         * An enum containing [CredentialType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CredentialType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UAC_EXTERNAL_CREDENTIAL,
            TELEPHONY_CREDENTIAL,
            /**
             * An enum member indicating that [CredentialType] was instantiated with an unknown
             * value.
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
                UAC_EXTERNAL_CREDENTIAL -> Value.UAC_EXTERNAL_CREDENTIAL
                TELEPHONY_CREDENTIAL -> Value.TELEPHONY_CREDENTIAL
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
                UAC_EXTERNAL_CREDENTIAL -> Known.UAC_EXTERNAL_CREDENTIAL
                TELEPHONY_CREDENTIAL -> Known.TELEPHONY_CREDENTIAL
                else -> throw TelnyxInvalidDataException("Unknown CredentialType: $value")
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
        fun validate(): CredentialType = apply {
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

            return other is CredentialType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Detailed registration information reported by the registrar. The populated fields depend on
     * `credential_type`.
     */
    class SipRegistrationDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val authRetries: JsonField<Long>,
        private val expires: JsonField<Long>,
        private val failures: JsonField<Long>,
        private val lastModified: JsonField<String>,
        private val nextActionAt: JsonField<Long>,
        private val node: JsonField<String>,
        private val sipUriUserHost: JsonField<String>,
        private val transport: JsonField<String>,
        private val uaIp: JsonField<String>,
        private val uaPort: JsonField<Long>,
        private val uptime: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth_retries")
            @ExcludeMissing
            authRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("expires") @ExcludeMissing expires: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("failures") @ExcludeMissing failures: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("last_modified")
            @ExcludeMissing
            lastModified: JsonField<String> = JsonMissing.of(),
            @JsonProperty("next_action_at")
            @ExcludeMissing
            nextActionAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("node") @ExcludeMissing node: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_uri_user_host")
            @ExcludeMissing
            sipUriUserHost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transport")
            @ExcludeMissing
            transport: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ua_ip") @ExcludeMissing uaIp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ua_port") @ExcludeMissing uaPort: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uptime") @ExcludeMissing uptime: JsonField<Long> = JsonMissing.of(),
        ) : this(
            authRetries,
            expires,
            failures,
            lastModified,
            nextActionAt,
            node,
            sipUriUserHost,
            transport,
            uaIp,
            uaPort,
            uptime,
            mutableMapOf(),
        )

        /**
         * Number of authentication retries on the last attempt.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authRetries(): Optional<Long> = authRetries.getOptional("auth_retries")

        /**
         * Unix timestamp when the current registration expires.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expires(): Optional<Long> = expires.getOptional("expires")

        /**
         * Count of consecutive registration failures.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failures(): Optional<Long> = failures.getOptional("failures")

        /**
         * Timestamp when the registration row was last modified (telephony_credential).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastModified(): Optional<String> = lastModified.getOptional("last_modified")

        /**
         * Unix timestamp of the next scheduled registration action.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextActionAt(): Optional<Long> = nextActionAt.getOptional("next_action_at")

        /**
         * Registrar node handling the registration (telephony_credential).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun node(): Optional<String> = node.getOptional("node")

        /**
         * SIP URI user@host of the registered contact.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipUriUserHost(): Optional<String> = sipUriUserHost.getOptional("sip_uri_user_host")

        /**
         * Transport used for the registration, e.g. UDP/TCP/TLS (telephony_credential).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transport(): Optional<String> = transport.getOptional("transport")

        /**
         * IP address of the registered user agent (telephony_credential).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uaIp(): Optional<String> = uaIp.getOptional("ua_ip")

        /**
         * Port of the registered user agent (telephony_credential).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uaPort(): Optional<Long> = uaPort.getOptional("ua_port")

        /**
         * Registration uptime reported by the registrar.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uptime(): Optional<Long> = uptime.getOptional("uptime")

        /**
         * Returns the raw JSON value of [authRetries].
         *
         * Unlike [authRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth_retries")
        @ExcludeMissing
        fun _authRetries(): JsonField<Long> = authRetries

        /**
         * Returns the raw JSON value of [expires].
         *
         * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<Long> = expires

        /**
         * Returns the raw JSON value of [failures].
         *
         * Unlike [failures], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("failures") @ExcludeMissing fun _failures(): JsonField<Long> = failures

        /**
         * Returns the raw JSON value of [lastModified].
         *
         * Unlike [lastModified], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_modified")
        @ExcludeMissing
        fun _lastModified(): JsonField<String> = lastModified

        /**
         * Returns the raw JSON value of [nextActionAt].
         *
         * Unlike [nextActionAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_action_at")
        @ExcludeMissing
        fun _nextActionAt(): JsonField<Long> = nextActionAt

        /**
         * Returns the raw JSON value of [node].
         *
         * Unlike [node], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("node") @ExcludeMissing fun _node(): JsonField<String> = node

        /**
         * Returns the raw JSON value of [sipUriUserHost].
         *
         * Unlike [sipUriUserHost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sip_uri_user_host")
        @ExcludeMissing
        fun _sipUriUserHost(): JsonField<String> = sipUriUserHost

        /**
         * Returns the raw JSON value of [transport].
         *
         * Unlike [transport], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transport") @ExcludeMissing fun _transport(): JsonField<String> = transport

        /**
         * Returns the raw JSON value of [uaIp].
         *
         * Unlike [uaIp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ua_ip") @ExcludeMissing fun _uaIp(): JsonField<String> = uaIp

        /**
         * Returns the raw JSON value of [uaPort].
         *
         * Unlike [uaPort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ua_port") @ExcludeMissing fun _uaPort(): JsonField<Long> = uaPort

        /**
         * Returns the raw JSON value of [uptime].
         *
         * Unlike [uptime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uptime") @ExcludeMissing fun _uptime(): JsonField<Long> = uptime

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
             * Returns a mutable builder for constructing an instance of [SipRegistrationDetails].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SipRegistrationDetails]. */
        class Builder internal constructor() {

            private var authRetries: JsonField<Long> = JsonMissing.of()
            private var expires: JsonField<Long> = JsonMissing.of()
            private var failures: JsonField<Long> = JsonMissing.of()
            private var lastModified: JsonField<String> = JsonMissing.of()
            private var nextActionAt: JsonField<Long> = JsonMissing.of()
            private var node: JsonField<String> = JsonMissing.of()
            private var sipUriUserHost: JsonField<String> = JsonMissing.of()
            private var transport: JsonField<String> = JsonMissing.of()
            private var uaIp: JsonField<String> = JsonMissing.of()
            private var uaPort: JsonField<Long> = JsonMissing.of()
            private var uptime: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sipRegistrationDetails: SipRegistrationDetails) = apply {
                authRetries = sipRegistrationDetails.authRetries
                expires = sipRegistrationDetails.expires
                failures = sipRegistrationDetails.failures
                lastModified = sipRegistrationDetails.lastModified
                nextActionAt = sipRegistrationDetails.nextActionAt
                node = sipRegistrationDetails.node
                sipUriUserHost = sipRegistrationDetails.sipUriUserHost
                transport = sipRegistrationDetails.transport
                uaIp = sipRegistrationDetails.uaIp
                uaPort = sipRegistrationDetails.uaPort
                uptime = sipRegistrationDetails.uptime
                additionalProperties = sipRegistrationDetails.additionalProperties.toMutableMap()
            }

            /** Number of authentication retries on the last attempt. */
            fun authRetries(authRetries: Long) = authRetries(JsonField.of(authRetries))

            /**
             * Sets [Builder.authRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authRetries(authRetries: JsonField<Long>) = apply { this.authRetries = authRetries }

            /** Unix timestamp when the current registration expires. */
            fun expires(expires: Long) = expires(JsonField.of(expires))

            /**
             * Sets [Builder.expires] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expires] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expires(expires: JsonField<Long>) = apply { this.expires = expires }

            /** Count of consecutive registration failures. */
            fun failures(failures: Long) = failures(JsonField.of(failures))

            /**
             * Sets [Builder.failures] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failures] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failures(failures: JsonField<Long>) = apply { this.failures = failures }

            /** Timestamp when the registration row was last modified (telephony_credential). */
            fun lastModified(lastModified: String) = lastModified(JsonField.of(lastModified))

            /**
             * Sets [Builder.lastModified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastModified] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastModified(lastModified: JsonField<String>) = apply {
                this.lastModified = lastModified
            }

            /** Unix timestamp of the next scheduled registration action. */
            fun nextActionAt(nextActionAt: Long) = nextActionAt(JsonField.of(nextActionAt))

            /**
             * Sets [Builder.nextActionAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextActionAt] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextActionAt(nextActionAt: JsonField<Long>) = apply {
                this.nextActionAt = nextActionAt
            }

            /** Registrar node handling the registration (telephony_credential). */
            fun node(node: String) = node(JsonField.of(node))

            /**
             * Sets [Builder.node] to an arbitrary JSON value.
             *
             * You should usually call [Builder.node] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun node(node: JsonField<String>) = apply { this.node = node }

            /** SIP URI user@host of the registered contact. */
            fun sipUriUserHost(sipUriUserHost: String) =
                sipUriUserHost(JsonField.of(sipUriUserHost))

            /**
             * Sets [Builder.sipUriUserHost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipUriUserHost] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipUriUserHost(sipUriUserHost: JsonField<String>) = apply {
                this.sipUriUserHost = sipUriUserHost
            }

            /** Transport used for the registration, e.g. UDP/TCP/TLS (telephony_credential). */
            fun transport(transport: String) = transport(JsonField.of(transport))

            /**
             * Sets [Builder.transport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transport] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transport(transport: JsonField<String>) = apply { this.transport = transport }

            /** IP address of the registered user agent (telephony_credential). */
            fun uaIp(uaIp: String) = uaIp(JsonField.of(uaIp))

            /**
             * Sets [Builder.uaIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uaIp] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uaIp(uaIp: JsonField<String>) = apply { this.uaIp = uaIp }

            /** Port of the registered user agent (telephony_credential). */
            fun uaPort(uaPort: Long) = uaPort(JsonField.of(uaPort))

            /**
             * Sets [Builder.uaPort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uaPort] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uaPort(uaPort: JsonField<Long>) = apply { this.uaPort = uaPort }

            /** Registration uptime reported by the registrar. */
            fun uptime(uptime: Long) = uptime(JsonField.of(uptime))

            /**
             * Sets [Builder.uptime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uptime] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uptime(uptime: JsonField<Long>) = apply { this.uptime = uptime }

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
             * Returns an immutable instance of [SipRegistrationDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SipRegistrationDetails =
                SipRegistrationDetails(
                    authRetries,
                    expires,
                    failures,
                    lastModified,
                    nextActionAt,
                    node,
                    sipUriUserHost,
                    transport,
                    uaIp,
                    uaPort,
                    uptime,
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
        fun validate(): SipRegistrationDetails = apply {
            if (validated) {
                return@apply
            }

            authRetries()
            expires()
            failures()
            lastModified()
            nextActionAt()
            node()
            sipUriUserHost()
            transport()
            uaIp()
            uaPort()
            uptime()
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
            (if (authRetries.asKnown().isPresent) 1 else 0) +
                (if (expires.asKnown().isPresent) 1 else 0) +
                (if (failures.asKnown().isPresent) 1 else 0) +
                (if (lastModified.asKnown().isPresent) 1 else 0) +
                (if (nextActionAt.asKnown().isPresent) 1 else 0) +
                (if (node.asKnown().isPresent) 1 else 0) +
                (if (sipUriUserHost.asKnown().isPresent) 1 else 0) +
                (if (transport.asKnown().isPresent) 1 else 0) +
                (if (uaIp.asKnown().isPresent) 1 else 0) +
                (if (uaPort.asKnown().isPresent) 1 else 0) +
                (if (uptime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SipRegistrationDetails &&
                authRetries == other.authRetries &&
                expires == other.expires &&
                failures == other.failures &&
                lastModified == other.lastModified &&
                nextActionAt == other.nextActionAt &&
                node == other.node &&
                sipUriUserHost == other.sipUriUserHost &&
                transport == other.transport &&
                uaIp == other.uaIp &&
                uaPort == other.uaPort &&
                uptime == other.uptime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                authRetries,
                expires,
                failures,
                lastModified,
                nextActionAt,
                node,
                sipUriUserHost,
                transport,
                uaIp,
                uaPort,
                uptime,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SipRegistrationDetails{authRetries=$authRetries, expires=$expires, failures=$failures, lastModified=$lastModified, nextActionAt=$nextActionAt, node=$node, sipUriUserHost=$sipUriUserHost, transport=$transport, uaIp=$uaIp, uaPort=$uaPort, uptime=$uptime, additionalProperties=$additionalProperties}"
    }

    /** Human-readable registration status derived from the registrar state. */
    class SipRegistrationStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UNREGISTERING = of("unregistering")

            @JvmField val CONNECTION_DISABLED = of("connection_disabled")

            @JvmField val STANDBY = of("standby")

            @JvmField val FAILED = of("failed")

            @JvmField val TRYING = of("trying")

            @JvmField val REGISTERED = of("registered")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = SipRegistrationStatus(JsonField.of(value))
        }

        /** An enum containing [SipRegistrationStatus]'s known values. */
        enum class Known {
            UNREGISTERING,
            CONNECTION_DISABLED,
            STANDBY,
            FAILED,
            TRYING,
            REGISTERED,
            UNKNOWN,
        }

        /**
         * An enum containing [SipRegistrationStatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SipRegistrationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNREGISTERING,
            CONNECTION_DISABLED,
            STANDBY,
            FAILED,
            TRYING,
            REGISTERED,
            UNKNOWN,
            /**
             * An enum member indicating that [SipRegistrationStatus] was instantiated with an
             * unknown value.
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
                UNREGISTERING -> Value.UNREGISTERING
                CONNECTION_DISABLED -> Value.CONNECTION_DISABLED
                STANDBY -> Value.STANDBY
                FAILED -> Value.FAILED
                TRYING -> Value.TRYING
                REGISTERED -> Value.REGISTERED
                UNKNOWN -> Value.UNKNOWN
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
                UNREGISTERING -> Known.UNREGISTERING
                CONNECTION_DISABLED -> Known.CONNECTION_DISABLED
                STANDBY -> Known.STANDBY
                FAILED -> Known.FAILED
                TRYING -> Known.TRYING
                REGISTERED -> Known.REGISTERED
                UNKNOWN -> Known.UNKNOWN
                else -> throw TelnyxInvalidDataException("Unknown SipRegistrationStatus: $value")
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
        fun validate(): SipRegistrationStatus = apply {
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

            return other is SipRegistrationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SipRegistrationStatusRetrieveResponse &&
            connectionId == other.connectionId &&
            connectionName == other.connectionName &&
            credentialType == other.credentialType &&
            credentialUsername == other.credentialUsername &&
            lastRegistrationResponse == other.lastRegistrationResponse &&
            registered == other.registered &&
            sipRegistrationDetails == other.sipRegistrationDetails &&
            sipRegistrationStatus == other.sipRegistrationStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            connectionId,
            connectionName,
            credentialType,
            credentialUsername,
            lastRegistrationResponse,
            registered,
            sipRegistrationDetails,
            sipRegistrationStatus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SipRegistrationStatusRetrieveResponse{connectionId=$connectionId, connectionName=$connectionName, credentialType=$credentialType, credentialUsername=$credentialUsername, lastRegistrationResponse=$lastRegistrationResponse, registered=$registered, sipRegistrationDetails=$sipRegistrationDetails, sipRegistrationStatus=$sipRegistrationStatus, additionalProperties=$additionalProperties}"
}
