// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.AccessIpAddressServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AccessIpAddressServiceAsync.list */
class AccessIpAddressListPageAsync
private constructor(
    private val service: AccessIpAddressServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccessIpAddressListParams,
    private val response: AccessIpAddressListPageResponse,
) : PageAsync<AccessIpAddressResponse> {

    /**
     * Delegates to [AccessIpAddressListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpAddressListPageResponse.data
     */
    fun data(): List<AccessIpAddressResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccessIpAddressListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpAddressListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaCloudflareIpListSync> = response._meta().getOptional("meta")

    override fun items(): List<AccessIpAddressResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AccessIpAddressListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AccessIpAddressListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccessIpAddressResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccessIpAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccessIpAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccessIpAddressListPageAsync].
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

    /** A builder for [AccessIpAddressListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccessIpAddressServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccessIpAddressListParams? = null
        private var response: AccessIpAddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(accessIpAddressListPageAsync: AccessIpAddressListPageAsync) = apply {
            service = accessIpAddressListPageAsync.service
            streamHandlerExecutor = accessIpAddressListPageAsync.streamHandlerExecutor
            params = accessIpAddressListPageAsync.params
            response = accessIpAddressListPageAsync.response
        }

        fun service(service: AccessIpAddressServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccessIpAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccessIpAddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccessIpAddressListPageAsync].
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
        fun build(): AccessIpAddressListPageAsync =
            AccessIpAddressListPageAsync(
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

        return other is AccessIpAddressListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccessIpAddressListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
