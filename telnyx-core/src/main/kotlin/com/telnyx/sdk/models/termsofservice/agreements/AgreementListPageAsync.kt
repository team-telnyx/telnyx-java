// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.termsofservice.AgreementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AgreementServiceAsync.list */
class AgreementListPageAsync
private constructor(
    private val service: AgreementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AgreementListParams,
    private val response: AgreementListPageResponse,
) : PageAsync<AgreementListResponse> {

    /**
     * Delegates to [AgreementListPageResponse], but gracefully handles missing data.
     *
     * @see AgreementListPageResponse.data
     */
    fun data(): List<AgreementListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgreementListPageResponse], but gracefully handles missing data.
     *
     * @see AgreementListPageResponse.meta
     */
    fun meta(): Optional<AgreementListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<AgreementListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AgreementListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AgreementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AgreementListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AgreementListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgreementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgreementListPageAsync].
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

    /** A builder for [AgreementListPageAsync]. */
    class Builder internal constructor() {

        private var service: AgreementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AgreementListParams? = null
        private var response: AgreementListPageResponse? = null

        @JvmSynthetic
        internal fun from(agreementListPageAsync: AgreementListPageAsync) = apply {
            service = agreementListPageAsync.service
            streamHandlerExecutor = agreementListPageAsync.streamHandlerExecutor
            params = agreementListPageAsync.params
            response = agreementListPageAsync.response
        }

        fun service(service: AgreementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AgreementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgreementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgreementListPageAsync].
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
        fun build(): AgreementListPageAsync =
            AgreementListPageAsync(
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

        return other is AgreementListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AgreementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
