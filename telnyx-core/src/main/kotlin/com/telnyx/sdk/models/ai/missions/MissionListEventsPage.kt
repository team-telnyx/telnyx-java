// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.MissionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MissionService.listEvents */
class MissionListEventsPage
private constructor(
    private val service: MissionService,
    private val params: MissionListEventsParams,
    private val response: MissionListEventsPageResponse,
) : Page<MissionListEventsResponse> {

    /**
     * Delegates to [MissionListEventsPageResponse], but gracefully handles missing data.
     *
     * @see MissionListEventsPageResponse.data
     */
    fun data(): List<MissionListEventsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MissionListEventsPageResponse], but gracefully handles missing data.
     *
     * @see MissionListEventsPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<MissionListEventsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MissionListEventsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MissionListEventsPage = service.listEvents(nextPageParams())

    fun autoPager(): AutoPager<MissionListEventsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MissionListEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): MissionListEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MissionListEventsPage].
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

    /** A builder for [MissionListEventsPage]. */
    class Builder internal constructor() {

        private var service: MissionService? = null
        private var params: MissionListEventsParams? = null
        private var response: MissionListEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(missionListEventsPage: MissionListEventsPage) = apply {
            service = missionListEventsPage.service
            params = missionListEventsPage.params
            response = missionListEventsPage.response
        }

        fun service(service: MissionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MissionListEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MissionListEventsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MissionListEventsPage].
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
        fun build(): MissionListEventsPage =
            MissionListEventsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MissionListEventsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MissionListEventsPage{service=$service, params=$params, response=$response}"
}
