// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documentlinks

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.DocumentLinkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DocumentLinkServiceAsync.list */
class DocumentLinkListPageAsync
private constructor(
    private val service: DocumentLinkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DocumentLinkListParams,
    private val response: DocumentLinkListPageResponse,
) : PageAsync<DocumentLinkListResponse> {

    /**
     * Delegates to [DocumentLinkListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentLinkListPageResponse.data
     */
    fun data(): List<DocumentLinkListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DocumentLinkListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentLinkListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<DocumentLinkListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): DocumentLinkListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DocumentLinkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DocumentLinkListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DocumentLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocumentLinkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentLinkListPageAsync].
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

    /** A builder for [DocumentLinkListPageAsync]. */
    class Builder internal constructor() {

        private var service: DocumentLinkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DocumentLinkListParams? = null
        private var response: DocumentLinkListPageResponse? = null

        @JvmSynthetic
        internal fun from(documentLinkListPageAsync: DocumentLinkListPageAsync) = apply {
            service = documentLinkListPageAsync.service
            streamHandlerExecutor = documentLinkListPageAsync.streamHandlerExecutor
            params = documentLinkListPageAsync.params
            response = documentLinkListPageAsync.response
        }

        fun service(service: DocumentLinkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DocumentLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocumentLinkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocumentLinkListPageAsync].
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
        fun build(): DocumentLinkListPageAsync =
            DocumentLinkListPageAsync(
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

        return other is DocumentLinkListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DocumentLinkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
