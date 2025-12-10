// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.loaconfigurations

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.porting.LoaConfigurationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see LoaConfigurationService.list */
class LoaConfigurationListPage
private constructor(
    private val service: LoaConfigurationService,
    private val params: LoaConfigurationListParams,
    private val response: LoaConfigurationListPageResponse,
) : Page<PortingLoaConfiguration> {

    /**
     * Delegates to [LoaConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see LoaConfigurationListPageResponse.data
     */
    fun data(): List<PortingLoaConfiguration> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LoaConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see LoaConfigurationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingLoaConfiguration> = data()

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

    fun nextPageParams(): LoaConfigurationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): LoaConfigurationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortingLoaConfiguration> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LoaConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): LoaConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LoaConfigurationListPage].
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

    /** A builder for [LoaConfigurationListPage]. */
    class Builder internal constructor() {

        private var service: LoaConfigurationService? = null
        private var params: LoaConfigurationListParams? = null
        private var response: LoaConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(loaConfigurationListPage: LoaConfigurationListPage) = apply {
            service = loaConfigurationListPage.service
            params = loaConfigurationListPage.params
            response = loaConfigurationListPage.response
        }

        fun service(service: LoaConfigurationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LoaConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LoaConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LoaConfigurationListPage].
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
        fun build(): LoaConfigurationListPage =
            LoaConfigurationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LoaConfigurationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LoaConfigurationListPage{service=$service, params=$params, response=$response}"
}
