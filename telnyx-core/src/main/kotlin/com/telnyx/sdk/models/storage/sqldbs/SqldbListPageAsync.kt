// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.storage.kvs.EdgeComputePaginationMeta
import com.telnyx.sdk.services.async.storage.SqldbServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SqldbServiceAsync.list */
class SqldbListPageAsync
private constructor(
    private val service: SqldbServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SqldbListParams,
    private val response: SqldbListPageResponse,
) : PageAsync<SqlDatabase> {

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

    override fun nextPage(): CompletableFuture<SqldbListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SqlDatabase> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SqldbListParams = params

    /** The response that this page was parsed from. */
    fun response(): SqldbListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SqldbListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SqldbListPageAsync]. */
    class Builder internal constructor() {

        private var service: SqldbServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SqldbListParams? = null
        private var response: SqldbListPageResponse? = null

        @JvmSynthetic
        internal fun from(sqldbListPageAsync: SqldbListPageAsync) = apply {
            service = sqldbListPageAsync.service
            streamHandlerExecutor = sqldbListPageAsync.streamHandlerExecutor
            params = sqldbListPageAsync.params
            response = sqldbListPageAsync.response
        }

        fun service(service: SqldbServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SqldbListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SqldbListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SqldbListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SqldbListPageAsync =
            SqldbListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SqldbListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SqldbListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
