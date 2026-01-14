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

/** @see SessionService.list0 */
class SessionList0Page
private constructor(
    private val service: SessionService,
    private val params: SessionList0Params,
    private val response: SessionList0PageResponse,
) : Page<RoomSession> {

    /**
     * Delegates to [SessionList0PageResponse], but gracefully handles missing data.
     *
     * @see SessionList0PageResponse.data
     */
    fun data(): List<RoomSession> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SessionList0PageResponse], but gracefully handles missing data.
     *
     * @see SessionList0PageResponse.meta
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

    fun nextPageParams(): SessionList0Params {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): SessionList0Page = service.list0(nextPageParams())

    fun autoPager(): AutoPager<RoomSession> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SessionList0Params = params

    /** The response that this page was parsed from. */
    fun response(): SessionList0PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionList0Page].
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

    /** A builder for [SessionList0Page]. */
    class Builder internal constructor() {

        private var service: SessionService? = null
        private var params: SessionList0Params? = null
        private var response: SessionList0PageResponse? = null

        @JvmSynthetic
        internal fun from(sessionList0Page: SessionList0Page) = apply {
            service = sessionList0Page.service
            params = sessionList0Page.params
            response = sessionList0Page.response
        }

        fun service(service: SessionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SessionList0Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SessionList0PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SessionList0Page].
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
        fun build(): SessionList0Page =
            SessionList0Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionList0Page &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SessionList0Page{service=$service, params=$params, response=$response}"
}
