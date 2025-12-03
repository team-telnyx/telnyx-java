// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberextensions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.PhoneNumberExtensionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberExtensionServiceAsync.list */
class PhoneNumberExtensionListPageAsync
private constructor(
    private val service: PhoneNumberExtensionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberExtensionListParams,
    private val response: PhoneNumberExtensionListPageResponse,
) : PageAsync<PortingPhoneNumberExtension> {

    /**
     * Delegates to [PhoneNumberExtensionListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberExtensionListPageResponse.data
     */
    fun data(): List<PortingPhoneNumberExtension> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberExtensionListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberExtensionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingPhoneNumberExtension> = data()

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

    fun nextPageParams(): PhoneNumberExtensionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberExtensionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingPhoneNumberExtension> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberExtensionListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberExtensionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberExtensionListPageAsync].
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

    /** A builder for [PhoneNumberExtensionListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberExtensionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberExtensionListParams? = null
        private var response: PhoneNumberExtensionListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberExtensionListPageAsync: PhoneNumberExtensionListPageAsync) =
            apply {
                service = phoneNumberExtensionListPageAsync.service
                streamHandlerExecutor = phoneNumberExtensionListPageAsync.streamHandlerExecutor
                params = phoneNumberExtensionListPageAsync.params
                response = phoneNumberExtensionListPageAsync.response
            }

        fun service(service: PhoneNumberExtensionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberExtensionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberExtensionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberExtensionListPageAsync].
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
        fun build(): PhoneNumberExtensionListPageAsync =
            PhoneNumberExtensionListPageAsync(
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

        return other is PhoneNumberExtensionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberExtensionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
