// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OAuthTokenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessToken: JsonField<String>,
    private val expiresIn: JsonField<Long>,
    private val tokenType: JsonField<TokenType>,
    private val refreshToken: JsonField<String>,
    private val scope: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access_token")
        @ExcludeMissing
        accessToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_in") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("token_type")
        @ExcludeMissing
        tokenType: JsonField<TokenType> = JsonMissing.of(),
        @JsonProperty("refresh_token")
        @ExcludeMissing
        refreshToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<String> = JsonMissing.of(),
    ) : this(accessToken, expiresIn, tokenType, refreshToken, scope, mutableMapOf())

    /**
     * The access token
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /**
     * Token lifetime in seconds
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expires_in")

    /**
     * Token type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenType(): TokenType = tokenType.getRequired("token_type")

    /**
     * Refresh token (if applicable)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refreshToken(): Optional<String> = refreshToken.getOptional("refresh_token")

    /**
     * Space-separated list of granted scopes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<String> = scope.getOptional("scope")

    /**
     * Returns the raw JSON value of [accessToken].
     *
     * Unlike [accessToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_token")
    @ExcludeMissing
    fun _accessToken(): JsonField<String> = accessToken

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /**
     * Returns the raw JSON value of [tokenType].
     *
     * Unlike [tokenType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType(): JsonField<TokenType> = tokenType

    /**
     * Returns the raw JSON value of [refreshToken].
     *
     * Unlike [refreshToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refresh_token")
    @ExcludeMissing
    fun _refreshToken(): JsonField<String> = refreshToken

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
         * Returns a mutable builder for constructing an instance of [OAuthTokenResponse].
         *
         * The following fields are required:
         * ```java
         * .accessToken()
         * .expiresIn()
         * .tokenType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthTokenResponse]. */
    class Builder internal constructor() {

        private var accessToken: JsonField<String>? = null
        private var expiresIn: JsonField<Long>? = null
        private var tokenType: JsonField<TokenType>? = null
        private var refreshToken: JsonField<String> = JsonMissing.of()
        private var scope: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthTokenResponse: OAuthTokenResponse) = apply {
            accessToken = oauthTokenResponse.accessToken
            expiresIn = oauthTokenResponse.expiresIn
            tokenType = oauthTokenResponse.tokenType
            refreshToken = oauthTokenResponse.refreshToken
            scope = oauthTokenResponse.scope
            additionalProperties = oauthTokenResponse.additionalProperties.toMutableMap()
        }

        /** The access token */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /**
         * Sets [Builder.accessToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** Token lifetime in seconds */
        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        /** Token type */
        fun tokenType(tokenType: TokenType) = tokenType(JsonField.of(tokenType))

        /**
         * Sets [Builder.tokenType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenType] with a well-typed [TokenType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenType(tokenType: JsonField<TokenType>) = apply { this.tokenType = tokenType }

        /** Refresh token (if applicable) */
        fun refreshToken(refreshToken: String) = refreshToken(JsonField.of(refreshToken))

        /**
         * Sets [Builder.refreshToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refreshToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refreshToken(refreshToken: JsonField<String>) = apply {
            this.refreshToken = refreshToken
        }

        /** Space-separated list of granted scopes */
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
         * Returns an immutable instance of [OAuthTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessToken()
         * .expiresIn()
         * .tokenType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthTokenResponse =
            OAuthTokenResponse(
                checkRequired("accessToken", accessToken),
                checkRequired("expiresIn", expiresIn),
                checkRequired("tokenType", tokenType),
                refreshToken,
                scope,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OAuthTokenResponse = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        expiresIn()
        tokenType().validate()
        refreshToken()
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
        (if (accessToken.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (tokenType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (refreshToken.asKnown().isPresent) 1 else 0) +
            (if (scope.asKnown().isPresent) 1 else 0)

    /** Token type */
    class TokenType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BEARER = of("Bearer")

            @JvmStatic fun of(value: String) = TokenType(JsonField.of(value))
        }

        /** An enum containing [TokenType]'s known values. */
        enum class Known {
            BEARER
        }

        /**
         * An enum containing [TokenType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BEARER,
            /**
             * An enum member indicating that [TokenType] was instantiated with an unknown value.
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
                BEARER -> Value.BEARER
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
                BEARER -> Known.BEARER
                else -> throw TelnyxInvalidDataException("Unknown TokenType: $value")
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

        fun validate(): TokenType = apply {
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

            return other is TokenType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthTokenResponse &&
            accessToken == other.accessToken &&
            expiresIn == other.expiresIn &&
            tokenType == other.tokenType &&
            refreshToken == other.refreshToken &&
            scope == other.scope &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accessToken, expiresIn, tokenType, refreshToken, scope, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthTokenResponse{accessToken=$accessToken, expiresIn=$expiresIn, tokenType=$tokenType, refreshToken=$refreshToken, scope=$scope, additionalProperties=$additionalProperties}"
}
