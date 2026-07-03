// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.storage.kvs.KeyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see KeyServiceAsync.list */
class KeyListPageAsync
private constructor(
    private val service: KeyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: KeyListParams,
    private val response: KeyListPageResponse,
) : PageAsync<KeyListResponse> {

    /**
     * Delegates to [KeyListPageResponse], but gracefully handles missing data.
     *
     * @see KeyListPageResponse.data
     */
    fun data(): List<KeyListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [KeyListPageResponse], but gracefully handles missing data.
     *
     * @see KeyListPageResponse.meta
     */
    fun meta(): Optional<KeyListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<KeyListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && meta().flatMap { it._cursor().getOptional("cursor") }.isPresent

    fun nextPageParams(): KeyListParams {
        val nextCursor =
            meta().flatMap { it._cursor().getOptional("cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<KeyListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<KeyListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): KeyListParams = params

    /** The response that this page was parsed from. */
    fun response(): KeyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KeyListPageAsync].
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

    /** A builder for [KeyListPageAsync]. */
    class Builder internal constructor() {

        private var service: KeyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: KeyListParams? = null
        private var response: KeyListPageResponse? = null

        @JvmSynthetic
        internal fun from(keyListPageAsync: KeyListPageAsync) = apply {
            service = keyListPageAsync.service
            streamHandlerExecutor = keyListPageAsync.streamHandlerExecutor
            params = keyListPageAsync.params
            response = keyListPageAsync.response
        }

        fun service(service: KeyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: KeyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: KeyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [KeyListPageAsync].
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
        fun build(): KeyListPageAsync =
            KeyListPageAsync(
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

        return other is KeyListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "KeyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
