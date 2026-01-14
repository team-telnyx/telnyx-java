// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.voice

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.StandardPaginationMeta
import com.telnyx.sdk.services.async.legacy.reporting.usagereports.VoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceServiceAsync.list */
class VoiceListPageAsync
private constructor(
    private val service: VoiceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VoiceListParams,
    private val response: VoiceListPageResponse,
) : PageAsync<CdrUsageReportResponseLegacy> {

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

    override fun nextPage(): CompletableFuture<VoiceListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CdrUsageReportResponseLegacy> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VoiceListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceListPageAsync]. */
    class Builder internal constructor() {

        private var service: VoiceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VoiceListParams? = null
        private var response: VoiceListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceListPageAsync: VoiceListPageAsync) = apply {
            service = voiceListPageAsync.service
            streamHandlerExecutor = voiceListPageAsync.streamHandlerExecutor
            params = voiceListPageAsync.params
            response = voiceListPageAsync.response
        }

        fun service(service: VoiceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VoiceListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceListPageAsync =
            VoiceListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VoiceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
