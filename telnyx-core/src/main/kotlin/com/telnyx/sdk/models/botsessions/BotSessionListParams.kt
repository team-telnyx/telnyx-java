// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botsessions

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects

/**
 * Consumes the one-time portal redirect (magic link) token emailed during bot signup and returns an
 * API session. The token is a UUIDv7 that encodes its creation time; it expires after a
 * configurable validity window (15 minutes by default) and is cleared on first use. Although the
 * action creates a session, the route uses the GET verb because it is opened from an email link. On
 * first use the account is also initialized. For bot signup (freemium) accounts the response is a
 * minimal envelope containing only the `api_v2_token`; accounts that are permitted to use magic
 * links but are not freemium accounts may instead receive an extended session payload when
 * additional steps (such as two-factor authentication or identity verification) are required. This
 * endpoint is public; the magic link token in the query string is the credential.
 */
class BotSessionListParams
private constructor(
    private val email: String,
    private val portalRedirectToken: String,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Email address associated with the magic link token. */
    fun email(): String = email

    /**
     * Single-use portal redirect (magic link) token, a UUIDv7 sent to the account owner's email.
     */
    fun portalRedirectToken(): String = portalRedirectToken

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BotSessionListParams].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .portalRedirectToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BotSessionListParams]. */
    class Builder internal constructor() {

        private var email: String? = null
        private var portalRedirectToken: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(botSessionListParams: BotSessionListParams) = apply {
            email = botSessionListParams.email
            portalRedirectToken = botSessionListParams.portalRedirectToken
            additionalHeaders = botSessionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = botSessionListParams.additionalQueryParams.toBuilder()
        }

        /** Email address associated with the magic link token. */
        fun email(email: String) = apply { this.email = email }

        /**
         * Single-use portal redirect (magic link) token, a UUIDv7 sent to the account owner's
         * email.
         */
        fun portalRedirectToken(portalRedirectToken: String) = apply {
            this.portalRedirectToken = portalRedirectToken
        }

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [BotSessionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .portalRedirectToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BotSessionListParams =
            BotSessionListParams(
                checkRequired("email", email),
                checkRequired("portalRedirectToken", portalRedirectToken),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("email", email)
                put("portal_redirect_token", portalRedirectToken)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BotSessionListParams &&
            email == other.email &&
            portalRedirectToken == other.portalRedirectToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(email, portalRedirectToken, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BotSessionListParams{email=$email, portalRedirectToken=$portalRedirectToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
