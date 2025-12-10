// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import com.telnyx.sdk.services.async.externalconnections.LogMessageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see LogMessageServiceAsync.list */
class LogMessageListPageAsync
private constructor(
    private val service: LogMessageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LogMessageListParams,
    private val response: LogMessageListPageResponse,
) : PageAsync<LogMessageListResponse> {

    /**
     * Delegates to [LogMessageListPageResponse], but gracefully handles missing data.
     *
     * @see LogMessageListPageResponse.logMessages
     */
    fun logMessages(): List<LogMessageListResponse> =
        response._logMessages().getOptional("log_messages").getOrNull() ?: emptyList()

    /**
     * Delegates to [LogMessageListPageResponse], but gracefully handles missing data.
     *
     * @see LogMessageListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<LogMessageListResponse> = logMessages()

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

    fun nextPageParams(): LogMessageListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<LogMessageListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LogMessageListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LogMessageListParams = params

    /** The response that this page was parsed from. */
    fun response(): LogMessageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LogMessageListPageAsync].
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

    /** A builder for [LogMessageListPageAsync]. */
    class Builder internal constructor() {

        private var service: LogMessageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LogMessageListParams? = null
        private var response: LogMessageListPageResponse? = null

        @JvmSynthetic
        internal fun from(logMessageListPageAsync: LogMessageListPageAsync) = apply {
            service = logMessageListPageAsync.service
            streamHandlerExecutor = logMessageListPageAsync.streamHandlerExecutor
            params = logMessageListPageAsync.params
            response = logMessageListPageAsync.response
        }

        fun service(service: LogMessageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LogMessageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LogMessageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LogMessageListPageAsync].
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
        fun build(): LogMessageListPageAsync =
            LogMessageListPageAsync(
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

        return other is LogMessageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LogMessageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
