// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.PhoneNumberWithMessagingSettings
import com.telnyx.sdk.services.blocking.MessagingHostedNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingHostedNumberService.list */
class MessagingHostedNumberListPage
private constructor(
    private val service: MessagingHostedNumberService,
    private val params: MessagingHostedNumberListParams,
    private val response: MessagingHostedNumberListPageResponse,
) : Page<PhoneNumberWithMessagingSettings> {

    /**
     * Delegates to [MessagingHostedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingHostedNumberListPageResponse.data
     */
    fun data(): List<PhoneNumberWithMessagingSettings> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingHostedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingHostedNumberListPageResponse.meta
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

    fun nextPageParams(): MessagingHostedNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingHostedNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PhoneNumberWithMessagingSettings> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingHostedNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingHostedNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingHostedNumberListPage].
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

    /** A builder for [MessagingHostedNumberListPage]. */
    class Builder internal constructor() {

        private var service: MessagingHostedNumberService? = null
        private var params: MessagingHostedNumberListParams? = null
        private var response: MessagingHostedNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingHostedNumberListPage: MessagingHostedNumberListPage) = apply {
            service = messagingHostedNumberListPage.service
            params = messagingHostedNumberListPage.params
            response = messagingHostedNumberListPage.response
        }

        fun service(service: MessagingHostedNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingHostedNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingHostedNumberListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingHostedNumberListPage].
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
        fun build(): MessagingHostedNumberListPage =
            MessagingHostedNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingHostedNumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingHostedNumberListPage{service=$service, params=$params, response=$response}"
}
