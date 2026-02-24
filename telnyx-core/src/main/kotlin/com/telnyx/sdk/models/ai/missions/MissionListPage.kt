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

/** @see MissionService.list */
class MissionListPage
private constructor(
    private val service: MissionService,
    private val params: MissionListParams,
    private val response: MissionListPageResponse,
) : Page<MissionData> {

    /**
     * Delegates to [MissionListPageResponse], but gracefully handles missing data.
     *
     * @see MissionListPageResponse.data
     */
    fun data(): List<MissionData> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MissionListPageResponse], but gracefully handles missing data.
     *
     * @see MissionListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<MissionData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MissionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MissionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MissionData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MissionListParams = params

    /** The response that this page was parsed from. */
    fun response(): MissionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MissionListPage].
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

    /** A builder for [MissionListPage]. */
    class Builder internal constructor() {

        private var service: MissionService? = null
        private var params: MissionListParams? = null
        private var response: MissionListPageResponse? = null

        @JvmSynthetic
        internal fun from(missionListPage: MissionListPage) = apply {
            service = missionListPage.service
            params = missionListPage.params
            response = missionListPage.response
        }

        fun service(service: MissionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MissionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MissionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MissionListPage].
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
        fun build(): MissionListPage =
            MissionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MissionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MissionListPage{service=$service, params=$params, response=$response}"
}
