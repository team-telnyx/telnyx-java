// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.MobilePhoneNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobilePhoneNumberService.list */
class MobilePhoneNumberListPage
private constructor(
    private val service: MobilePhoneNumberService,
    private val params: MobilePhoneNumberListParams,
    private val response: MobilePhoneNumberListPageResponse,
) : Page<MobilePhoneNumber> {

    /**
     * Delegates to [MobilePhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePhoneNumberListPageResponse.data
     */
    fun data(): List<MobilePhoneNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobilePhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<MobilePhoneNumberListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<MobilePhoneNumber> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MobilePhoneNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MobilePhoneNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MobilePhoneNumber> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MobilePhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobilePhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MobilePhoneNumberListPage].
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

    /** A builder for [MobilePhoneNumberListPage]. */
    class Builder internal constructor() {

        private var service: MobilePhoneNumberService? = null
        private var params: MobilePhoneNumberListParams? = null
        private var response: MobilePhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobilePhoneNumberListPage: MobilePhoneNumberListPage) = apply {
            service = mobilePhoneNumberListPage.service
            params = mobilePhoneNumberListPage.params
            response = mobilePhoneNumberListPage.response
        }

        fun service(service: MobilePhoneNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MobilePhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobilePhoneNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobilePhoneNumberListPage].
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
        fun build(): MobilePhoneNumberListPage =
            MobilePhoneNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobilePhoneNumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MobilePhoneNumberListPage{service=$service, params=$params, response=$response}"
}
