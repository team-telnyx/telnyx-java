// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Query the status of an SMS OTP (One-Time Password) for Sole Proprietor brand verification.
 *
 * This endpoint allows you to check the delivery and verification status of an OTP sent during the
 * Sole Proprietor brand verification process. You can query by either:
 * * `referenceId` - The reference ID returned when the OTP was initially triggered
 * * `brandId` - Query parameter for portal users to look up OTP status by Brand ID
 *
 * The response includes delivery status, verification dates, and detailed delivery information.
 */
class BrandGetSmsOtpByReferenceParams
private constructor(
    private val referenceId: String?,
    private val brandId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun referenceId(): Optional<String> = Optional.ofNullable(referenceId)

    /** Filter by Brand ID for easier lookup in portal applications */
    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BrandGetSmsOtpByReferenceParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BrandGetSmsOtpByReferenceParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandGetSmsOtpByReferenceParams]. */
    class Builder internal constructor() {

        private var referenceId: String? = null
        private var brandId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandGetSmsOtpByReferenceParams: BrandGetSmsOtpByReferenceParams) =
            apply {
                referenceId = brandGetSmsOtpByReferenceParams.referenceId
                brandId = brandGetSmsOtpByReferenceParams.brandId
                additionalHeaders = brandGetSmsOtpByReferenceParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    brandGetSmsOtpByReferenceParams.additionalQueryParams.toBuilder()
            }

        fun referenceId(referenceId: String?) = apply { this.referenceId = referenceId }

        /** Alias for calling [Builder.referenceId] with `referenceId.orElse(null)`. */
        fun referenceId(referenceId: Optional<String>) = referenceId(referenceId.getOrNull())

        /** Filter by Brand ID for easier lookup in portal applications */
        fun brandId(brandId: String?) = apply { this.brandId = brandId }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

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
         * Returns an immutable instance of [BrandGetSmsOtpByReferenceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandGetSmsOtpByReferenceParams =
            BrandGetSmsOtpByReferenceParams(
                referenceId,
                brandId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> referenceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                brandId?.let { put("brandId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandGetSmsOtpByReferenceParams &&
            referenceId == other.referenceId &&
            brandId == other.brandId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(referenceId, brandId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrandGetSmsOtpByReferenceParams{referenceId=$referenceId, brandId=$brandId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
