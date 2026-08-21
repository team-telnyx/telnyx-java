// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.EmailInboxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailInboxService.list */
class EmailInboxListPage
private constructor(
    private val service: EmailInboxService,
    private val params: EmailInboxListParams,
    private val response: EmailInboxListPageResponse,
) : Page<EmailInbox> {

    /**
     * Delegates to [EmailInboxListPageResponse], but gracefully handles missing data.
     *
     * @see EmailInboxListPageResponse.data
     */
    fun data(): List<EmailInbox> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailInboxListPageResponse], but gracefully handles missing data.
     *
     * @see EmailInboxListPageResponse.meta
     */
    fun meta(): Optional<EmailInboxListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailInbox> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailInboxListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): EmailInboxListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailInbox> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailInboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailInboxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailInboxListPage].
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

    /** A builder for [EmailInboxListPage]. */
    class Builder internal constructor() {

        private var service: EmailInboxService? = null
        private var params: EmailInboxListParams? = null
        private var response: EmailInboxListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailInboxListPage: EmailInboxListPage) = apply {
            service = emailInboxListPage.service
            params = emailInboxListPage.params
            response = emailInboxListPage.response
        }

        fun service(service: EmailInboxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailInboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailInboxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailInboxListPage].
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
        fun build(): EmailInboxListPage =
            EmailInboxListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailInboxListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailInboxListPage{service=$service, params=$params, response=$response}"
}
