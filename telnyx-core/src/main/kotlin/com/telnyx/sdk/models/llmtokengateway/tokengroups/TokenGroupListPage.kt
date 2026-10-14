// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TokenGroupService.list */
class TokenGroupListPage
private constructor(
    private val service: TokenGroupService,
    private val params: TokenGroupListParams,
    private val response: TokenGroupListPageResponse,
) : Page<TokenGroup> {

    /**
     * Delegates to [TokenGroupListPageResponse], but gracefully handles missing data.
     *
     * @see TokenGroupListPageResponse.data
     */
    fun data(): List<TokenGroup> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TokenGroupListPageResponse], but gracefully handles missing data.
     *
     * @see TokenGroupListPageResponse.meta
     */
    fun meta(): Optional<AiGatewayResourcesPageMeta> = response._meta().getOptional("meta")

    override fun items(): List<TokenGroup> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TokenGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): TokenGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TokenGroup> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TokenGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenGroupListPage].
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

    /** A builder for [TokenGroupListPage]. */
    class Builder internal constructor() {

        private var service: TokenGroupService? = null
        private var params: TokenGroupListParams? = null
        private var response: TokenGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(tokenGroupListPage: TokenGroupListPage) = apply {
            service = tokenGroupListPage.service
            params = tokenGroupListPage.params
            response = tokenGroupListPage.response
        }

        fun service(service: TokenGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TokenGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenGroupListPage].
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
        fun build(): TokenGroupListPage =
            TokenGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenGroupListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TokenGroupListPage{service=$service, params=$params, response=$response}"
}
