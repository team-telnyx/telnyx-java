// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.PhoneNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberService.slimList */
class PhoneNumberSlimListPage
private constructor(
    private val service: PhoneNumberService,
    private val params: PhoneNumberSlimListParams,
    private val response: PhoneNumberSlimListPageResponse,
) : Page<PhoneNumberSlimListResponse> {

    /**
     * Delegates to [PhoneNumberSlimListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberSlimListPageResponse.data
     */
    fun data(): List<PhoneNumberSlimListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberSlimListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberSlimListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberSlimListResponse> = data()

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

    fun nextPageParams(): PhoneNumberSlimListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): PhoneNumberSlimListPage = service.slimList(nextPageParams())

    fun autoPager(): AutoPager<PhoneNumberSlimListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberSlimListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberSlimListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberSlimListPage].
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

    /** A builder for [PhoneNumberSlimListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberService? = null
        private var params: PhoneNumberSlimListParams? = null
        private var response: PhoneNumberSlimListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberSlimListPage: PhoneNumberSlimListPage) = apply {
            service = phoneNumberSlimListPage.service
            params = phoneNumberSlimListPage.params
            response = phoneNumberSlimListPage.response
        }

        fun service(service: PhoneNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberSlimListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberSlimListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhoneNumberSlimListPage].
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
        fun build(): PhoneNumberSlimListPage =
            PhoneNumberSlimListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberSlimListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberSlimListPage{service=$service, params=$params, response=$response}"
}
