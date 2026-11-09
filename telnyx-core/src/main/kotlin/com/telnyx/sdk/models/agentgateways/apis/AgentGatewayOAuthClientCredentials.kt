// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The gateway gets its own access token with the `client_credentials` grant and sends it as a
 * bearer token on every request, renewing it before it expires. The client ID and secret are
 * write-only.
 */
class AgentGatewayOAuthClientCredentials
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientId: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val tokenUrl: JsonField<String>,
    private val type: JsonValue,
    private val audience: JsonField<String>,
    private val credentialsIn: JsonField<CredentialsIn>,
    private val resource: JsonField<String>,
    private val scopes: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_url") @ExcludeMissing tokenUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("audience") @ExcludeMissing audience: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credentials_in")
        @ExcludeMissing
        credentialsIn: JsonField<CredentialsIn> = JsonMissing.of(),
        @JsonProperty("resource") @ExcludeMissing resource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        clientId,
        clientSecret,
        tokenUrl,
        type,
        audience,
        credentialsIn,
        resource,
        scopes,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientSecret(): String = clientSecret.getRequired("client_secret")

    /**
     * The OAuth provider's token endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenUrl(): String = tokenUrl.getRequired("token_url")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("oauth_client_credentials")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * The token's audience, sent in the token request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audience(): Optional<String> = audience.getOptional("audience")

    /**
     * Whether the client ID and secret go in the token request's body or as HTTP Basic
     * authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentialsIn(): Optional<CredentialsIn> = credentialsIn.getOptional("credentials_in")

    /**
     * The resource the token is for, sent in the token request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resource(): Optional<String> = resource.getOptional("resource")

    /**
     * The scopes to request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    /**
     * Returns the raw JSON value of [tokenUrl].
     *
     * Unlike [tokenUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_url") @ExcludeMissing fun _tokenUrl(): JsonField<String> = tokenUrl

    /**
     * Returns the raw JSON value of [audience].
     *
     * Unlike [audience], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audience") @ExcludeMissing fun _audience(): JsonField<String> = audience

    /**
     * Returns the raw JSON value of [credentialsIn].
     *
     * Unlike [credentialsIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credentials_in")
    @ExcludeMissing
    fun _credentialsIn(): JsonField<CredentialsIn> = credentialsIn

    /**
     * Returns the raw JSON value of [resource].
     *
     * Unlike [resource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource") @ExcludeMissing fun _resource(): JsonField<String> = resource

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

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
         * [AgentGatewayOAuthClientCredentials].
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientSecret()
         * .tokenUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayOAuthClientCredentials]. */
    class Builder internal constructor() {

        private var clientId: JsonField<String>? = null
        private var clientSecret: JsonField<String>? = null
        private var tokenUrl: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("oauth_client_credentials")
        private var audience: JsonField<String> = JsonMissing.of()
        private var credentialsIn: JsonField<CredentialsIn> = JsonMissing.of()
        private var resource: JsonField<String> = JsonMissing.of()
        private var scopes: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials) =
            apply {
                clientId = agentGatewayOAuthClientCredentials.clientId
                clientSecret = agentGatewayOAuthClientCredentials.clientSecret
                tokenUrl = agentGatewayOAuthClientCredentials.tokenUrl
                type = agentGatewayOAuthClientCredentials.type
                audience = agentGatewayOAuthClientCredentials.audience
                credentialsIn = agentGatewayOAuthClientCredentials.credentialsIn
                resource = agentGatewayOAuthClientCredentials.resource
                scopes = agentGatewayOAuthClientCredentials.scopes.map { it.toMutableList() }
                additionalProperties =
                    agentGatewayOAuthClientCredentials.additionalProperties.toMutableMap()
            }

        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        /** The OAuth provider's token endpoint. */
        fun tokenUrl(tokenUrl: String) = tokenUrl(JsonField.of(tokenUrl))

        /**
         * Sets [Builder.tokenUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tokenUrl(tokenUrl: JsonField<String>) = apply { this.tokenUrl = tokenUrl }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("oauth_client_credentials")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        /** The token's audience, sent in the token request. */
        fun audience(audience: String?) = audience(JsonField.ofNullable(audience))

        /** Alias for calling [Builder.audience] with `audience.orElse(null)`. */
        fun audience(audience: Optional<String>) = audience(audience.getOrNull())

        /**
         * Sets [Builder.audience] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audience] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun audience(audience: JsonField<String>) = apply { this.audience = audience }

        /**
         * Whether the client ID and secret go in the token request's body or as HTTP Basic
         * authentication.
         */
        fun credentialsIn(credentialsIn: CredentialsIn) = credentialsIn(JsonField.of(credentialsIn))

        /**
         * Sets [Builder.credentialsIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialsIn] with a well-typed [CredentialsIn] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentialsIn(credentialsIn: JsonField<CredentialsIn>) = apply {
            this.credentialsIn = credentialsIn
        }

        /** The resource the token is for, sent in the token request. */
        fun resource(resource: String?) = resource(JsonField.ofNullable(resource))

        /** Alias for calling [Builder.resource] with `resource.orElse(null)`. */
        fun resource(resource: Optional<String>) = resource(resource.getOrNull())

        /**
         * Sets [Builder.resource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resource] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun resource(resource: JsonField<String>) = apply { this.resource = resource }

        /** The scopes to request. */
        fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

        /**
         * Sets [Builder.scopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scopes(scopes: JsonField<List<String>>) = apply {
            this.scopes = scopes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [scopes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScope(scope: String) = apply {
            scopes =
                (scopes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopes", it).add(scope)
                }
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
         * Returns an immutable instance of [AgentGatewayOAuthClientCredentials].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientSecret()
         * .tokenUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayOAuthClientCredentials =
            AgentGatewayOAuthClientCredentials(
                checkRequired("clientId", clientId),
                checkRequired("clientSecret", clientSecret),
                checkRequired("tokenUrl", tokenUrl),
                type,
                audience,
                credentialsIn,
                resource,
                (scopes ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AgentGatewayOAuthClientCredentials = apply {
        if (validated) {
            return@apply
        }

        clientId()
        clientSecret()
        tokenUrl()
        _type().let {
            if (it != JsonValue.from("oauth_client_credentials")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
        }
        audience()
        credentialsIn().ifPresent { it.validate() }
        resource()
        scopes()
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
        (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (clientSecret.asKnown().isPresent) 1 else 0) +
            (if (tokenUrl.asKnown().isPresent) 1 else 0) +
            type.let { if (it == JsonValue.from("oauth_client_credentials")) 1 else 0 } +
            (if (audience.asKnown().isPresent) 1 else 0) +
            (credentialsIn.asKnown().getOrNull()?.validity() ?: 0) +
            (if (resource.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0)

    /**
     * Whether the client ID and secret go in the token request's body or as HTTP Basic
     * authentication.
     */
    class CredentialsIn @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BODY = of("body")

            @JvmField val BASIC = of("basic")

            @JvmStatic fun of(value: String) = CredentialsIn(JsonField.of(value))
        }

        /** An enum containing [CredentialsIn]'s known values. */
        enum class Known {
            BODY,
            BASIC,
        }

        /**
         * An enum containing [CredentialsIn]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CredentialsIn] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BODY,
            BASIC,
            /**
             * An enum member indicating that [CredentialsIn] was instantiated with an unknown
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
                BODY -> Value.BODY
                BASIC -> Value.BASIC
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
                BODY -> Known.BODY
                BASIC -> Known.BASIC
                else -> throw TelnyxInvalidDataException("Unknown CredentialsIn: $value")
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
        fun validate(): CredentialsIn = apply {
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

            return other is CredentialsIn && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayOAuthClientCredentials &&
            clientId == other.clientId &&
            clientSecret == other.clientSecret &&
            tokenUrl == other.tokenUrl &&
            type == other.type &&
            audience == other.audience &&
            credentialsIn == other.credentialsIn &&
            resource == other.resource &&
            scopes == other.scopes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clientId,
            clientSecret,
            tokenUrl,
            type,
            audience,
            credentialsIn,
            resource,
            scopes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayOAuthClientCredentials{clientId=$clientId, clientSecret=$clientSecret, tokenUrl=$tokenUrl, type=$type, audience=$audience, credentialsIn=$credentialsIn, resource=$resource, scopes=$scopes, additionalProperties=$additionalProperties}"
}
