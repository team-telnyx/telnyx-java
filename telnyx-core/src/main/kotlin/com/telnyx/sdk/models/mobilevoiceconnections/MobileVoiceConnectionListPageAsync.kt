// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.MobileVoiceConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobileVoiceConnectionServiceAsync.list */
class MobileVoiceConnectionListPageAsync
private constructor(
    private val service: MobileVoiceConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MobileVoiceConnectionListParams,
    private val response: MobileVoiceConnectionListPageResponse,
) : PageAsync<MobileVoiceConnection> {

    /**
     * Delegates to [MobileVoiceConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see MobileVoiceConnectionListPageResponse.data
     */
    fun data(): List<MobileVoiceConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobileVoiceConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see MobileVoiceConnectionListPageResponse.meta
     */
    fun meta(): Optional<MobileVoiceConnectionListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<MobileVoiceConnection> = data()

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

    fun nextPageParams(): MobileVoiceConnectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MobileVoiceConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MobileVoiceConnection> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MobileVoiceConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobileVoiceConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobileVoiceConnectionListPageAsync].
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

    /** A builder for [MobileVoiceConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: MobileVoiceConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MobileVoiceConnectionListParams? = null
        private var response: MobileVoiceConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobileVoiceConnectionListPageAsync: MobileVoiceConnectionListPageAsync) =
            apply {
                service = mobileVoiceConnectionListPageAsync.service
                streamHandlerExecutor = mobileVoiceConnectionListPageAsync.streamHandlerExecutor
                params = mobileVoiceConnectionListPageAsync.params
                response = mobileVoiceConnectionListPageAsync.response
            }

        fun service(service: MobileVoiceConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MobileVoiceConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobileVoiceConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobileVoiceConnectionListPageAsync].
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
        fun build(): MobileVoiceConnectionListPageAsync =
            MobileVoiceConnectionListPageAsync(
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

        return other is MobileVoiceConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MobileVoiceConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
