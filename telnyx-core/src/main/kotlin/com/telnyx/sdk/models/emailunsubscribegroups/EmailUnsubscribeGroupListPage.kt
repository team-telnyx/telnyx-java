// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.EmailUnsubscribeGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailUnsubscribeGroupService.list */
class EmailUnsubscribeGroupListPage
private constructor(
    private val service: EmailUnsubscribeGroupService,
    private val params: EmailUnsubscribeGroupListParams,
    private val response: EmailUnsubscribeGroupListPageResponse,
) : Page<UnsubscribeGroup> {

    /**
     * Delegates to [EmailUnsubscribeGroupListPageResponse], but gracefully handles missing data.
     *
     * @see EmailUnsubscribeGroupListPageResponse.data
     */
    fun data(): List<UnsubscribeGroup> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailUnsubscribeGroupListPageResponse], but gracefully handles missing data.
     *
     * @see EmailUnsubscribeGroupListPageResponse.meta
     */
    fun meta(): Optional<GroupListMeta> = response._meta().getOptional("meta")

    override fun items(): List<UnsubscribeGroup> = data()

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

    fun nextPageParams(): EmailUnsubscribeGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): EmailUnsubscribeGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<UnsubscribeGroup> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailUnsubscribeGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailUnsubscribeGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailUnsubscribeGroupListPage].
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

    /** A builder for [EmailUnsubscribeGroupListPage]. */
    class Builder internal constructor() {

        private var service: EmailUnsubscribeGroupService? = null
        private var params: EmailUnsubscribeGroupListParams? = null
        private var response: EmailUnsubscribeGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailUnsubscribeGroupListPage: EmailUnsubscribeGroupListPage) = apply {
            service = emailUnsubscribeGroupListPage.service
            params = emailUnsubscribeGroupListPage.params
            response = emailUnsubscribeGroupListPage.response
        }

        fun service(service: EmailUnsubscribeGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailUnsubscribeGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailUnsubscribeGroupListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailUnsubscribeGroupListPage].
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
        fun build(): EmailUnsubscribeGroupListPage =
            EmailUnsubscribeGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailUnsubscribeGroupListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailUnsubscribeGroupListPage{service=$service, params=$params, response=$response}"
}
