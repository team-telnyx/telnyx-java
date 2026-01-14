// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.userbundles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.bundlepricing.billingbundles.PaginationResponse
import com.telnyx.sdk.services.async.bundlepricing.UserBundleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UserBundleServiceAsync.list */
class UserBundleListPageAsync
private constructor(
    private val service: UserBundleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UserBundleListParams,
    private val response: UserBundleListPageResponse,
) : PageAsync<UserBundle> {

    /**
     * Delegates to [UserBundleListPageResponse], but gracefully handles missing data.
     *
     * @see UserBundleListPageResponse.data
     */
    fun data(): List<UserBundle> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserBundleListPageResponse], but gracefully handles missing data.
     *
     * @see UserBundleListPageResponse.meta
     */
    fun meta(): Optional<PaginationResponse> = response._meta().getOptional("meta")

    override fun items(): List<UserBundle> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): UserBundleListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<UserBundleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UserBundle> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UserBundleListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserBundleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserBundleListPageAsync].
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

    /** A builder for [UserBundleListPageAsync]. */
    class Builder internal constructor() {

        private var service: UserBundleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UserBundleListParams? = null
        private var response: UserBundleListPageResponse? = null

        @JvmSynthetic
        internal fun from(userBundleListPageAsync: UserBundleListPageAsync) = apply {
            service = userBundleListPageAsync.service
            streamHandlerExecutor = userBundleListPageAsync.streamHandlerExecutor
            params = userBundleListPageAsync.params
            response = userBundleListPageAsync.response
        }

        fun service(service: UserBundleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UserBundleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserBundleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserBundleListPageAsync].
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
        fun build(): UserBundleListPageAsync =
            UserBundleListPageAsync(
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

        return other is UserBundleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UserBundleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
