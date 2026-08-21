// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.services.async.emailinboxes.DraftServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DraftServiceAsync.list */
class DraftListPageAsync
private constructor(
    private val service: DraftServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DraftListParams,
    private val response: DraftListPageResponse,
) : PageAsync<EmailDraft> {

    /**
     * Delegates to [DraftListPageResponse], but gracefully handles missing data.
     *
     * @see DraftListPageResponse.data
     */
    fun data(): List<EmailDraft> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DraftListPageResponse], but gracefully handles missing data.
     *
     * @see DraftListPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailDraft> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): DraftListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DraftListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailDraft> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DraftListParams = params

    /** The response that this page was parsed from. */
    fun response(): DraftListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DraftListPageAsync].
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

    /** A builder for [DraftListPageAsync]. */
    class Builder internal constructor() {

        private var service: DraftServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DraftListParams? = null
        private var response: DraftListPageResponse? = null

        @JvmSynthetic
        internal fun from(draftListPageAsync: DraftListPageAsync) = apply {
            service = draftListPageAsync.service
            streamHandlerExecutor = draftListPageAsync.streamHandlerExecutor
            params = draftListPageAsync.params
            response = draftListPageAsync.response
        }

        fun service(service: DraftServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DraftListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DraftListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DraftListPageAsync].
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
        fun build(): DraftListPageAsync =
            DraftListPageAsync(
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

        return other is DraftListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DraftListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
