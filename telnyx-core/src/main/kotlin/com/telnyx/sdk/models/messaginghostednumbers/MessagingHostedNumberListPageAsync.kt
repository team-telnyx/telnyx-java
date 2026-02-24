// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumbers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.PhoneNumberWithMessagingSettings
import com.telnyx.sdk.services.async.MessagingHostedNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingHostedNumberServiceAsync.list */
class MessagingHostedNumberListPageAsync
private constructor(
    private val service: MessagingHostedNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingHostedNumberListParams,
    private val response: MessagingHostedNumberListPageResponse,
) : PageAsync<PhoneNumberWithMessagingSettings> {

    /**
     * Delegates to [MessagingHostedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingHostedNumberListPageResponse.data
     */
    fun data(): List<PhoneNumberWithMessagingSettings> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingHostedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingHostedNumberListPageResponse.meta
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

    fun nextPageParams(): MessagingHostedNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingHostedNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberWithMessagingSettings> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingHostedNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingHostedNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingHostedNumberListPageAsync].
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

    /** A builder for [MessagingHostedNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingHostedNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingHostedNumberListParams? = null
        private var response: MessagingHostedNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingHostedNumberListPageAsync: MessagingHostedNumberListPageAsync) =
            apply {
                service = messagingHostedNumberListPageAsync.service
                streamHandlerExecutor = messagingHostedNumberListPageAsync.streamHandlerExecutor
                params = messagingHostedNumberListPageAsync.params
                response = messagingHostedNumberListPageAsync.response
            }

        fun service(service: MessagingHostedNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingHostedNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingHostedNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingHostedNumberListPageAsync].
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
        fun build(): MessagingHostedNumberListPageAsync =
            MessagingHostedNumberListPageAsync(
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

        return other is MessagingHostedNumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingHostedNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
