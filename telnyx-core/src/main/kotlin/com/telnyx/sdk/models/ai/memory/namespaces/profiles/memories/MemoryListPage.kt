// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.MemoryService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MemoryService.list */
class MemoryListPage
private constructor(
    private val service: MemoryService,
    private val params: MemoryListParams,
    private val response: MemoryListPageResponse,
) : Page<MemoryListResponse> {

    /**
     * Delegates to [MemoryListPageResponse], but gracefully handles missing data.
     *
     * @see MemoryListPageResponse.data
     */
    fun data(): List<MemoryListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MemoryListPageResponse], but gracefully handles missing data.
     *
     * @see MemoryListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<MemoryListResponse> = data()

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

    fun nextPageParams(): MemoryListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MemoryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MemoryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MemoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): MemoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MemoryListPage].
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

    /** A builder for [MemoryListPage]. */
    class Builder internal constructor() {

        private var service: MemoryService? = null
        private var params: MemoryListParams? = null
        private var response: MemoryListPageResponse? = null

        @JvmSynthetic
        internal fun from(memoryListPage: MemoryListPage) = apply {
            service = memoryListPage.service
            params = memoryListPage.params
            response = memoryListPage.response
        }

        fun service(service: MemoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MemoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MemoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MemoryListPage].
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
        fun build(): MemoryListPage =
            MemoryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemoryListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "MemoryListPage{service=$service, params=$params, response=$response}"
}
