// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomrecordings

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.RoomRecordingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomRecordingService.list */
class RoomRecordingListPage
private constructor(
    private val service: RoomRecordingService,
    private val params: RoomRecordingListParams,
    private val response: RoomRecordingListPageResponse,
) : Page<RoomRecordingListResponse> {

    /**
     * Delegates to [RoomRecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RoomRecordingListPageResponse.data
     */
    fun data(): List<RoomRecordingListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomRecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RoomRecordingListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomRecordingListResponse> = data()

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

    fun nextPageParams(): RoomRecordingListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): RoomRecordingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RoomRecordingListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RoomRecordingListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomRecordingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomRecordingListPage].
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

    /** A builder for [RoomRecordingListPage]. */
    class Builder internal constructor() {

        private var service: RoomRecordingService? = null
        private var params: RoomRecordingListParams? = null
        private var response: RoomRecordingListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomRecordingListPage: RoomRecordingListPage) = apply {
            service = roomRecordingListPage.service
            params = roomRecordingListPage.params
            response = roomRecordingListPage.response
        }

        fun service(service: RoomRecordingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoomRecordingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomRecordingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomRecordingListPage].
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
        fun build(): RoomRecordingListPage =
            RoomRecordingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomRecordingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RoomRecordingListPage{service=$service, params=$params, response=$response}"
}
