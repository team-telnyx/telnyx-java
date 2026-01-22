// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.FaxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FaxServiceAsync.list */
class FaxListPageAsync
private constructor(
    private val service: FaxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FaxListParams,
    private val response: FaxListPageResponse,
) : PageAsync<Fax> {

    /**
     * Delegates to [FaxListPageResponse], but gracefully handles missing data.
     *
     * @see FaxListPageResponse.data
     */
    fun data(): List<Fax> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FaxListPageResponse], but gracefully handles missing data.
     *
     * @see FaxListPageResponse.meta
     */
    fun meta(): Optional<FaxListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<Fax> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = meta()._additionalProperties().values.toList().getOrDefault(1)
        val pageCount = meta()._additionalProperties().values.toList().getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): FaxListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<FaxListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Fax> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FaxListParams = params

    /** The response that this page was parsed from. */
    fun response(): FaxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FaxListPageAsync].
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

    /** A builder for [FaxListPageAsync]. */
    class Builder internal constructor() {

        private var service: FaxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FaxListParams? = null
        private var response: FaxListPageResponse? = null

        @JvmSynthetic
        internal fun from(faxListPageAsync: FaxListPageAsync) = apply {
            service = faxListPageAsync.service
            streamHandlerExecutor = faxListPageAsync.streamHandlerExecutor
            params = faxListPageAsync.params
            response = faxListPageAsync.response
        }

        fun service(service: FaxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FaxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FaxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FaxListPageAsync].
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
        fun build(): FaxListPageAsync =
            FaxListPageAsync(
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

        return other is FaxListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FaxListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
