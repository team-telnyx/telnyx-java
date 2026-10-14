// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.llmtokengateway.tokengroups.AiGatewayResourcesPageMeta
import com.telnyx.sdk.services.async.llmtokengateway.TokenKeyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TokenKeyServiceAsync.list */
class TokenKeyListPageAsync
private constructor(
    private val service: TokenKeyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TokenKeyListParams,
    private val response: TokenKeyListPageResponse,
) : PageAsync<TokenKey> {

    /**
     * Delegates to [TokenKeyListPageResponse], but gracefully handles missing data.
     *
     * @see TokenKeyListPageResponse.data
     */
    fun data(): List<TokenKey> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TokenKeyListPageResponse], but gracefully handles missing data.
     *
     * @see TokenKeyListPageResponse.meta
     */
    fun meta(): Optional<AiGatewayResourcesPageMeta> = response._meta().getOptional("meta")

    override fun items(): List<TokenKey> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TokenKeyListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TokenKeyListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TokenKey> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TokenKeyListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenKeyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenKeyListPageAsync].
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

    /** A builder for [TokenKeyListPageAsync]. */
    class Builder internal constructor() {

        private var service: TokenKeyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TokenKeyListParams? = null
        private var response: TokenKeyListPageResponse? = null

        @JvmSynthetic
        internal fun from(tokenKeyListPageAsync: TokenKeyListPageAsync) = apply {
            service = tokenKeyListPageAsync.service
            streamHandlerExecutor = tokenKeyListPageAsync.streamHandlerExecutor
            params = tokenKeyListPageAsync.params
            response = tokenKeyListPageAsync.response
        }

        fun service(service: TokenKeyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TokenKeyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenKeyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenKeyListPageAsync].
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
        fun build(): TokenKeyListPageAsync =
            TokenKeyListPageAsync(
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

        return other is TokenKeyListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TokenKeyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
