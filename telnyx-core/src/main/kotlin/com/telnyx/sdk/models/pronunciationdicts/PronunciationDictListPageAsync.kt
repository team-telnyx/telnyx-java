// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.PronunciationDictServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PronunciationDictServiceAsync.list */
class PronunciationDictListPageAsync
private constructor(
    private val service: PronunciationDictServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PronunciationDictListParams,
    private val response: PronunciationDictListPageResponse,
) : PageAsync<PronunciationDictData> {

    /**
     * Delegates to [PronunciationDictListPageResponse], but gracefully handles missing data.
     *
     * @see PronunciationDictListPageResponse.data
     */
    fun data(): List<PronunciationDictData> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PronunciationDictListPageResponse], but gracefully handles missing data.
     *
     * @see PronunciationDictListPageResponse.meta
     */
    fun meta(): Optional<PronunciationDictListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<PronunciationDictData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PronunciationDictListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PronunciationDictListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PronunciationDictData> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PronunciationDictListParams = params

    /** The response that this page was parsed from. */
    fun response(): PronunciationDictListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PronunciationDictListPageAsync].
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

    /** A builder for [PronunciationDictListPageAsync]. */
    class Builder internal constructor() {

        private var service: PronunciationDictServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PronunciationDictListParams? = null
        private var response: PronunciationDictListPageResponse? = null

        @JvmSynthetic
        internal fun from(pronunciationDictListPageAsync: PronunciationDictListPageAsync) = apply {
            service = pronunciationDictListPageAsync.service
            streamHandlerExecutor = pronunciationDictListPageAsync.streamHandlerExecutor
            params = pronunciationDictListPageAsync.params
            response = pronunciationDictListPageAsync.response
        }

        fun service(service: PronunciationDictServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PronunciationDictListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PronunciationDictListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PronunciationDictListPageAsync].
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
        fun build(): PronunciationDictListPageAsync =
            PronunciationDictListPageAsync(
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

        return other is PronunciationDictListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PronunciationDictListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
