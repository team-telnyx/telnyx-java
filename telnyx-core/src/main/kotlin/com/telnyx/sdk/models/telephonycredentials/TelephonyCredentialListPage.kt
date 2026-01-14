// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.TelephonyCredentialService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TelephonyCredentialService.list */
class TelephonyCredentialListPage
private constructor(
    private val service: TelephonyCredentialService,
    private val params: TelephonyCredentialListParams,
    private val response: TelephonyCredentialListPageResponse,
) : Page<TelephonyCredential> {

    /**
     * Delegates to [TelephonyCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see TelephonyCredentialListPageResponse.data
     */
    fun data(): List<TelephonyCredential> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TelephonyCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see TelephonyCredentialListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TelephonyCredential> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TelephonyCredentialListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): TelephonyCredentialListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TelephonyCredential> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TelephonyCredentialListParams = params

    /** The response that this page was parsed from. */
    fun response(): TelephonyCredentialListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TelephonyCredentialListPage].
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

    /** A builder for [TelephonyCredentialListPage]. */
    class Builder internal constructor() {

        private var service: TelephonyCredentialService? = null
        private var params: TelephonyCredentialListParams? = null
        private var response: TelephonyCredentialListPageResponse? = null

        @JvmSynthetic
        internal fun from(telephonyCredentialListPage: TelephonyCredentialListPage) = apply {
            service = telephonyCredentialListPage.service
            params = telephonyCredentialListPage.params
            response = telephonyCredentialListPage.response
        }

        fun service(service: TelephonyCredentialService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TelephonyCredentialListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TelephonyCredentialListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TelephonyCredentialListPage].
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
        fun build(): TelephonyCredentialListPage =
            TelephonyCredentialListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelephonyCredentialListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TelephonyCredentialListPage{service=$service, params=$params, response=$response}"
}
