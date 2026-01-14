// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.MobilePhoneNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobilePhoneNumberServiceAsync.list */
class MobilePhoneNumberListPageAsync
private constructor(
    private val service: MobilePhoneNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MobilePhoneNumberListParams,
    private val response: MobilePhoneNumberListPageResponse,
) : PageAsync<MobilePhoneNumber> {

    /**
     * Delegates to [MobilePhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePhoneNumberListPageResponse.data
     */
    fun data(): List<MobilePhoneNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobilePhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MobilePhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<MobilePhoneNumberListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<MobilePhoneNumber> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MobilePhoneNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MobilePhoneNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MobilePhoneNumber> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MobilePhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobilePhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobilePhoneNumberListPageAsync].
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

    /** A builder for [MobilePhoneNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: MobilePhoneNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MobilePhoneNumberListParams? = null
        private var response: MobilePhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobilePhoneNumberListPageAsync: MobilePhoneNumberListPageAsync) = apply {
            service = mobilePhoneNumberListPageAsync.service
            streamHandlerExecutor = mobilePhoneNumberListPageAsync.streamHandlerExecutor
            params = mobilePhoneNumberListPageAsync.params
            response = mobilePhoneNumberListPageAsync.response
        }

        fun service(service: MobilePhoneNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MobilePhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobilePhoneNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobilePhoneNumberListPageAsync].
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
        fun build(): MobilePhoneNumberListPageAsync =
            MobilePhoneNumberListPageAsync(
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

        return other is MobilePhoneNumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MobilePhoneNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
