// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.TelephonyCredentialServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TelephonyCredentialServiceAsync.list */
class TelephonyCredentialListPageAsync
private constructor(
    private val service: TelephonyCredentialServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TelephonyCredentialListParams,
    private val response: TelephonyCredentialListPageResponse,
) : PageAsync<TelephonyCredential> {

    /**
     * Delegates to [TelephonyCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see TelephonyCredentialListPageResponse.data
     */
    fun data(): List<TelephonyCredential> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TelephonyCredentialListPageResponse], but gracefully handles missing data.
     *
     * @see TelephonyCredentialListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TelephonyCredential> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TelephonyCredentialListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TelephonyCredentialListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TelephonyCredential> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TelephonyCredentialListParams = params

    /** The response that this page was parsed from. */
    fun response(): TelephonyCredentialListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TelephonyCredentialListPageAsync].
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

    /** A builder for [TelephonyCredentialListPageAsync]. */
    class Builder internal constructor() {

        private var service: TelephonyCredentialServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TelephonyCredentialListParams? = null
        private var response: TelephonyCredentialListPageResponse? = null

        @JvmSynthetic
        internal fun from(telephonyCredentialListPageAsync: TelephonyCredentialListPageAsync) =
            apply {
                service = telephonyCredentialListPageAsync.service
                streamHandlerExecutor = telephonyCredentialListPageAsync.streamHandlerExecutor
                params = telephonyCredentialListPageAsync.params
                response = telephonyCredentialListPageAsync.response
            }

        fun service(service: TelephonyCredentialServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TelephonyCredentialListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TelephonyCredentialListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TelephonyCredentialListPageAsync].
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
        fun build(): TelephonyCredentialListPageAsync =
            TelephonyCredentialListPageAsync(
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

        return other is TelephonyCredentialListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TelephonyCredentialListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
