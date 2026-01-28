// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.comments

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.CommentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CommentService.list */
class CommentListPage
private constructor(
    private val service: CommentService,
    private val params: CommentListParams,
    private val response: CommentListPageResponse,
) : Page<CommentListResponse> {

    /**
     * Delegates to [CommentListPageResponse], but gracefully handles missing data.
     *
     * @see CommentListPageResponse.data
     */
    fun data(): List<CommentListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CommentListPageResponse], but gracefully handles missing data.
     *
     * @see CommentListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CommentListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CommentListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CommentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CommentListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CommentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommentListPage].
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

    /** A builder for [CommentListPage]. */
    class Builder internal constructor() {

        private var service: CommentService? = null
        private var params: CommentListParams? = null
        private var response: CommentListPageResponse? = null

        @JvmSynthetic
        internal fun from(commentListPage: CommentListPage) = apply {
            service = commentListPage.service
            params = commentListPage.params
            response = commentListPage.response
        }

        fun service(service: CommentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CommentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommentListPage].
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
        fun build(): CommentListPage =
            CommentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CommentListPage{service=$service, params=$params, response=$response}"
}
