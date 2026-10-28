// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.PayConnectorServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PayConnectorServiceAsync.list */
class PayConnectorListPageAsync
private constructor(
    private val service: PayConnectorServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PayConnectorListParams,
    private val response: PayConnectorListPageResponse,
) : PageAsync<PayConnector> {

    /**
     * Delegates to [PayConnectorListPageResponse], but gracefully handles missing data.
     *
     * @see PayConnectorListPageResponse.data
     */
    fun data(): List<PayConnector> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PayConnectorListPageResponse], but gracefully handles missing data.
     *
     * @see PayConnectorListPageResponse.meta
     */
    fun meta(): Optional<PayConnectorListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<PayConnector> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PayConnectorListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<PayConnectorListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PayConnector> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PayConnectorListParams = params

    /** The response that this page was parsed from. */
    fun response(): PayConnectorListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayConnectorListPageAsync].
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

    /** A builder for [PayConnectorListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayConnectorServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PayConnectorListParams? = null
        private var response: PayConnectorListPageResponse? = null

        @JvmSynthetic
        internal fun from(payConnectorListPageAsync: PayConnectorListPageAsync) = apply {
            service = payConnectorListPageAsync.service
            streamHandlerExecutor = payConnectorListPageAsync.streamHandlerExecutor
            params = payConnectorListPageAsync.params
            response = payConnectorListPageAsync.response
        }

        fun service(service: PayConnectorServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PayConnectorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PayConnectorListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PayConnectorListPageAsync].
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
        fun build(): PayConnectorListPageAsync =
            PayConnectorListPageAsync(
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

        return other is PayConnectorListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PayConnectorListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
