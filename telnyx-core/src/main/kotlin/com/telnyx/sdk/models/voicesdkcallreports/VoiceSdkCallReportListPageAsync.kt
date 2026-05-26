// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.VoiceSdkCallReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceSdkCallReportServiceAsync.list */
class VoiceSdkCallReportListPageAsync
private constructor(
    private val service: VoiceSdkCallReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VoiceSdkCallReportListParams,
    private val response: VoiceSdkCallReportListPageResponse,
) : PageAsync<VoiceSdkCallReportListResponse> {

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

    override fun nextPage(): CompletableFuture<VoiceSdkCallReportListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VoiceSdkCallReportListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VoiceSdkCallReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceSdkCallReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VoiceSdkCallReportListPageAsync].
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

    /** A builder for [VoiceSdkCallReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: VoiceSdkCallReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VoiceSdkCallReportListParams? = null
        private var response: VoiceSdkCallReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceSdkCallReportListPageAsync: VoiceSdkCallReportListPageAsync) =
            apply {
                service = voiceSdkCallReportListPageAsync.service
                streamHandlerExecutor = voiceSdkCallReportListPageAsync.streamHandlerExecutor
                params = voiceSdkCallReportListPageAsync.params
                response = voiceSdkCallReportListPageAsync.response
            }

        fun service(service: VoiceSdkCallReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceSdkCallReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceSdkCallReportListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VoiceSdkCallReportListPageAsync].
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
        fun build(): VoiceSdkCallReportListPageAsync =
            VoiceSdkCallReportListPageAsync(
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

        return other is VoiceSdkCallReportListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VoiceSdkCallReportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
