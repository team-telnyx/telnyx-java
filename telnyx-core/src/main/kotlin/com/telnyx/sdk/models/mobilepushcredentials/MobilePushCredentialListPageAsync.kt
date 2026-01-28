// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.MobilePushCredentialServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobilePushCredentialServiceAsync.list */
class MobilePushCredentialListPageAsync
private constructor(
    private val service: MobilePushCredentialServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MobilePushCredentialListParams,
    private val response: MobilePushCredentialListPageResponse,
) : PageAsync<PushCredential> {

    /**
     * Delegates to [MobilePushCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePushCredentialListPageResponse.data
     */
    fun data(): List<PushCredential> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobilePushCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePushCredentialListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PushCredential> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MobilePushCredentialListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MobilePushCredentialListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PushCredential> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MobilePushCredentialListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobilePushCredentialListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobilePushCredentialListPageAsync].
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

    /** A builder for [MobilePushCredentialListPageAsync]. */
    class Builder internal constructor() {

        private var service: MobilePushCredentialServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MobilePushCredentialListParams? = null
        private var response: MobilePushCredentialListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobilePushCredentialListPageAsync: MobilePushCredentialListPageAsync) =
            apply {
                service = mobilePushCredentialListPageAsync.service
                streamHandlerExecutor = mobilePushCredentialListPageAsync.streamHandlerExecutor
                params = mobilePushCredentialListPageAsync.params
                response = mobilePushCredentialListPageAsync.response
            }

        fun service(service: MobilePushCredentialServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MobilePushCredentialListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobilePushCredentialListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobilePushCredentialListPageAsync].
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
        fun build(): MobilePushCredentialListPageAsync =
            MobilePushCredentialListPageAsync(
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

        return other is MobilePushCredentialListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MobilePushCredentialListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
