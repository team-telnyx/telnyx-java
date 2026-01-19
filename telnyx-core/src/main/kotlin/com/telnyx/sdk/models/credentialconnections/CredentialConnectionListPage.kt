// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.blocking.CredentialConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CredentialConnectionService.list */
class CredentialConnectionListPage
private constructor(
    private val service: CredentialConnectionService,
    private val params: CredentialConnectionListParams,
    private val response: CredentialConnectionListPageResponse,
) : Page<CredentialConnection> {

    /**
     * Delegates to [CredentialConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see CredentialConnectionListPageResponse.data
     */
    fun data(): List<CredentialConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CredentialConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see CredentialConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CredentialConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CredentialConnectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CredentialConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CredentialConnection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CredentialConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CredentialConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CredentialConnectionListPage].
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

    /** A builder for [CredentialConnectionListPage]. */
    class Builder internal constructor() {

        private var service: CredentialConnectionService? = null
        private var params: CredentialConnectionListParams? = null
        private var response: CredentialConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(credentialConnectionListPage: CredentialConnectionListPage) = apply {
            service = credentialConnectionListPage.service
            params = credentialConnectionListPage.params
            response = credentialConnectionListPage.response
        }

        fun service(service: CredentialConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CredentialConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CredentialConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CredentialConnectionListPage].
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
        fun build(): CredentialConnectionListPage =
            CredentialConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CredentialConnectionListPage{service=$service, params=$params, response=$response}"
}
