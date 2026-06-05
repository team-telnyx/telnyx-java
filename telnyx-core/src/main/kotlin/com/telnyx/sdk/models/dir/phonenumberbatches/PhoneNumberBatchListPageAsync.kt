// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumberbatches

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.dir.PhoneNumberBatchServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberBatchServiceAsync.list */
class PhoneNumberBatchListPageAsync
private constructor(
    private val service: PhoneNumberBatchServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberBatchListParams,
    private val response: PhoneNumberBatchListPageResponse,
) : PageAsync<PhoneNumberBatchListResponse> {

    /**
     * Delegates to [PhoneNumberBatchListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBatchListPageResponse.data
     */
    fun data(): List<PhoneNumberBatchListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberBatchListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBatchListPageResponse.meta
     */
    fun meta(): Optional<PhoneNumberBatchListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberBatchListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberBatchListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberBatchListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberBatchListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberBatchListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberBatchListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberBatchListPageAsync].
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

    /** A builder for [PhoneNumberBatchListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberBatchServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberBatchListParams? = null
        private var response: PhoneNumberBatchListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberBatchListPageAsync: PhoneNumberBatchListPageAsync) = apply {
            service = phoneNumberBatchListPageAsync.service
            streamHandlerExecutor = phoneNumberBatchListPageAsync.streamHandlerExecutor
            params = phoneNumberBatchListPageAsync.params
            response = phoneNumberBatchListPageAsync.response
        }

        fun service(service: PhoneNumberBatchServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberBatchListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberBatchListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberBatchListPageAsync].
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
        fun build(): PhoneNumberBatchListPageAsync =
            PhoneNumberBatchListPageAsync(
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

        return other is PhoneNumberBatchListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberBatchListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
