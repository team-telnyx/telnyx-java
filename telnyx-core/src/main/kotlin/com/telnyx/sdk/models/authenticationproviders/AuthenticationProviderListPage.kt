// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.AuthenticationProviderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AuthenticationProviderService.list */
class AuthenticationProviderListPage
private constructor(
    private val service: AuthenticationProviderService,
    private val params: AuthenticationProviderListParams,
    private val response: AuthenticationProviderListPageResponse,
) : Page<AuthenticationProvider> {

    /**
     * Delegates to [AuthenticationProviderListPageResponse], but gracefully handles missing data.
     *
     * @see AuthenticationProviderListPageResponse.data
     */
    fun data(): List<AuthenticationProvider> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AuthenticationProviderListPageResponse], but gracefully handles missing data.
     *
     * @see AuthenticationProviderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<AuthenticationProvider> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AuthenticationProviderListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AuthenticationProviderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AuthenticationProvider> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AuthenticationProviderListParams = params

    /** The response that this page was parsed from. */
    fun response(): AuthenticationProviderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthenticationProviderListPage].
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

    /** A builder for [AuthenticationProviderListPage]. */
    class Builder internal constructor() {

        private var service: AuthenticationProviderService? = null
        private var params: AuthenticationProviderListParams? = null
        private var response: AuthenticationProviderListPageResponse? = null

        @JvmSynthetic
        internal fun from(authenticationProviderListPage: AuthenticationProviderListPage) = apply {
            service = authenticationProviderListPage.service
            params = authenticationProviderListPage.params
            response = authenticationProviderListPage.response
        }

        fun service(service: AuthenticationProviderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AuthenticationProviderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuthenticationProviderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AuthenticationProviderListPage].
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
        fun build(): AuthenticationProviderListPage =
            AuthenticationProviderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthenticationProviderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AuthenticationProviderListPage{service=$service, params=$params, response=$response}"
}
