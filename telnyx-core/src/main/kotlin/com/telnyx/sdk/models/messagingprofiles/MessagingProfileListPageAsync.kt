// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.MessagingProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingProfileServiceAsync.list */
class MessagingProfileListPageAsync
private constructor(
    private val service: MessagingProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingProfileListParams,
    private val response: MessagingProfileListPageResponse,
) : PageAsync<MessagingProfile> {

    /**
     * Delegates to [MessagingProfileListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingProfileListPageResponse.data
     */
    fun data(): List<MessagingProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingProfileListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingProfile> = data()

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

    fun nextPageParams(): MessagingProfileListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessagingProfile> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileListPageAsync].
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

    /** A builder for [MessagingProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingProfileListParams? = null
        private var response: MessagingProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingProfileListPageAsync: MessagingProfileListPageAsync) = apply {
            service = messagingProfileListPageAsync.service
            streamHandlerExecutor = messagingProfileListPageAsync.streamHandlerExecutor
            params = messagingProfileListPageAsync.params
            response = messagingProfileListPageAsync.response
        }

        fun service(service: MessagingProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListPageAsync].
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
        fun build(): MessagingProfileListPageAsync =
            MessagingProfileListPageAsync(
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

        return other is MessagingProfileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
