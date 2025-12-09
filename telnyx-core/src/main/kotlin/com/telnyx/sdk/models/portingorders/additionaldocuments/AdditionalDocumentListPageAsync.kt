// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.additionaldocuments

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.AdditionalDocumentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AdditionalDocumentServiceAsync.list */
class AdditionalDocumentListPageAsync
private constructor(
    private val service: AdditionalDocumentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AdditionalDocumentListParams,
    private val response: AdditionalDocumentListPageResponse,
) : PageAsync<AdditionalDocumentListResponse> {

    /**
     * Delegates to [AdditionalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see AdditionalDocumentListPageResponse.data
     */
    fun data(): List<AdditionalDocumentListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AdditionalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see AdditionalDocumentListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<AdditionalDocumentListResponse> = data()

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

    fun nextPageParams(): AdditionalDocumentListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AdditionalDocumentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AdditionalDocumentListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AdditionalDocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AdditionalDocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AdditionalDocumentListPageAsync].
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

    /** A builder for [AdditionalDocumentListPageAsync]. */
    class Builder internal constructor() {

        private var service: AdditionalDocumentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AdditionalDocumentListParams? = null
        private var response: AdditionalDocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(additionalDocumentListPageAsync: AdditionalDocumentListPageAsync) =
            apply {
                service = additionalDocumentListPageAsync.service
                streamHandlerExecutor = additionalDocumentListPageAsync.streamHandlerExecutor
                params = additionalDocumentListPageAsync.params
                response = additionalDocumentListPageAsync.response
            }

        fun service(service: AdditionalDocumentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AdditionalDocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AdditionalDocumentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AdditionalDocumentListPageAsync].
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
        fun build(): AdditionalDocumentListPageAsync =
            AdditionalDocumentListPageAsync(
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

        return other is AdditionalDocumentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AdditionalDocumentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
