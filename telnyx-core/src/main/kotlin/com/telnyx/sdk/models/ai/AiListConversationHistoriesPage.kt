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

/** @see AiService.listConversationHistories */
class AiListConversationHistoriesPage
private constructor(
    private val service: AiService,
    private val params: AiListConversationHistoriesParams,
    private val response: AiListConversationHistoriesPageResponse,
) : Page<AiListConversationHistoriesResponse> {

    /**
     * Delegates to [AiListConversationHistoriesPageResponse], but gracefully handles missing data.
     *
     * @see AiListConversationHistoriesPageResponse.data
     */
    fun data(): List<AiListConversationHistoriesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AiListConversationHistoriesPageResponse], but gracefully handles missing data.
     *
     * @see AiListConversationHistoriesPageResponse.meta
     */
    fun meta(): Optional<AiListConversationHistoriesPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<AiListConversationHistoriesResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AiListConversationHistoriesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AiListConversationHistoriesPage =
        service.listConversationHistories(nextPageParams())

    fun autoPager(): AutoPager<AiListConversationHistoriesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AiListConversationHistoriesParams = params

    /** The response that this page was parsed from. */
    fun response(): AiListConversationHistoriesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AiListConversationHistoriesPage].
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

    /** A builder for [AiListConversationHistoriesPage]. */
    class Builder internal constructor() {

        private var service: AiService? = null
        private var params: AiListConversationHistoriesParams? = null
        private var response: AiListConversationHistoriesPageResponse? = null

        @JvmSynthetic
        internal fun from(aiListConversationHistoriesPage: AiListConversationHistoriesPage) =
            apply {
                service = aiListConversationHistoriesPage.service
                params = aiListConversationHistoriesPage.params
                response = aiListConversationHistoriesPage.response
            }

        fun service(service: AiService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AiListConversationHistoriesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AiListConversationHistoriesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AiListConversationHistoriesPage].
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
        fun build(): AiListConversationHistoriesPage =
            AiListConversationHistoriesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiListConversationHistoriesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AiListConversationHistoriesPage{service=$service, params=$params, response=$response}"
}
