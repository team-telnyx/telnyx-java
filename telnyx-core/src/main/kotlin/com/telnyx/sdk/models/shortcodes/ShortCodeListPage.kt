// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.shortcodes

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.ShortCode
import com.telnyx.sdk.services.blocking.ShortCodeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ShortCodeService.list */
class ShortCodeListPage
private constructor(
    private val service: ShortCodeService,
    private val params: ShortCodeListParams,
    private val response: ShortCodeListPageResponse,
) : Page<ShortCode> {

    /**
     * Delegates to [ShortCodeListPageResponse], but gracefully handles missing data.
     *
     * @see ShortCodeListPageResponse.data
     */
    fun data(): List<ShortCode> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ShortCodeListPageResponse], but gracefully handles missing data.
     *
     * @see ShortCodeListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ShortCode> = data()

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

    fun nextPageParams(): ShortCodeListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ShortCodeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ShortCode> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ShortCodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): ShortCodeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShortCodeListPage].
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

    /** A builder for [ShortCodeListPage]. */
    class Builder internal constructor() {

        private var service: ShortCodeService? = null
        private var params: ShortCodeListParams? = null
        private var response: ShortCodeListPageResponse? = null

        @JvmSynthetic
        internal fun from(shortCodeListPage: ShortCodeListPage) = apply {
            service = shortCodeListPage.service
            params = shortCodeListPage.params
            response = shortCodeListPage.response
        }

        fun service(service: ShortCodeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ShortCodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShortCodeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShortCodeListPage].
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
        fun build(): ShortCodeListPage =
            ShortCodeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShortCodeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ShortCodeListPage{service=$service, params=$params, response=$response}"
}
