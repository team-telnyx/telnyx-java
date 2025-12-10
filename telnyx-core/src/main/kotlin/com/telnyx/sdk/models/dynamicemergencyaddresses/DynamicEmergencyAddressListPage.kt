// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyaddresses

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Metadata
import com.telnyx.sdk.services.blocking.DynamicEmergencyAddressService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DynamicEmergencyAddressService.list */
class DynamicEmergencyAddressListPage
private constructor(
    private val service: DynamicEmergencyAddressService,
    private val params: DynamicEmergencyAddressListParams,
    private val response: DynamicEmergencyAddressListPageResponse,
) : Page<DynamicEmergencyAddress> {

    /**
     * Delegates to [DynamicEmergencyAddressListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyAddressListPageResponse.data
     */
    fun data(): List<DynamicEmergencyAddress> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DynamicEmergencyAddressListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyAddressListPageResponse.meta
     */
    fun meta(): Optional<Metadata> = response._meta().getOptional("meta")

    override fun items(): List<DynamicEmergencyAddress> = data()

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

    fun nextPageParams(): DynamicEmergencyAddressListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): DynamicEmergencyAddressListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DynamicEmergencyAddress> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DynamicEmergencyAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): DynamicEmergencyAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DynamicEmergencyAddressListPage].
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

    /** A builder for [DynamicEmergencyAddressListPage]. */
    class Builder internal constructor() {

        private var service: DynamicEmergencyAddressService? = null
        private var params: DynamicEmergencyAddressListParams? = null
        private var response: DynamicEmergencyAddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(dynamicEmergencyAddressListPage: DynamicEmergencyAddressListPage) =
            apply {
                service = dynamicEmergencyAddressListPage.service
                params = dynamicEmergencyAddressListPage.params
                response = dynamicEmergencyAddressListPage.response
            }

        fun service(service: DynamicEmergencyAddressService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DynamicEmergencyAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DynamicEmergencyAddressListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DynamicEmergencyAddressListPage].
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
        fun build(): DynamicEmergencyAddressListPage =
            DynamicEmergencyAddressListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DynamicEmergencyAddressListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DynamicEmergencyAddressListPage{service=$service, params=$params, response=$response}"
}
