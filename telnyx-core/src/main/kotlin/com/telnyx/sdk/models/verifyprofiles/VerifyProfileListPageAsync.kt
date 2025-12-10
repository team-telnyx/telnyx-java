// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.verifications.byphonenumber.VerifyMeta
import com.telnyx.sdk.services.async.VerifyProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VerifyProfileServiceAsync.list */
class VerifyProfileListPageAsync
private constructor(
    private val service: VerifyProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VerifyProfileListParams,
    private val response: VerifyProfileListPageResponse,
) : PageAsync<VerifyProfile> {

    /**
     * Delegates to [VerifyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyProfileListPageResponse.data
     */
    fun data(): List<VerifyProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerifyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyProfileListPageResponse.meta
     */
    fun meta(): Optional<VerifyMeta> = response._meta().getOptional("meta")

    override fun items(): List<VerifyProfile> = data()

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

    fun nextPageParams(): VerifyProfileListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<VerifyProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VerifyProfile> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VerifyProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerifyProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerifyProfileListPageAsync].
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

    /** A builder for [VerifyProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: VerifyProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VerifyProfileListParams? = null
        private var response: VerifyProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(verifyProfileListPageAsync: VerifyProfileListPageAsync) = apply {
            service = verifyProfileListPageAsync.service
            streamHandlerExecutor = verifyProfileListPageAsync.streamHandlerExecutor
            params = verifyProfileListPageAsync.params
            response = verifyProfileListPageAsync.response
        }

        fun service(service: VerifyProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VerifyProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerifyProfileListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerifyProfileListPageAsync].
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
        fun build(): VerifyProfileListPageAsync =
            VerifyProfileListPageAsync(
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

        return other is VerifyProfileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VerifyProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
