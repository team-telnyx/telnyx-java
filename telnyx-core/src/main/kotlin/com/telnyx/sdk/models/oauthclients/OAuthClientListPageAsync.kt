// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.OAuthClientServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OAuthClientServiceAsync.list */
class OAuthClientListPageAsync
private constructor(
    private val service: OAuthClientServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OAuthClientListParams,
    private val response: OAuthClientListPageResponse,
) : PageAsync<OAuthClient> {

    /**
     * Delegates to [OAuthClientListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthClientListPageResponse.data
     */
    fun data(): List<OAuthClient> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthClientListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthClientListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaOAuth> = response._meta().getOptional("meta")

    override fun items(): List<OAuthClient> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): OAuthClientListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<OAuthClientListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OAuthClient> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OAuthClientListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthClientListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthClientListPageAsync].
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

    /** A builder for [OAuthClientListPageAsync]. */
    class Builder internal constructor() {

        private var service: OAuthClientServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OAuthClientListParams? = null
        private var response: OAuthClientListPageResponse? = null

        @JvmSynthetic
        internal fun from(oauthClientListPageAsync: OAuthClientListPageAsync) = apply {
            service = oauthClientListPageAsync.service
            streamHandlerExecutor = oauthClientListPageAsync.streamHandlerExecutor
            params = oauthClientListPageAsync.params
            response = oauthClientListPageAsync.response
        }

        fun service(service: OAuthClientServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthClientListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthClientListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OAuthClientListPageAsync].
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
        fun build(): OAuthClientListPageAsync =
            OAuthClientListPageAsync(
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

        return other is OAuthClientListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OAuthClientListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
