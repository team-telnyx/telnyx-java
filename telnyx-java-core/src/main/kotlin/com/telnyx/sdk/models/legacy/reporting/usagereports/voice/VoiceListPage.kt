// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.voice

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.StandardPaginationMeta
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.VoiceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceService.list */
class VoiceListPage
private constructor(
    private val service: VoiceService,
    private val params: VoiceListParams,
    private val response: VoiceListPageResponse,
) : Page<CdrUsageReportResponseLegacy> {

    /**
     * Delegates to [VoiceListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceListPageResponse.data
     */
    fun data(): List<CdrUsageReportResponseLegacy> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VoiceListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceListPageResponse.meta
     */
    fun meta(): Optional<StandardPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CdrUsageReportResponseLegacy> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VoiceListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): VoiceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CdrUsageReportResponseLegacy> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VoiceListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceListPage].
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

    /** A builder for [VoiceListPage]. */
    class Builder internal constructor() {

        private var service: VoiceService? = null
        private var params: VoiceListParams? = null
        private var response: VoiceListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceListPage: VoiceListPage) = apply {
            service = voiceListPage.service
            params = voiceListPage.params
            response = voiceListPage.response
        }

        fun service(service: VoiceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VoiceListPage].
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
        fun build(): VoiceListPage =
            VoiceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "VoiceListPage{service=$service, params=$params, response=$response}"
}
