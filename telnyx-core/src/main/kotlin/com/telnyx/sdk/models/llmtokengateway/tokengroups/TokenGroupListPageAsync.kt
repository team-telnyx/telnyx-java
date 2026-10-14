// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.llmtokengateway.TokenGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TokenGroupServiceAsync.list */
class TokenGroupListPageAsync
private constructor(
    private val service: TokenGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TokenGroupListParams,
    private val response: TokenGroupListPageResponse,
) : PageAsync<TokenGroup> {

    /**
     * Delegates to [TokenGroupListPageResponse], but gracefully handles missing data.
     *
     * @see TokenGroupListPageResponse.data
     */
    fun data(): List<TokenGroup> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TokenGroupListPageResponse], but gracefully handles missing data.
     *
     * @see TokenGroupListPageResponse.meta
     */
    fun meta(): Optional<AiGatewayResourcesPageMeta> = response._meta().getOptional("meta")

    override fun items(): List<TokenGroup> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TokenGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TokenGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TokenGroup> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TokenGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenGroupListPageAsync].
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

    /** A builder for [TokenGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: TokenGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TokenGroupListParams? = null
        private var response: TokenGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(tokenGroupListPageAsync: TokenGroupListPageAsync) = apply {
            service = tokenGroupListPageAsync.service
            streamHandlerExecutor = tokenGroupListPageAsync.streamHandlerExecutor
            params = tokenGroupListPageAsync.params
            response = tokenGroupListPageAsync.response
        }

        fun service(service: TokenGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TokenGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenGroupListPageAsync].
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
        fun build(): TokenGroupListPageAsync =
            TokenGroupListPageAsync(
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

        return other is TokenGroupListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TokenGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
