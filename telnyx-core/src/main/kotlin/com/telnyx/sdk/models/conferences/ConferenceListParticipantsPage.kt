// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.ConferenceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ConferenceService.listParticipants */
class ConferenceListParticipantsPage
private constructor(
    private val service: ConferenceService,
    private val params: ConferenceListParticipantsParams,
    private val response: ConferenceListParticipantsPageResponse,
) : Page<ConferenceListParticipantsResponse> {

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
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ConferenceListParticipantsPage =
        service.listParticipants(nextPageParams())

    fun autoPager(): AutoPager<ConferenceListParticipantsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConferenceListParticipantsParams = params

    /** The response that this page was parsed from. */
    fun response(): ConferenceListParticipantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConferenceListParticipantsPage].
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

    /** A builder for [ConferenceListParticipantsPage]. */
    class Builder internal constructor() {

        private var service: ConferenceService? = null
        private var params: ConferenceListParticipantsParams? = null
        private var response: ConferenceListParticipantsPageResponse? = null

        @JvmSynthetic
        internal fun from(conferenceListParticipantsPage: ConferenceListParticipantsPage) = apply {
            service = conferenceListParticipantsPage.service
            params = conferenceListParticipantsPage.params
            response = conferenceListParticipantsPage.response
        }

        fun service(service: ConferenceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConferenceListParticipantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConferenceListParticipantsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ConferenceListParticipantsPage].
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
        fun build(): ConferenceListParticipantsPage =
            ConferenceListParticipantsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceListParticipantsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ConferenceListParticipantsPage{service=$service, params=$params, response=$response}"
}
