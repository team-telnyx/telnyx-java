// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.ConferenceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ConferenceServiceAsync.list */
class ConferenceListPageAsync
private constructor(
    private val service: ConferenceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ConferenceListParams,
    private val response: ConferenceListPageResponse,
) : PageAsync<Conference> {

    /**
     * Delegates to [ConferenceListPageResponse], but gracefully handles missing data.
     *
     * @see ConferenceListPageResponse.data
     */
    fun data(): List<Conference> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConferenceListPageResponse], but gracefully handles missing data.
     *
     * @see ConferenceListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Conference> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ConferenceListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ConferenceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Conference> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ConferenceListParams = params

    /** The response that this page was parsed from. */
    fun response(): ConferenceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConferenceListPageAsync].
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

    /** A builder for [ConferenceListPageAsync]. */
    class Builder internal constructor() {

        private var service: ConferenceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ConferenceListParams? = null
        private var response: ConferenceListPageResponse? = null

        @JvmSynthetic
        internal fun from(conferenceListPageAsync: ConferenceListPageAsync) = apply {
            service = conferenceListPageAsync.service
            streamHandlerExecutor = conferenceListPageAsync.streamHandlerExecutor
            params = conferenceListPageAsync.params
            response = conferenceListPageAsync.response
        }

        fun service(service: ConferenceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ConferenceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConferenceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ConferenceListPageAsync].
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
        fun build(): ConferenceListPageAsync =
            ConferenceListPageAsync(
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

        return other is ConferenceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ConferenceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
