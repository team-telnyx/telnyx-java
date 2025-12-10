// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.integrationsecrets

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.IntegrationSecretServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see IntegrationSecretServiceAsync.list */
class IntegrationSecretListPageAsync
private constructor(
    private val service: IntegrationSecretServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IntegrationSecretListParams,
    private val response: IntegrationSecretListPageResponse,
) : PageAsync<IntegrationSecret> {

    /**
     * Delegates to [IntegrationSecretListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationSecretListPageResponse.data
     */
    fun data(): List<IntegrationSecret> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntegrationSecretListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationSecretListPageResponse.meta
     */
    fun meta(): Optional<IntegrationSecretListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<IntegrationSecret> = data()

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

    fun nextPageParams(): IntegrationSecretListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<IntegrationSecretListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IntegrationSecret> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IntegrationSecretListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntegrationSecretListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntegrationSecretListPageAsync].
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

    /** A builder for [IntegrationSecretListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntegrationSecretServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IntegrationSecretListParams? = null
        private var response: IntegrationSecretListPageResponse? = null

        @JvmSynthetic
        internal fun from(integrationSecretListPageAsync: IntegrationSecretListPageAsync) = apply {
            service = integrationSecretListPageAsync.service
            streamHandlerExecutor = integrationSecretListPageAsync.streamHandlerExecutor
            params = integrationSecretListPageAsync.params
            response = integrationSecretListPageAsync.response
        }

        fun service(service: IntegrationSecretServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IntegrationSecretListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntegrationSecretListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntegrationSecretListPageAsync].
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
        fun build(): IntegrationSecretListPageAsync =
            IntegrationSecretListPageAsync(
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

        return other is IntegrationSecretListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IntegrationSecretListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
