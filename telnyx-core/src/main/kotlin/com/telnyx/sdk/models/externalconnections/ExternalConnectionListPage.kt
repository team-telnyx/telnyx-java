// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ExternalConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ExternalConnectionService.list */
class ExternalConnectionListPage
private constructor(
    private val service: ExternalConnectionService,
    private val params: ExternalConnectionListParams,
    private val response: ExternalConnectionListPageResponse,
) : Page<ExternalConnection> {

    /**
     * Delegates to [ExternalConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalConnectionListPageResponse.data
     */
    fun data(): List<ExternalConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalConnectionListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<ExternalConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ExternalConnectionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ExternalConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalConnection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalConnectionListPage].
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

    /** A builder for [ExternalConnectionListPage]. */
    class Builder internal constructor() {

        private var service: ExternalConnectionService? = null
        private var params: ExternalConnectionListParams? = null
        private var response: ExternalConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalConnectionListPage: ExternalConnectionListPage) = apply {
            service = externalConnectionListPage.service
            params = externalConnectionListPage.params
            response = externalConnectionListPage.response
        }

        fun service(service: ExternalConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalConnectionListPage].
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
        fun build(): ExternalConnectionListPage =
            ExternalConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExternalConnectionListPage{service=$service, params=$params, response=$response}"
}
