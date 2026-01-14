// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.channelzones

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.ChannelZoneService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ChannelZoneService.list */
class ChannelZoneListPage
private constructor(
    private val service: ChannelZoneService,
    private val params: ChannelZoneListParams,
    private val response: ChannelZoneListPageResponse,
) : Page<ChannelZoneListResponse> {

    /**
     * Delegates to [ChannelZoneListPageResponse], but gracefully handles missing data.
     *
     * @see ChannelZoneListPageResponse.data
     */
    fun data(): List<ChannelZoneListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ChannelZoneListPageResponse], but gracefully handles missing data.
     *
     * @see ChannelZoneListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ChannelZoneListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ChannelZoneListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ChannelZoneListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ChannelZoneListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ChannelZoneListParams = params

    /** The response that this page was parsed from. */
    fun response(): ChannelZoneListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelZoneListPage].
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

    /** A builder for [ChannelZoneListPage]. */
    class Builder internal constructor() {

        private var service: ChannelZoneService? = null
        private var params: ChannelZoneListParams? = null
        private var response: ChannelZoneListPageResponse? = null

        @JvmSynthetic
        internal fun from(channelZoneListPage: ChannelZoneListPage) = apply {
            service = channelZoneListPage.service
            params = channelZoneListPage.params
            response = channelZoneListPage.response
        }

        fun service(service: ChannelZoneService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelZoneListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ChannelZoneListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ChannelZoneListPage].
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
        fun build(): ChannelZoneListPage =
            ChannelZoneListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelZoneListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ChannelZoneListPage{service=$service, params=$params, response=$response}"
}
