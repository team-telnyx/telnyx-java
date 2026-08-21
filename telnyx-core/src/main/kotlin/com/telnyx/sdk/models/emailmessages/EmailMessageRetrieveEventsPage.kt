// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.services.blocking.EmailMessageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailMessageService.retrieveEvents */
class EmailMessageRetrieveEventsPage
private constructor(
    private val service: EmailMessageService,
    private val params: EmailMessageRetrieveEventsParams,
    private val response: EmailMessageRetrieveEventsPageResponse,
) : Page<MessageEvent> {

    /**
     * Delegates to [EmailMessageRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailMessageRetrieveEventsPageResponse.data
     */
    fun data(): List<MessageEvent> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailMessageRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailMessageRetrieveEventsPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessageEvent> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailMessageRetrieveEventsParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): EmailMessageRetrieveEventsPage =
        service.retrieveEvents(nextPageParams())

    fun autoPager(): AutoPager<MessageEvent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailMessageRetrieveEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailMessageRetrieveEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailMessageRetrieveEventsPage].
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

    /** A builder for [EmailMessageRetrieveEventsPage]. */
    class Builder internal constructor() {

        private var service: EmailMessageService? = null
        private var params: EmailMessageRetrieveEventsParams? = null
        private var response: EmailMessageRetrieveEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(emailMessageRetrieveEventsPage: EmailMessageRetrieveEventsPage) = apply {
            service = emailMessageRetrieveEventsPage.service
            params = emailMessageRetrieveEventsPage.params
            response = emailMessageRetrieveEventsPage.response
        }

        fun service(service: EmailMessageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailMessageRetrieveEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailMessageRetrieveEventsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailMessageRetrieveEventsPage].
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
        fun build(): EmailMessageRetrieveEventsPage =
            EmailMessageRetrieveEventsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailMessageRetrieveEventsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailMessageRetrieveEventsPage{service=$service, params=$params, response=$response}"
}
