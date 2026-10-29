// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * What a server needs to mint login tokens for the credential itself, with no request per token
 * (`TelephonyCredential#to_jwt` in telnyx-ruby 3.1.0 or later). As sensitive as `sip_password`:
 * keep it on the server.
 */
class TokenMaterial
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val kid: JsonField<String>,
    private val signingSecret: JsonField<String>,
    private val telToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("kid") @ExcludeMissing kid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signing_secret")
        @ExcludeMissing
        signingSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tel_token") @ExcludeMissing telToken: JsonField<String> = JsonMissing.of(),
    ) : this(kid, signingSecret, telToken, mutableMapOf())

    /**
     * Identifies the Telnyx signing key the `signing_secret` was derived with. Goes in the token
     * header.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun kid(): Optional<String> = kid.getOptional("kid")

    /**
     * The HMAC-SHA256 key the token is signed with, base64url without padding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signingSecret(): Optional<String> = signingSecret.getOptional("signing_secret")

    /**
     * Opaque value Telnyx uses to resolve the credential. Carried in the token's `tel_token` claim
     * as is.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telToken(): Optional<String> = telToken.getOptional("tel_token")

    /**
     * Returns the raw JSON value of [kid].
     *
     * Unlike [kid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kid") @ExcludeMissing fun _kid(): JsonField<String> = kid

    /**
     * Returns the raw JSON value of [signingSecret].
     *
     * Unlike [signingSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signing_secret")
    @ExcludeMissing
    fun _signingSecret(): JsonField<String> = signingSecret

    /**
     * Returns the raw JSON value of [telToken].
     *
     * Unlike [telToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tel_token") @ExcludeMissing fun _telToken(): JsonField<String> = telToken

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

        /** Returns a mutable builder for constructing an instance of [TokenMaterial]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenMaterial]. */
    class Builder internal constructor() {

        private var kid: JsonField<String> = JsonMissing.of()
        private var signingSecret: JsonField<String> = JsonMissing.of()
        private var telToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenMaterial: TokenMaterial) = apply {
            kid = tokenMaterial.kid
            signingSecret = tokenMaterial.signingSecret
            telToken = tokenMaterial.telToken
            additionalProperties = tokenMaterial.additionalProperties.toMutableMap()
        }

        /**
         * Identifies the Telnyx signing key the `signing_secret` was derived with. Goes in the
         * token header.
         */
        fun kid(kid: String) = kid(JsonField.of(kid))

        /**
         * Sets [Builder.kid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kid(kid: JsonField<String>) = apply { this.kid = kid }

        /** The HMAC-SHA256 key the token is signed with, base64url without padding. */
        fun signingSecret(signingSecret: String) = signingSecret(JsonField.of(signingSecret))

        /**
         * Sets [Builder.signingSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signingSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signingSecret(signingSecret: JsonField<String>) = apply {
            this.signingSecret = signingSecret
        }

        /**
         * Opaque value Telnyx uses to resolve the credential. Carried in the token's `tel_token`
         * claim as is.
         */
        fun telToken(telToken: String) = telToken(JsonField.of(telToken))

        /**
         * Sets [Builder.telToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telToken] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun telToken(telToken: JsonField<String>) = apply { this.telToken = telToken }

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
         * Returns an immutable instance of [TokenMaterial].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TokenMaterial =
            TokenMaterial(kid, signingSecret, telToken, additionalProperties.toMutableMap())
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
    fun validate(): TokenMaterial = apply {
        if (validated) {
            return@apply
        }

        kid()
        signingSecret()
        telToken()
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
        (if (kid.asKnown().isPresent) 1 else 0) +
            (if (signingSecret.asKnown().isPresent) 1 else 0) +
            (if (telToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenMaterial &&
            kid == other.kid &&
            signingSecret == other.signingSecret &&
            telToken == other.telToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(kid, signingSecret, telToken, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenMaterial{kid=$kid, signingSecret=$signingSecret, telToken=$telToken, additionalProperties=$additionalProperties}"
}
