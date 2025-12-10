// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.assistants.ScheduledEventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ScheduledEventService.list */
class ScheduledEventListPage
private constructor(
    private val service: ScheduledEventService,
    private val params: ScheduledEventListParams,
    private val response: ScheduledEventListPageResponse,
) : Page<ScheduledEventListResponse> {

    /**
     * Delegates to [ScheduledEventListPageResponse], but gracefully handles missing data.
     *
     * @see ScheduledEventListPageResponse.data
     */
    fun data(): List<ScheduledEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ScheduledEventListPageResponse], but gracefully handles missing data.
     *
     * @see ScheduledEventListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<ScheduledEventListResponse> = data()

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

    fun nextPageParams(): ScheduledEventListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ScheduledEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ScheduledEventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ScheduledEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): ScheduledEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScheduledEventListPage].
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

    /** A builder for [ScheduledEventListPage]. */
    class Builder internal constructor() {

        private var service: ScheduledEventService? = null
        private var params: ScheduledEventListParams? = null
        private var response: ScheduledEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(scheduledEventListPage: ScheduledEventListPage) = apply {
            service = scheduledEventListPage.service
            params = scheduledEventListPage.params
            response = scheduledEventListPage.response
        }

        fun service(service: ScheduledEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ScheduledEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ScheduledEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ScheduledEventListPage].
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
        fun build(): ScheduledEventListPage =
            ScheduledEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledEventListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ScheduledEventListPage{service=$service, params=$params, response=$response}"
}
