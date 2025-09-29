// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves the resources of a user bundle by its ID. */
class UserBundleListResourcesParams
private constructor(
    private val userBundleId: String?,
    private val authorizationBearer: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** User bundle's ID, this is used to identify the user bundle in the API. */
    fun userBundleId(): Optional<String> = Optional.ofNullable(userBundleId)

    /** Authenticates the request with your Telnyx API V2 KEY */
    fun authorizationBearer(): Optional<String> = Optional.ofNullable(authorizationBearer)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UserBundleListResourcesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [UserBundleListResourcesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserBundleListResourcesParams]. */
    class Builder internal constructor() {

        private var userBundleId: String? = null
        private var authorizationBearer: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userBundleListResourcesParams: UserBundleListResourcesParams) = apply {
            userBundleId = userBundleListResourcesParams.userBundleId
            authorizationBearer = userBundleListResourcesParams.authorizationBearer
            additionalHeaders = userBundleListResourcesParams.additionalHeaders.toBuilder()
            additionalQueryParams = userBundleListResourcesParams.additionalQueryParams.toBuilder()
        }

        /** User bundle's ID, this is used to identify the user bundle in the API. */
        fun userBundleId(userBundleId: String?) = apply { this.userBundleId = userBundleId }

        /** Alias for calling [Builder.userBundleId] with `userBundleId.orElse(null)`. */
        fun userBundleId(userBundleId: Optional<String>) = userBundleId(userBundleId.getOrNull())

        /** Authenticates the request with your Telnyx API V2 KEY */
        fun authorizationBearer(authorizationBearer: String?) = apply {
            this.authorizationBearer = authorizationBearer
        }

        /**
         * Alias for calling [Builder.authorizationBearer] with `authorizationBearer.orElse(null)`.
         */
        fun authorizationBearer(authorizationBearer: Optional<String>) =
            authorizationBearer(authorizationBearer.getOrNull())

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
         * Returns an immutable instance of [UserBundleListResourcesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserBundleListResourcesParams =
            UserBundleListResourcesParams(
                userBundleId,
                authorizationBearer,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userBundleId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                authorizationBearer?.let { put("authorization_bearer", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserBundleListResourcesParams &&
            userBundleId == other.userBundleId &&
            authorizationBearer == other.authorizationBearer &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userBundleId, authorizationBearer, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserBundleListResourcesParams{userBundleId=$userBundleId, authorizationBearer=$authorizationBearer, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
