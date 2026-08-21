// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.EmailBlockService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailBlockService.retrieveEvents */
class EmailBlockRetrieveEventsPage
private constructor(
    private val service: EmailBlockService,
    private val params: EmailBlockRetrieveEventsParams,
    private val response: EmailBlockRetrieveEventsPageResponse,
) : Page<EmailBlockRetrieveEventsResponse> {

    /**
     * Delegates to [EmailBlockRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailBlockRetrieveEventsPageResponse.data
     */
    fun data(): List<EmailBlockRetrieveEventsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailBlockRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailBlockRetrieveEventsPageResponse.meta
     */
    fun meta(): Optional<OffsetMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailBlockRetrieveEventsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EmailBlockRetrieveEventsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): EmailBlockRetrieveEventsPage = service.retrieveEvents(nextPageParams())

    fun autoPager(): AutoPager<EmailBlockRetrieveEventsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailBlockRetrieveEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailBlockRetrieveEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailBlockRetrieveEventsPage].
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

    /** A builder for [EmailBlockRetrieveEventsPage]. */
    class Builder internal constructor() {

        private var service: EmailBlockService? = null
        private var params: EmailBlockRetrieveEventsParams? = null
        private var response: EmailBlockRetrieveEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(emailBlockRetrieveEventsPage: EmailBlockRetrieveEventsPage) = apply {
            service = emailBlockRetrieveEventsPage.service
            params = emailBlockRetrieveEventsPage.params
            response = emailBlockRetrieveEventsPage.response
        }

        fun service(service: EmailBlockService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailBlockRetrieveEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailBlockRetrieveEventsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailBlockRetrieveEventsPage].
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
        fun build(): EmailBlockRetrieveEventsPage =
            EmailBlockRetrieveEventsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailBlockRetrieveEventsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailBlockRetrieveEventsPage{service=$service, params=$params, response=$response}"
}
