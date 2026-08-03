// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.storage.KvService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see KvService.list */
class KvListPage
private constructor(
    private val service: KvService,
    private val params: KvListParams,
    private val response: KvListPageResponse,
) : Page<KvNamespace> {

    /**
     * Delegates to [KvListPageResponse], but gracefully handles missing data.
     *
     * @see KvListPageResponse.data
     */
    fun data(): List<KvNamespace> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [KvListPageResponse], but gracefully handles missing data.
     *
     * @see KvListPageResponse.meta
     */
    fun meta(): Optional<KvListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<KvNamespace> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): KvListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): KvListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<KvNamespace> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): KvListParams = params

    /** The response that this page was parsed from. */
    fun response(): KvListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KvListPage].
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

    /** A builder for [KvListPage]. */
    class Builder internal constructor() {

        private var service: KvService? = null
        private var params: KvListParams? = null
        private var response: KvListPageResponse? = null

        @JvmSynthetic
        internal fun from(kvListPage: KvListPage) = apply {
            service = kvListPage.service
            params = kvListPage.params
            response = kvListPage.response
        }

        fun service(service: KvService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: KvListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: KvListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [KvListPage].
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
        fun build(): KvListPage =
            KvListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KvListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "KvListPage{service=$service, params=$params, response=$response}"
}
