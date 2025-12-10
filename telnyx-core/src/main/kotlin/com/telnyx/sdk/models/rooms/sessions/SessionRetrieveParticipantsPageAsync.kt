// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.RoomParticipant
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.rooms.SessionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SessionServiceAsync.retrieveParticipants */
class SessionRetrieveParticipantsPageAsync
private constructor(
    private val service: SessionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SessionRetrieveParticipantsParams,
    private val response: SessionRetrieveParticipantsPageResponse,
) : PageAsync<RoomParticipant> {

    /**
     * Delegates to [SessionRetrieveParticipantsPageResponse], but gracefully handles missing data.
     *
     * @see SessionRetrieveParticipantsPageResponse.data
     */
    fun data(): List<RoomParticipant> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SessionRetrieveParticipantsPageResponse], but gracefully handles missing data.
     *
     * @see SessionRetrieveParticipantsPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomParticipant> = data()

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

    fun nextPageParams(): SessionRetrieveParticipantsParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SessionRetrieveParticipantsPageAsync> =
        service.retrieveParticipants(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoomParticipant> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SessionRetrieveParticipantsParams = params

    /** The response that this page was parsed from. */
    fun response(): SessionRetrieveParticipantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SessionRetrieveParticipantsPageAsync].
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

    /** A builder for [SessionRetrieveParticipantsPageAsync]. */
    class Builder internal constructor() {

        private var service: SessionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SessionRetrieveParticipantsParams? = null
        private var response: SessionRetrieveParticipantsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            sessionRetrieveParticipantsPageAsync: SessionRetrieveParticipantsPageAsync
        ) = apply {
            service = sessionRetrieveParticipantsPageAsync.service
            streamHandlerExecutor = sessionRetrieveParticipantsPageAsync.streamHandlerExecutor
            params = sessionRetrieveParticipantsPageAsync.params
            response = sessionRetrieveParticipantsPageAsync.response
        }

        fun service(service: SessionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SessionRetrieveParticipantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SessionRetrieveParticipantsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SessionRetrieveParticipantsPageAsync].
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
        fun build(): SessionRetrieveParticipantsPageAsync =
            SessionRetrieveParticipantsPageAsync(
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

        return other is SessionRetrieveParticipantsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SessionRetrieveParticipantsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
