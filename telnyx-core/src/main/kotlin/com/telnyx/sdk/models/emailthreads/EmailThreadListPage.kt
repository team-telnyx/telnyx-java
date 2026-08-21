// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailthreads

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.models.emailinboxes.threads.InboundThread
import com.telnyx.sdk.models.emailinboxes.threads.InboundThreadListResponse
import com.telnyx.sdk.services.blocking.EmailThreadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailThreadService.list */
class EmailThreadListPage
private constructor(
    private val service: EmailThreadService,
    private val params: EmailThreadListParams,
    private val response: InboundThreadListResponse,
) : Page<InboundThread> {

    /**
     * Delegates to [InboundThreadListResponse], but gracefully handles missing data.
     *
     * @see InboundThreadListResponse.data
     */
    fun data(): List<InboundThread> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundThreadListResponse], but gracefully handles missing data.
     *
     * @see InboundThreadListResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<InboundThread> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailThreadListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): EmailThreadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundThread> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailThreadListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundThreadListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailThreadListPage].
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

    /** A builder for [EmailThreadListPage]. */
    class Builder internal constructor() {

        private var service: EmailThreadService? = null
        private var params: EmailThreadListParams? = null
        private var response: InboundThreadListResponse? = null

        @JvmSynthetic
        internal fun from(emailThreadListPage: EmailThreadListPage) = apply {
            service = emailThreadListPage.service
            params = emailThreadListPage.params
            response = emailThreadListPage.response
        }

        fun service(service: EmailThreadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailThreadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundThreadListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailThreadListPage].
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
        fun build(): EmailThreadListPage =
            EmailThreadListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailThreadListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailThreadListPage{service=$service, params=$params, response=$response}"
}
