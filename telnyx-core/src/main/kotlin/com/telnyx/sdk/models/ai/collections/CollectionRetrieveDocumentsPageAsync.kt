// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ai.CollectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CollectionServiceAsync.retrieveDocuments */
class CollectionRetrieveDocumentsPageAsync
private constructor(
    private val service: CollectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CollectionRetrieveDocumentsParams,
    private val response: CollectionRetrieveDocumentsPageResponse,
) : PageAsync<CollectionRetrieveDocumentsResponse> {

    /**
     * Delegates to [CollectionRetrieveDocumentsPageResponse], but gracefully handles missing data.
     *
     * @see CollectionRetrieveDocumentsPageResponse.data
     */
    fun data(): List<CollectionRetrieveDocumentsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionRetrieveDocumentsPageResponse], but gracefully handles missing data.
     *
     * @see CollectionRetrieveDocumentsPageResponse.meta
     */
    fun meta(): Optional<CollectionRetrieveDocumentsPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<CollectionRetrieveDocumentsResponse> = data()

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

    fun nextPageParams(): CollectionRetrieveDocumentsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CollectionRetrieveDocumentsPageAsync> =
        service.retrieveDocuments(nextPageParams())

    fun autoPager(): AutoPagerAsync<CollectionRetrieveDocumentsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CollectionRetrieveDocumentsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionRetrieveDocumentsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CollectionRetrieveDocumentsPageAsync].
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

    /** A builder for [CollectionRetrieveDocumentsPageAsync]. */
    class Builder internal constructor() {

        private var service: CollectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CollectionRetrieveDocumentsParams? = null
        private var response: CollectionRetrieveDocumentsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            collectionRetrieveDocumentsPageAsync: CollectionRetrieveDocumentsPageAsync
        ) = apply {
            service = collectionRetrieveDocumentsPageAsync.service
            streamHandlerExecutor = collectionRetrieveDocumentsPageAsync.streamHandlerExecutor
            params = collectionRetrieveDocumentsPageAsync.params
            response = collectionRetrieveDocumentsPageAsync.response
        }

        fun service(service: CollectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CollectionRetrieveDocumentsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionRetrieveDocumentsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CollectionRetrieveDocumentsPageAsync].
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
        fun build(): CollectionRetrieveDocumentsPageAsync =
            CollectionRetrieveDocumentsPageAsync(
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

        return other is CollectionRetrieveDocumentsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CollectionRetrieveDocumentsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
