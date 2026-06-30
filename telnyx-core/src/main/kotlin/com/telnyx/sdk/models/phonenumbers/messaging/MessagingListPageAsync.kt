// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.messaging

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.PhoneNumberWithMessagingSettings
import com.telnyx.sdk.services.async.phonenumbers.MessagingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingServiceAsync.list */
class MessagingListPageAsync
private constructor(
    private val service: MessagingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingListParams,
    private val response: MessagingListPageResponse,
) : PageAsync<PhoneNumberWithMessagingSettings> {

    /**
     * Delegates to [MessagingListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingListPageResponse.data
     */
    fun data(): List<PhoneNumberWithMessagingSettings> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberWithMessagingSettings> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberWithMessagingSettings> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessagingListPageAsync].
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

    /** A builder for [MessagingListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingListParams? = null
        private var response: MessagingListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingListPageAsync: MessagingListPageAsync) = apply {
            service = messagingListPageAsync.service
            streamHandlerExecutor = messagingListPageAsync.streamHandlerExecutor
            params = messagingListPageAsync.params
            response = messagingListPageAsync.response
        }

        fun service(service: MessagingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MessagingListPageAsync].
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
        fun build(): MessagingListPageAsync =
            MessagingListPageAsync(
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

        return other is MessagingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
