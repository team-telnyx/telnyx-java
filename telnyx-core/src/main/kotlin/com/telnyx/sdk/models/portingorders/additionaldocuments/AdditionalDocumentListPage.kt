// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.additionaldocuments

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.AdditionalDocumentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AdditionalDocumentService.list */
class AdditionalDocumentListPage
private constructor(
    private val service: AdditionalDocumentService,
    private val params: AdditionalDocumentListParams,
    private val response: AdditionalDocumentListPageResponse,
) : Page<AdditionalDocumentListResponse> {

    /**
     * Delegates to [AdditionalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see AdditionalDocumentListPageResponse.data
     */
    fun data(): List<AdditionalDocumentListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AdditionalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see AdditionalDocumentListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<AdditionalDocumentListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): AdditionalDocumentListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): AdditionalDocumentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AdditionalDocumentListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AdditionalDocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AdditionalDocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdditionalDocumentListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdditionalDocumentListPage]. */
    class Builder internal constructor() {

        private var service: AdditionalDocumentService? = null
        private var params: AdditionalDocumentListParams? = null
        private var response: AdditionalDocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(additionalDocumentListPage: AdditionalDocumentListPage) = apply {
            service = additionalDocumentListPage.service
            params = additionalDocumentListPage.params
            response = additionalDocumentListPage.response
        }

        fun service(service: AdditionalDocumentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AdditionalDocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AdditionalDocumentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AdditionalDocumentListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdditionalDocumentListPage =
            AdditionalDocumentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdditionalDocumentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AdditionalDocumentListPage{service=$service, params=$params, response=$response}"
}
