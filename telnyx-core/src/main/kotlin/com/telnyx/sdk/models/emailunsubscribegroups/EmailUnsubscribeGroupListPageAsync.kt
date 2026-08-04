// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.EmailUnsubscribeGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailUnsubscribeGroupServiceAsync.list */
class EmailUnsubscribeGroupListPageAsync
private constructor(
    private val service: EmailUnsubscribeGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailUnsubscribeGroupListParams,
    private val response: EmailUnsubscribeGroupListPageResponse,
) : PageAsync<UnsubscribeGroup> {

    /**
     * Delegates to [EmailUnsubscribeGroupListPageResponse], but gracefully handles missing data.
     *
     * @see EmailUnsubscribeGroupListPageResponse.data
     */
    fun data(): List<UnsubscribeGroup> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailUnsubscribeGroupListPageResponse], but gracefully handles missing data.
     *
     * @see EmailUnsubscribeGroupListPageResponse.meta
     */
    fun meta(): Optional<GroupListMeta> = response._meta().getOptional("meta")

    override fun items(): List<UnsubscribeGroup> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EmailUnsubscribeGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<EmailUnsubscribeGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UnsubscribeGroup> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailUnsubscribeGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailUnsubscribeGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailUnsubscribeGroupListPageAsync].
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

    /** A builder for [EmailUnsubscribeGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailUnsubscribeGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailUnsubscribeGroupListParams? = null
        private var response: EmailUnsubscribeGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailUnsubscribeGroupListPageAsync: EmailUnsubscribeGroupListPageAsync) =
            apply {
                service = emailUnsubscribeGroupListPageAsync.service
                streamHandlerExecutor = emailUnsubscribeGroupListPageAsync.streamHandlerExecutor
                params = emailUnsubscribeGroupListPageAsync.params
                response = emailUnsubscribeGroupListPageAsync.response
            }

        fun service(service: EmailUnsubscribeGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailUnsubscribeGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailUnsubscribeGroupListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailUnsubscribeGroupListPageAsync].
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
        fun build(): EmailUnsubscribeGroupListPageAsync =
            EmailUnsubscribeGroupListPageAsync(
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

        return other is EmailUnsubscribeGroupListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailUnsubscribeGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
