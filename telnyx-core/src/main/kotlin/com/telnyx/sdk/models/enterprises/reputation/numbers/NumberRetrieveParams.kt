// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get detailed reputation data for a specific phone number associated with an enterprise.
 *
 * **Query Parameters:**
 * - `fresh` (default: `false`): When `true`, fetches fresh reputation data (incurs API cost). When
 *   `false`, returns cached data. If no cached data exists, fresh data is automatically fetched.
 *
 * **Returns:**
 * - `spam_risk`: Overall spam risk level (`low`, `medium`, `high`)
 * - `spam_category`: Spam category classification
 * - `maturity_score`: Maturity metric (0–100)
 * - `connection_score`: Connection quality metric (0–100)
 * - `engagement_score`: Engagement metric (0–100)
 * - `sentiment_score`: Sentiment metric (0–100)
 * - `last_refreshed_at`: Timestamp of last data refresh
 */
class NumberRetrieveParams
private constructor(
    private val enterpriseId: String,
    private val phoneNumber: String?,
    private val fresh: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): String = enterpriseId

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /**
     * When true, fetches fresh reputation data (incurs API cost). When false, returns cached data.
     */
    fun fresh(): Optional<Boolean> = Optional.ofNullable(fresh)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .enterpriseId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberRetrieveParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var phoneNumber: String? = null
        private var fresh: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(numberRetrieveParams: NumberRetrieveParams) = apply {
            enterpriseId = numberRetrieveParams.enterpriseId
            phoneNumber = numberRetrieveParams.phoneNumber
            fresh = numberRetrieveParams.fresh
            additionalHeaders = numberRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = numberRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String) = apply { this.enterpriseId = enterpriseId }

        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * When true, fetches fresh reputation data (incurs API cost). When false, returns cached
         * data.
         */
        fun fresh(fresh: Boolean?) = apply { this.fresh = fresh }

        /**
         * Alias for [Builder.fresh].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fresh(fresh: Boolean) = fresh(fresh as Boolean?)

        /** Alias for calling [Builder.fresh] with `fresh.orElse(null)`. */
        fun fresh(fresh: Optional<Boolean>) = fresh(fresh.getOrNull())

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
         * Returns an immutable instance of [NumberRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enterpriseId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NumberRetrieveParams =
            NumberRetrieveParams(
                checkRequired("enterpriseId", enterpriseId),
                phoneNumber,
                fresh,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId
            1 -> phoneNumber ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                fresh?.let { put("fresh", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberRetrieveParams &&
            enterpriseId == other.enterpriseId &&
            phoneNumber == other.phoneNumber &&
            fresh == other.fresh &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(enterpriseId, phoneNumber, fresh, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NumberRetrieveParams{enterpriseId=$enterpriseId, phoneNumber=$phoneNumber, fresh=$fresh, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
