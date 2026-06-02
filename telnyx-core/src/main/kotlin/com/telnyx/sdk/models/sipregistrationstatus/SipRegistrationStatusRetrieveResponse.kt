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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SipRegistrationStatusRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val b2buaExternal: JsonField<B2buaExternal>,
    private val b2buaInternal: JsonField<B2buaInternal>,
    private val connectionId: JsonField<String>,
    private val connectionName: JsonField<String>,
    private val credentialType: JsonField<CredentialType>,
    private val externalState: JsonField<String>,
    private val externalUacSettings: JsonField<ExternalUacSettings>,
    private val internalUacSettings: JsonField<InternalUacSettings>,
    private val lastRegistrationResponse: JsonField<String>,
    private val pairState: JsonField<String>,
    private val registered: JsonField<Boolean>,
    private val userId: JsonField<String>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("b2bua_external")
        @ExcludeMissing
        b2buaExternal: JsonField<B2buaExternal> = JsonMissing.of(),
        @JsonProperty("b2bua_internal")
        @ExcludeMissing
        b2buaInternal: JsonField<B2buaInternal> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_name")
        @ExcludeMissing
        connectionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credential_type")
        @ExcludeMissing
        credentialType: JsonField<CredentialType> = JsonMissing.of(),
        @JsonProperty("external_state")
        @ExcludeMissing
        externalState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_uac_settings")
        @ExcludeMissing
        externalUacSettings: JsonField<ExternalUacSettings> = JsonMissing.of(),
        @JsonProperty("internal_uac_settings")
        @ExcludeMissing
        internalUacSettings: JsonField<InternalUacSettings> = JsonMissing.of(),
        @JsonProperty("last_registration_response")
        @ExcludeMissing
        lastRegistrationResponse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pair_state") @ExcludeMissing pairState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registered")
        @ExcludeMissing
        registered: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(
        b2buaExternal,
        b2buaInternal,
        connectionId,
        connectionName,
        credentialType,
        externalState,
        externalUacSettings,
        internalUacSettings,
        lastRegistrationResponse,
        pairState,
        registered,
        userId,
        username,
        mutableMapOf(),
    )

    /**
     * Raw external-side registration block reported by the registrar.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun b2buaExternal(): Optional<B2buaExternal> = b2buaExternal.getOptional("b2bua_external")

    /**
     * Raw internal-side block reported by the registrar.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun b2buaInternal(): Optional<B2buaInternal> = b2buaInternal.getOptional("b2bua_internal")

    /**
     * Identifier of the UAC connection.
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
     * Registration state on the external (UAC / PBX) side, e.g. REGED.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalState(): Optional<String> = externalState.getOptional("external_state")

    /**
     * Outward-facing SIP settings used for registration. Password is redacted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalUacSettings(): Optional<ExternalUacSettings> =
        externalUacSettings.getOptional("external_uac_settings")

    /**
     * Internal routing target the connection delivers calls to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun internalUacSettings(): Optional<InternalUacSettings> =
        internalUacSettings.getOptional("internal_uac_settings")

    /**
     * SIP response from the last registration attempt.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRegistrationResponse(): Optional<String> =
        lastRegistrationResponse.getOptional("last_registration_response")

    /**
     * Internal pairing state, e.g. ACTIVE or INACTIVE.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pairState(): Optional<String> = pairState.getOptional("pair_state")

    /**
     * True if the endpoint is currently registered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registered(): Optional<Boolean> = registered.getOptional("registered")

    /**
     * Owner of the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * SIP username used for the registration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): Optional<String> = username.getOptional("username")

    /**
     * Returns the raw JSON value of [b2buaExternal].
     *
     * Unlike [b2buaExternal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("b2bua_external")
    @ExcludeMissing
    fun _b2buaExternal(): JsonField<B2buaExternal> = b2buaExternal

    /**
     * Returns the raw JSON value of [b2buaInternal].
     *
     * Unlike [b2buaInternal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("b2bua_internal")
    @ExcludeMissing
    fun _b2buaInternal(): JsonField<B2buaInternal> = b2buaInternal

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
     * Returns the raw JSON value of [externalState].
     *
     * Unlike [externalState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_state")
    @ExcludeMissing
    fun _externalState(): JsonField<String> = externalState

    /**
     * Returns the raw JSON value of [externalUacSettings].
     *
     * Unlike [externalUacSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_uac_settings")
    @ExcludeMissing
    fun _externalUacSettings(): JsonField<ExternalUacSettings> = externalUacSettings

    /**
     * Returns the raw JSON value of [internalUacSettings].
     *
     * Unlike [internalUacSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("internal_uac_settings")
    @ExcludeMissing
    fun _internalUacSettings(): JsonField<InternalUacSettings> = internalUacSettings

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
     * Returns the raw JSON value of [pairState].
     *
     * Unlike [pairState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pair_state") @ExcludeMissing fun _pairState(): JsonField<String> = pairState

    /**
     * Returns the raw JSON value of [registered].
     *
     * Unlike [registered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("registered") @ExcludeMissing fun _registered(): JsonField<Boolean> = registered

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [SipRegistrationStatusRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SipRegistrationStatusRetrieveResponse]. */
    class Builder internal constructor() {

        private var b2buaExternal: JsonField<B2buaExternal> = JsonMissing.of()
        private var b2buaInternal: JsonField<B2buaInternal> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var connectionName: JsonField<String> = JsonMissing.of()
        private var credentialType: JsonField<CredentialType> = JsonMissing.of()
        private var externalState: JsonField<String> = JsonMissing.of()
        private var externalUacSettings: JsonField<ExternalUacSettings> = JsonMissing.of()
        private var internalUacSettings: JsonField<InternalUacSettings> = JsonMissing.of()
        private var lastRegistrationResponse: JsonField<String> = JsonMissing.of()
        private var pairState: JsonField<String> = JsonMissing.of()
        private var registered: JsonField<Boolean> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            sipRegistrationStatusRetrieveResponse: SipRegistrationStatusRetrieveResponse
        ) = apply {
            b2buaExternal = sipRegistrationStatusRetrieveResponse.b2buaExternal
            b2buaInternal = sipRegistrationStatusRetrieveResponse.b2buaInternal
            connectionId = sipRegistrationStatusRetrieveResponse.connectionId
            connectionName = sipRegistrationStatusRetrieveResponse.connectionName
            credentialType = sipRegistrationStatusRetrieveResponse.credentialType
            externalState = sipRegistrationStatusRetrieveResponse.externalState
            externalUacSettings = sipRegistrationStatusRetrieveResponse.externalUacSettings
            internalUacSettings = sipRegistrationStatusRetrieveResponse.internalUacSettings
            lastRegistrationResponse =
                sipRegistrationStatusRetrieveResponse.lastRegistrationResponse
            pairState = sipRegistrationStatusRetrieveResponse.pairState
            registered = sipRegistrationStatusRetrieveResponse.registered
            userId = sipRegistrationStatusRetrieveResponse.userId
            username = sipRegistrationStatusRetrieveResponse.username
            additionalProperties =
                sipRegistrationStatusRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Raw external-side registration block reported by the registrar. */
        fun b2buaExternal(b2buaExternal: B2buaExternal) = b2buaExternal(JsonField.of(b2buaExternal))

        /**
         * Sets [Builder.b2buaExternal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.b2buaExternal] with a well-typed [B2buaExternal] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun b2buaExternal(b2buaExternal: JsonField<B2buaExternal>) = apply {
            this.b2buaExternal = b2buaExternal
        }

        /** Raw internal-side block reported by the registrar. */
        fun b2buaInternal(b2buaInternal: B2buaInternal) = b2buaInternal(JsonField.of(b2buaInternal))

        /**
         * Sets [Builder.b2buaInternal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.b2buaInternal] with a well-typed [B2buaInternal] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun b2buaInternal(b2buaInternal: JsonField<B2buaInternal>) = apply {
            this.b2buaInternal = b2buaInternal
        }

        /** Identifier of the UAC connection. */
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

        /** Registration state on the external (UAC / PBX) side, e.g. REGED. */
        fun externalState(externalState: String) = externalState(JsonField.of(externalState))

        /**
         * Sets [Builder.externalState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalState(externalState: JsonField<String>) = apply {
            this.externalState = externalState
        }

        /** Outward-facing SIP settings used for registration. Password is redacted. */
        fun externalUacSettings(externalUacSettings: ExternalUacSettings) =
            externalUacSettings(JsonField.of(externalUacSettings))

        /**
         * Sets [Builder.externalUacSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalUacSettings] with a well-typed
         * [ExternalUacSettings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun externalUacSettings(externalUacSettings: JsonField<ExternalUacSettings>) = apply {
            this.externalUacSettings = externalUacSettings
        }

        /** Internal routing target the connection delivers calls to. */
        fun internalUacSettings(internalUacSettings: InternalUacSettings) =
            internalUacSettings(JsonField.of(internalUacSettings))

        /**
         * Sets [Builder.internalUacSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalUacSettings] with a well-typed
         * [InternalUacSettings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun internalUacSettings(internalUacSettings: JsonField<InternalUacSettings>) = apply {
            this.internalUacSettings = internalUacSettings
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

        /** Internal pairing state, e.g. ACTIVE or INACTIVE. */
        fun pairState(pairState: String) = pairState(JsonField.of(pairState))

        /**
         * Sets [Builder.pairState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pairState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pairState(pairState: JsonField<String>) = apply { this.pairState = pairState }

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

        /** Owner of the connection. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** SIP username used for the registration. */
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
         * Returns an immutable instance of [SipRegistrationStatusRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SipRegistrationStatusRetrieveResponse =
            SipRegistrationStatusRetrieveResponse(
                b2buaExternal,
                b2buaInternal,
                connectionId,
                connectionName,
                credentialType,
                externalState,
                externalUacSettings,
                internalUacSettings,
                lastRegistrationResponse,
                pairState,
                registered,
                userId,
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
    fun validate(): SipRegistrationStatusRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        b2buaExternal().ifPresent { it.validate() }
        b2buaInternal().ifPresent { it.validate() }
        connectionId()
        connectionName()
        credentialType().ifPresent { it.validate() }
        externalState()
        externalUacSettings().ifPresent { it.validate() }
        internalUacSettings().ifPresent { it.validate() }
        lastRegistrationResponse()
        pairState()
        registered()
        userId()
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
        (b2buaExternal.asKnown().getOrNull()?.validity() ?: 0) +
            (b2buaInternal.asKnown().getOrNull()?.validity() ?: 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (connectionName.asKnown().isPresent) 1 else 0) +
            (credentialType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalState.asKnown().isPresent) 1 else 0) +
            (externalUacSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (internalUacSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lastRegistrationResponse.asKnown().isPresent) 1 else 0) +
            (if (pairState.asKnown().isPresent) 1 else 0) +
            (if (registered.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (username.asKnown().isPresent) 1 else 0)

    /** Raw external-side registration block reported by the registrar. */
    class B2buaExternal
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

            /** Returns a mutable builder for constructing an instance of [B2buaExternal]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [B2buaExternal]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(b2buaExternal: B2buaExternal) = apply {
                additionalProperties = b2buaExternal.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [B2buaExternal].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): B2buaExternal = B2buaExternal(additionalProperties.toImmutable())
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
        fun validate(): B2buaExternal = apply {
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

            return other is B2buaExternal && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "B2buaExternal{additionalProperties=$additionalProperties}"
    }

    /** Raw internal-side block reported by the registrar. */
    class B2buaInternal
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

            /** Returns a mutable builder for constructing an instance of [B2buaInternal]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [B2buaInternal]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(b2buaInternal: B2buaInternal) = apply {
                additionalProperties = b2buaInternal.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [B2buaInternal].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): B2buaInternal = B2buaInternal(additionalProperties.toImmutable())
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
        fun validate(): B2buaInternal = apply {
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

            return other is B2buaInternal && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "B2buaInternal{additionalProperties=$additionalProperties}"
    }

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

            @JvmStatic fun of(value: String) = CredentialType(JsonField.of(value))
        }

        /** An enum containing [CredentialType]'s known values. */
        enum class Known {
            UAC_EXTERNAL_CREDENTIAL
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

    /** Outward-facing SIP settings used for registration. Password is redacted. */
    class ExternalUacSettings
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
            @JsonProperty("from_user")
            @ExcludeMissing
            fromUser: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outbound_proxy")
            @ExcludeMissing
            outboundProxy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authUsername(): Optional<String> = authUsername.getOptional("auth_username")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expirationSec(): Optional<Long> = expirationSec.getOptional("expiration_sec")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fromUser(): Optional<String> = fromUser.getOptional("from_user")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundProxy(): Optional<String> = outboundProxy.getOptional("outbound_proxy")

        /**
         * Always redacted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun proxy(): Optional<String> = proxy.getOptional("proxy")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transport(): Optional<Transport> = transport.getOptional("transport")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun username(): Optional<String> = username.getOptional("username")

        /**
         * Returns the raw JSON value of [authUsername].
         *
         * Unlike [authUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auth_username")
        @ExcludeMissing
        fun _authUsername(): JsonField<String> = authUsername

        /**
         * Returns the raw JSON value of [expirationSec].
         *
         * Unlike [expirationSec], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [outboundProxy], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("transport")
        @ExcludeMissing
        fun _transport(): JsonField<Transport> = transport

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

            /** Returns a mutable builder for constructing an instance of [ExternalUacSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalUacSettings]. */
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
            internal fun from(externalUacSettings: ExternalUacSettings) = apply {
                authUsername = externalUacSettings.authUsername
                expirationSec = externalUacSettings.expirationSec
                fromUser = externalUacSettings.fromUser
                outboundProxy = externalUacSettings.outboundProxy
                password = externalUacSettings.password
                proxy = externalUacSettings.proxy
                transport = externalUacSettings.transport
                username = externalUacSettings.username
                additionalProperties = externalUacSettings.additionalProperties.toMutableMap()
            }

            fun authUsername(authUsername: String) = authUsername(JsonField.of(authUsername))

            /**
             * Sets [Builder.authUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authUsername(authUsername: JsonField<String>) = apply {
                this.authUsername = authUsername
            }

            fun expirationSec(expirationSec: Long) = expirationSec(JsonField.of(expirationSec))

            /**
             * Sets [Builder.expirationSec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationSec] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationSec(expirationSec: JsonField<Long>) = apply {
                this.expirationSec = expirationSec
            }

            fun fromUser(fromUser: String) = fromUser(JsonField.of(fromUser))

            /**
             * Sets [Builder.fromUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromUser] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromUser(fromUser: JsonField<String>) = apply { this.fromUser = fromUser }

            fun outboundProxy(outboundProxy: String) = outboundProxy(JsonField.of(outboundProxy))

            /**
             * Sets [Builder.outboundProxy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundProxy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outboundProxy(outboundProxy: JsonField<String>) = apply {
                this.outboundProxy = outboundProxy
            }

            /** Always redacted. */
            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            fun proxy(proxy: String) = proxy(JsonField.of(proxy))

            /**
             * Sets [Builder.proxy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proxy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proxy(proxy: JsonField<String>) = apply { this.proxy = proxy }

            fun transport(transport: Transport) = transport(JsonField.of(transport))

            /**
             * Sets [Builder.transport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transport] with a well-typed [Transport] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transport(transport: JsonField<Transport>) = apply { this.transport = transport }

            fun username(username: String) = username(JsonField.of(username))

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [ExternalUacSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExternalUacSettings =
                ExternalUacSettings(
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ExternalUacSettings = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

        class Transport @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TCP = of("TCP")

                @JvmField val UDP = of("UDP")

                @JvmField val TLS = of("TLS")

                @JvmStatic fun of(value: String) = Transport(JsonField.of(value))
            }

            /** An enum containing [Transport]'s known values. */
            enum class Known {
                TCP,
                UDP,
                TLS,
            }

            /**
             * An enum containing [Transport]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Transport] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TCP,
                UDP,
                TLS,
                /**
                 * An enum member indicating that [Transport] was instantiated with an unknown
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
                    TCP -> Value.TCP
                    UDP -> Value.UDP
                    TLS -> Value.TLS
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
                    TCP -> Known.TCP
                    UDP -> Known.UDP
                    TLS -> Known.TLS
                    else -> throw TelnyxInvalidDataException("Unknown Transport: $value")
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

            return other is ExternalUacSettings &&
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
            "ExternalUacSettings{authUsername=$authUsername, expirationSec=$expirationSec, fromUser=$fromUser, outboundProxy=$outboundProxy, password=$password, proxy=$proxy, transport=$transport, username=$username, additionalProperties=$additionalProperties}"
    }

    /** Internal routing target the connection delivers calls to. */
    class InternalUacSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destinationUri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destination_uri")
            @ExcludeMissing
            destinationUri: JsonField<String> = JsonMissing.of()
        ) : this(destinationUri, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destinationUri(): Optional<String> = destinationUri.getOptional("destination_uri")

        /**
         * Returns the raw JSON value of [destinationUri].
         *
         * Unlike [destinationUri], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destination_uri")
        @ExcludeMissing
        fun _destinationUri(): JsonField<String> = destinationUri

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

            /** Returns a mutable builder for constructing an instance of [InternalUacSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InternalUacSettings]. */
        class Builder internal constructor() {

            private var destinationUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(internalUacSettings: InternalUacSettings) = apply {
                destinationUri = internalUacSettings.destinationUri
                additionalProperties = internalUacSettings.additionalProperties.toMutableMap()
            }

            fun destinationUri(destinationUri: String) =
                destinationUri(JsonField.of(destinationUri))

            /**
             * Sets [Builder.destinationUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationUri(destinationUri: JsonField<String>) = apply {
                this.destinationUri = destinationUri
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
             * Returns an immutable instance of [InternalUacSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InternalUacSettings =
                InternalUacSettings(destinationUri, additionalProperties.toMutableMap())
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
        fun validate(): InternalUacSettings = apply {
            if (validated) {
                return@apply
            }

            destinationUri()
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
        internal fun validity(): Int = (if (destinationUri.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InternalUacSettings &&
                destinationUri == other.destinationUri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(destinationUri, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InternalUacSettings{destinationUri=$destinationUri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SipRegistrationStatusRetrieveResponse &&
            b2buaExternal == other.b2buaExternal &&
            b2buaInternal == other.b2buaInternal &&
            connectionId == other.connectionId &&
            connectionName == other.connectionName &&
            credentialType == other.credentialType &&
            externalState == other.externalState &&
            externalUacSettings == other.externalUacSettings &&
            internalUacSettings == other.internalUacSettings &&
            lastRegistrationResponse == other.lastRegistrationResponse &&
            pairState == other.pairState &&
            registered == other.registered &&
            userId == other.userId &&
            username == other.username &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            b2buaExternal,
            b2buaInternal,
            connectionId,
            connectionName,
            credentialType,
            externalState,
            externalUacSettings,
            internalUacSettings,
            lastRegistrationResponse,
            pairState,
            registered,
            userId,
            username,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SipRegistrationStatusRetrieveResponse{b2buaExternal=$b2buaExternal, b2buaInternal=$b2buaInternal, connectionId=$connectionId, connectionName=$connectionName, credentialType=$credentialType, externalState=$externalState, externalUacSettings=$externalUacSettings, internalUacSettings=$internalUacSettings, lastRegistrationResponse=$lastRegistrationResponse, pairState=$pairState, registered=$registered, userId=$userId, username=$username, additionalProperties=$additionalProperties}"
}
