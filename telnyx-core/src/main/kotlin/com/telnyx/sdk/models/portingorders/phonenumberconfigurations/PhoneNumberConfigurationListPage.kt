// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberconfigurations

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberConfigurationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberConfigurationService.list */
class PhoneNumberConfigurationListPage
private constructor(
    private val service: PhoneNumberConfigurationService,
    private val params: PhoneNumberConfigurationListParams,
    private val response: PhoneNumberConfigurationListPageResponse,
) : Page<PhoneNumberConfigurationListResponse> {

    /**
     * Delegates to [PhoneNumberConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberConfigurationListPageResponse.data
     */
    fun data(): List<PhoneNumberConfigurationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberConfigurationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberConfigurationListResponse> = data()

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

    fun nextPageParams(): PhoneNumberConfigurationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): PhoneNumberConfigurationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PhoneNumberConfigurationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberConfigurationListPage].
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

    /** A builder for [PhoneNumberConfigurationListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberConfigurationService? = null
        private var params: PhoneNumberConfigurationListParams? = null
        private var response: PhoneNumberConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberConfigurationListPage: PhoneNumberConfigurationListPage) =
            apply {
                service = phoneNumberConfigurationListPage.service
                params = phoneNumberConfigurationListPage.params
                response = phoneNumberConfigurationListPage.response
            }

        fun service(service: PhoneNumberConfigurationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberConfigurationListPage].
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
        fun build(): PhoneNumberConfigurationListPage =
            PhoneNumberConfigurationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberConfigurationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberConfigurationListPage{service=$service, params=$params, response=$response}"
}
