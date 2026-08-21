// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.services.async.EmailTemplateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmailTemplateServiceAsync.list */
class EmailTemplateListPageAsync
private constructor(
    private val service: EmailTemplateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailTemplateListParams,
    private val response: EmailTemplateListPageResponse,
) : PageAsync<EmailTemplate> {

    /**
     * Delegates to [EmailTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see EmailTemplateListPageResponse.data
     */
    fun data(): List<EmailTemplate> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see EmailTemplateListPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailTemplate> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailTemplateListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmailTemplateListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailTemplate> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailTemplateListPageAsync].
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

    /** A builder for [EmailTemplateListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailTemplateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailTemplateListParams? = null
        private var response: EmailTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailTemplateListPageAsync: EmailTemplateListPageAsync) = apply {
            service = emailTemplateListPageAsync.service
            streamHandlerExecutor = emailTemplateListPageAsync.streamHandlerExecutor
            params = emailTemplateListPageAsync.params
            response = emailTemplateListPageAsync.response
        }

        fun service(service: EmailTemplateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailTemplateListPageAsync].
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
        fun build(): EmailTemplateListPageAsync =
            EmailTemplateListPageAsync(
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

        return other is EmailTemplateListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailTemplateListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
