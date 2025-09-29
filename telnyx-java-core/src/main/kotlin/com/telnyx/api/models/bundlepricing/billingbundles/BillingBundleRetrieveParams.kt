// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.billingbundles

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a single bundle by ID. */
class BillingBundleRetrieveParams
private constructor(
    private val bundleId: String?,
    private val authorizationBearer: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Billing bundle's ID, this is used to identify the billing bundle in the API. */
    fun bundleId(): Optional<String> = Optional.ofNullable(bundleId)

    /** Authenticates the request with your Telnyx API V2 KEY */
    fun authorizationBearer(): Optional<String> = Optional.ofNullable(authorizationBearer)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BillingBundleRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [BillingBundleRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingBundleRetrieveParams]. */
    class Builder internal constructor() {

        private var bundleId: String? = null
        private var authorizationBearer: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billingBundleRetrieveParams: BillingBundleRetrieveParams) = apply {
            bundleId = billingBundleRetrieveParams.bundleId
            authorizationBearer = billingBundleRetrieveParams.authorizationBearer
            additionalHeaders = billingBundleRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = billingBundleRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** Billing bundle's ID, this is used to identify the billing bundle in the API. */
        fun bundleId(bundleId: String?) = apply { this.bundleId = bundleId }

        /** Alias for calling [Builder.bundleId] with `bundleId.orElse(null)`. */
        fun bundleId(bundleId: Optional<String>) = bundleId(bundleId.getOrNull())

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
         * Returns an immutable instance of [BillingBundleRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BillingBundleRetrieveParams =
            BillingBundleRetrieveParams(
                bundleId,
                authorizationBearer,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> bundleId ?: ""
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

        return other is BillingBundleRetrieveParams &&
            bundleId == other.bundleId &&
            authorizationBearer == other.authorizationBearer &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(bundleId, authorizationBearer, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BillingBundleRetrieveParams{bundleId=$bundleId, authorizationBearer=$authorizationBearer, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
