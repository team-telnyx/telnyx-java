// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.async.CredentialConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CredentialConnectionServiceAsync.list */
class CredentialConnectionListPageAsync
private constructor(
    private val service: CredentialConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CredentialConnectionListParams,
    private val response: CredentialConnectionListPageResponse,
) : PageAsync<CredentialConnection> {

    /**
     * Delegates to [CredentialConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see CredentialConnectionListPageResponse.data
     */
    fun data(): List<CredentialConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CredentialConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see CredentialConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CredentialConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CredentialConnectionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CredentialConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CredentialConnection> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CredentialConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CredentialConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CredentialConnectionListPageAsync].
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

    /** A builder for [CredentialConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: CredentialConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CredentialConnectionListParams? = null
        private var response: CredentialConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(credentialConnectionListPageAsync: CredentialConnectionListPageAsync) =
            apply {
                service = credentialConnectionListPageAsync.service
                streamHandlerExecutor = credentialConnectionListPageAsync.streamHandlerExecutor
                params = credentialConnectionListPageAsync.params
                response = credentialConnectionListPageAsync.response
            }

        fun service(service: CredentialConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CredentialConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CredentialConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CredentialConnectionListPageAsync].
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
        fun build(): CredentialConnectionListPageAsync =
            CredentialConnectionListPageAsync(
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

        return other is CredentialConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CredentialConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
