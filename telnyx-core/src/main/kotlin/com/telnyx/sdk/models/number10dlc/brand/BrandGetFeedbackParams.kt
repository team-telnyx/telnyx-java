// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get feedback about a brand by ID. This endpoint can be used after creating or revetting a brand.
 *
 * Possible values for `.category[].id`:
 * * `TAX_ID` - Data mismatch related to tax id and its associated properties.
 * * `STOCK_SYMBOL` - Non public entity registered as a public for profit entity or the stock
 *   information mismatch.
 * * `GOVERNMENT_ENTITY` - Non government entity registered as a government entity. Must be a U.S.
 *   government entity.
 * * `NONPROFIT` - Not a recognized non-profit entity. No IRS tax-exempt status found.
 * * `OTHERS` - Details of the data misrepresentation if any.
 */
class BrandGetFeedbackParams
private constructor(
    private val brandId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BrandGetFeedbackParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BrandGetFeedbackParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandGetFeedbackParams]. */
    class Builder internal constructor() {

        private var brandId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandGetFeedbackParams: BrandGetFeedbackParams) = apply {
            brandId = brandGetFeedbackParams.brandId
            additionalHeaders = brandGetFeedbackParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandGetFeedbackParams.additionalQueryParams.toBuilder()
        }

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
         * Returns an immutable instance of [BrandGetFeedbackParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandGetFeedbackParams =
            BrandGetFeedbackParams(
                brandId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> brandId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandGetFeedbackParams &&
            brandId == other.brandId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(brandId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrandGetFeedbackParams{brandId=$brandId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
