// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ShortCode
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.MessagingProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingProfileServiceAsync.listShortCodes */
class MessagingProfileListShortCodesPageAsync
private constructor(
    private val service: MessagingProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingProfileListShortCodesParams,
    private val response: MessagingProfileListShortCodesPageResponse,
) : PageAsync<ShortCode> {

    /**
     * Delegates to [MessagingProfileListShortCodesPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListShortCodesPageResponse.data
     */
    fun data(): List<ShortCode> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListShortCodesPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListShortCodesPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ShortCode> = data()

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

    fun nextPageParams(): MessagingProfileListShortCodesParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingProfileListShortCodesPageAsync> =
        service.listShortCodes(nextPageParams())

    fun autoPager(): AutoPagerAsync<ShortCode> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListShortCodesParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListShortCodesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileListShortCodesPageAsync].
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

    /** A builder for [MessagingProfileListShortCodesPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingProfileListShortCodesParams? = null
        private var response: MessagingProfileListShortCodesPageResponse? = null

        @JvmSynthetic
        internal fun from(
            messagingProfileListShortCodesPageAsync: MessagingProfileListShortCodesPageAsync
        ) = apply {
            service = messagingProfileListShortCodesPageAsync.service
            streamHandlerExecutor = messagingProfileListShortCodesPageAsync.streamHandlerExecutor
            params = messagingProfileListShortCodesPageAsync.params
            response = messagingProfileListShortCodesPageAsync.response
        }

        fun service(service: MessagingProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListShortCodesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListShortCodesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListShortCodesPageAsync].
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
        fun build(): MessagingProfileListShortCodesPageAsync =
            MessagingProfileListShortCodesPageAsync(
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

        return other is MessagingProfileListShortCodesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingProfileListShortCodesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
