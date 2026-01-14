// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.PhoneNumberWithMessagingSettings
import com.telnyx.sdk.services.async.MessagingProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingProfileServiceAsync.listPhoneNumbers */
class MessagingProfileListPhoneNumbersPageAsync
private constructor(
    private val service: MessagingProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingProfileListPhoneNumbersParams,
    private val response: MessagingProfileListPhoneNumbersPageResponse,
) : PageAsync<PhoneNumberWithMessagingSettings> {

    /**
     * Delegates to [MessagingProfileListPhoneNumbersPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListPhoneNumbersPageResponse.data
     */
    fun data(): List<PhoneNumberWithMessagingSettings> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListPhoneNumbersPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListPhoneNumbersPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberWithMessagingSettings> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingProfileListPhoneNumbersParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync> =
        service.listPhoneNumbers(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberWithMessagingSettings> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListPhoneNumbersParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListPhoneNumbersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileListPhoneNumbersPageAsync].
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

    /** A builder for [MessagingProfileListPhoneNumbersPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingProfileListPhoneNumbersParams? = null
        private var response: MessagingProfileListPhoneNumbersPageResponse? = null

        @JvmSynthetic
        internal fun from(
            messagingProfileListPhoneNumbersPageAsync: MessagingProfileListPhoneNumbersPageAsync
        ) = apply {
            service = messagingProfileListPhoneNumbersPageAsync.service
            streamHandlerExecutor = messagingProfileListPhoneNumbersPageAsync.streamHandlerExecutor
            params = messagingProfileListPhoneNumbersPageAsync.params
            response = messagingProfileListPhoneNumbersPageAsync.response
        }

        fun service(service: MessagingProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListPhoneNumbersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListPhoneNumbersPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListPhoneNumbersPageAsync].
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
        fun build(): MessagingProfileListPhoneNumbersPageAsync =
            MessagingProfileListPhoneNumbersPageAsync(
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

        return other is MessagingProfileListPhoneNumbersPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingProfileListPhoneNumbersPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
