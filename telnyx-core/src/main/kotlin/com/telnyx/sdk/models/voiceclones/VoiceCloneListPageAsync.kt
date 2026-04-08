// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.VoiceCloneServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceCloneServiceAsync.list */
class VoiceCloneListPageAsync
private constructor(
    private val service: VoiceCloneServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VoiceCloneListParams,
    private val response: VoiceCloneListPageResponse,
) : PageAsync<VoiceCloneListResponse> {

    /**
     * Delegates to [VoiceCloneListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceCloneListPageResponse.data
     */
    fun data(): List<VoiceCloneListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VoiceCloneListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceCloneListPageResponse.meta
     */
    fun meta(): Optional<VoiceCloneListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<VoiceCloneListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VoiceCloneListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<VoiceCloneListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VoiceCloneListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VoiceCloneListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceCloneListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceCloneListPageAsync].
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

    /** A builder for [VoiceCloneListPageAsync]. */
    class Builder internal constructor() {

        private var service: VoiceCloneServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VoiceCloneListParams? = null
        private var response: VoiceCloneListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceCloneListPageAsync: VoiceCloneListPageAsync) = apply {
            service = voiceCloneListPageAsync.service
            streamHandlerExecutor = voiceCloneListPageAsync.streamHandlerExecutor
            params = voiceCloneListPageAsync.params
            response = voiceCloneListPageAsync.response
        }

        fun service(service: VoiceCloneServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceCloneListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceCloneListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VoiceCloneListPageAsync].
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
        fun build(): VoiceCloneListPageAsync =
            VoiceCloneListPageAsync(
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

        return other is VoiceCloneListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VoiceCloneListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
