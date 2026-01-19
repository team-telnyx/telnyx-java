// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.associatedphonenumbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.AssociatedPhoneNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AssociatedPhoneNumberService.list */
class AssociatedPhoneNumberListPage
private constructor(
    private val service: AssociatedPhoneNumberService,
    private val params: AssociatedPhoneNumberListParams,
    private val response: AssociatedPhoneNumberListPageResponse,
) : Page<PortingAssociatedPhoneNumber> {

    /**
     * Delegates to [AssociatedPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see AssociatedPhoneNumberListPageResponse.data
     */
    fun data(): List<PortingAssociatedPhoneNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AssociatedPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see AssociatedPhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingAssociatedPhoneNumber> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AssociatedPhoneNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AssociatedPhoneNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortingAssociatedPhoneNumber> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AssociatedPhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): AssociatedPhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AssociatedPhoneNumberListPage].
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

    /** A builder for [AssociatedPhoneNumberListPage]. */
    class Builder internal constructor() {

        private var service: AssociatedPhoneNumberService? = null
        private var params: AssociatedPhoneNumberListParams? = null
        private var response: AssociatedPhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(associatedPhoneNumberListPage: AssociatedPhoneNumberListPage) = apply {
            service = associatedPhoneNumberListPage.service
            params = associatedPhoneNumberListPage.params
            response = associatedPhoneNumberListPage.response
        }

        fun service(service: AssociatedPhoneNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AssociatedPhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AssociatedPhoneNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AssociatedPhoneNumberListPage].
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
        fun build(): AssociatedPhoneNumberListPage =
            AssociatedPhoneNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociatedPhoneNumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AssociatedPhoneNumberListPage{service=$service, params=$params, response=$response}"
}
