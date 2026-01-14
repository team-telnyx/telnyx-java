// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.PortingPhoneNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortingPhoneNumberService.list */
class PortingPhoneNumberListPage
private constructor(
    private val service: PortingPhoneNumberService,
    private val params: PortingPhoneNumberListParams,
    private val response: PortingPhoneNumberListPageResponse,
) : Page<PortingPhoneNumberListResponse> {

    /**
     * Delegates to [PortingPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PortingPhoneNumberListPageResponse.data
     */
    fun data(): List<PortingPhoneNumberListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PortingPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PortingPhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingPhoneNumberListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PortingPhoneNumberListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): PortingPhoneNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortingPhoneNumberListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PortingPhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): PortingPhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortingPhoneNumberListPage].
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

    /** A builder for [PortingPhoneNumberListPage]. */
    class Builder internal constructor() {

        private var service: PortingPhoneNumberService? = null
        private var params: PortingPhoneNumberListParams? = null
        private var response: PortingPhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(portingPhoneNumberListPage: PortingPhoneNumberListPage) = apply {
            service = portingPhoneNumberListPage.service
            params = portingPhoneNumberListPage.params
            response = portingPhoneNumberListPage.response
        }

        fun service(service: PortingPhoneNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PortingPhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortingPhoneNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PortingPhoneNumberListPage].
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
        fun build(): PortingPhoneNumberListPage =
            PortingPhoneNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingPhoneNumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PortingPhoneNumberListPage{service=$service, params=$params, response=$response}"
}
