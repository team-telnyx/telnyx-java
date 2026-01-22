// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.verificationcodes

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.VerificationCodeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VerificationCodeServiceAsync.list */
class VerificationCodeListPageAsync
private constructor(
    private val service: VerificationCodeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VerificationCodeListParams,
    private val response: VerificationCodeListPageResponse,
) : PageAsync<VerificationCodeListResponse> {

    /**
     * Delegates to [VerificationCodeListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationCodeListPageResponse.data
     */
    fun data(): List<VerificationCodeListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerificationCodeListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationCodeListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<VerificationCodeListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VerificationCodeListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<VerificationCodeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VerificationCodeListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VerificationCodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerificationCodeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VerificationCodeListPageAsync].
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

    /** A builder for [VerificationCodeListPageAsync]. */
    class Builder internal constructor() {

        private var service: VerificationCodeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VerificationCodeListParams? = null
        private var response: VerificationCodeListPageResponse? = null

        @JvmSynthetic
        internal fun from(verificationCodeListPageAsync: VerificationCodeListPageAsync) = apply {
            service = verificationCodeListPageAsync.service
            streamHandlerExecutor = verificationCodeListPageAsync.streamHandlerExecutor
            params = verificationCodeListPageAsync.params
            response = verificationCodeListPageAsync.response
        }

        fun service(service: VerificationCodeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VerificationCodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerificationCodeListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VerificationCodeListPageAsync].
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
        fun build(): VerificationCodeListPageAsync =
            VerificationCodeListPageAsync(
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

        return other is VerificationCodeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VerificationCodeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
