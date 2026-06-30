// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.AddressServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AddressServiceAsync.list */
class AddressListPageAsync
private constructor(
    private val service: AddressServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AddressListParams,
    private val response: AddressListPageResponse,
) : PageAsync<Address> {

    /**
     * Delegates to [AddressListPageResponse], but gracefully handles missing data.
     *
     * @see AddressListPageResponse.data
     */
    fun data(): List<Address> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddressListPageResponse], but gracefully handles missing data.
     *
     * @see AddressListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Address> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AddressListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AddressListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Address> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): AddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddressListPageAsync].
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

    /** A builder for [AddressListPageAsync]. */
    class Builder internal constructor() {

        private var service: AddressServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AddressListParams? = null
        private var response: AddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(addressListPageAsync: AddressListPageAsync) = apply {
            service = addressListPageAsync.service
            streamHandlerExecutor = addressListPageAsync.streamHandlerExecutor
            params = addressListPageAsync.params
            response = addressListPageAsync.response
        }

        fun service(service: AddressServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddressListPageAsync].
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
        fun build(): AddressListPageAsync =
            AddressListPageAsync(
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

        return other is AddressListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AddressListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
