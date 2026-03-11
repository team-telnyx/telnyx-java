// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.messagetemplates

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.whatsapp.MessageTemplateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessageTemplateService.list */
class MessageTemplateListPage
private constructor(
    private val service: MessageTemplateService,
    private val params: MessageTemplateListParams,
    private val response: MessageTemplateListPageResponse,
) : Page<MessageTemplateListResponse> {

    /**
     * Delegates to [MessageTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see MessageTemplateListPageResponse.data
     */
    fun data(): List<MessageTemplateListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessageTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see MessageTemplateListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessageTemplateListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessageTemplateListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MessageTemplateListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MessageTemplateListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessageTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessageTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageTemplateListPage].
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

    /** A builder for [MessageTemplateListPage]. */
    class Builder internal constructor() {

        private var service: MessageTemplateService? = null
        private var params: MessageTemplateListParams? = null
        private var response: MessageTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(messageTemplateListPage: MessageTemplateListPage) = apply {
            service = messageTemplateListPage.service
            params = messageTemplateListPage.params
            response = messageTemplateListPage.response
        }

        fun service(service: MessageTemplateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessageTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessageTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MessageTemplateListPage].
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
        fun build(): MessageTemplateListPage =
            MessageTemplateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageTemplateListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessageTemplateListPage{service=$service, params=$params, response=$response}"
}
