// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordingtranscriptions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.RecordingTranscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RecordingTranscriptionServiceAsync.list */
class RecordingTranscriptionListPageAsync
private constructor(
    private val service: RecordingTranscriptionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RecordingTranscriptionListParams,
    private val response: RecordingTranscriptionListPageResponse,
) : PageAsync<RecordingTranscription> {

    /**
     * Delegates to [RecordingTranscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingTranscriptionListPageResponse.data
     */
    fun data(): List<RecordingTranscription> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RecordingTranscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingTranscriptionListPageResponse.meta
     */
    fun meta(): Optional<RecordingTranscriptionListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<RecordingTranscription> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RecordingTranscriptionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RecordingTranscriptionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RecordingTranscription> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RecordingTranscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): RecordingTranscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RecordingTranscriptionListPageAsync].
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

    /** A builder for [RecordingTranscriptionListPageAsync]. */
    class Builder internal constructor() {

        private var service: RecordingTranscriptionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RecordingTranscriptionListParams? = null
        private var response: RecordingTranscriptionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            recordingTranscriptionListPageAsync: RecordingTranscriptionListPageAsync
        ) = apply {
            service = recordingTranscriptionListPageAsync.service
            streamHandlerExecutor = recordingTranscriptionListPageAsync.streamHandlerExecutor
            params = recordingTranscriptionListPageAsync.params
            response = recordingTranscriptionListPageAsync.response
        }

        fun service(service: RecordingTranscriptionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RecordingTranscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RecordingTranscriptionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RecordingTranscriptionListPageAsync].
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
        fun build(): RecordingTranscriptionListPageAsync =
            RecordingTranscriptionListPageAsync(
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

        return other is RecordingTranscriptionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RecordingTranscriptionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
