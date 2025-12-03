// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthgrants

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.oauthclients.PaginationMetaOAuth
import com.telnyx.sdk.services.async.OAuthGrantServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OAuthGrantServiceAsync.list */
class OAuthGrantListPageAsync
private constructor(
    private val service: OAuthGrantServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OAuthGrantListParams,
    private val response: OAuthGrantListPageResponse,
) : PageAsync<OAuthGrant> {

    /**
     * Delegates to [OAuthGrantListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthGrantListPageResponse.data
     */
    fun data(): List<OAuthGrant> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthGrantListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthGrantListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaOAuth> = response._meta().getOptional("meta")

    override fun items(): List<OAuthGrant> = data()

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

    fun nextPageParams(): OAuthGrantListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<OAuthGrantListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OAuthGrant> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OAuthGrantListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthGrantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthGrantListPageAsync].
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

    /** A builder for [OAuthGrantListPageAsync]. */
    class Builder internal constructor() {

        private var service: OAuthGrantServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OAuthGrantListParams? = null
        private var response: OAuthGrantListPageResponse? = null

        @JvmSynthetic
        internal fun from(oauthGrantListPageAsync: OAuthGrantListPageAsync) = apply {
            service = oauthGrantListPageAsync.service
            streamHandlerExecutor = oauthGrantListPageAsync.streamHandlerExecutor
            params = oauthGrantListPageAsync.params
            response = oauthGrantListPageAsync.response
        }

        fun service(service: OAuthGrantServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthGrantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthGrantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OAuthGrantListPageAsync].
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
        fun build(): OAuthGrantListPageAsync =
            OAuthGrantListPageAsync(
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

        return other is OAuthGrantListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OAuthGrantListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
