// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.collections.sources.Source
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.SourceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SourceService.list */
class SourceListPage
private constructor(
    private val service: SourceService,
    private val params: SourceListParams,
    private val response: SourceListPageResponse,
) : Page<Source> {

    /**
     * Delegates to [SourceListPageResponse], but gracefully handles missing data.
     *
     * @see SourceListPageResponse.data
     */
    fun data(): List<Source> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SourceListPageResponse], but gracefully handles missing data.
     *
     * @see SourceListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<Source> = data()

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

    fun nextPageParams(): SourceListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SourceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Source> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SourceListParams = params

    /** The response that this page was parsed from. */
    fun response(): SourceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SourceListPage].
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

    /** A builder for [SourceListPage]. */
    class Builder internal constructor() {

        private var service: SourceService? = null
        private var params: SourceListParams? = null
        private var response: SourceListPageResponse? = null

        @JvmSynthetic
        internal fun from(sourceListPage: SourceListPage) = apply {
            service = sourceListPage.service
            params = sourceListPage.params
            response = sourceListPage.response
        }

        fun service(service: SourceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SourceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SourceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SourceListPage].
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
        fun build(): SourceListPage =
            SourceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SourceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "SourceListPage{service=$service, params=$params, response=$response}"
}
