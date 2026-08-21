// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.AiService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AiService.retrieveConversationHistories */
class AiRetrieveConversationHistoriesPage
private constructor(
    private val service: AiService,
    private val params: AiRetrieveConversationHistoriesParams,
    private val response: AiRetrieveConversationHistoriesPageResponse,
) : Page<AiRetrieveConversationHistoriesResponse> {

    /**
     * Delegates to [AiRetrieveConversationHistoriesPageResponse], but gracefully handles missing
     * data.
     *
     * @see AiRetrieveConversationHistoriesPageResponse.data
     */
    fun data(): List<AiRetrieveConversationHistoriesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AiRetrieveConversationHistoriesPageResponse], but gracefully handles missing
     * data.
     *
     * @see AiRetrieveConversationHistoriesPageResponse.meta
     */
    fun meta(): Optional<AiRetrieveConversationHistoriesPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<AiRetrieveConversationHistoriesResponse> = data()

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

    fun nextPageParams(): AiRetrieveConversationHistoriesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AiRetrieveConversationHistoriesPage =
        service.retrieveConversationHistories(nextPageParams())

    fun autoPager(): AutoPager<AiRetrieveConversationHistoriesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AiRetrieveConversationHistoriesParams = params

    /** The response that this page was parsed from. */
    fun response(): AiRetrieveConversationHistoriesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AiRetrieveConversationHistoriesPage].
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

    /** A builder for [AiRetrieveConversationHistoriesPage]. */
    class Builder internal constructor() {

        private var service: AiService? = null
        private var params: AiRetrieveConversationHistoriesParams? = null
        private var response: AiRetrieveConversationHistoriesPageResponse? = null

        @JvmSynthetic
        internal fun from(
            aiRetrieveConversationHistoriesPage: AiRetrieveConversationHistoriesPage
        ) = apply {
            service = aiRetrieveConversationHistoriesPage.service
            params = aiRetrieveConversationHistoriesPage.params
            response = aiRetrieveConversationHistoriesPage.response
        }

        fun service(service: AiService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AiRetrieveConversationHistoriesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AiRetrieveConversationHistoriesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AiRetrieveConversationHistoriesPage].
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
        fun build(): AiRetrieveConversationHistoriesPage =
            AiRetrieveConversationHistoriesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiRetrieveConversationHistoriesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AiRetrieveConversationHistoriesPage{service=$service, params=$params, response=$response}"
}
