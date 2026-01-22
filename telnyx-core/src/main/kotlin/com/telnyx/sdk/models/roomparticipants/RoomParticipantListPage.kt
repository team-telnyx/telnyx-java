// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomparticipants

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.RoomParticipant
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.RoomParticipantService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomParticipantService.list */
class RoomParticipantListPage
private constructor(
    private val service: RoomParticipantService,
    private val params: RoomParticipantListParams,
    private val response: RoomParticipantListPageResponse,
) : Page<RoomParticipant> {

    /**
     * Delegates to [RoomParticipantListPageResponse], but gracefully handles missing data.
     *
     * @see RoomParticipantListPageResponse.data
     */
    fun data(): List<RoomParticipant> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomParticipantListPageResponse], but gracefully handles missing data.
     *
     * @see RoomParticipantListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomParticipant> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RoomParticipantListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): RoomParticipantListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RoomParticipant> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RoomParticipantListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomParticipantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomParticipantListPage].
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

    /** A builder for [RoomParticipantListPage]. */
    class Builder internal constructor() {

        private var service: RoomParticipantService? = null
        private var params: RoomParticipantListParams? = null
        private var response: RoomParticipantListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomParticipantListPage: RoomParticipantListPage) = apply {
            service = roomParticipantListPage.service
            params = roomParticipantListPage.params
            response = roomParticipantListPage.response
        }

        fun service(service: RoomParticipantService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoomParticipantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomParticipantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomParticipantListPage].
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
        fun build(): RoomParticipantListPage =
            RoomParticipantListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomParticipantListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RoomParticipantListPage{service=$service, params=$params, response=$response}"
}
