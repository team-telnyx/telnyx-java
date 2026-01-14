// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.MobilePushCredentialService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobilePushCredentialService.list */
class MobilePushCredentialListPage
private constructor(
    private val service: MobilePushCredentialService,
    private val params: MobilePushCredentialListParams,
    private val response: MobilePushCredentialListPageResponse,
) : Page<PushCredential> {

    /**
     * Delegates to [MobilePushCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePushCredentialListPageResponse.data
     */
    fun data(): List<PushCredential> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobilePushCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePushCredentialListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PushCredential> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MobilePushCredentialListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): MobilePushCredentialListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PushCredential> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MobilePushCredentialListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobilePushCredentialListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MobilePushCredentialListPage].
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

    /** A builder for [MobilePushCredentialListPage]. */
    class Builder internal constructor() {

        private var service: MobilePushCredentialService? = null
        private var params: MobilePushCredentialListParams? = null
        private var response: MobilePushCredentialListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobilePushCredentialListPage: MobilePushCredentialListPage) = apply {
            service = mobilePushCredentialListPage.service
            params = mobilePushCredentialListPage.params
            response = mobilePushCredentialListPage.response
        }

        fun service(service: MobilePushCredentialService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MobilePushCredentialListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobilePushCredentialListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobilePushCredentialListPage].
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
        fun build(): MobilePushCredentialListPage =
            MobilePushCredentialListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobilePushCredentialListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MobilePushCredentialListPage{service=$service, params=$params, response=$response}"
}
