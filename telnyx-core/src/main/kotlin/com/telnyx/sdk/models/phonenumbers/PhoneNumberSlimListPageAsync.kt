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

/** @see PhoneNumberServiceAsync.slimList */
class PhoneNumberSlimListPageAsync
private constructor(
    private val service: PhoneNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberSlimListParams,
    private val response: PhoneNumberSlimListPageResponse,
) : PageAsync<PhoneNumberSlimListResponse> {

    /**
     * Delegates to [PhoneNumberSlimListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberSlimListPageResponse.data
     */
    fun data(): List<PhoneNumberSlimListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberSlimListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberSlimListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberSlimListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberSlimListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberSlimListPageAsync> =
        service.slimList(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberSlimListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberSlimListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberSlimListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberSlimListPageAsync].
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

    /** A builder for [PhoneNumberSlimListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberSlimListParams? = null
        private var response: PhoneNumberSlimListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberSlimListPageAsync: PhoneNumberSlimListPageAsync) = apply {
            service = phoneNumberSlimListPageAsync.service
            streamHandlerExecutor = phoneNumberSlimListPageAsync.streamHandlerExecutor
            params = phoneNumberSlimListPageAsync.params
            response = phoneNumberSlimListPageAsync.response
        }

        fun service(service: PhoneNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberSlimListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberSlimListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhoneNumberSlimListPageAsync].
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
        fun build(): PhoneNumberSlimListPageAsync =
            PhoneNumberSlimListPageAsync(
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

        return other is PhoneNumberSlimListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberSlimListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
