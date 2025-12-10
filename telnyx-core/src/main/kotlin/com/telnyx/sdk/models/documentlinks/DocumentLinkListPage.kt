// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documentlinks

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.DocumentLinkService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DocumentLinkService.list */
class DocumentLinkListPage
private constructor(
    private val service: DocumentLinkService,
    private val params: DocumentLinkListParams,
    private val response: DocumentLinkListPageResponse,
) : Page<DocumentLinkListResponse> {

    /**
     * Delegates to [DocumentLinkListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentLinkListPageResponse.data
     */
    fun data(): List<DocumentLinkListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DocumentLinkListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentLinkListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<DocumentLinkListResponse> = data()

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

    fun nextPageParams(): DocumentLinkListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): DocumentLinkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DocumentLinkListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DocumentLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocumentLinkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentLinkListPage].
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

    /** A builder for [DocumentLinkListPage]. */
    class Builder internal constructor() {

        private var service: DocumentLinkService? = null
        private var params: DocumentLinkListParams? = null
        private var response: DocumentLinkListPageResponse? = null

        @JvmSynthetic
        internal fun from(documentLinkListPage: DocumentLinkListPage) = apply {
            service = documentLinkListPage.service
            params = documentLinkListPage.params
            response = documentLinkListPage.response
        }

        fun service(service: DocumentLinkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DocumentLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocumentLinkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocumentLinkListPage].
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
        fun build(): DocumentLinkListPage =
            DocumentLinkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentLinkListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DocumentLinkListPage{service=$service, params=$params, response=$response}"
}
