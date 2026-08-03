// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups.suppressions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailblocks.EmailBlock
import com.telnyx.sdk.models.emailunsubscribegroups.GroupListMeta
import com.telnyx.sdk.services.blocking.emailunsubscribegroups.SuppressionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SuppressionService.list */
class SuppressionListPage
private constructor(
    private val service: SuppressionService,
    private val params: SuppressionListParams,
    private val response: SuppressionListPageResponse,
) : Page<EmailBlock> {

    /**
     * Delegates to [SuppressionListPageResponse], but gracefully handles missing data.
     *
     * @see SuppressionListPageResponse.data
     */
    fun data(): List<EmailBlock> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SuppressionListPageResponse], but gracefully handles missing data.
     *
     * @see SuppressionListPageResponse.meta
     */
    fun meta(): Optional<GroupListMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailBlock> = data()

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

    fun nextPageParams(): SuppressionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SuppressionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailBlock> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SuppressionListParams = params

    /** The response that this page was parsed from. */
    fun response(): SuppressionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SuppressionListPage].
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

    /** A builder for [SuppressionListPage]. */
    class Builder internal constructor() {

        private var service: SuppressionService? = null
        private var params: SuppressionListParams? = null
        private var response: SuppressionListPageResponse? = null

        @JvmSynthetic
        internal fun from(suppressionListPage: SuppressionListPage) = apply {
            service = suppressionListPage.service
            params = suppressionListPage.params
            response = suppressionListPage.response
        }

        fun service(service: SuppressionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SuppressionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SuppressionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SuppressionListPage].
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
        fun build(): SuppressionListPage =
            SuppressionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SuppressionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SuppressionListPage{service=$service, params=$params, response=$response}"
}
