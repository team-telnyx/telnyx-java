// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberblocks

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberBlockService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberBlockService.list */
class PhoneNumberBlockListPage
private constructor(
    private val service: PhoneNumberBlockService,
    private val params: PhoneNumberBlockListParams,
    private val response: PhoneNumberBlockListPageResponse,
) : Page<PortingPhoneNumberBlock> {

    /**
     * Delegates to [PhoneNumberBlockListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBlockListPageResponse.data
     */
    fun data(): List<PortingPhoneNumberBlock> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberBlockListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBlockListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingPhoneNumberBlock> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberBlockListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): PhoneNumberBlockListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortingPhoneNumberBlock> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberBlockListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberBlockListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberBlockListPage].
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

    /** A builder for [PhoneNumberBlockListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberBlockService? = null
        private var params: PhoneNumberBlockListParams? = null
        private var response: PhoneNumberBlockListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberBlockListPage: PhoneNumberBlockListPage) = apply {
            service = phoneNumberBlockListPage.service
            params = phoneNumberBlockListPage.params
            response = phoneNumberBlockListPage.response
        }

        fun service(service: PhoneNumberBlockService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberBlockListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberBlockListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberBlockListPage].
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
        fun build(): PhoneNumberBlockListPage =
            PhoneNumberBlockListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberBlockListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberBlockListPage{service=$service, params=$params, response=$response}"
}
