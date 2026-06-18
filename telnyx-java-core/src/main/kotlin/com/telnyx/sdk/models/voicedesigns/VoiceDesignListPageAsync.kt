// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.VoiceDesignServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceDesignServiceAsync.list */
class VoiceDesignListPageAsync
private constructor(
    private val service: VoiceDesignServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VoiceDesignListParams,
    private val response: VoiceDesignListPageResponse,
) : PageAsync<VoiceDesignListResponse> {

    /**
     * Delegates to [VoiceDesignListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceDesignListPageResponse.data
     */
    fun data(): List<VoiceDesignListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VoiceDesignListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceDesignListPageResponse.meta
     */
    fun meta(): Optional<VoiceDesignListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<VoiceDesignListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VoiceDesignListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<VoiceDesignListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VoiceDesignListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VoiceDesignListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceDesignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceDesignListPageAsync].
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

    /** A builder for [VoiceDesignListPageAsync]. */
    class Builder internal constructor() {

        private var service: VoiceDesignServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VoiceDesignListParams? = null
        private var response: VoiceDesignListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceDesignListPageAsync: VoiceDesignListPageAsync) = apply {
            service = voiceDesignListPageAsync.service
            streamHandlerExecutor = voiceDesignListPageAsync.streamHandlerExecutor
            params = voiceDesignListPageAsync.params
            response = voiceDesignListPageAsync.response
        }

        fun service(service: VoiceDesignServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceDesignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceDesignListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VoiceDesignListPageAsync].
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
        fun build(): VoiceDesignListPageAsync =
            VoiceDesignListPageAsync(
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

        return other is VoiceDesignListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VoiceDesignListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
