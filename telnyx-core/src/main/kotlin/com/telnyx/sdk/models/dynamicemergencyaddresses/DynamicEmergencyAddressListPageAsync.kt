// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyaddresses

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Metadata
import com.telnyx.sdk.services.async.DynamicEmergencyAddressServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DynamicEmergencyAddressServiceAsync.list */
class DynamicEmergencyAddressListPageAsync
private constructor(
    private val service: DynamicEmergencyAddressServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DynamicEmergencyAddressListParams,
    private val response: DynamicEmergencyAddressListPageResponse,
) : PageAsync<DynamicEmergencyAddress> {

    /**
     * Delegates to [DynamicEmergencyAddressListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyAddressListPageResponse.data
     */
    fun data(): List<DynamicEmergencyAddress> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DynamicEmergencyAddressListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyAddressListPageResponse.meta
     */
    fun meta(): Optional<Metadata> = response._meta().getOptional("meta")

    override fun items(): List<DynamicEmergencyAddress> = data()

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

    fun nextPageParams(): DynamicEmergencyAddressListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DynamicEmergencyAddressListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DynamicEmergencyAddress> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DynamicEmergencyAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): DynamicEmergencyAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DynamicEmergencyAddressListPageAsync].
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

    /** A builder for [DynamicEmergencyAddressListPageAsync]. */
    class Builder internal constructor() {

        private var service: DynamicEmergencyAddressServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DynamicEmergencyAddressListParams? = null
        private var response: DynamicEmergencyAddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            dynamicEmergencyAddressListPageAsync: DynamicEmergencyAddressListPageAsync
        ) = apply {
            service = dynamicEmergencyAddressListPageAsync.service
            streamHandlerExecutor = dynamicEmergencyAddressListPageAsync.streamHandlerExecutor
            params = dynamicEmergencyAddressListPageAsync.params
            response = dynamicEmergencyAddressListPageAsync.response
        }

        fun service(service: DynamicEmergencyAddressServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DynamicEmergencyAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DynamicEmergencyAddressListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DynamicEmergencyAddressListPageAsync].
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
        fun build(): DynamicEmergencyAddressListPageAsync =
            DynamicEmergencyAddressListPageAsync(
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

        return other is DynamicEmergencyAddressListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DynamicEmergencyAddressListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
