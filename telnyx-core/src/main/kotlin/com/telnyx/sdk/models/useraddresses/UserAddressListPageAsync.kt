// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.useraddresses

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.UserAddressServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UserAddressServiceAsync.list */
class UserAddressListPageAsync
private constructor(
    private val service: UserAddressServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UserAddressListParams,
    private val response: UserAddressListPageResponse,
) : PageAsync<UserAddress> {

    /**
     * Delegates to [UserAddressListPageResponse], but gracefully handles missing data.
     *
     * @see UserAddressListPageResponse.data
     */
    fun data(): List<UserAddress> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserAddressListPageResponse], but gracefully handles missing data.
     *
     * @see UserAddressListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<UserAddress> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): UserAddressListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<UserAddressListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UserAddress> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UserAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserAddressListPageAsync].
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

    /** A builder for [UserAddressListPageAsync]. */
    class Builder internal constructor() {

        private var service: UserAddressServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UserAddressListParams? = null
        private var response: UserAddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(userAddressListPageAsync: UserAddressListPageAsync) = apply {
            service = userAddressListPageAsync.service
            streamHandlerExecutor = userAddressListPageAsync.streamHandlerExecutor
            params = userAddressListPageAsync.params
            response = userAddressListPageAsync.response
        }

        fun service(service: UserAddressServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UserAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserAddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserAddressListPageAsync].
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
        fun build(): UserAddressListPageAsync =
            UserAddressListPageAsync(
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

        return other is UserAddressListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UserAddressListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
