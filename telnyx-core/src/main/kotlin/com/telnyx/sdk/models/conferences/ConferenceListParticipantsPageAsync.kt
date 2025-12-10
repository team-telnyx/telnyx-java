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

/** @see ConferenceServiceAsync.listParticipants */
class ConferenceListParticipantsPageAsync
private constructor(
    private val service: ConferenceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ConferenceListParticipantsParams,
    private val response: ConferenceListParticipantsPageResponse,
) : PageAsync<ConferenceListParticipantsResponse> {

    /**
     * Delegates to [ConferenceListParticipantsPageResponse], but gracefully handles missing data.
     *
     * @see ConferenceListParticipantsPageResponse.data
     */
    fun data(): List<ConferenceListParticipantsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConferenceListParticipantsPageResponse], but gracefully handles missing data.
     *
     * @see ConferenceListParticipantsPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ConferenceListParticipantsResponse> = data()

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

    fun nextPageParams(): ConferenceListParticipantsParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ConferenceListParticipantsPageAsync> =
        service.listParticipants(nextPageParams())

    fun autoPager(): AutoPagerAsync<ConferenceListParticipantsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ConferenceListParticipantsParams = params

    /** The response that this page was parsed from. */
    fun response(): ConferenceListParticipantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConferenceListParticipantsPageAsync].
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

    /** A builder for [ConferenceListParticipantsPageAsync]. */
    class Builder internal constructor() {

        private var service: ConferenceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ConferenceListParticipantsParams? = null
        private var response: ConferenceListParticipantsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            conferenceListParticipantsPageAsync: ConferenceListParticipantsPageAsync
        ) = apply {
            service = conferenceListParticipantsPageAsync.service
            streamHandlerExecutor = conferenceListParticipantsPageAsync.streamHandlerExecutor
            params = conferenceListParticipantsPageAsync.params
            response = conferenceListParticipantsPageAsync.response
        }

        fun service(service: ConferenceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ConferenceListParticipantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConferenceListParticipantsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ConferenceListParticipantsPageAsync].
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
        fun build(): ConferenceListParticipantsPageAsync =
            ConferenceListParticipantsPageAsync(
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

        return other is ConferenceListParticipantsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ConferenceListParticipantsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
