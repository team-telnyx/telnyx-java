// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import com.telnyx.sdk.services.async.externalconnections.UploadServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UploadServiceAsync.list */
class UploadListPageAsync
private constructor(
    private val service: UploadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UploadListParams,
    private val response: UploadListPageResponse,
) : PageAsync<Upload> {

    /**
     * Delegates to [UploadListPageResponse], but gracefully handles missing data.
     *
     * @see UploadListPageResponse.data
     */
    fun data(): List<Upload> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UploadListPageResponse], but gracefully handles missing data.
     *
     * @see UploadListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<Upload> = data()

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

    fun nextPageParams(): UploadListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<UploadListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Upload> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UploadListParams = params

    /** The response that this page was parsed from. */
    fun response(): UploadListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadListPageAsync].
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

    /** A builder for [UploadListPageAsync]. */
    class Builder internal constructor() {

        private var service: UploadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UploadListParams? = null
        private var response: UploadListPageResponse? = null

        @JvmSynthetic
        internal fun from(uploadListPageAsync: UploadListPageAsync) = apply {
            service = uploadListPageAsync.service
            streamHandlerExecutor = uploadListPageAsync.streamHandlerExecutor
            params = uploadListPageAsync.params
            response = uploadListPageAsync.response
        }

        fun service(service: UploadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UploadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UploadListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UploadListPageAsync].
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
        fun build(): UploadListPageAsync =
            UploadListPageAsync(
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

        return other is UploadListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UploadListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
