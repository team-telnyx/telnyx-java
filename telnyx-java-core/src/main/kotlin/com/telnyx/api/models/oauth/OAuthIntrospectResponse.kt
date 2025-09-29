// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class OAuthIntrospectResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val active: JsonField<Boolean>,
    private val aud: JsonField<String>,
    private val clientId: JsonField<String>,
    private val exp: JsonField<Long>,
    private val iat: JsonField<Long>,
    private val iss: JsonField<String>,
    private val scope: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("aud") @ExcludeMissing aud: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp") @ExcludeMissing exp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("iat") @ExcludeMissing iat: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("iss") @ExcludeMissing iss: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<String> = JsonMissing.of(),
    ) : this(active, aud, clientId, exp, iat, iss, scope, mutableMapOf())

    /**
     * Whether the token is active
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun active(): Boolean = active.getRequired("active")

    /**
     * Audience
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aud(): Optional<String> = aud.getOptional("aud")

    /**
     * Client identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientId(): Optional<String> = clientId.getOptional("client_id")

    /**
     * Expiration timestamp
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exp(): Optional<Long> = exp.getOptional("exp")

    /**
     * Issued at timestamp
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iat(): Optional<Long> = iat.getOptional("iat")

    /**
     * Issuer
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iss(): Optional<String> = iss.getOptional("iss")

    /**
     * Space-separated list of scopes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<String> = scope.getOptional("scope")

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [aud].
     *
     * Unlike [aud], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aud") @ExcludeMissing fun _aud(): JsonField<String> = aud

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * Returns the raw JSON value of [exp].
     *
     * Unlike [exp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exp") @ExcludeMissing fun _exp(): JsonField<Long> = exp

    /**
     * Returns the raw JSON value of [iat].
     *
     * Unlike [iat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iat") @ExcludeMissing fun _iat(): JsonField<Long> = iat

    /**
     * Returns the raw JSON value of [iss].
     *
     * Unlike [iss], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iss") @ExcludeMissing fun _iss(): JsonField<String> = iss

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<String> = scope

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
         * Returns a mutable builder for constructing an instance of [OAuthIntrospectResponse].
         *
         * The following fields are required:
         * ```java
         * .active()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthIntrospectResponse]. */
    class Builder internal constructor() {

        private var active: JsonField<Boolean>? = null
        private var aud: JsonField<String> = JsonMissing.of()
        private var clientId: JsonField<String> = JsonMissing.of()
        private var exp: JsonField<Long> = JsonMissing.of()
        private var iat: JsonField<Long> = JsonMissing.of()
        private var iss: JsonField<String> = JsonMissing.of()
        private var scope: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthIntrospectResponse: OAuthIntrospectResponse) = apply {
            active = oauthIntrospectResponse.active
            aud = oauthIntrospectResponse.aud
            clientId = oauthIntrospectResponse.clientId
            exp = oauthIntrospectResponse.exp
            iat = oauthIntrospectResponse.iat
            iss = oauthIntrospectResponse.iss
            scope = oauthIntrospectResponse.scope
            additionalProperties = oauthIntrospectResponse.additionalProperties.toMutableMap()
        }

        /** Whether the token is active */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /** Audience */
        fun aud(aud: String) = aud(JsonField.of(aud))

        /**
         * Sets [Builder.aud] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aud] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aud(aud: JsonField<String>) = apply { this.aud = aud }

        /** Client identifier */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /** Expiration timestamp */
        fun exp(exp: Long) = exp(JsonField.of(exp))

        /**
         * Sets [Builder.exp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exp] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exp(exp: JsonField<Long>) = apply { this.exp = exp }

        /** Issued at timestamp */
        fun iat(iat: Long) = iat(JsonField.of(iat))

        /**
         * Sets [Builder.iat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iat] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iat(iat: JsonField<Long>) = apply { this.iat = iat }

        /** Issuer */
        fun iss(iss: String) = iss(JsonField.of(iss))

        /**
         * Sets [Builder.iss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iss] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iss(iss: JsonField<String>) = apply { this.iss = iss }

        /** Space-separated list of scopes */
        fun scope(scope: String) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<String>) = apply { this.scope = scope }

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
         * Returns an immutable instance of [OAuthIntrospectResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .active()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthIntrospectResponse =
            OAuthIntrospectResponse(
                checkRequired("active", active),
                aud,
                clientId,
                exp,
                iat,
                iss,
                scope,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OAuthIntrospectResponse = apply {
        if (validated) {
            return@apply
        }

        active()
        aud()
        clientId()
        exp()
        iat()
        iss()
        scope()
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
        (if (active.asKnown().isPresent) 1 else 0) +
            (if (aud.asKnown().isPresent) 1 else 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (exp.asKnown().isPresent) 1 else 0) +
            (if (iat.asKnown().isPresent) 1 else 0) +
            (if (iss.asKnown().isPresent) 1 else 0) +
            (if (scope.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthIntrospectResponse &&
            active == other.active &&
            aud == other.aud &&
            clientId == other.clientId &&
            exp == other.exp &&
            iat == other.iat &&
            iss == other.iss &&
            scope == other.scope &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(active, aud, clientId, exp, iat, iss, scope, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthIntrospectResponse{active=$active, aud=$aud, clientId=$clientId, exp=$exp, iat=$iat, iss=$iss, scope=$scope, additionalProperties=$additionalProperties}"
}
