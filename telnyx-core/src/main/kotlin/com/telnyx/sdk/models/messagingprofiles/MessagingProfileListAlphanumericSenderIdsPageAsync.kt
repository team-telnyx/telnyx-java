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

/** @see MessagingProfileServiceAsync.listAlphanumericSenderIds */
class MessagingProfileListAlphanumericSenderIdsPageAsync
private constructor(
    private val service: MessagingProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingProfileListAlphanumericSenderIdsParams,
    private val response: MessagingProfileListAlphanumericSenderIdsPageResponse,
) : PageAsync<MessagingProfileListAlphanumericSenderIdsResponse> {

    /**
     * Delegates to [MessagingProfileListAlphanumericSenderIdsPageResponse], but gracefully handles
     * missing data.
     *
     * @see MessagingProfileListAlphanumericSenderIdsPageResponse.data
     */
    fun data(): List<MessagingProfileListAlphanumericSenderIdsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListAlphanumericSenderIdsPageResponse], but gracefully handles
     * missing data.
     *
     * @see MessagingProfileListAlphanumericSenderIdsPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingProfileListAlphanumericSenderIdsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingProfileListAlphanumericSenderIdsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingProfileListAlphanumericSenderIdsPageAsync> =
        service.listAlphanumericSenderIds(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessagingProfileListAlphanumericSenderIdsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListAlphanumericSenderIdsParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListAlphanumericSenderIdsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileListAlphanumericSenderIdsPageAsync].
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

    /** A builder for [MessagingProfileListAlphanumericSenderIdsPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingProfileListAlphanumericSenderIdsParams? = null
        private var response: MessagingProfileListAlphanumericSenderIdsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            messagingProfileListAlphanumericSenderIdsPageAsync:
                MessagingProfileListAlphanumericSenderIdsPageAsync
        ) = apply {
            service = messagingProfileListAlphanumericSenderIdsPageAsync.service
            streamHandlerExecutor =
                messagingProfileListAlphanumericSenderIdsPageAsync.streamHandlerExecutor
            params = messagingProfileListAlphanumericSenderIdsPageAsync.params
            response = messagingProfileListAlphanumericSenderIdsPageAsync.response
        }

        fun service(service: MessagingProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListAlphanumericSenderIdsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListAlphanumericSenderIdsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListAlphanumericSenderIdsPageAsync].
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
        fun build(): MessagingProfileListAlphanumericSenderIdsPageAsync =
            MessagingProfileListAlphanumericSenderIdsPageAsync(
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

        return other is MessagingProfileListAlphanumericSenderIdsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingProfileListAlphanumericSenderIdsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
