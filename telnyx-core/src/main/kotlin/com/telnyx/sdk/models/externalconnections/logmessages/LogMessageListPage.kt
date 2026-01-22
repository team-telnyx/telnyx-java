// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Page
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import com.telnyx.sdk.services.blocking.externalconnections.LogMessageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see LogMessageService.list */
class LogMessageListPage
private constructor(
    private val service: LogMessageService,
    private val params: LogMessageListParams,
    private val response: LogMessageListPageResponse,
) : Page<LogMessageListResponse> {

    /**
     * Delegates to [LogMessageListPageResponse], but gracefully handles missing data.
     *
     * @see LogMessageListPageResponse.logMessages
     */
    fun logMessages(): List<LogMessageListResponse> =
        response._logMessages().getOptional("log_messages").getOrNull() ?: emptyList()

    /**
     * Delegates to [LogMessageListPageResponse], but gracefully handles missing data.
     *
     * @see LogMessageListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<LogMessageListResponse> = logMessages()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): LogMessageListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): LogMessageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LogMessageListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LogMessageListParams = params

    /** The response that this page was parsed from. */
    fun response(): LogMessageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LogMessageListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogMessageListPage]. */
    class Builder internal constructor() {

        private var service: LogMessageService? = null
        private var params: LogMessageListParams? = null
        private var response: LogMessageListPageResponse? = null

        @JvmSynthetic
        internal fun from(logMessageListPage: LogMessageListPage) = apply {
            service = logMessageListPage.service
            params = logMessageListPage.params
            response = logMessageListPage.response
        }

        fun service(service: LogMessageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LogMessageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LogMessageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LogMessageListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LogMessageListPage =
            LogMessageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogMessageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LogMessageListPage{service=$service, params=$params, response=$response}"
}
