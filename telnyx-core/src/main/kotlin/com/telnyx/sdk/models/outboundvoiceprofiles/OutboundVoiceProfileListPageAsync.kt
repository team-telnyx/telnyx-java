// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.OutboundVoiceProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OutboundVoiceProfileServiceAsync.list */
class OutboundVoiceProfileListPageAsync
private constructor(
    private val service: OutboundVoiceProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OutboundVoiceProfileListParams,
    private val response: OutboundVoiceProfileListPageResponse,
) : PageAsync<OutboundVoiceProfile> {

    /**
     * Delegates to [OutboundVoiceProfileListPageResponse], but gracefully handles missing data.
     *
     * @see OutboundVoiceProfileListPageResponse.data
     */
    fun data(): List<OutboundVoiceProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OutboundVoiceProfileListPageResponse], but gracefully handles missing data.
     *
     * @see OutboundVoiceProfileListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<OutboundVoiceProfile> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): OutboundVoiceProfileListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<OutboundVoiceProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OutboundVoiceProfile> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OutboundVoiceProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): OutboundVoiceProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OutboundVoiceProfileListPageAsync].
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

    /** A builder for [OutboundVoiceProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: OutboundVoiceProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OutboundVoiceProfileListParams? = null
        private var response: OutboundVoiceProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(outboundVoiceProfileListPageAsync: OutboundVoiceProfileListPageAsync) =
            apply {
                service = outboundVoiceProfileListPageAsync.service
                streamHandlerExecutor = outboundVoiceProfileListPageAsync.streamHandlerExecutor
                params = outboundVoiceProfileListPageAsync.params
                response = outboundVoiceProfileListPageAsync.response
            }

        fun service(service: OutboundVoiceProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OutboundVoiceProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OutboundVoiceProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OutboundVoiceProfileListPageAsync].
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
        fun build(): OutboundVoiceProfileListPageAsync =
            OutboundVoiceProfileListPageAsync(
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

        return other is OutboundVoiceProfileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OutboundVoiceProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
