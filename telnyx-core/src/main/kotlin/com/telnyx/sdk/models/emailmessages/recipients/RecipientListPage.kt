// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages.recipients

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.emailmessages.RecipientService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RecipientService.list */
class RecipientListPage
private constructor(
    private val service: RecipientService,
    private val params: RecipientListParams,
    private val response: RecipientListPageResponse,
) : Page<EmailRecipient> {

    /**
     * Delegates to [RecipientListPageResponse], but gracefully handles missing data.
     *
     * @see RecipientListPageResponse.data
     */
    fun data(): List<EmailRecipient> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RecipientListPageResponse], but gracefully handles missing data.
     *
     * @see RecipientListPageResponse.meta
     */
    fun meta(): Optional<RecipientListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailRecipient> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): RecipientListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): RecipientListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailRecipient> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RecipientListParams = params

    /** The response that this page was parsed from. */
    fun response(): RecipientListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RecipientListPage].
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

    /** A builder for [RecipientListPage]. */
    class Builder internal constructor() {

        private var service: RecipientService? = null
        private var params: RecipientListParams? = null
        private var response: RecipientListPageResponse? = null

        @JvmSynthetic
        internal fun from(recipientListPage: RecipientListPage) = apply {
            service = recipientListPage.service
            params = recipientListPage.params
            response = recipientListPage.response
        }

        fun service(service: RecipientService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RecipientListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RecipientListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RecipientListPage].
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
        fun build(): RecipientListPage =
            RecipientListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecipientListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RecipientListPage{service=$service, params=$params, response=$response}"
}
