// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emaildomains.webhooks.OffsetPaginationMeta
import com.telnyx.sdk.services.async.EmailDomainServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailDomainServiceAsync.list */
class EmailDomainListPageAsync
private constructor(
    private val service: EmailDomainServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailDomainListParams,
    private val response: EmailDomainListPageResponse,
) : PageAsync<EmailDomain> {

    /**
     * Delegates to [EmailDomainListPageResponse], but gracefully handles missing data.
     *
     * @see EmailDomainListPageResponse.data
     */
    fun data(): List<EmailDomain> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailDomainListPageResponse], but gracefully handles missing data.
     *
     * @see EmailDomainListPageResponse.meta
     */
    fun meta(): Optional<EmailDomainListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailDomain> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap {
                    it.accept(
                        object : EmailDomainListPageResponse.Meta.Visitor<Optional<Long>> {
                            override fun visitOffsetPagination(
                                offsetPagination: OffsetPaginationMeta
                            ): Optional<Long> =
                                offsetPagination._pageNumber().getOptional("page_number")

                            override fun visitEmailCursorPagination(
                                emailCursorPagination:
                                    EmailDomainListPageResponse.Meta.EmailCursorPaginationMeta
                            ): Optional<Long> = Optional.empty()
                        }
                    )
                }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap {
                    it.accept(
                        object : EmailDomainListPageResponse.Meta.Visitor<Optional<Long>> {
                            override fun visitOffsetPagination(
                                offsetPagination: OffsetPaginationMeta
                            ): Optional<Long> =
                                offsetPagination._totalPages().getOptional("total_pages")

                            override fun visitEmailCursorPagination(
                                emailCursorPagination:
                                    EmailDomainListPageResponse.Meta.EmailCursorPaginationMeta
                            ): Optional<Long> = Optional.empty()
                        }
                    )
                }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EmailDomainListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<EmailDomainListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailDomain> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailDomainListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailDomainListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailDomainListPageAsync].
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

    /** A builder for [EmailDomainListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailDomainServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailDomainListParams? = null
        private var response: EmailDomainListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailDomainListPageAsync: EmailDomainListPageAsync) = apply {
            service = emailDomainListPageAsync.service
            streamHandlerExecutor = emailDomainListPageAsync.streamHandlerExecutor
            params = emailDomainListPageAsync.params
            response = emailDomainListPageAsync.response
        }

        fun service(service: EmailDomainServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailDomainListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailDomainListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailDomainListPageAsync].
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
        fun build(): EmailDomainListPageAsync =
            EmailDomainListPageAsync(
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

        return other is EmailDomainListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailDomainListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
