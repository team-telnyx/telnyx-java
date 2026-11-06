// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingbot.calendar

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Browser redirect after calendar consent. Use the returned oauth_url rather than constructing this
 * request. Verified state identifies the connecting user. Returns HTML for success, cancellation,
 * or failure; no JSON error envelope or bearer token is used.
 */
class CalendarRetrieveOAuthCallbackParams
private constructor(
    private val code: String?,
    private val error: String?,
    private val state: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Authorization code supplied by the calendar provider. */
    fun code(): Optional<String> = Optional.ofNullable(code)

    /** Authorization error supplied by the calendar provider, such as access_denied. */
    fun error(): Optional<String> = Optional.ofNullable(error)

    /** Unmodified signed state from the authorization URL. */
    fun state(): Optional<String> = Optional.ofNullable(state)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CalendarRetrieveOAuthCallbackParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CalendarRetrieveOAuthCallbackParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalendarRetrieveOAuthCallbackParams]. */
    class Builder internal constructor() {

        private var code: String? = null
        private var error: String? = null
        private var state: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            calendarRetrieveOAuthCallbackParams: CalendarRetrieveOAuthCallbackParams
        ) = apply {
            code = calendarRetrieveOAuthCallbackParams.code
            error = calendarRetrieveOAuthCallbackParams.error
            state = calendarRetrieveOAuthCallbackParams.state
            additionalHeaders = calendarRetrieveOAuthCallbackParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                calendarRetrieveOAuthCallbackParams.additionalQueryParams.toBuilder()
        }

        /** Authorization code supplied by the calendar provider. */
        fun code(code: String?) = apply { this.code = code }

        /** Alias for calling [Builder.code] with `code.orElse(null)`. */
        fun code(code: Optional<String>) = code(code.getOrNull())

        /** Authorization error supplied by the calendar provider, such as access_denied. */
        fun error(error: String?) = apply { this.error = error }

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /** Unmodified signed state from the authorization URL. */
        fun state(state: String?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

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
         * Returns an immutable instance of [CalendarRetrieveOAuthCallbackParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CalendarRetrieveOAuthCallbackParams =
            CalendarRetrieveOAuthCallbackParams(
                code,
                error,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                code?.let { put("code", it) }
                error?.let { put("error", it) }
                state?.let { put("state", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalendarRetrieveOAuthCallbackParams &&
            code == other.code &&
            error == other.error &&
            state == other.state &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(code, error, state, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CalendarRetrieveOAuthCallbackParams{code=$code, error=$error, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
