// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages.recipients

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.emailmessages.RecipientServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RecipientServiceAsync.list */
class RecipientListPageAsync
private constructor(
    private val service: RecipientServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RecipientListParams,
    private val response: RecipientListPageResponse,
) : PageAsync<EmailRecipient> {

    /**
     * Delegates to [RecipientListPageResponse], but gracefully handles missing data.
     *
     * @see RecipientListPageResponse.data
     */
    fun data(): List<EmailRecipient> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RecipientListPageResponse], but gracefully handles missing data.
     *
     * @see RecipientListPageResponse.meta
     */
    fun meta(): Optional<RecipientListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailRecipient> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): RecipientListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RecipientListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailRecipient> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RecipientListParams = params

    /** The response that this page was parsed from. */
    fun response(): RecipientListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RecipientListPageAsync].
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

    /** A builder for [RecipientListPageAsync]. */
    class Builder internal constructor() {

        private var service: RecipientServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RecipientListParams? = null
        private var response: RecipientListPageResponse? = null

        @JvmSynthetic
        internal fun from(recipientListPageAsync: RecipientListPageAsync) = apply {
            service = recipientListPageAsync.service
            streamHandlerExecutor = recipientListPageAsync.streamHandlerExecutor
            params = recipientListPageAsync.params
            response = recipientListPageAsync.response
        }

        fun service(service: RecipientServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RecipientListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RecipientListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RecipientListPageAsync].
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
        fun build(): RecipientListPageAsync =
            RecipientListPageAsync(
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

        return other is RecipientListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RecipientListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
