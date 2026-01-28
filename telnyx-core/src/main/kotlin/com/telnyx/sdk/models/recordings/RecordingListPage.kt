// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.RecordingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RecordingService.list */
class RecordingListPage
private constructor(
    private val service: RecordingService,
    private val params: RecordingListParams,
    private val response: RecordingListPageResponse,
) : Page<RecordingResponseData> {

    /**
     * Delegates to [RecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingListPageResponse.data
     */
    fun data(): List<RecordingResponseData> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RecordingResponseData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RecordingListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): RecordingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RecordingResponseData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RecordingListParams = params

    /** The response that this page was parsed from. */
    fun response(): RecordingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RecordingListPage].
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

    /** A builder for [RecordingListPage]. */
    class Builder internal constructor() {

        private var service: RecordingService? = null
        private var params: RecordingListParams? = null
        private var response: RecordingListPageResponse? = null

        @JvmSynthetic
        internal fun from(recordingListPage: RecordingListPage) = apply {
            service = recordingListPage.service
            params = recordingListPage.params
            response = recordingListPage.response
        }

        fun service(service: RecordingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RecordingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RecordingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RecordingListPage].
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
        fun build(): RecordingListPage =
            RecordingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RecordingListPage{service=$service, params=$params, response=$response}"
}
