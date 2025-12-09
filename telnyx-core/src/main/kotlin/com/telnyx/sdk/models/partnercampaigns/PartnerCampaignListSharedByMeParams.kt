// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.partnercampaigns

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get all partner campaigns you have shared to Telnyx in a paginated fashion
 *
 * This endpoint is currently limited to only returning shared campaigns that Telnyx has accepted.
 * In other words, shared but pending campaigns are currently omitted from the response from this
 * endpoint.
 */
class PartnerCampaignListSharedByMeParams
private constructor(
    private val page: Long?,
    private val recordsPerPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The 1-indexed page number to get. The default value is `1`. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /**
     * The amount of records per page, limited to between 1 and 500 inclusive. The default value is
     * `10`.
     */
    fun recordsPerPage(): Optional<Long> = Optional.ofNullable(recordsPerPage)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PartnerCampaignListSharedByMeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PartnerCampaignListSharedByMeParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PartnerCampaignListSharedByMeParams]. */
    class Builder internal constructor() {

        private var page: Long? = null
        private var recordsPerPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            partnerCampaignListSharedByMeParams: PartnerCampaignListSharedByMeParams
        ) = apply {
            page = partnerCampaignListSharedByMeParams.page
            recordsPerPage = partnerCampaignListSharedByMeParams.recordsPerPage
            additionalHeaders = partnerCampaignListSharedByMeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                partnerCampaignListSharedByMeParams.additionalQueryParams.toBuilder()
        }

        /** The 1-indexed page number to get. The default value is `1`. */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /**
         * The amount of records per page, limited to between 1 and 500 inclusive. The default value
         * is `10`.
         */
        fun recordsPerPage(recordsPerPage: Long?) = apply { this.recordsPerPage = recordsPerPage }

        /**
         * Alias for [Builder.recordsPerPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun recordsPerPage(recordsPerPage: Long) = recordsPerPage(recordsPerPage as Long?)

        /** Alias for calling [Builder.recordsPerPage] with `recordsPerPage.orElse(null)`. */
        fun recordsPerPage(recordsPerPage: Optional<Long>) =
            recordsPerPage(recordsPerPage.getOrNull())

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
         * Returns an immutable instance of [PartnerCampaignListSharedByMeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PartnerCampaignListSharedByMeParams =
            PartnerCampaignListSharedByMeParams(
                page,
                recordsPerPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                page?.let { put("page", it.toString()) }
                recordsPerPage?.let { put("recordsPerPage", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerCampaignListSharedByMeParams &&
            page == other.page &&
            recordsPerPage == other.recordsPerPage &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(page, recordsPerPage, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PartnerCampaignListSharedByMeParams{page=$page, recordsPerPage=$recordsPerPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
