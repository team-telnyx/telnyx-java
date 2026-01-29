// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberconfigurations

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.PhoneNumberConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberConfigurationServiceAsync.list */
class PhoneNumberConfigurationListPageAsync
private constructor(
    private val service: PhoneNumberConfigurationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberConfigurationListParams,
    private val response: PhoneNumberConfigurationListPageResponse,
) : PageAsync<PhoneNumberConfigurationListResponse> {

    /**
     * Delegates to [PhoneNumberConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberConfigurationListPageResponse.data
     */
    fun data(): List<PhoneNumberConfigurationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberConfigurationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberConfigurationListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberConfigurationListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberConfigurationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberConfigurationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberConfigurationListPageAsync].
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

    /** A builder for [PhoneNumberConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberConfigurationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberConfigurationListParams? = null
        private var response: PhoneNumberConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            phoneNumberConfigurationListPageAsync: PhoneNumberConfigurationListPageAsync
        ) = apply {
            service = phoneNumberConfigurationListPageAsync.service
            streamHandlerExecutor = phoneNumberConfigurationListPageAsync.streamHandlerExecutor
            params = phoneNumberConfigurationListPageAsync.params
            response = phoneNumberConfigurationListPageAsync.response
        }

        fun service(service: PhoneNumberConfigurationServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberConfigurationListPageAsync].
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
        fun build(): PhoneNumberConfigurationListPageAsync =
            PhoneNumberConfigurationListPageAsync(
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

        return other is PhoneNumberConfigurationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberConfigurationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
