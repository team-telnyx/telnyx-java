// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.WhatsappTemplateData
import com.telnyx.sdk.services.async.whatsapp.TemplateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TemplateServiceAsync.list */
class TemplateListPageAsync
private constructor(
    private val service: TemplateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TemplateListParams,
    private val response: TemplateListPageResponse,
) : PageAsync<WhatsappTemplateData> {

    /**
     * Delegates to [TemplateListPageResponse], but gracefully handles missing data.
     *
     * @see TemplateListPageResponse.data
     */
    fun data(): List<WhatsappTemplateData> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TemplateListPageResponse], but gracefully handles missing data.
     *
     * @see TemplateListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WhatsappTemplateData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TemplateListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TemplateListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WhatsappTemplateData> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): TemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplateListPageAsync].
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

    /** A builder for [TemplateListPageAsync]. */
    class Builder internal constructor() {

        private var service: TemplateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TemplateListParams? = null
        private var response: TemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(templateListPageAsync: TemplateListPageAsync) = apply {
            service = templateListPageAsync.service
            streamHandlerExecutor = templateListPageAsync.streamHandlerExecutor
            params = templateListPageAsync.params
            response = templateListPageAsync.response
        }

        fun service(service: TemplateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TemplateListPageAsync].
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
        fun build(): TemplateListPageAsync =
            TemplateListPageAsync(
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

        return other is TemplateListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TemplateListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
