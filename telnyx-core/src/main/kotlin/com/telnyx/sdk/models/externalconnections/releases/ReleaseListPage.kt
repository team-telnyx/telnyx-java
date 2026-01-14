// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import com.telnyx.sdk.services.blocking.externalconnections.ReleaseService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ReleaseService.list */
class ReleaseListPage
private constructor(
    private val service: ReleaseService,
    private val params: ReleaseListParams,
    private val response: ReleaseListPageResponse,
) : Page<ReleaseListResponse> {

    /**
     * Delegates to [ReleaseListPageResponse], but gracefully handles missing data.
     *
     * @see ReleaseListPageResponse.data
     */
    fun data(): List<ReleaseListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReleaseListPageResponse], but gracefully handles missing data.
     *
     * @see ReleaseListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<ReleaseListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ReleaseListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ReleaseListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ReleaseListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReleaseListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReleaseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReleaseListPage].
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

    /** A builder for [ReleaseListPage]. */
    class Builder internal constructor() {

        private var service: ReleaseService? = null
        private var params: ReleaseListParams? = null
        private var response: ReleaseListPageResponse? = null

        @JvmSynthetic
        internal fun from(releaseListPage: ReleaseListPage) = apply {
            service = releaseListPage.service
            params = releaseListPage.params
            response = releaseListPage.response
        }

        fun service(service: ReleaseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReleaseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReleaseListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReleaseListPage].
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
        fun build(): ReleaseListPage =
            ReleaseListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReleaseListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ReleaseListPage{service=$service, params=$params, response=$response}"
}
