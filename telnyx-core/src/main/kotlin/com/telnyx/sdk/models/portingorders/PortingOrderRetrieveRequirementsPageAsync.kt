// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.PortingOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortingOrderServiceAsync.retrieveRequirements */
class PortingOrderRetrieveRequirementsPageAsync
private constructor(
    private val service: PortingOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PortingOrderRetrieveRequirementsParams,
    private val response: PortingOrderRetrieveRequirementsPageResponse,
) : PageAsync<PortingOrderRetrieveRequirementsResponse> {

    /**
     * Delegates to [PortingOrderRetrieveRequirementsPageResponse], but gracefully handles missing
     * data.
     *
     * @see PortingOrderRetrieveRequirementsPageResponse.data
     */
    fun data(): List<PortingOrderRetrieveRequirementsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PortingOrderRetrieveRequirementsPageResponse], but gracefully handles missing
     * data.
     *
     * @see PortingOrderRetrieveRequirementsPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingOrderRetrieveRequirementsResponse> = data()

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

    fun nextPageParams(): PortingOrderRetrieveRequirementsParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync> =
        service.retrieveRequirements(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingOrderRetrieveRequirementsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PortingOrderRetrieveRequirementsParams = params

    /** The response that this page was parsed from. */
    fun response(): PortingOrderRetrieveRequirementsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PortingOrderRetrieveRequirementsPageAsync].
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

    /** A builder for [PortingOrderRetrieveRequirementsPageAsync]. */
    class Builder internal constructor() {

        private var service: PortingOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PortingOrderRetrieveRequirementsParams? = null
        private var response: PortingOrderRetrieveRequirementsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            portingOrderRetrieveRequirementsPageAsync: PortingOrderRetrieveRequirementsPageAsync
        ) = apply {
            service = portingOrderRetrieveRequirementsPageAsync.service
            streamHandlerExecutor = portingOrderRetrieveRequirementsPageAsync.streamHandlerExecutor
            params = portingOrderRetrieveRequirementsPageAsync.params
            response = portingOrderRetrieveRequirementsPageAsync.response
        }

        fun service(service: PortingOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PortingOrderRetrieveRequirementsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortingOrderRetrieveRequirementsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PortingOrderRetrieveRequirementsPageAsync].
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
        fun build(): PortingOrderRetrieveRequirementsPageAsync =
            PortingOrderRetrieveRequirementsPageAsync(
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

        return other is PortingOrderRetrieveRequirementsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PortingOrderRetrieveRequirementsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
