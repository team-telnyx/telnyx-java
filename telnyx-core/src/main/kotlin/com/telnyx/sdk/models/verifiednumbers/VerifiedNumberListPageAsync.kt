// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifiednumbers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.VerifiedNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VerifiedNumberServiceAsync.list */
class VerifiedNumberListPageAsync
private constructor(
    private val service: VerifiedNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VerifiedNumberListParams,
    private val response: VerifiedNumberListPageResponse,
) : PageAsync<VerifiedNumber> {

    /**
     * Delegates to [VerifiedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see VerifiedNumberListPageResponse.data
     */
    fun data(): List<VerifiedNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerifiedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see VerifiedNumberListPageResponse.meta
     */
    fun meta(): Optional<VerifiedNumberListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<VerifiedNumber> = data()

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

    fun nextPageParams(): VerifiedNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<VerifiedNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VerifiedNumber> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VerifiedNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerifiedNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerifiedNumberListPageAsync].
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

    /** A builder for [VerifiedNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: VerifiedNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VerifiedNumberListParams? = null
        private var response: VerifiedNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(verifiedNumberListPageAsync: VerifiedNumberListPageAsync) = apply {
            service = verifiedNumberListPageAsync.service
            streamHandlerExecutor = verifiedNumberListPageAsync.streamHandlerExecutor
            params = verifiedNumberListPageAsync.params
            response = verifiedNumberListPageAsync.response
        }

        fun service(service: VerifiedNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VerifiedNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerifiedNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerifiedNumberListPageAsync].
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
        fun build(): VerifiedNumberListPageAsync =
            VerifiedNumberListPageAsync(
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

        return other is VerifiedNumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VerifiedNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
