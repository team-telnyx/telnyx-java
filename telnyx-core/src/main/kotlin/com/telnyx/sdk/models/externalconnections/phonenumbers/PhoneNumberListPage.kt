// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.phonenumbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import com.telnyx.sdk.services.blocking.externalconnections.PhoneNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberService.list */
class PhoneNumberListPage
private constructor(
    private val service: PhoneNumberService,
    private val params: PhoneNumberListParams,
    private val response: PhoneNumberListPageResponse,
) : Page<ExternalConnectionPhoneNumber> {

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.data
     */
    fun data(): List<ExternalConnectionPhoneNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<ExternalConnectionPhoneNumber> = data()

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

    fun nextPageParams(): PhoneNumberListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): PhoneNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalConnectionPhoneNumber> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberListPage].
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

    /** A builder for [PhoneNumberListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberService? = null
        private var params: PhoneNumberListParams? = null
        private var response: PhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberListPage: PhoneNumberListPage) = apply {
            service = phoneNumberListPage.service
            params = phoneNumberListPage.params
            response = phoneNumberListPage.response
        }

        fun service(service: PhoneNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhoneNumberListPage].
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
        fun build(): PhoneNumberListPage =
            PhoneNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberListPage{service=$service, params=$params, response=$response}"
}
