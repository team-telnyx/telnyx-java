// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberextensions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberExtensionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberExtensionService.list */
class PhoneNumberExtensionListPage
private constructor(
    private val service: PhoneNumberExtensionService,
    private val params: PhoneNumberExtensionListParams,
    private val response: PhoneNumberExtensionListPageResponse,
) : Page<PortingPhoneNumberExtension> {

    /**
     * Delegates to [PhoneNumberExtensionListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberExtensionListPageResponse.data
     */
    fun data(): List<PortingPhoneNumberExtension> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberExtensionListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberExtensionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingPhoneNumberExtension> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberExtensionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): PhoneNumberExtensionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortingPhoneNumberExtension> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberExtensionListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberExtensionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberExtensionListPage].
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

    /** A builder for [PhoneNumberExtensionListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberExtensionService? = null
        private var params: PhoneNumberExtensionListParams? = null
        private var response: PhoneNumberExtensionListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberExtensionListPage: PhoneNumberExtensionListPage) = apply {
            service = phoneNumberExtensionListPage.service
            params = phoneNumberExtensionListPage.params
            response = phoneNumberExtensionListPage.response
        }

        fun service(service: PhoneNumberExtensionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberExtensionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberExtensionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberExtensionListPage].
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
        fun build(): PhoneNumberExtensionListPage =
            PhoneNumberExtensionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberExtensionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberExtensionListPage{service=$service, params=$params, response=$response}"
}
