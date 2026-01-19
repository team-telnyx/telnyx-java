// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthgrants

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.oauthclients.PaginationMetaOAuth
import com.telnyx.sdk.services.blocking.OAuthGrantService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OAuthGrantService.list */
class OAuthGrantListPage
private constructor(
    private val service: OAuthGrantService,
    private val params: OAuthGrantListParams,
    private val response: OAuthGrantListPageResponse,
) : Page<OAuthGrant> {

    /**
     * Delegates to [OAuthGrantListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthGrantListPageResponse.data
     */
    fun data(): List<OAuthGrant> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthGrantListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthGrantListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaOAuth> = response._meta().getOptional("meta")

    override fun items(): List<OAuthGrant> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): OAuthGrantListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): OAuthGrantListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OAuthGrant> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OAuthGrantListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthGrantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthGrantListPage].
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

    /** A builder for [OAuthGrantListPage]. */
    class Builder internal constructor() {

        private var service: OAuthGrantService? = null
        private var params: OAuthGrantListParams? = null
        private var response: OAuthGrantListPageResponse? = null

        @JvmSynthetic
        internal fun from(oauthGrantListPage: OAuthGrantListPage) = apply {
            service = oauthGrantListPage.service
            params = oauthGrantListPage.params
            response = oauthGrantListPage.response
        }

        fun service(service: OAuthGrantService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthGrantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthGrantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OAuthGrantListPage].
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
        fun build(): OAuthGrantListPage =
            OAuthGrantListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthGrantListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OAuthGrantListPage{service=$service, params=$params, response=$response}"
}
