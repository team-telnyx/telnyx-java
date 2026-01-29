// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.associatedphonenumbers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.AssociatedPhoneNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AssociatedPhoneNumberServiceAsync.list */
class AssociatedPhoneNumberListPageAsync
private constructor(
    private val service: AssociatedPhoneNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AssociatedPhoneNumberListParams,
    private val response: AssociatedPhoneNumberListPageResponse,
) : PageAsync<PortingAssociatedPhoneNumber> {

    /**
     * Delegates to [AssociatedPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see AssociatedPhoneNumberListPageResponse.data
     */
    fun data(): List<PortingAssociatedPhoneNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AssociatedPhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see AssociatedPhoneNumberListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingAssociatedPhoneNumber> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AssociatedPhoneNumberListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AssociatedPhoneNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingAssociatedPhoneNumber> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AssociatedPhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): AssociatedPhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AssociatedPhoneNumberListPageAsync].
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

    /** A builder for [AssociatedPhoneNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: AssociatedPhoneNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AssociatedPhoneNumberListParams? = null
        private var response: AssociatedPhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(associatedPhoneNumberListPageAsync: AssociatedPhoneNumberListPageAsync) =
            apply {
                service = associatedPhoneNumberListPageAsync.service
                streamHandlerExecutor = associatedPhoneNumberListPageAsync.streamHandlerExecutor
                params = associatedPhoneNumberListPageAsync.params
                response = associatedPhoneNumberListPageAsync.response
            }

        fun service(service: AssociatedPhoneNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AssociatedPhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AssociatedPhoneNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AssociatedPhoneNumberListPageAsync].
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
        fun build(): AssociatedPhoneNumberListPageAsync =
            AssociatedPhoneNumberListPageAsync(
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

        return other is AssociatedPhoneNumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AssociatedPhoneNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
