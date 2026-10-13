// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.llmtokengateway.tokengroups.AiGatewayResourcesPageMeta
import com.telnyx.sdk.services.blocking.llmtokengateway.TokenKeyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TokenKeyService.list */
class TokenKeyListPage
private constructor(
    private val service: TokenKeyService,
    private val params: TokenKeyListParams,
    private val response: TokenKeyListPageResponse,
) : Page<TokenKey> {

    /**
     * Delegates to [TokenKeyListPageResponse], but gracefully handles missing data.
     *
     * @see TokenKeyListPageResponse.data
     */
    fun data(): List<TokenKey> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TokenKeyListPageResponse], but gracefully handles missing data.
     *
     * @see TokenKeyListPageResponse.meta
     */
    fun meta(): Optional<AiGatewayResourcesPageMeta> = response._meta().getOptional("meta")

    override fun items(): List<TokenKey> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TokenKeyListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): TokenKeyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TokenKey> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TokenKeyListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenKeyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenKeyListPage].
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

    /** A builder for [TokenKeyListPage]. */
    class Builder internal constructor() {

        private var service: TokenKeyService? = null
        private var params: TokenKeyListParams? = null
        private var response: TokenKeyListPageResponse? = null

        @JvmSynthetic
        internal fun from(tokenKeyListPage: TokenKeyListPage) = apply {
            service = tokenKeyListPage.service
            params = tokenKeyListPage.params
            response = tokenKeyListPage.response
        }

        fun service(service: TokenKeyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TokenKeyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenKeyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenKeyListPage].
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
        fun build(): TokenKeyListPage =
            TokenKeyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenKeyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TokenKeyListPage{service=$service, params=$params, response=$response}"
}
