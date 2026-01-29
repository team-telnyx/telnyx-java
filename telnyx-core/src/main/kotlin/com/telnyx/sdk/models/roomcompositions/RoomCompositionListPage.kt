// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomcompositions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.RoomCompositionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomCompositionService.list */
class RoomCompositionListPage
private constructor(
    private val service: RoomCompositionService,
    private val params: RoomCompositionListParams,
    private val response: RoomCompositionListPageResponse,
) : Page<RoomComposition> {

    /**
     * Delegates to [RoomCompositionListPageResponse], but gracefully handles missing data.
     *
     * @see RoomCompositionListPageResponse.data
     */
    fun data(): List<RoomComposition> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomCompositionListPageResponse], but gracefully handles missing data.
     *
     * @see RoomCompositionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomComposition> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RoomCompositionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): RoomCompositionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RoomComposition> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RoomCompositionListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomCompositionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomCompositionListPage].
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

    /** A builder for [RoomCompositionListPage]. */
    class Builder internal constructor() {

        private var service: RoomCompositionService? = null
        private var params: RoomCompositionListParams? = null
        private var response: RoomCompositionListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomCompositionListPage: RoomCompositionListPage) = apply {
            service = roomCompositionListPage.service
            params = roomCompositionListPage.params
            response = roomCompositionListPage.response
        }

        fun service(service: RoomCompositionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoomCompositionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomCompositionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomCompositionListPage].
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
        fun build(): RoomCompositionListPage =
            RoomCompositionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomCompositionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RoomCompositionListPage{service=$service, params=$params, response=$response}"
}
