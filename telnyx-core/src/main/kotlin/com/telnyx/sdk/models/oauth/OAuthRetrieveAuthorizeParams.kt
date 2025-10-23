// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauth

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** OAuth 2.0 authorization endpoint for the authorization code flow */
class OAuthRetrieveAuthorizeParams
private constructor(
    private val clientId: String,
    private val redirectUri: String,
    private val responseType: ResponseType,
    private val codeChallenge: String?,
    private val codeChallengeMethod: CodeChallengeMethod?,
    private val scope: String?,
    private val state: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** OAuth client identifier */
    fun clientId(): String = clientId

    /** Redirect URI */
    fun redirectUri(): String = redirectUri

    /** OAuth response type */
    fun responseType(): ResponseType = responseType

    /** PKCE code challenge */
    fun codeChallenge(): Optional<String> = Optional.ofNullable(codeChallenge)

    /** PKCE code challenge method */
    fun codeChallengeMethod(): Optional<CodeChallengeMethod> =
        Optional.ofNullable(codeChallengeMethod)

    /** Space-separated list of requested scopes */
    fun scope(): Optional<String> = Optional.ofNullable(scope)

    /** State parameter for CSRF protection */
    fun state(): Optional<String> = Optional.ofNullable(state)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthRetrieveAuthorizeParams].
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .redirectUri()
         * .responseType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthRetrieveAuthorizeParams]. */
    class Builder internal constructor() {

        private var clientId: String? = null
        private var redirectUri: String? = null
        private var responseType: ResponseType? = null
        private var codeChallenge: String? = null
        private var codeChallengeMethod: CodeChallengeMethod? = null
        private var scope: String? = null
        private var state: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(oauthRetrieveAuthorizeParams: OAuthRetrieveAuthorizeParams) = apply {
            clientId = oauthRetrieveAuthorizeParams.clientId
            redirectUri = oauthRetrieveAuthorizeParams.redirectUri
            responseType = oauthRetrieveAuthorizeParams.responseType
            codeChallenge = oauthRetrieveAuthorizeParams.codeChallenge
            codeChallengeMethod = oauthRetrieveAuthorizeParams.codeChallengeMethod
            scope = oauthRetrieveAuthorizeParams.scope
            state = oauthRetrieveAuthorizeParams.state
            additionalHeaders = oauthRetrieveAuthorizeParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthRetrieveAuthorizeParams.additionalQueryParams.toBuilder()
        }

        /** OAuth client identifier */
        fun clientId(clientId: String) = apply { this.clientId = clientId }

        /** Redirect URI */
        fun redirectUri(redirectUri: String) = apply { this.redirectUri = redirectUri }

        /** OAuth response type */
        fun responseType(responseType: ResponseType) = apply { this.responseType = responseType }

        /** PKCE code challenge */
        fun codeChallenge(codeChallenge: String?) = apply { this.codeChallenge = codeChallenge }

        /** Alias for calling [Builder.codeChallenge] with `codeChallenge.orElse(null)`. */
        fun codeChallenge(codeChallenge: Optional<String>) =
            codeChallenge(codeChallenge.getOrNull())

        /** PKCE code challenge method */
        fun codeChallengeMethod(codeChallengeMethod: CodeChallengeMethod?) = apply {
            this.codeChallengeMethod = codeChallengeMethod
        }

        /**
         * Alias for calling [Builder.codeChallengeMethod] with `codeChallengeMethod.orElse(null)`.
         */
        fun codeChallengeMethod(codeChallengeMethod: Optional<CodeChallengeMethod>) =
            codeChallengeMethod(codeChallengeMethod.getOrNull())

        /** Space-separated list of requested scopes */
        fun scope(scope: String?) = apply { this.scope = scope }

        /** Alias for calling [Builder.scope] with `scope.orElse(null)`. */
        fun scope(scope: Optional<String>) = scope(scope.getOrNull())

        /** State parameter for CSRF protection */
        fun state(state: String?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

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
         * Returns an immutable instance of [OAuthRetrieveAuthorizeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .redirectUri()
         * .responseType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthRetrieveAuthorizeParams =
            OAuthRetrieveAuthorizeParams(
                checkRequired("clientId", clientId),
                checkRequired("redirectUri", redirectUri),
                checkRequired("responseType", responseType),
                codeChallenge,
                codeChallengeMethod,
                scope,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("client_id", clientId)
                put("redirect_uri", redirectUri)
                put("response_type", responseType.toString())
                codeChallenge?.let { put("code_challenge", it) }
                codeChallengeMethod?.let { put("code_challenge_method", it.toString()) }
                scope?.let { put("scope", it) }
                state?.let { put("state", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** OAuth response type */
    class ResponseType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CODE = of("code")

            @JvmStatic fun of(value: String) = ResponseType(JsonField.of(value))
        }

        /** An enum containing [ResponseType]'s known values. */
        enum class Known {
            CODE
        }

        /**
         * An enum containing [ResponseType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResponseType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CODE,
            /**
             * An enum member indicating that [ResponseType] was instantiated with an unknown value.
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
                CODE -> Value.CODE
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
                CODE -> Known.CODE
                else -> throw TelnyxInvalidDataException("Unknown ResponseType: $value")
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

        fun validate(): ResponseType = apply {
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

            return other is ResponseType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** PKCE code challenge method */
    class CodeChallengeMethod
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

            @JvmField val PLAIN = of("plain")

            @JvmField val S256 = of("S256")

            @JvmStatic fun of(value: String) = CodeChallengeMethod(JsonField.of(value))
        }

        /** An enum containing [CodeChallengeMethod]'s known values. */
        enum class Known {
            PLAIN,
            S256,
        }

        /**
         * An enum containing [CodeChallengeMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CodeChallengeMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLAIN,
            S256,
            /**
             * An enum member indicating that [CodeChallengeMethod] was instantiated with an unknown
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
                PLAIN -> Value.PLAIN
                S256 -> Value.S256
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
                PLAIN -> Known.PLAIN
                S256 -> Known.S256
                else -> throw TelnyxInvalidDataException("Unknown CodeChallengeMethod: $value")
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

        fun validate(): CodeChallengeMethod = apply {
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

            return other is CodeChallengeMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthRetrieveAuthorizeParams &&
            clientId == other.clientId &&
            redirectUri == other.redirectUri &&
            responseType == other.responseType &&
            codeChallenge == other.codeChallenge &&
            codeChallengeMethod == other.codeChallengeMethod &&
            scope == other.scope &&
            state == other.state &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            clientId,
            redirectUri,
            responseType,
            codeChallenge,
            codeChallengeMethod,
            scope,
            state,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OAuthRetrieveAuthorizeParams{clientId=$clientId, redirectUri=$redirectUri, responseType=$responseType, codeChallenge=$codeChallenge, codeChallengeMethod=$codeChallengeMethod, scope=$scope, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
