// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.integrationsecrets

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.IntegrationSecretService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see IntegrationSecretService.list */
class IntegrationSecretListPage
private constructor(
    private val service: IntegrationSecretService,
    private val params: IntegrationSecretListParams,
    private val response: IntegrationSecretListPageResponse,
) : Page<IntegrationSecret> {

    /**
     * Delegates to [IntegrationSecretListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationSecretListPageResponse.data
     */
    fun data(): List<IntegrationSecret> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntegrationSecretListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationSecretListPageResponse.meta
     */
    fun meta(): Optional<IntegrationSecretListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<IntegrationSecret> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): IntegrationSecretListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): IntegrationSecretListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IntegrationSecret> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IntegrationSecretListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntegrationSecretListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntegrationSecretListPage].
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

    /** A builder for [IntegrationSecretListPage]. */
    class Builder internal constructor() {

        private var service: IntegrationSecretService? = null
        private var params: IntegrationSecretListParams? = null
        private var response: IntegrationSecretListPageResponse? = null

        @JvmSynthetic
        internal fun from(integrationSecretListPage: IntegrationSecretListPage) = apply {
            service = integrationSecretListPage.service
            params = integrationSecretListPage.params
            response = integrationSecretListPage.response
        }

        fun service(service: IntegrationSecretService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IntegrationSecretListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntegrationSecretListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntegrationSecretListPage].
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
        fun build(): IntegrationSecretListPage =
            IntegrationSecretListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegrationSecretListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "IntegrationSecretListPage{service=$service, params=$params, response=$response}"
}
