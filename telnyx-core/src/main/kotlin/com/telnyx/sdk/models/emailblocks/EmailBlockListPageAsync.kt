// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.EmailBlockServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailBlockServiceAsync.list */
class EmailBlockListPageAsync
private constructor(
    private val service: EmailBlockServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailBlockListParams,
    private val response: EmailBlockListPageResponse,
) : PageAsync<EmailBlock> {

    /**
     * Delegates to [EmailBlockListPageResponse], but gracefully handles missing data.
     *
     * @see EmailBlockListPageResponse.EmailBlockListOffsetResponse.data
     * @see EmailBlockListPageResponse.EmailBlockListCursorResponse.data
     */
    fun data(): List<EmailBlock> =
        response
            .accept(
                object : EmailBlockListPageResponse.Visitor<Optional<List<EmailBlock>>> {
                    override fun visitOffset(
                        offset: EmailBlockListPageResponse.EmailBlockListOffsetResponse
                    ): Optional<List<EmailBlock>> = offset._data().getOptional("data")

                    override fun visitCursor(
                        cursor: EmailBlockListPageResponse.EmailBlockListCursorResponse
                    ): Optional<List<EmailBlock>> = cursor._data().getOptional("data")
                }
            )
            .getOrNull() ?: emptyList()

    override fun items(): List<EmailBlock> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                .accept(
                    object : EmailBlockListPageResponse.Visitor<Optional<Long>> {
                        override fun visitOffset(
                            offset: EmailBlockListPageResponse.EmailBlockListOffsetResponse
                        ): Optional<Long> =
                            offset._meta().getOptional("meta").flatMap {
                                it._pageNumber().getOptional("page_number")
                            }

                        override fun visitCursor(
                            cursor: EmailBlockListPageResponse.EmailBlockListCursorResponse
                        ): Optional<Long> = Optional.empty()
                    }
                )
                .getOrDefault(1)
        val pageCount =
            response
                .accept(
                    object : EmailBlockListPageResponse.Visitor<Optional<Long>> {
                        override fun visitOffset(
                            offset: EmailBlockListPageResponse.EmailBlockListOffsetResponse
                        ): Optional<Long> =
                            offset._meta().getOptional("meta").flatMap {
                                it._totalPages().getOptional("total_pages")
                            }

                        override fun visitCursor(
                            cursor: EmailBlockListPageResponse.EmailBlockListCursorResponse
                        ): Optional<Long> = Optional.empty()
                    }
                )
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EmailBlockListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<EmailBlockListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailBlock> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailBlockListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailBlockListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailBlockListPageAsync].
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

    /** A builder for [EmailBlockListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailBlockServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailBlockListParams? = null
        private var response: EmailBlockListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailBlockListPageAsync: EmailBlockListPageAsync) = apply {
            service = emailBlockListPageAsync.service
            streamHandlerExecutor = emailBlockListPageAsync.streamHandlerExecutor
            params = emailBlockListPageAsync.params
            response = emailBlockListPageAsync.response
        }

        fun service(service: EmailBlockServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailBlockListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailBlockListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailBlockListPageAsync].
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
        fun build(): EmailBlockListPageAsync =
            EmailBlockListPageAsync(
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

        return other is EmailBlockListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailBlockListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
