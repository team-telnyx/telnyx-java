// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ai.AvatarServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AvatarServiceAsync.list */
class AvatarListPageAsync
private constructor(
    private val service: AvatarServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AvatarListParams,
    private val response: AvatarListPageResponse,
) : PageAsync<Avatar> {

    /**
     * Delegates to [AvatarListPageResponse], but gracefully handles missing data.
     *
     * @see AvatarListPageResponse.data
     */
    fun data(): List<Avatar> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AvatarListPageResponse], but gracefully handles missing data.
     *
     * @see AvatarListPageResponse.meta
     */
    fun meta(): Optional<AvatarListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<Avatar> = data()

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

    fun nextPageParams(): AvatarListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AvatarListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Avatar> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AvatarListParams = params

    /** The response that this page was parsed from. */
    fun response(): AvatarListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AvatarListPageAsync].
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

    /** A builder for [AvatarListPageAsync]. */
    class Builder internal constructor() {

        private var service: AvatarServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AvatarListParams? = null
        private var response: AvatarListPageResponse? = null

        @JvmSynthetic
        internal fun from(avatarListPageAsync: AvatarListPageAsync) = apply {
            service = avatarListPageAsync.service
            streamHandlerExecutor = avatarListPageAsync.streamHandlerExecutor
            params = avatarListPageAsync.params
            response = avatarListPageAsync.response
        }

        fun service(service: AvatarServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AvatarListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AvatarListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AvatarListPageAsync].
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
        fun build(): AvatarListPageAsync =
            AvatarListPageAsync(
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

        return other is AvatarListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AvatarListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
