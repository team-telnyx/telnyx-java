// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ai.CollectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CollectionService.list */
class CollectionListPage
private constructor(
    private val service: CollectionService,
    private val params: CollectionListParams,
    private val response: CollectionListPageResponse,
) : Page<Collection> {

    /**
     * Delegates to [CollectionListPageResponse], but gracefully handles missing data.
     *
     * @see CollectionListPageResponse.data
     */
    fun data(): List<Collection> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionListPageResponse], but gracefully handles missing data.
     *
     * @see CollectionListPageResponse.meta
     */
    fun meta(): Optional<CollectionListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<Collection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CollectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CollectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Collection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CollectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CollectionListPage].
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

    /** A builder for [CollectionListPage]. */
    class Builder internal constructor() {

        private var service: CollectionService? = null
        private var params: CollectionListParams? = null
        private var response: CollectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(collectionListPage: CollectionListPage) = apply {
            service = collectionListPage.service
            params = collectionListPage.params
            response = collectionListPage.response
        }

        fun service(service: CollectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CollectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CollectionListPage].
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
        fun build(): CollectionListPage =
            CollectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CollectionListPage{service=$service, params=$params, response=$response}"
}
