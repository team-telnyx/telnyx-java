// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.VoiceSdkCallReportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceSdkCallReportService.list */
class VoiceSdkCallReportListPage
private constructor(
    private val service: VoiceSdkCallReportService,
    private val params: VoiceSdkCallReportListParams,
    private val response: VoiceSdkCallReportListPageResponse,
) : Page<VoiceSdkCallReportListResponse> {

    /**
     * Delegates to [VoiceSdkCallReportListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceSdkCallReportListPageResponse.data
     */
    fun data(): List<VoiceSdkCallReportListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VoiceSdkCallReportListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceSdkCallReportListPageResponse.meta
     */
    fun meta(): Optional<VoiceSdkCallReportListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<VoiceSdkCallReportListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VoiceSdkCallReportListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): VoiceSdkCallReportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VoiceSdkCallReportListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VoiceSdkCallReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceSdkCallReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceSdkCallReportListPage].
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

    /** A builder for [VoiceSdkCallReportListPage]. */
    class Builder internal constructor() {

        private var service: VoiceSdkCallReportService? = null
        private var params: VoiceSdkCallReportListParams? = null
        private var response: VoiceSdkCallReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceSdkCallReportListPage: VoiceSdkCallReportListPage) = apply {
            service = voiceSdkCallReportListPage.service
            params = voiceSdkCallReportListPage.params
            response = voiceSdkCallReportListPage.response
        }

        fun service(service: VoiceSdkCallReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceSdkCallReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceSdkCallReportListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VoiceSdkCallReportListPage].
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
        fun build(): VoiceSdkCallReportListPage =
            VoiceSdkCallReportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceSdkCallReportListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VoiceSdkCallReportListPage{service=$service, params=$params, response=$response}"
}
