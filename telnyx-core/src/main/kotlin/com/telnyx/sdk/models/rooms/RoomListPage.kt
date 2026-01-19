// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.RoomService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomService.list */
class RoomListPage
private constructor(
    private val service: RoomService,
    private val params: RoomListParams,
    private val response: RoomListPageResponse,
) : Page<Room> {

    /**
     * Delegates to [RoomListPageResponse], but gracefully handles missing data.
     *
     * @see RoomListPageResponse.data
     */
    fun data(): List<Room> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomListPageResponse], but gracefully handles missing data.
     *
     * @see RoomListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Room> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RoomListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): RoomListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Room> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RoomListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomListPage].
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

    /** A builder for [RoomListPage]. */
    class Builder internal constructor() {

        private var service: RoomService? = null
        private var params: RoomListParams? = null
        private var response: RoomListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomListPage: RoomListPage) = apply {
            service = roomListPage.service
            params = roomListPage.params
            response = roomListPage.response
        }

        fun service(service: RoomService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoomListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomListPage].
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
        fun build(): RoomListPage =
            RoomListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "RoomListPage{service=$service, params=$params, response=$response}"
}
