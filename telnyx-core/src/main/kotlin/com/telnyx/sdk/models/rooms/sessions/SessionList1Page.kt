// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.rooms.RoomSession
import com.telnyx.sdk.services.blocking.rooms.SessionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SessionService.list1 */
class SessionList1Page
private constructor(
    private val service: SessionService,
    private val params: SessionList1Params,
    private val response: SessionList1PageResponse,
) : Page<RoomSession> {

    /**
     * Delegates to [SessionList1PageResponse], but gracefully handles missing data.
     *
     * @see SessionList1PageResponse.data
     */
    fun data(): List<RoomSession> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SessionList1PageResponse], but gracefully handles missing data.
     *
     * @see SessionList1PageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomSession> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SessionList1Params {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): SessionList1Page = service.list1(nextPageParams())

    fun autoPager(): AutoPager<RoomSession> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SessionList1Params = params

    /** The response that this page was parsed from. */
    fun response(): SessionList1PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionList1Page].
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

    /** A builder for [SessionList1Page]. */
    class Builder internal constructor() {

        private var service: SessionService? = null
        private var params: SessionList1Params? = null
        private var response: SessionList1PageResponse? = null

        @JvmSynthetic
        internal fun from(sessionList1Page: SessionList1Page) = apply {
            service = sessionList1Page.service
            params = sessionList1Page.params
            response = sessionList1Page.response
        }

        fun service(service: SessionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SessionList1Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SessionList1PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SessionList1Page].
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
        fun build(): SessionList1Page =
            SessionList1Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionList1Page &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SessionList1Page{service=$service, params=$params, response=$response}"
}
