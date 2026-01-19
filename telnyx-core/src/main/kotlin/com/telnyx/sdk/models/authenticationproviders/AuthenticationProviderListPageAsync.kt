// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.AuthenticationProviderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AuthenticationProviderServiceAsync.list */
class AuthenticationProviderListPageAsync
private constructor(
    private val service: AuthenticationProviderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AuthenticationProviderListParams,
    private val response: AuthenticationProviderListPageResponse,
) : PageAsync<AuthenticationProvider> {

    /**
     * Delegates to [AuthenticationProviderListPageResponse], but gracefully handles missing data.
     *
     * @see AuthenticationProviderListPageResponse.data
     */
    fun data(): List<AuthenticationProvider> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AuthenticationProviderListPageResponse], but gracefully handles missing data.
     *
     * @see AuthenticationProviderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<AuthenticationProvider> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AuthenticationProviderListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AuthenticationProviderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AuthenticationProvider> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AuthenticationProviderListParams = params

    /** The response that this page was parsed from. */
    fun response(): AuthenticationProviderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthenticationProviderListPageAsync].
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

    /** A builder for [AuthenticationProviderListPageAsync]. */
    class Builder internal constructor() {

        private var service: AuthenticationProviderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AuthenticationProviderListParams? = null
        private var response: AuthenticationProviderListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            authenticationProviderListPageAsync: AuthenticationProviderListPageAsync
        ) = apply {
            service = authenticationProviderListPageAsync.service
            streamHandlerExecutor = authenticationProviderListPageAsync.streamHandlerExecutor
            params = authenticationProviderListPageAsync.params
            response = authenticationProviderListPageAsync.response
        }

        fun service(service: AuthenticationProviderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AuthenticationProviderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuthenticationProviderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AuthenticationProviderListPageAsync].
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
        fun build(): AuthenticationProviderListPageAsync =
            AuthenticationProviderListPageAsync(
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

        return other is AuthenticationProviderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AuthenticationProviderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
