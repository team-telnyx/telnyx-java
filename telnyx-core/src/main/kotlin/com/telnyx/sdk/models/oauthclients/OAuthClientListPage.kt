// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.OAuthClientService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OAuthClientService.list */
class OAuthClientListPage
private constructor(
    private val service: OAuthClientService,
    private val params: OAuthClientListParams,
    private val response: OAuthClientListPageResponse,
) : Page<OAuthClient> {

    /**
     * Delegates to [OAuthClientListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthClientListPageResponse.data
     */
    fun data(): List<OAuthClient> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthClientListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthClientListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaOAuth> = response._meta().getOptional("meta")

    override fun items(): List<OAuthClient> = data()

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

    fun nextPageParams(): OAuthClientListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): OAuthClientListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OAuthClient> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OAuthClientListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthClientListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthClientListPage].
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

    /** A builder for [OAuthClientListPage]. */
    class Builder internal constructor() {

        private var service: OAuthClientService? = null
        private var params: OAuthClientListParams? = null
        private var response: OAuthClientListPageResponse? = null

        @JvmSynthetic
        internal fun from(oauthClientListPage: OAuthClientListPage) = apply {
            service = oauthClientListPage.service
            params = oauthClientListPage.params
            response = oauthClientListPage.response
        }

        fun service(service: OAuthClientService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthClientListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthClientListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OAuthClientListPage].
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
        fun build(): OAuthClientListPage =
            OAuthClientListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthClientListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OAuthClientListPage{service=$service, params=$params, response=$response}"
}
