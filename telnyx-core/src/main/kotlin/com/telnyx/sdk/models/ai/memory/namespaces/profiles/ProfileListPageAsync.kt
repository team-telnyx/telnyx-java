// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ai.memory.namespaces.ProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ProfileServiceAsync.list */
class ProfileListPageAsync
private constructor(
    private val service: ProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ProfileListParams,
    private val response: ProfileListPageResponse,
) : PageAsync<ProfileListResponse> {

    /**
     * Delegates to [ProfileListPageResponse], but gracefully handles missing data.
     *
     * @see ProfileListPageResponse.data
     */
    fun data(): List<ProfileListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProfileListPageResponse], but gracefully handles missing data.
     *
     * @see ProfileListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<ProfileListResponse> = data()

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

    fun nextPageParams(): ProfileListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProfileListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProfileListPageAsync].
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

    /** A builder for [ProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ProfileListParams? = null
        private var response: ProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(profileListPageAsync: ProfileListPageAsync) = apply {
            service = profileListPageAsync.service
            streamHandlerExecutor = profileListPageAsync.streamHandlerExecutor
            params = profileListPageAsync.params
            response = profileListPageAsync.response
        }

        fun service(service: ProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProfileListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProfileListPageAsync].
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
        fun build(): ProfileListPageAsync =
            ProfileListPageAsync(
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

        return other is ProfileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
