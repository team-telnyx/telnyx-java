// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.PortingPhoneNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortingPhoneNumberServiceAsync.list */
class PortingPhoneNumberListPageAsync
private constructor(
    private val service: PortingPhoneNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PortingPhoneNumberListParams,
    private val response: PortingPhoneNumberListPageResponse,
) : PageAsync<PortingPhoneNumberListResponse> {

    /**
     * Delegates to [PortingPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PortingPhoneNumberListPageResponse.data
     */
    fun data(): List<PortingPhoneNumberListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PortingPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PortingPhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingPhoneNumberListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PortingPhoneNumberListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PortingPhoneNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingPhoneNumberListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PortingPhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): PortingPhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PortingPhoneNumberListPageAsync].
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

    /** A builder for [PortingPhoneNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: PortingPhoneNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PortingPhoneNumberListParams? = null
        private var response: PortingPhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(portingPhoneNumberListPageAsync: PortingPhoneNumberListPageAsync) =
            apply {
                service = portingPhoneNumberListPageAsync.service
                streamHandlerExecutor = portingPhoneNumberListPageAsync.streamHandlerExecutor
                params = portingPhoneNumberListPageAsync.params
                response = portingPhoneNumberListPageAsync.response
            }

        fun service(service: PortingPhoneNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PortingPhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortingPhoneNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PortingPhoneNumberListPageAsync].
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
        fun build(): PortingPhoneNumberListPageAsync =
            PortingPhoneNumberListPageAsync(
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

        return other is PortingPhoneNumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PortingPhoneNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
