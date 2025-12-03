// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.messaging

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.PhoneNumberWithMessagingSettings
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.phonenumbers.MessagingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingService.list */
class MessagingListPage
private constructor(
    private val service: MessagingService,
    private val params: MessagingListParams,
    private val response: MessagingListPageResponse,
) : Page<PhoneNumberWithMessagingSettings> {

    /**
     * Delegates to [MessagingListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingListPageResponse.data
     */
    fun data(): List<PhoneNumberWithMessagingSettings> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberWithMessagingSettings> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): MessagingListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PhoneNumberWithMessagingSettings> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessagingListPage].
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

    /** A builder for [MessagingListPage]. */
    class Builder internal constructor() {

        private var service: MessagingService? = null
        private var params: MessagingListParams? = null
        private var response: MessagingListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingListPage: MessagingListPage) = apply {
            service = messagingListPage.service
            params = messagingListPage.params
            response = messagingListPage.response
        }

        fun service(service: MessagingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MessagingListPage].
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
        fun build(): MessagingListPage =
            MessagingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingListPage{service=$service, params=$params, response=$response}"
}
