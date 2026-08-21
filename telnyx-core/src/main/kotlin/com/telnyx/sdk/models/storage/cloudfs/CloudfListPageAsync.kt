// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.storage.CloudfServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CloudfServiceAsync.list */
class CloudfListPageAsync
private constructor(
    private val service: CloudfServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CloudfListParams,
    private val response: CloudfListPageResponse,
) : PageAsync<CloudfListResponse> {

    /**
     * Delegates to [CloudfListPageResponse], but gracefully handles missing data.
     *
     * @see CloudfListPageResponse.data
     */
    fun data(): List<CloudfListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CloudfListPageResponse], but gracefully handles missing data.
     *
     * @see CloudfListPageResponse.meta
     */
    fun meta(): Optional<CloudfListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<CloudfListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): CloudfListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CloudfListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CloudfListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CloudfListParams = params

    /** The response that this page was parsed from. */
    fun response(): CloudfListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CloudfListPageAsync].
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

    /** A builder for [CloudfListPageAsync]. */
    class Builder internal constructor() {

        private var service: CloudfServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CloudfListParams? = null
        private var response: CloudfListPageResponse? = null

        @JvmSynthetic
        internal fun from(cloudfListPageAsync: CloudfListPageAsync) = apply {
            service = cloudfListPageAsync.service
            streamHandlerExecutor = cloudfListPageAsync.streamHandlerExecutor
            params = cloudfListPageAsync.params
            response = cloudfListPageAsync.response
        }

        fun service(service: CloudfServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CloudfListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CloudfListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CloudfListPageAsync].
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
        fun build(): CloudfListPageAsync =
            CloudfListPageAsync(
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

        return other is CloudfListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CloudfListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
