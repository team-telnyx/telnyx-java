// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.services.blocking.emailinboxes.DraftService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DraftService.list */
class DraftListPage
private constructor(
    private val service: DraftService,
    private val params: DraftListParams,
    private val response: DraftListPageResponse,
) : Page<EmailDraft> {

    /**
     * Delegates to [DraftListPageResponse], but gracefully handles missing data.
     *
     * @see DraftListPageResponse.data
     */
    fun data(): List<EmailDraft> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DraftListPageResponse], but gracefully handles missing data.
     *
     * @see DraftListPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailDraft> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): DraftListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): DraftListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailDraft> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DraftListParams = params

    /** The response that this page was parsed from. */
    fun response(): DraftListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DraftListPage].
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

    /** A builder for [DraftListPage]. */
    class Builder internal constructor() {

        private var service: DraftService? = null
        private var params: DraftListParams? = null
        private var response: DraftListPageResponse? = null

        @JvmSynthetic
        internal fun from(draftListPage: DraftListPage) = apply {
            service = draftListPage.service
            params = draftListPage.params
            response = draftListPage.response
        }

        fun service(service: DraftService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DraftListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DraftListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DraftListPage].
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
        fun build(): DraftListPage =
            DraftListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DraftListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "DraftListPage{service=$service, params=$params, response=$response}"
}
