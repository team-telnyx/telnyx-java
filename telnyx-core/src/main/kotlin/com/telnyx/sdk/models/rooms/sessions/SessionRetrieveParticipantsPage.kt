// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.RoomParticipant
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.rooms.SessionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SessionService.retrieveParticipants */
class SessionRetrieveParticipantsPage
private constructor(
    private val service: SessionService,
    private val params: SessionRetrieveParticipantsParams,
    private val response: SessionRetrieveParticipantsPageResponse,
) : Page<RoomParticipant> {

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
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SessionRetrieveParticipantsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SessionRetrieveParticipantsPage =
        service.retrieveParticipants(nextPageParams())

    fun autoPager(): AutoPager<RoomParticipant> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SessionRetrieveParticipantsParams = params

    /** The response that this page was parsed from. */
    fun response(): SessionRetrieveParticipantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SessionRetrieveParticipantsPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionRetrieveParticipantsPage]. */
    class Builder internal constructor() {

        private var service: SessionService? = null
        private var params: SessionRetrieveParticipantsParams? = null
        private var response: SessionRetrieveParticipantsPageResponse? = null

        @JvmSynthetic
        internal fun from(sessionRetrieveParticipantsPage: SessionRetrieveParticipantsPage) =
            apply {
                service = sessionRetrieveParticipantsPage.service
                params = sessionRetrieveParticipantsPage.params
                response = sessionRetrieveParticipantsPage.response
            }

        fun service(service: SessionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SessionRetrieveParticipantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SessionRetrieveParticipantsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SessionRetrieveParticipantsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionRetrieveParticipantsPage =
            SessionRetrieveParticipantsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionRetrieveParticipantsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SessionRetrieveParticipantsPage{service=$service, params=$params, response=$response}"
}
