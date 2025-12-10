// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberblocks

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.PhoneNumberBlockServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberBlockServiceAsync.list */
class PhoneNumberBlockListPageAsync
private constructor(
    private val service: PhoneNumberBlockServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberBlockListParams,
    private val response: PhoneNumberBlockListPageResponse,
) : PageAsync<PortingPhoneNumberBlock> {

    /**
     * Delegates to [PhoneNumberBlockListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBlockListPageResponse.data
     */
    fun data(): List<PortingPhoneNumberBlock> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberBlockListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBlockListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingPhoneNumberBlock> = data()

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

    fun nextPageParams(): PhoneNumberBlockListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberBlockListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingPhoneNumberBlock> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberBlockListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberBlockListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberBlockListPageAsync].
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

    /** A builder for [PhoneNumberBlockListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberBlockServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberBlockListParams? = null
        private var response: PhoneNumberBlockListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberBlockListPageAsync: PhoneNumberBlockListPageAsync) = apply {
            service = phoneNumberBlockListPageAsync.service
            streamHandlerExecutor = phoneNumberBlockListPageAsync.streamHandlerExecutor
            params = phoneNumberBlockListPageAsync.params
            response = phoneNumberBlockListPageAsync.response
        }

        fun service(service: PhoneNumberBlockServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberBlockListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberBlockListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberBlockListPageAsync].
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
        fun build(): PhoneNumberBlockListPageAsync =
            PhoneNumberBlockListPageAsync(
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

        return other is PhoneNumberBlockListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberBlockListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
