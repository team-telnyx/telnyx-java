// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups.suppressions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailblocks.EmailBlock
import com.telnyx.sdk.models.emailunsubscribegroups.GroupListMeta
import com.telnyx.sdk.services.async.emailunsubscribegroups.SuppressionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SuppressionServiceAsync.list */
class SuppressionListPageAsync
private constructor(
    private val service: SuppressionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SuppressionListParams,
    private val response: SuppressionListPageResponse,
) : PageAsync<EmailBlock> {

    /**
     * Delegates to [SuppressionListPageResponse], but gracefully handles missing data.
     *
     * @see SuppressionListPageResponse.data
     */
    fun data(): List<EmailBlock> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SuppressionListPageResponse], but gracefully handles missing data.
     *
     * @see SuppressionListPageResponse.meta
     */
    fun meta(): Optional<GroupListMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailBlock> = data()

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

    fun nextPageParams(): SuppressionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SuppressionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailBlock> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SuppressionListParams = params

    /** The response that this page was parsed from. */
    fun response(): SuppressionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SuppressionListPageAsync].
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

    /** A builder for [SuppressionListPageAsync]. */
    class Builder internal constructor() {

        private var service: SuppressionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SuppressionListParams? = null
        private var response: SuppressionListPageResponse? = null

        @JvmSynthetic
        internal fun from(suppressionListPageAsync: SuppressionListPageAsync) = apply {
            service = suppressionListPageAsync.service
            streamHandlerExecutor = suppressionListPageAsync.streamHandlerExecutor
            params = suppressionListPageAsync.params
            response = suppressionListPageAsync.response
        }

        fun service(service: SuppressionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SuppressionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SuppressionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SuppressionListPageAsync].
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
        fun build(): SuppressionListPageAsync =
            SuppressionListPageAsync(
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

        return other is SuppressionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SuppressionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
