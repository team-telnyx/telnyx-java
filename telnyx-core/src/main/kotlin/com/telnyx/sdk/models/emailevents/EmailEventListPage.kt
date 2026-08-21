// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.EmailEventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailEventService.list */
class EmailEventListPage
private constructor(
    private val service: EmailEventService,
    private val params: EmailEventListParams,
    private val response: EmailEventListPageResponse,
) : Page<EmailEventListResponse> {

    /**
     * Delegates to [EmailEventListPageResponse], but gracefully handles missing data.
     *
     * @see EmailEventListPageResponse.data
     */
    fun data(): List<EmailEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailEventListPageResponse], but gracefully handles missing data.
     *
     * @see EmailEventListPageResponse.meta
     */
    fun meta(): Optional<EmailEventListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailEventListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailEventListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): EmailEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailEventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailEventListPage].
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

    /** A builder for [EmailEventListPage]. */
    class Builder internal constructor() {

        private var service: EmailEventService? = null
        private var params: EmailEventListParams? = null
        private var response: EmailEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailEventListPage: EmailEventListPage) = apply {
            service = emailEventListPage.service
            params = emailEventListPage.params
            response = emailEventListPage.response
        }

        fun service(service: EmailEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailEventListPage].
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
        fun build(): EmailEventListPage =
            EmailEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailEventListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailEventListPage{service=$service, params=$params, response=$response}"
}
