// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.storage.kvs.EdgeComputePaginationMeta
import com.telnyx.sdk.services.blocking.storage.SqldbService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SqldbService.list */
class SqldbListPage
private constructor(
    private val service: SqldbService,
    private val params: SqldbListParams,
    private val response: SqldbListPageResponse,
) : Page<SqlDatabase> {

    /**
     * Delegates to [SqldbListPageResponse], but gracefully handles missing data.
     *
     * @see SqldbListPageResponse.data
     */
    fun data(): List<SqlDatabase> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SqldbListPageResponse], but gracefully handles missing data.
     *
     * @see SqldbListPageResponse.meta
     */
    fun meta(): Optional<EdgeComputePaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SqlDatabase> = data()

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

    fun nextPageParams(): SqldbListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SqldbListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SqlDatabase> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SqldbListParams = params

    /** The response that this page was parsed from. */
    fun response(): SqldbListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SqldbListPage].
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

    /** A builder for [SqldbListPage]. */
    class Builder internal constructor() {

        private var service: SqldbService? = null
        private var params: SqldbListParams? = null
        private var response: SqldbListPageResponse? = null

        @JvmSynthetic
        internal fun from(sqldbListPage: SqldbListPage) = apply {
            service = sqldbListPage.service
            params = sqldbListPage.params
            response = sqldbListPage.response
        }

        fun service(service: SqldbService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SqldbListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SqldbListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SqldbListPage].
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
        fun build(): SqldbListPage =
            SqldbListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SqldbListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "SqldbListPage{service=$service, params=$params, response=$response}"
}
