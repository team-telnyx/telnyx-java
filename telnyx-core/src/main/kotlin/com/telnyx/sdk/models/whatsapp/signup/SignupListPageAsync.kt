// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.signup

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.whatsapp.SignupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SignupServiceAsync.list */
class SignupListPageAsync
private constructor(
    private val service: SignupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SignupListParams,
    private val response: SignupListPageResponse,
) : PageAsync<SignupListResponse> {

    /**
     * Delegates to [SignupListPageResponse], but gracefully handles missing data.
     *
     * @see SignupListPageResponse.data
     */
    fun data(): List<SignupListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SignupListPageResponse], but gracefully handles missing data.
     *
     * @see SignupListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SignupListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SignupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SignupListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SignupListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SignupListParams = params

    /** The response that this page was parsed from. */
    fun response(): SignupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SignupListPageAsync].
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

    /** A builder for [SignupListPageAsync]. */
    class Builder internal constructor() {

        private var service: SignupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SignupListParams? = null
        private var response: SignupListPageResponse? = null

        @JvmSynthetic
        internal fun from(signupListPageAsync: SignupListPageAsync) = apply {
            service = signupListPageAsync.service
            streamHandlerExecutor = signupListPageAsync.streamHandlerExecutor
            params = signupListPageAsync.params
            response = signupListPageAsync.response
        }

        fun service(service: SignupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SignupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SignupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SignupListPageAsync].
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
        fun build(): SignupListPageAsync =
            SignupListPageAsync(
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

        return other is SignupListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SignupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
