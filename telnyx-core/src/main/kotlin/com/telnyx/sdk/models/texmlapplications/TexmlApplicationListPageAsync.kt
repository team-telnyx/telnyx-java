// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texmlapplications

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.TexmlApplicationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TexmlApplicationServiceAsync.list */
class TexmlApplicationListPageAsync
private constructor(
    private val service: TexmlApplicationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TexmlApplicationListParams,
    private val response: TexmlApplicationListPageResponse,
) : PageAsync<TexmlApplication> {

    /**
     * Delegates to [TexmlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see TexmlApplicationListPageResponse.data
     */
    fun data(): List<TexmlApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TexmlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see TexmlApplicationListPageResponse.meta
     */
    fun meta(): Optional<TexmlApplicationListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<TexmlApplication> = data()

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

    fun nextPageParams(): TexmlApplicationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TexmlApplicationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TexmlApplication> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TexmlApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): TexmlApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TexmlApplicationListPageAsync].
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

    /** A builder for [TexmlApplicationListPageAsync]. */
    class Builder internal constructor() {

        private var service: TexmlApplicationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TexmlApplicationListParams? = null
        private var response: TexmlApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(texmlApplicationListPageAsync: TexmlApplicationListPageAsync) = apply {
            service = texmlApplicationListPageAsync.service
            streamHandlerExecutor = texmlApplicationListPageAsync.streamHandlerExecutor
            params = texmlApplicationListPageAsync.params
            response = texmlApplicationListPageAsync.response
        }

        fun service(service: TexmlApplicationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TexmlApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TexmlApplicationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TexmlApplicationListPageAsync].
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
        fun build(): TexmlApplicationListPageAsync =
            TexmlApplicationListPageAsync(
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

        return other is TexmlApplicationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TexmlApplicationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
