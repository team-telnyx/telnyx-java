// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessage
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.services.blocking.EmailMessageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailMessageService.list */
class EmailMessageListPage
private constructor(
    private val service: EmailMessageService,
    private val params: EmailMessageListParams,
    private val response: EmailMessageListPageResponse,
) : Page<EmailMessage> {

    /**
     * Delegates to [EmailMessageListPageResponse], but gracefully handles missing data.
     *
     * @see EmailMessageListPageResponse.data
     */
    fun data(): List<EmailMessage> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailMessageListPageResponse], but gracefully handles missing data.
     *
     * @see EmailMessageListPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailMessage> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailMessageListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): EmailMessageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailMessage> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailMessageListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailMessageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailMessageListPage].
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

    /** A builder for [EmailMessageListPage]. */
    class Builder internal constructor() {

        private var service: EmailMessageService? = null
        private var params: EmailMessageListParams? = null
        private var response: EmailMessageListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailMessageListPage: EmailMessageListPage) = apply {
            service = emailMessageListPage.service
            params = emailMessageListPage.params
            response = emailMessageListPage.response
        }

        fun service(service: EmailMessageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailMessageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailMessageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailMessageListPage].
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
        fun build(): EmailMessageListPage =
            EmailMessageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailMessageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailMessageListPage{service=$service, params=$params, response=$response}"
}
