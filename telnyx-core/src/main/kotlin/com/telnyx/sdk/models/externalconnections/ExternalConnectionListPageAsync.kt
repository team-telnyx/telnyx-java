// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ExternalConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ExternalConnectionServiceAsync.list */
class ExternalConnectionListPageAsync
private constructor(
    private val service: ExternalConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExternalConnectionListParams,
    private val response: ExternalConnectionListPageResponse,
) : PageAsync<ExternalConnection> {

    /**
     * Delegates to [ExternalConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalConnectionListPageResponse.data
     */
    fun data(): List<ExternalConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalConnectionListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<ExternalConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ExternalConnectionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ExternalConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalConnection> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExternalConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalConnectionListPageAsync].
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

    /** A builder for [ExternalConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExternalConnectionListParams? = null
        private var response: ExternalConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalConnectionListPageAsync: ExternalConnectionListPageAsync) =
            apply {
                service = externalConnectionListPageAsync.service
                streamHandlerExecutor = externalConnectionListPageAsync.streamHandlerExecutor
                params = externalConnectionListPageAsync.params
                response = externalConnectionListPageAsync.response
            }

        fun service(service: ExternalConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalConnectionListPageAsync].
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
        fun build(): ExternalConnectionListPageAsync =
            ExternalConnectionListPageAsync(
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

        return other is ExternalConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExternalConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
