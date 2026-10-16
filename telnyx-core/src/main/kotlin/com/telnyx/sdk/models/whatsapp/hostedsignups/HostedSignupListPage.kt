// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.hostedsignups

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.whatsapp.HostedSignupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see HostedSignupService.list */
class HostedSignupListPage
private constructor(
    private val service: HostedSignupService,
    private val params: HostedSignupListParams,
    private val response: HostedSignupListPageResponse,
) : Page<HostedSignupListResponse> {

    /**
     * Delegates to [HostedSignupListPageResponse], but gracefully handles missing data.
     *
     * @see HostedSignupListPageResponse.data
     */
    fun data(): List<HostedSignupListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [HostedSignupListPageResponse], but gracefully handles missing data.
     *
     * @see HostedSignupListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<HostedSignupListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): HostedSignupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): HostedSignupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<HostedSignupListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HostedSignupListParams = params

    /** The response that this page was parsed from. */
    fun response(): HostedSignupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HostedSignupListPage].
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

    /** A builder for [HostedSignupListPage]. */
    class Builder internal constructor() {

        private var service: HostedSignupService? = null
        private var params: HostedSignupListParams? = null
        private var response: HostedSignupListPageResponse? = null

        @JvmSynthetic
        internal fun from(hostedSignupListPage: HostedSignupListPage) = apply {
            service = hostedSignupListPage.service
            params = hostedSignupListPage.params
            response = hostedSignupListPage.response
        }

        fun service(service: HostedSignupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HostedSignupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HostedSignupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [HostedSignupListPage].
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
        fun build(): HostedSignupListPage =
            HostedSignupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HostedSignupListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "HostedSignupListPage{service=$service, params=$params, response=$response}"
}
