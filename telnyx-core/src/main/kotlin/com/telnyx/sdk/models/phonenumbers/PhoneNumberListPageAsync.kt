// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.PhoneNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberServiceAsync.list */
class PhoneNumberListPageAsync
private constructor(
    private val service: PhoneNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberListParams,
    private val response: PhoneNumberListPageResponse,
) : PageAsync<PhoneNumberDetailed> {

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.data
     */
    fun data(): List<PhoneNumberDetailed> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberDetailed> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberDetailed> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberListPageAsync].
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

    /** A builder for [PhoneNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberListParams? = null
        private var response: PhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberListPageAsync: PhoneNumberListPageAsync) = apply {
            service = phoneNumberListPageAsync.service
            streamHandlerExecutor = phoneNumberListPageAsync.streamHandlerExecutor
            params = phoneNumberListPageAsync.params
            response = phoneNumberListPageAsync.response
        }

        fun service(service: PhoneNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhoneNumberListPageAsync].
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
        fun build(): PhoneNumberListPageAsync =
            PhoneNumberListPageAsync(
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

        return other is PhoneNumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
